import os
import sys
import subprocess
from openai import OpenAI

def main(api_key):
    if not api_key:
        print("Error: OpenAI API key is missing.")
        sys.exit(1)

    client = OpenAI(api_key=api_key)

    # Read the task file
    try:
        with open("tasks/new_task.md", "r") as file:
            task_content = file.read()
    except FileNotFoundError:
        print("Error: tasks/new_task.md file not found.")
        sys.exit(1)

    # Combine the task into a single prompt
    prompt = (f"Based on the following task, generate the tests and solution.\n\n"
              f"### Task\n{task_content}\n\n"
              "### Tests\n<test_cases>\n\n"
              "### Solution\n<solution_code>\n\n")

    # Call OpenAI API to generate tests and solution
    response_content = generate_with_retries(client, prompt, max_retries=3)
    if response_content is None:
        print("Error: Failed to generate tests and solution after multiple retries.")
        sys.exit(1)

    # Extract tests and solution from the response
    tests, solution = extract_tests_solution(response_content)

    # Save the tests and solution to hidden tasks directory
    os.makedirs(".hidden_tasks", exist_ok=True)
    tests_file_path = os.path.join(".hidden_tasks", "new_task_tests.java")
    solution_file_path = os.path.join(".hidden_tasks", "new_task_solution.java")

    with open(tests_file_path, "w") as file:
        file.write(tests)
    with open(solution_file_path, "w") as file:
        file.write(solution)

    # Commit and push the changes
    commit_and_push_changes(tests_file_path, solution_file_path)

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

def commit_and_push_changes(tests_file_path, solution_file_path):
    try:
        # Configure git
        subprocess.run(["git", "config", "--global", "user.email", "actions@github.com"], check=True)
        subprocess.run(["git", "config", "--global", "user.name", "github-actions"], check=True)

        subprocess.run(["git", "add", tests_file_path, solution_file_path], check=True)
        subprocess.run(["git", "commit", "-m", "Add tests and solution for new task"], check=True)
        subprocess.run(
            ["git", "push"],
            check=True,
            env=dict(os.environ, GIT_ASKPASS='echo', GIT_USERNAME='x-access-token', GIT_PASSWORD=os.getenv('GITHUB_TOKEN'))
        )
    except subprocess.CalledProcessError as e:
        print(f"Error committing and pushing changes: {e}")
        sys.exit(1)
    except Exception as e:
        print(f"An unexpected error occurred: {e}")
        sys.exit(1)

if len(sys.argv) != 2:
    print("Error: Missing required command line argument 'api_key'")
    sys.exit(1)

api_key = sys.argv[1]

main(api_key)
