import os
import sys
import subprocess
from openai import OpenAI

def main(api_key, head_branch, base_branch):
    if not api_key:
        print("Error: OpenAI API key is missing.")
        sys.exit(1)

    client = OpenAI(api_key=api_key)

    # Generate a compliment and analysis
    prompt = (
        "A student has successfully completed the task with all tests passing. "
        "Generate a brief compliment and analysis of what has been achieved in the task. "
        "Be positive and provide a clear summary of the student's accomplishments."
    )

    compliment = generate_with_retries(client, prompt, max_retries=3)
    if compliment is None:
        print("Error: Failed to generate compliment after multiple retries.")
        sys.exit(1)

    # Ensure compliment is not empty
    if not compliment.strip():
        print("Error: Generated compliment is empty.")
        sys.exit(1)

    # Post the compliment as a PR comment
    post_comment_on_pr(compliment)

    # Merge the branch
    merge_branch(head_branch, base_branch)

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
            print(f"Error generating compliment: {e}")
            if attempt < max_retries - 1:
                print("Retrying...")
    return None

def post_comment_on_pr(comment):
    pr_number = os.getenv('GITHUB_PR_NUMBER')
    repo = os.getenv('GITHUB_REPOSITORY')

    # Check environment variables
    if not pr_number:
        print("Error: GITHUB_PR_NUMBER is not set.")
        sys.exit(1)
    if not repo:
        print("Error: GITHUB_REPOSITORY is not set.")
        sys.exit(1)

    # Debugging: Print the variables to ensure they are not None
    print(f"PR Number: {pr_number}")
    print(f"Repository: {repo}")
    print(f"Comment: {comment}")

    # Properly escape the comment content
    comment = comment.replace('"', '\\"')

    command = [
        'gh', 'pr', 'comment', pr_number,
        '--body', comment
    ]

    # Debugging: Print the command to ensure it's correct
    print(f"Command: {command}")

    try:
        subprocess.run(command, check=True)
    except subprocess.CalledProcessError as e:
        print(f"Failed to post comment: {e}")
        sys.exit(1)

def merge_branch(head_branch, base_branch):
    try:
        subprocess.run(["git", "checkout", base_branch], check=True)
        subprocess.run(["git", "merge", head_branch], check=True)
        subprocess.run(["git", "push"], check=True)
    except subprocess.CalledProcessError as e:
        print(f"Error merging branch {head_branch} into {base_branch}: {e}")
        sys.exit(1)

if len(sys.argv) != 4:
    print("Error: Missing required command line arguments 'api_key', 'head_branch', and 'base_branch'")
    sys.exit(1)

api_key = sys.argv[1]
head_branch = sys.argv[2]
base_branch = sys.argv[3]

main(api_key, head_branch, base_branch)
