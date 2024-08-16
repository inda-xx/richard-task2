import os
import sys
import subprocess
from openai import OpenAI

def main(api_key, head_branch, base_branch):
    if not api_key:
        print("Error: OpenAI API key is missing.")
        sys.exit(1)

    client = OpenAI(api_key=api_key)

    # Read the student's code
    try:
        with open("src/template_code.java", "r") as file:
            student_code = file.read()
    except FileNotFoundError:
        print("Error: template_code.java file not found.")
        sys.exit(1)

    # Generate feedback and clues based on the failed tests and student code
    prompt = (
        "A student has submitted their solution, but some tests have failed. "
        "Analyze the following code and provide constructive feedback with small clues on how to fix the remaining issues.\n\n"
        f"### Student Code\n\n"
        f"```java\n{student_code}\n```\n\n"
    )
    
    feedback = generate_with_retries(client, prompt, max_retries=3)
    if feedback is None:
        print("Error: Failed to generate feedback after multiple retries.")
        sys.exit(1)

    # Post the feedback as a PR comment
    post_comment_on_pr(feedback)

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
            print(f"Error generating feedback: {e}")
            if attempt < max_retries - 1:
                print("Retrying...")
    return None

def post_comment_on_pr(comment):
    pr_number = os.getenv('GITHUB_PR_NUMBER')
    repo = os.getenv('GITHUB_REPOSITORY')

    # Debugging: Check environment variables
    print(f"GITHUB_PR_NUMBER: {pr_number}")
    print(f"GITHUB_REPOSITORY: {repo}")

    if not pr_number or not repo:
        print("Error: GITHUB_PR_NUMBER or GITHUB_REPOSITORY environment variables not set.")
        sys.exit(1)

    command = [
        'gh', 'pr', 'comment', pr_number,
        '--body', comment
    ]

    # Debugging: Check command
    print(f"Command: {command}")
    
    try:
        subprocess.run(command, check=True)
    except subprocess.CalledProcessError as e:
        print(f"Failed to post comment: {e}")
        sys.exit(1)


if len(sys.argv) != 4:
    print("Error: Missing required command line arguments 'api_key', 'head_branch', and 'base_branch'")
    sys.exit(1)

api_key = sys.argv[1]
head_branch = sys.argv[2]
base_branch = sys.argv[3]

main(api_key, head_branch, base_branch)
