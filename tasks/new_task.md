# Battle of the Bytes! 💻⚔️

Welcome class! For our next assignment, we're practising Java fundamentals in an unconventional manner! We're creating a simple game application that will help you understand the design and interaction of Java classes.

### 💀 Deadline
The assignment should be completed before **Friday 1st October**.

### 👩‍🏫 Instructions
For instructions on how to do and submit the assignment, please check the [assignments section of the course instructions](https://github.com/unique/course-instructions).

### 📝 Preparation
To achieve the learning goals, you have to complete the following tasks:

- Read and understand [Ins and Outs of Classes](https://java.web.url/classes)
- Register at https://java.web.url/, using the course key `dd2244-ht22`

> **Assistant's Note:** The online material is a bit out-of-step, so don't hesitate in exploring the upcoming modules!

### ✅ Learning Goals

Primarily, you will learn about:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide
If you encounter any issues:

1. Check [posted issues](https://github.com/unique/course-issues). Are others experiencing the same trouble?
2. If not, create a [New Issue](https://github.com/unique/course-issues/new). Add a precise title, starting with "Task x: Summary of problem".
3. Ask a TA during the [weekly lab](https://queue.csc.tasks.com/Queue/INDA). Check your schedule for the lab.

Feel free to discuss with your classmates, but **do not share answers**!

### 🏛 Assignment

You will build a simple game in which players and enemies (or `Bytes`) engage in a battle of scores! Using object-oriented programming (OOP) principles, you'll define classes for the player, enemy, and the necessary game behaviors.

#### Exercise 1.0 -- Design Player and Enemy classes

In the `/src` directory, create two new classes: `Player.java` and `Enemy.java`. The class attributes will be:

- `Player`: `String name`, `int score`, `int lives`
- `Enemy`: `String name`, `int score`

Define these attributes with appropriate access modifiers (probably `private`). You can utilize any standard naming convention.

#### Exercise 1.1 -- Add Constructors

Create constructors for each class that initialize their fields at object creation. Constructors helps to reduce redundancy and improve code readability.

#### Exercise 1.2 -- Getters and Setters for the Win

For every instance variable you added, create appropriate getters and setters. This will help the code maintain encapsulation while still allowing access to instance variables.

#### Exercise 1.3 -- The Main Showdown

In the `main` method of the `Game.java` class, create an instance of the Player and Enemy class. Via setters or directly (if access permissions allow), assign values to the instance fields. Use getters to print the fields to the console.

#### Exercise 1.4 -- Player Vs Enemy: Let The Games Begin!

In the `Game.java` class, create a `startGame()` method that simulates the game's scoring system. The player scores by multiplying its current score by 2 each time. The enemy scores by adding 15 to its current score each time. The game ends when the player loses all three lives (deduct one life each round). The player or enemy with the highest score wins!

#### Exercise 1.5 -- Keeping Score

In the `Player` class, implement a `printScore()` method that prints the player's score to the terminal. Do the same for the `Enemy` class.

#### Exercise 1.6 -- Understanding Scope (Variable Shadowing)

Define two instances with the same name, one at the class level and another inside a method (creating a shadow effect). Now, try to access both variables using the `this` keyword. For instance, use `this.score = score`. Analyze the effect of variable shadowing in Java.

### 🐞 Found Any Bugs?
If you find any mistakes or inconsistencies in this exercise, kindly open a [New Issue](https://github.com/unique/course-issues/new) with the title "Task x Error: Summary of error". Happy bug hunting! 🦟