# Brawl in the Byte World! 🎮

For this project, you'll immerse yourself in the world of *object-oriented programming* (OOP) by constructing game elements using Java classes. Brace yourself, the adventure comprises constructors, instance fields, getters and setters, and much more!

### 🚀 Deadline
Your Brawl in the Byte World masterpiece should be ready to hit the console by **Friday, 30th September**.

### 🤓 Instructions
To get a grip on the assignment requirements and submission process, consult the [assignment rules](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📔 Preparation 
Get prepped by going through the Module 3 content:

- Dwell into [Spaceships and Astronauts](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60) module.
- If you haven't registered yet, visit https://kth.oli.cmu.edu/, sign up and claim the course key `dd1337-ht22`.

> **Note:** The OLI material and tasks are subject to yearly revisions, so feel free to skim through next segments if you don't find all the material.

### ⭐ Learning Goals

This project brings together an array of skills like:

* Designing Java classes
* Adding instance fields
* Injecting a constructor method
* Implementing getters and setters
* Printing to the terminal
* Leveraging the `main` method
* Scope, or *variable shadowing*

### 🌐 Troubleshooting Guide
If you're stuck, follow these steps:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Are other students experiencing similar troubles?
2. If not, post your own by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Let your title begin with "Task x: overview of your problem".
3. Get in-person help during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Align your lab visits with your schedule.

Engage in discussions, but remember, **don't share problem solutions**!

### 💻 Assignment

Welcome to the Byte World, where the brave Player battles the mighty Enemies for high Scores! Your task is to model the game components in Java:

#### Exercise 3.1 -- Player Class
Create a `Player.java` class which must contain:

- A `String` field for the player's name
- An `int` field for the player's hit points (HP)
- An `int` field for player's score

The Player class should also contain:
- A constructor that accepts arguments for all instance fields.
- Getter and setter methods for each instance field.
- A `void` method `showStatus()` that prints all current player info (name, HP, and score)

#### Exercise 3.2 -- Enemy Class
Now, write `Enemy.java`, the class should include:

- A `String` field for the enemy's type.
- An `int` field for the enemy's HP.
- An `int` field for the damage the enemy can deal.

In addition to the said fields, incorporate:
- A constructor accepting all instance field arguments.
- Getters and setters for each field.
- A `void` method `showStatus()` that prints domestic info (type, HP, damage deal-ability)

#### Exercise 3.3 -- `attack()` 

Players must confront their enemies! Implement the `attack()` method in Player class to deal damage to an enemy. The damage should reduce enemy HP by a fixed integer value (e.g., 10 HP). Print the enemy's remaining HP and don’t forget to update player's score based on the damage inflicted. 

#### Exercise 3.4 -- Game Testing and Printing
Enliven the game! 

- Create one or more Player(s) and Enemy(ies) in your application's main method.
- Invoke attack commands and print player and enemy status after each attack.

#### Exercise 3.5 -- Playing with Scope 

Now, create a simple class heavy with shadowing elements. The class should incorporate global variables, local variables and instance fields with the same name, inspect their popularity, and reason your findings out. 

### 🐛 Bugs and errors?

Spotted an error? Create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) titled "Task x Error: briefly describe the error". Bug hunters deserve acknowledgment!