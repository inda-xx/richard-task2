# Code Quest: Journey of the Drifters! 🎮

In this exercise for our programming course, you will use the skills you've been practicing in Java to develop a simple game application! Get ready for an exciting adventure where you'll design the behaviors and interactions of various in-game entities. 

## 📅 Due Date
This project should be completed by **Friday, 18th March**.

## 👓 Guidelines
For guidance on how to approach and submit the assignment, kindly refer to the [assignments section of the course guideline](https://github.com/java-course-guide/course-instructions#assignments).

## 📚 Pre-requisites
Please review and respond to questions in the OLI material for Module 5.

- Read [Java Programming Basics](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=JavaProgrammingBasics)
- Also, visit https://kth.oli.cmu.edu/, sign up and register for the course key 'codequest-ht22'

> **Assistant's Note:** Despite occasional discrepancies between the OLI tasks and materials this year, feel free to skip ahead if you did not find all the required information.

## 🎯 Learning Objectives

Through this assignment, you'll be able to hone the following skills:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating getters and setters
* Printing to the terminal
* Using the main method
* Scope (or variable shadowing)

## 🚦 Problem-solving Protocol
In case you stumble across any issues or have any questions, adhere to the following steps:

1. Browse this week's [posted issues](https://github.com/code-quest/help/issues)
2. If nobody else is experiencing similar issues, create a [New Issue](https://github.com/code-quest/help/issues/new) and provide a descriptive title, starting with "Task *x*: *summary of problem here*"
3. Reach out to a TA during the [weekly lab session](https://queue.csc.kth.se/Queue/CODE-QUEST). Refer to your schedule for the timing.

We encourage active discussions with your peers, but remember: **do not share solutions**!

## 📜 Assignment

For this assignment, you will develop a game that consists of:
  - A player character that can move and score points
  - Enemies that pose a challenge to the player
  - A scoring system that keeps track of the game's progression

### Exercise 1: Designing Your Game Entities
Design three Java classes: `Player`, `Enemy` and `Game`.

Your `Player` class should have the following fields:
- `String` name
- `int` xPosition
- `int` yPosition
- `int` score

Your `Enemy` class should have the following fields:
- `String` type
- `int` xPosition
- `int` yPosition
- `int` damage

Your `Game` class should have the following fields:
- `Player` player
- `Enemy` enemy

In each class, create getters and setters for each field.

Implement a constructor for each class that accepts arguments to initialize each field. The `Game` class constructor should accept `Player` and `Enemy` objects.

### Exercise 2: Player Movement
In the `Player` class, implement methods to represent the player's movement in four directions: `moveUp()`, `moveDown()`, `moveLeft()`, `moveRight()`. Each method should modify the player's `xPosition` or `yPosition` accordingly.

### Exercise 3: Scoring System
In the `Player` class, implement a method called `increaseScore` that accepts an integer argument and adds it to the player's current score.

### Exercise 4: Enemy Interactions
In the `Enemy` class, implement a method called `attackPlayer`. This method should accept a `Player` object, and deduct the `Enemy`'s `damage` from the `Player`'s `score`.

In the `Player` class, implement a method called `attackEnemy`. This method should accept an `Enemy` object, and deduct a fixed value (e.g. `10`) from the `Enemy`'s `damage`.

### Exercise 5: Game Execution
In the `Game` class, implement a method called `startGame`. This method should demonstrate interactions between game entities. For example, it could involve player movement, player and enemy attacks, and updates to the player's score.

### Exercise 6: Variable Shadowing
Review the concept of variable shadowing and illustrate it using any of the classes you've designed. Explain how you could resolve the shadowing issue using the `this` keyword.

Your task is to implement the features outlined in the assignment description, and add any extra features of your choice to enhance your game.

It is essential to ensure your code is clean and well commented. Good luck!