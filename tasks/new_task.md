# Battle Blocks, Survive!

In this exercise, you are going to build a simple game application using core JAVA programming concepts. The purpose of this exercise is to acquaint you with Java classes, instance fields, constructor methods, getters and setters, and printing to the terminal.

### 🎯 Deadline
This game application should be completed before the next class, on **Tuesday 20th September**.

### 👷‍♂️ Instructions
For instructions on how to do and submit the assignment, please see the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### ⚒️ Preparation
Before starting this task make sure to read and understand the following preparatory material:
- Read and practice [Defining and Using Classes in Java](https://openbookproject.net/thinkcsjava/chap10.html)
- Check out the basics of [Java Game Development](https://beginnersbook.com/2017/08/java-tutorial-game-development/)

### 🎯 Learning Goals
The learning goals for this exercise include:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### ☔ Troubleshooting Guide
If you encounter any problems:
1. Revisit the learning goals and make sure that you understand each concept.
2. Ask a question by raising a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Start the title with "Task: Game App" followed by your specific question.
3. Ask a TA for help during the next lab session. 

Remember, it's great to discuss this task with your peers, but do not share answers!

### 🎲 Assignment

The task presents a game called *Battle Blocks*. The game depends on a player's character, which can move on a grid. The objective is to survive as long as possible by avoiding enemies that randomly appear on the grid. The player can earn points by picking up collectible items that also randomly appear on the grid.

#### Main Classes Configuration:
1. Player (includes name, position x and y, score)
2. Enemy (includes position x and y)
3. Item (similar to enemy but increases the player's score when collected)

Each class must be assembled with corresponding getter and setter methods and an appropriate constructor. All instance fields should be private to ensure that they are accessed and modified correctly. 

For printing to the terminal, you must include a method in the Player class (for example, `printPlayerStatus()`) that prints the current status of the player (name, position, and score).

For the main method, use a class Game where you will create instances and manage interactions between the objects. Here, you will also control the player's movement based on the user input. You can start with basic text input for testing purposes and later upgrade to keyboard events if you prefer.

#### Additional Requirements:
- When an enemy touches (occupies the same block as) the player, the game should end.
- The enemies and items should appear at random positions within the grid after a certain interval or event (such as after moving or collecting an item).
- The game should maintain the player's high score after each round.

### Bugs or Errors?
If you find any inconsistencies or errors in this text, raise a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task: Game App Error: summary of the error".