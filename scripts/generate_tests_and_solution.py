import os
import sys
import subprocess
from openai import OpenAI

def main(api_key, branch_name):
    if not api_key:
        print("Error: OpenAI API key is missing.")
        sys.exit(1)

    client = OpenAI(api_key=api_key)

    # Ensure we are on the correct branch
    try:
        subprocess.run(["git", "checkout", branch_name], check=True)
    except subprocess.CalledProcessError as e:
        print(f"Error checking out branch {branch_name}: {e}")
        sys.exit(1)

    # Read the generated task and template
    try:
        with open("tasks/new_task.md", "r") as file:
            task = file.read()
        with open("src/template_code.java", "r") as file:
            template = file.read()
        with open("src/IndamonTest.java", "r") as file:
            existing_tests = file.read()
    except FileNotFoundError:
        print("Error: new_task.md or template_code.java file not found.")
        sys.exit(1)

    # Combine task, template, and existing tests into a single prompt 
    prompt = (f"Given the following task, code template, and existing tests, generate a set of high-quality unit tests and a suggested solution. "
              f"Ensure the tests are thorough, robust, and cover all edge cases, including invalid inputs, boundary conditions, and performance considerations. "
              f"The tests should follow best practices, including descriptive naming conventions, setup and teardown methods if necessary, and detailed assertions to validate expected behavior. "
              f"The solution should be complete and able to pass all the generated tests. Use meaningful variable names and comments to improve readability and maintainability.\n\n"
              f"### Task\n{task}\n\n"
              f"### Template\n{template}\n\n"
              f"### Existing Tests\n\n"
              f"```java\n{existing_tests}\n```\n\n"
              "Format the response as follows:\n\n"
              "### Tests\n<test_cases>\n\n"
              "### Solution\n<solution_code>\n\n")

    response_content = generate_with_retries(client, prompt, max_retries=3)
    if response_content is None:
        print("Error: Failed to generate tests and solution after multiple retries.")
        sys.exit(1)

    tests, solution = extract_tests_solution(response_content)

    commit_and_push_changes(branch_name, tests, solution)

def generate_with_retries(client, prompt, max_retries=3):
    for attempt in range(max_retries):
        try:
            response = client.chat.completions.create(
                model="gpt-4",
                messages=[
                    {"role": "system", "content": "You are a helpful assistant."},
                    {"role": "user", "content": prompt}
                ]
            )
            return response.choices[0].message.content.strip()
        except Exception as e:
            print(f"Error generating tests and solution: {e}")
            if attempt < max_retries - 1:
                print("Retrying...")
    return None

def extract_tests_solution(content):
    tests_marker = "### Tests"
    solution_marker = "### Solution"

    tests_start = content.find(tests_marker)
    solution_start = content.find(solution_marker)

    tests = content[tests_start + len(tests_marker):solution_start].strip()
    solution = content[solution_start + len(solution_marker):].strip()

    return tests, solution

def commit_and_push_changes(branch_name, tests_content, solution_content):
    try:
        subprocess.run(["git", "config", "--global", "user.email", "actions@github.com"], check=True)
        subprocess.run(["git", "config", "--global", "user.name", "github-actions"], check=True)
        
        os.makedirs(".hidden_tasks", exist_ok=True)

        tests_file_path = os.path.join(".hidden_tasks", "new_task_tests.java")
        solution_file_path = os.path.join(".hidden_tasks", "new_task_solution.java")

        with open(tests_file_path, "w") as file:
            file.write(tests_content)
        with open(solution_file_path, "w") as file:
            file.write(solution_content)

        subprocess.run(["git", "add", tests_file_path, solution_file_path], check=True)
        subprocess.run(["git", "commit", "-m", "Add generated tests and solution"], check=True)
        subprocess.run(
            ["git", "push", "--set-upstream", "origin", branch_name],
            check=True,
            env=dict(os.environ, GIT_ASKPASS='echo', GIT_USERNAME='x-access-token', GIT_PASSWORD=os.getenv('GITHUB_TOKEN'))
        )
    except subprocess.CalledProcessError as e:
        print(f"Error committing and pushing changes: {e}")
        sys.exit(1)

if len(sys.argv) != 3:
    print("Error: Missing required command line arguments 'api_key' and 'branch_name'")
    sys.exit(1)

api_key = sys.argv[1]
branch_name = sys.argv[2]

main(api_key, branch_name)
