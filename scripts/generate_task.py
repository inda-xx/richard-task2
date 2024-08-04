import os
import sys
import json
import subprocess
from datetime import datetime
from openai import OpenAI
import pytz
from pytz import timezone

def main(api_key):
    if not api_key:
        print("Error: OpenAI API key is missing.")
        sys.exit(1)

    client = OpenAI(api_key=api_key)

    # Read the template file
    try:
        with open("task_template.md", "r") as file:
            template = file.read()
    except FileNotFoundError:
        print("Error: task_template.md file not found.")
        sys.exit(1)

    # Read the existing code
    try:
        with open("src/Indamon.java", "r") as file:
            existing_code = file.read()
        with open("src/IndamonTest.java", "r") as file:
            existing_tests = file.read()
    except FileNotFoundError:
        print("Error: Indamon.java or IndamonTest.java file not found.")
        sys.exit(1)

    # Extract requirements JSON and theme from environment variables
    difficulty = os.getenv("TASK_DIFFICULTY", "medium")
    theme = os.getenv("TASK_THEME", "Create a basic Java application with the following requirements.")
    language = os.getenv("TASK_LANGUAGE", "English")

    requirements_dict = {
        "difficulty": difficulty
    }

    # Combine template, theme, requirements, existing code, and existing tests into a single prompt
    task_goals = (
        "Designing Java classes, "
        "Adding instance fields, "
        "Adding a constructor method, "
        "Creating getters and setters, "
        "Printing to the terminal, "
        "Using the main method, "
        "Scope (or variable shadowing)."
    )

    indamon_code = """
    class Indamon {
        private String name;
        private int hp;
        private int attack;
        private int defense;
        private boolean fainted;

        public Indamon(String name, int hp, int attack, int defense) {
            this.name = name;
            this.hp = hp;
            this.attack = attack;
            this.defense = defense;
            fainted = false;
        }

        // getters
        public String getName() { return name; }
        public int getHp() { return hp; }
        public int getAttack() { return attack; }
        public int getDefense() { return defense; }
        public boolean getFainted() { return fainted; }

        // setters
        public void setName(String name) { this.name = name; }
        public void setHp(int hp) { this.hp = hp; }
        public void setAttack(int attack) { this.attack = attack; }
        public void setDefense(int defense) { this.defense = defense; }
        public void setFainted(boolean fainted) { this.fainted = fainted; }

        // attack method
        public void attackOponnent(Indamon target) {
            int damage = attack / target.getDefense();
            target.setHp(target.getHp() - damage);
            if (target.getHp() <= 0) {
                target.setFainted(true);
            }
        }

        // print info method
        public void printInfo() {
            System.out.println("Name: " + name);
            System.out.println("HP: " + hp);
            System.out.println("Attack: " + attack);
            System.out.println("Defense: " + defense);
            System.out.println("Fainted: " + fainted);
        }   

        public static void main(String[] args) {
            // create a new "Indamon" object
            Indamon glassey = new Indamon("Glassey", 10, 5, 5);
            Indamon siberov = new Indamon("Siberov", 10, 5, 5);
            // print out the object's info
            glassey.printInfo();
            siberov.printInfo();
            // call the attack method
            glassey.attack(siberov);
            siberov.printInfo();
        } // end main method
    }
    """

    prompt = (f"Create a new programming task in {language} based on this template: {template}. "
              f"Theme: {theme}. "
              f"Requirements: {requirements_dict}. "
              f"Ensure the following task goals are included: {task_goals} "
              "Use the following existing code and tests as inspiration. The new task must be detailed, well-structured, aesthetically pleasing, and provide thorough instructions for the students. "
              "The task must include specific function names where necessary and be compatible with the provided tests. "
              "The task description must include the name of the test class and the test methods for the functions in the task. "
              "Create a slightly quirky task title based on the description. "
              "Format the response as follows:\n\n"
              "# <task_title>\n\n"
              "## <task_subtitle>\n\n"
              "### Task\n<task_description>\n\n"
              "### Template\n<template_code>\n\n"
              "### Existing Code\n\n"
              "```java\n"
              f"{indamon_code}\n"
              "```\n\n"
              "### Existing Tests\n\n"
              "```java\n"
              f"{existing_tests}\n"
              "```\n\n"
              "The code template must be very detailed and coordinated with the task description and tests, ensuring the correct function names and return types are used so that the tests pass. "
              "Pay special attention to clarity, coherence, and structure to ensure the task is easy to understand and follow. "
              "The quality of the template is paramount, and it should include all necessary details for function names to facilitate grading later on. "
              "Maintain consistency with the structure of the original task, and highlight the importance of each section. "
              "Ensure the instructions, examples, and notes are clear and helpful, matching the style and format of the original task provided below:\n\n"
              f"{template}\n\n")

    # Call OpenAI API to generate task and template
    response_content = generate_with_retries(client, prompt, max_retries=3)
    if response_content is None:
        print("Error: Failed to generate task after multiple retries.")
        sys.exit(1)

    # Extract task and template from the response
    task, template_code = extract_task_template(response_content)

    # Create a new branch with a unique name
    stockholm_tz = timezone('Europe/Stockholm')
    branch_name = f"task-{datetime.now(stockholm_tz).strftime('%Y%m%d%H%M%S')}"
    create_branch(branch_name)
    commit_and_push_changes(branch_name, task, template_code)

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
            print(f"Error generating task: {e}")
            if attempt < max_retries - 1:
                print("Retrying...")
    return None

def extract_task_template(content):
    task_marker = "### Task"
    template_marker = "### Template"

    task_start = content.find(task_marker)
    template_start = content.find(template_marker)

    task = content[task_start + len(task_marker):template_start].strip()
    template_code = content[template_start + len(template_marker):].strip()

    return task, template_code

def create_branch(branch_name):
    try:
        subprocess.run(["git", "checkout", "-b", branch_name], check=True)
        subprocess.run(
            ["git", "push", "-u", "origin", branch_name],
            check=True,
            env=dict(os.environ, GIT_ASKPASS='echo', GIT_USERNAME='x-access-token', GIT_PASSWORD=os.getenv('GITHUB_TOKEN'))
        )
    except subprocess.CalledProcessError as e:
        print(f"Error creating branch: {e}")
        sys.exit(1)

def commit_and_push_changes(branch_name, task_content, template_content):
    try:
        subprocess.run(["git", "config", "--global", "user.email", "actions@github.com"], check=True)
        subprocess.run(["git", "config", "--global", "user.name", "github-actions"], check=True)
        
        os.makedirs("tasks", exist_ok=True)
        os.makedirs("src", exist_ok=True)

        task_file_path = os.path.join("tasks", "new_task.md")
        template_file_path = os.path.join("src", "template_code.java")

        with open(task_file_path, "w") as file:
            file.write(task_content)
        with open(template_file_path, "w") as file:
            file.write(template_content)

        subprocess.run(["git", "add", task_file_path, template_file_path], check=True)
        subprocess.run(["git", "commit", "-m", f"Add new task: {branch_name}"], check=True)
        subprocess.run(
            ["git", "push", "origin", branch_name],
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
