# Hazard Hunters! 

For this project, you will develop a simple game in Java. You are going to apply your understanding of Java classes.

### 🏷 Deadline
Be ready to submit your work by **Friday, 25th February**.

### 💼 Project Brief
For instructions on how to carry out and submit the assignment, please refer to the [project section of the course instructions](https://project.org/course-instructions#course-assignments).

### 🔖 Prep Work
You must read and fulfill the exercises in the documentation for Module 3 before starting the assignment.

- Review [Intro to Class Design](https://javaclass.design.cmu.edu/jcourse/webui/syllabus/module.do?context=1919a808ac1f650b132f650bac60f8)
- If you have yet to do so, visit https://javaclass.design.cmu.edu/ and register for the course `hc1337-ht23`.

> **Assistant's Note:** As the material and tasks may vary slightly every year, feel free to read ahead if you aren't finding all of the material needed.

### 🔨 Learning Objectives

The learning goals of this week include:

* Designing Java classes 
* Adding instance fields 
* Adding a constructor method 
* Creating getters and setters 
* Printing to the terminal 
* Using the `main` method 
* Scope (or variable shadowing)

### 📚 Assignment

Your mission is to create a simple game, **Hazard Hunters**, where a hunter must navigate through a dangerous forest and avoid or overcome enemies.

#### Exercise 3.1
Create Java classes for the game entities. Your game should include, at a minimum:

- `Hunter` class: This will handle player movement and scoring. It should include fields for the name, current location (x and y coordinates), and score.
- `Enemy` class: This will handle enemy interactions and behaviors. It should include fields for the enemy’s type, their strength, and their own location (x and y coordinates).

#### Exercise 3.2
Add a constructor method to each class. This constructor should set all the instance fields according to the parameters provided.

#### Exercise 3.3
Create getters and setters for the attributes that need to be accessed or modified from outside the class.

#### Exercise 3.4
Put in a simple method for tallying the score. This method should calculate points based on how many enemies the Hunter was able to outrun.

#### Exercise 3.5
Define a method in your `Hunter` class for moving the Hunter. Update the Hunter's location based on user input and check if the new location coincides with an Enemy's location. If it does, reduce the Hunter's score based on the enemy’s power.

#### Exercise 3.6
Add a `printInfo()` method to both classes. This method should print all the information about the Hunter or Enemy to the terminal.

#### Exercise 3.7
Implement the functionality for the main game loop within a `main` method. It should create instances of the Hunter and Enemy classes, accept inputs for movement, and check for collisions.

#### Exercise 3.8
Variable shadowing: Study the example in the assignment briefing and understand how to prevent variable shadowing.

### ⚠️ Troubleshooting

If you face any issues or have questions, follow these steps:

1. Refer to this week's [project queries](https://project.org/help/issues). Are other students raising similar issues?
2. If not, post your question by creating a [New Post](https://project.org/help/issues/new). Add a clear title, starting with "Task *x*: *summary of problem*"
3. Ask a project mentor in person during the [project consultation session](https://queue.csc.kth.se/Queue/HC). Check your schedule to find out when the next session will be held.

Discussions on the project with friends are encouraged, but **code sharing is strictly prohibited**!

### 🪲 Bugs and mistakes?

If you come across any errors or discrepancies in this exercise, please open a [New Post](https://project.org/help/issues/new) with the title "Task *x* Error: *summary of error here*". Anyone who spots errors will be acknowledged in the acknowledgment section.