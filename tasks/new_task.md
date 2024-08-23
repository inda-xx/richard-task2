# 🎮 Simple Java Game: Adventures in the Maze

Welcome to the Java Game Development exercise! In this task, you'll create a simple game application that allows the player to move around, collect points, and interact with enemies. By completing this exercise, you will gain valuable experience in object-oriented programming in Java.

### 💀 Deadline
This assignment should be completed before the exercise on **Monday 30th October**.

### 👩‍🏫 Instructions
For detailed instructions on how to complete and submit the assignment, please consult the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation
Ensure you have completed the readings and exercises in the OLI material for Module 3:

- Read [Understanding Classes and Objects](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60).

### ✅ Learning Goals
The goals for this week include:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide
If you encounter any issues, please follow these steps:

1. Check the [help section](https://gits-15.sys.kth.se/inda-22/help/issues) to see if the problem has already been addressed.
2. If not, post a question by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Clearly describe the problem and include "Game Task" in the title.
3. Consult a TA during the [weekly lab sessions](https://queue.csc.kth.se/Queue/INDA).

Collaborate with classmates, but **do not share solutions**!

### 🏛 Assignment Description

In this task, we will simulate an adventurous journey through a mysterious maze. You'll create classes to represent the player, enemies, and the scoring system. By the end, you'll have a simple game where the player moves, collects points, and avoids or interacts with enemies.

#### Exercise 1.0 -- Designing Classes
Start by creating the `Player`, `Game`, and `Enemy` classes in the `src` folder. Use fields to represent key attributes:

- `Player` class:
  - `String` name
  - `int` score
  - `int` health
  - `int` positionX, `positionY`

- `Enemy` class:
  - `String` type
  - `int` positionX, `positionY`

Implement the following constructor and methods:
- A constructor for initializing objects.
- Getters and setters for all fields.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  class Player {
      private String name;
      private int score;
      private int health;
      private int positionX;
      private int positionY;

      // Constructor
      public Player(String name) {
          this.name = name;
          this.score = 0;
          this.health = 100;
          this.positionX = 0;
          this.positionY = 0;
      }

      // Getters and setters
      public String getName() { return name; }
      public void setName(String name) { this.name = name; }

      public int getScore() { return score; }
      public void setScore(int score) { this.score = score; }

      public int getHealth() { return health; }
      public void setHealth(int health) { this.health = health; }

      public int getPositionX() { return positionX; }
      public void setPositionX(int positionX) { this.positionX = positionX; }

      public int getPositionY() { return positionY; }
      public void setPositionY(int positionY) { this.positionY = positionY; }
  }
  ```
</details>

#### Exercise 1.1 -- Player Movement
Implement player movement within the maze. The player can move up, down, left, or right. Define a method `move(int x, int y)` in the `Player` class.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  public void move(int deltaX, int deltaY) {
      this.positionX += deltaX;
      this.positionY += deltaY;
      System.out.println("Player moved to position: (" + positionX + ", " + positionY + ")");
  }
  ```
</details>

#### Exercise 1.2 -- Scoring System
Create a `scorePoints(int points)` method in the `Player` class to update the player's score. Print the new score after adding points.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public void scorePoints(int points) {
      this.score += points;
      System.out.println("Score updated: " + score);
  }
  ```
</details>

#### Exercise 1.3 -- Enemy Interactions
Add an interaction method `interactWithEnemy(Enemy enemy)` in the `Player` class. If the player occupies the same position as an enemy, decrease the player's health and print a status message.

<details>
  <summary> 🛠 Example 4 </summary>

  ```java
  public void interactWithEnemy(Enemy enemy) {
      if (this.positionX == enemy.getPositionX() && this.positionY == enemy.getPositionY()) {
          this.health -= 10;
          System.out.println("Encountered an enemy! Health now: " + health);
      } else {
          System.out.println("No enemy encountered.");
      }
  }
  ```
</details>

#### Exercise 1.4 -- Variable Shadowing Exploration
Understand and resolve variable shadowing issues within the constructor or methods. Modify the constructor if needed using the `this` keyword.

<details>
  <summary> 🛠 Example 5 </summary>

  ```java
  // Constructor with potential shadowing issue
  public Player(String name, int score) {
      this.name = name;  // Correct use of 'this' to refer to the instance variable
      this.score = score;
  }
  ```
</details>

> **Assistant's Note:** Carefully observe methods and constructors for any possible variable shadowing and correct them as necessary.

### 🐞 Bugs and Errors?
If you detect any errors within the exercise, please report them by opening a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) titled "Game Task Error: *summary of error here*". Identified bugs may earn shout-outs in acknowledgments!