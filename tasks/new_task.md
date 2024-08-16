# Game On: Simple Game Application in Java!

For this exercise of the Java Programming course, you will delve into creating a simple game application. This will bring together much of what you have learned about Java classes, methods, and variable scopes.

### 🕒 Deadline
This assignment should be completed before **Friday, 20th May**.

### 🎓 Instructions
For instructions on how to do and submit the assignment, please refer to the [assignments section of the course instructions](https://gits-15.sys.kth.se/java-21/course-instructions#assignments).

### 🌱 Preparation
Before embarking on this assignment, please go through the following resources:

- Read the document on [Looking Inside Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- If you haven't done so yet, go to https://kth.oli.cmu.edu/, sign up and register for the course key `dd1337-ht22`

Reading ahead might be necessary in case you do not find all the required material.

### ✔️  Learning Goals

This assignment focuses on:
- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating getters and setters
- Printing to the terminal
- Using the main method
- Understanding scope (or *variable shadowing*)

### 🚀 Getting Started

Amidst confusion and anticipation, your task will be to construct a simple game where a player moves around, scores points, and interacts with enemies. A digital adventure, the player and enemies will be abstracted into Java classes with various attributes and methods.

The digital realm is yours for the taking. Let's get started!

### 🚨 Troubleshooting 
If you encounter issues or have questions, here's how to handle them:

1. Check out [posted issues](https://gits-15.sys.kth.se/java-21/help/issues). Perhaps other students had similar issues?
2. If not, post a question by creating a [New Issue](https://gits-15.sys.kth.se/java-21/help/issues/new). Make the title as descriptive as possible e.g. "Task X: summary of the problem"
3. Talk to a TA in-person during a [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule for upcoming labs.

You're encouraged to engage with your peers, but remember not to share answers!

### 🔨 Assignment

Your journey begins by creating two Java classes, `Player` and `Enemy`. Both classes represent characters in the game with specific attributes and methods. 

#### Exercise 1 — Player & Enemy Class and Fields
In the `src` subdirectory, create `Player.java` and `Enemy.java` files, each representing a class with properties like name, position (x and y coordinates), and score (only for Player) or health points (only for Enemy). The structure of the classes might look as follows:

```java
public class Player {
  private String name;
  private int xPosition;
  private int yPosition;
  private int score;
}

public class Enemy {
  private String name;
  private int xPosition;
  private int yPosition;
  private int health;
}
```
#### Exercise 2 — Getter & Setter Methods
Add getter and setter methods for all the fields in both classes so that these can be accessed and modified.

#### Exercise 3 — Constructor Method
Add a constructor method to the `Player` and the `Enemy` classes to initialize all the attributes at the time of object creation.

#### Exercise 4 — Player Movement
Add a `move` method in the `Player` class that receives the new x and y position and updates the player's current position.

#### Exercise 5 — Player-Enemy Interaction
In the Enemy class, create a `hitByPlayer` method that reduces the enemy's health when a player hits them. If the health falls to zero or less, print a message saying that the enemy has been defeated.

#### Exercise 6 — Scoring System
In the Player class, include a `hitEnemy` method which will receive an Enemy object (representing the enemy being hit). It will call the enemy's `hitByPlayer` method and increase the player's score each time they hit an enemy.

#### Exercise 7 — Main Method for Running the Game
Create a `Game.java` class with a `main` method. In this method, create some Player and Enemy objects, make the player hit some enemies and move around. Print the Player's score and the Enemy's health points to check if the game is functioning as expected.

> **Assistant's Note:** In all of the exercises, make sure to adhere to the principles of Ecapsulation. Your class fields should be `private`, and they should only be accessed and modified through getter and setter methods.

### 🐛 Bugs and Errors?
If you find any inconsistencies or errors in this exercise, don't hesitate to open a [New Issue](https://gits-15.sys.kth.se/java-21/help/issues/new) with the title "Task X Error: Summary of error here". You will receive our utmost gratitude and acknowledgment for your contribution towards improving the course material!