# Let's Play: Game On! 🎮🚀

In your second assignment of INDA, your mission is to create a simple game application. You'll hone your Java skills by modeling objects and adding various functionalities.

### ⌛ Deadline
This project should be completed before the exercise, on **Friday 18th March**.

### 👩‍🏫 Instructions
For instructions on how to do and submit the assignment, please see the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation
You must read and answer the questions in the OLI material for Module 2.

- Read [Class Design in Java](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- If you have not done so, go to https://kth.oli.cmu.edu/, sign up and register for the course key `dd1337-ht22`

> **Assistant's Note:** The OLI material and tasks might be slightly out of order this year, so it is ok to read ahead if you cannot find all the material.

### ✅ Learning Goals

This week's learning goals include:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide
If you encounter any issues or questions, follow these steps:

1. Look at this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Are other students experiencing the same problem?
2. If not, create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Add a descriptive title, starting with "Task *x*: *summary of problem here*"
3. Seek in-person assistance from a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule for the next lab time.

Remember, you can discuss with your coursemates, but **do not share exact answers**!

### 🏛 Assignment

Your task is to design a simple game where a player can move in a space, score points by collecting items, and interact with enemies. The classes involved in your game might include `Player`, `Item`, `Score`, and `Enemy`.

#### Exercise 1.0 -- Design the `Player` Class
In the `src` folder, create a new class named `Player.java`. This class should model a player in your game. The `Player` class should have:

- `String` name
- `int` xPosition
- `int` yPosition
- `int` healthPoints
- `int` score

Create *getters* and *setters* for all these fields. Moreover, implement two methods, `moveX` and `moveY`, that modify the player's position.

#### Exercise 1.1 -- Design the `Enemy` Class
In the `src` folder, create a new class named `Enemy.java`. This class should model an enemy in your game. The `Enemy` class should have:

- `String` name
- `int` xPosition
- `int` yPosition
- `int` damage

Create *getters* and *setters* for all these fields. Also, implement a `moveTowardsPlayer` method that takes a `Player` object and modifies the enemy's position to move towards the player.

#### Exercise 1.2 -- Design the `Item` Class
In the `src` folder, create a new class named `Item.java`. This class should model an item in your game. The `Item` class should contain:

- `String` name
- `int` xPosition
- `int` yPosition
- `int` points

Create *getters* and *setters* for all these fields.

#### Exercise 1.3 -- Create the `Game` Class
In the `src` folder, create a new class named `Game.java`. Implement a `main` method in which you instantiate objects from the `Player`, `Item`, and `Enemy` classes. Add code to simulate player movements, item collection, enemy interactions, and scoring system.

Write methods to print the game status, including player position, health points, score, and the positions of items and enemies.

#### Exercise 1.4 -- Scope (or *Variable Shadowing*)
Look at examples of variable shadowing in the OLI Module and understand how scope works in Java. You may need to apply this concept in your `Game` class to prevent variable shadowing.

### 🐞 Bugs and errors?
If you notice any inaccuracies or errors in this assignment, please open a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task *x* Error: *summary of error here*". By reporting bugs, you'll help improve the quality of future assignments.