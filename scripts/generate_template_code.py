import os
import sys
import subprocess
from openai import OpenAI

def main(api_key, branch_name):
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

    # Read the original code template
    original_template = """
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
        public void setFainted(boolean fainted) { this.fainted = fainted;}

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

    # Combine task description and original template into a single prompt
    prompt = (f"Based on the following task description, generate a detailed Java code template. "
              "The template should include all necessary placeholders and comments to guide the students in completing the task. "
              "Ensure that the template aligns with the exercises and instructions provided in the task description. "
              "Use the provided original code template as inspiration for the structure and formatting of the new code template.\n\n"
              f"### Task Description\n\n"
              f"{task_description}\n\n"
              "### Original Code Template\n\n"
              f"```java\n{original_template}\n```\n\n"
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

    # Commit and push changes
    commit_and_push_changes(branch_name, template_file_path)

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

def commit_and_push_changes(branch_name, template_file_path):
    try:
        subprocess.run(["git", "config", "--global", "user.email", "actions@github.com"], check=True)
        subprocess.run(["git", "config", "--global", "user.name", "github-actions"], check=True)

        subprocess.run(["git", "add", template_file_path], check=True)
        subprocess.run(["git", "commit", "-m", "Add new template code"], check=True)
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