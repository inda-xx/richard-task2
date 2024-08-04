import os
import sys
from openai import OpenAI

def main(api_key):
    if not api_key:
        print("Error: OpenAI API key is missing.")
        sys.exit(1)

    client = OpenAI(api_key=api_key)

    # Read the task description
    try:
        with open("tasks/new_task.md", "r") as file:
            task_description = file.read()
    except FileNotFoundError:
        print("Error: new_task.md file not found.")
        sys.exit(1)

    # Combine task description into a single prompt
    prompt = (f"Based on the following task description, generate a detailed Java code template. "
              "The template should include all necessary placeholders and comments to guide the students in completing the task. "
              "Ensure that the template aligns with the exercises and instructions provided in the task description.\n\n"
              f"### Task Description\n\n"
              f"{task_description}\n\n"
              "Format the response as follows:\n\n"
              "### Template\n<template_code>\n\n")

    # Call OpenAI API to generate the template code
    response_content = generate_with_retries(client, prompt, max_retries=3)
    if response_content is None:
        print("Error: Failed to generate template code after multiple retries.")
        sys.exit(1)

    # Write the template code to a Java file
    template_file_path = os.path.join("src", "template_code.java")
    with open(template_file_path, "w") as file:
        file.write(response_content)

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
            print(f"Error generating template code: {e}")
            if attempt < max_retries - 1:
                print("Retrying...")
    return None

if len(sys.argv) != 2:
    print("Error: Missing required command line argument 'api_key'")
    sys.exit(1)

api_key = sys.argv[1]

main(api_key)
