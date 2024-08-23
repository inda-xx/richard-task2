# 🎮 Simple Java Game: The Adventure Awaits!

Welcome to your next assignment, where you'll create a simple Java game application to practice object-oriented programming concepts. This task focuses on player movement, a scoring system, and enemy interactions. By completing this challenge, you'll enhance your skills in designing Java classes and implementing fundamental principles of Java programming.

### 💀 Deadline
This work should be completed before the exercise, on **Friday, November 24th**.

### 👨‍🏫 Instructions
For instructions on how to do and submit the assignment, please see the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation
To prepare for this task, ensure you are comfortable with the following concepts:

- Object-Oriented Programming basics
- Java classes and objects
- Methods (constructors, getters, setters)
- The `main` method
- Scope and variable shadowing

Visit the following resources to brush up on these topics:

- [Java Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
- [Method Basics](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)

### ✅ Learning Goals

This task's learning goals include:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide
If you encounter any issues, follow this process:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues) for similar problems.
2. If not resolved, post a new issue with a detailed title, starting with "Game Task: [summary of problem]".
3. Ask a TA during [weekly lab sessions](https://queue.csc.kth.se/Queue/INDA). Check your schedule to find the next lab.

**Collaborate, don’t copy!** Discussing concepts with classmates is encouraged, but sharing exact answers is not.

### 🏛 Assignment

Embark on an adventure by creating a Java game with basic functionalities. In this task, you'll implement a character that moves around a 2D grid, collects points, and interacts with enemies.

#### Exercise 1.0 -- Class Design
Create the following classes in your project:

1. **Player**: Represents the player's character with fields for `name` (String), `score` (int), `positionX` (int), `positionY` (int).
2. **Enemy**: Represents an enemy character with fields `type` (String), `positionX` (int), `positionY` (int).
3. **Game**: Contains the main method to run the game.

<details>
  <summary> 🛠 Example for Player and Enemy </summary>

  ```java
  public class Player {
      // Fields
      private String name;
      private int score;
      private int positionX;
      private int positionY;

      // Constructor
      public Player(String name, int startX, int startY) {
          this.name = name;
          this.score = 0;
          this.positionX = startX;
          this.positionY = startY;
      }

      // Getters and Setters
      public String getName() { return name; }
      public int getScore() { return score; }
      public int getPositionX() { return positionX; }
      public int getPositionY() { return positionY; }

      public void setPositionX(int x) { this.positionX = x; }
      public void setPositionY(int y) { this.positionY = y; }

      // Print Info
      public void printInfo() {
          System.out.printf("Player: %s, Score: %d, Position: (%d, %d)\n", name, score, positionX, positionY);
      }
  }

  public class Enemy {
      // Fields
      private String type;
      private int positionX;
      private int positionY;

      // Constructor
      public Enemy(String type, int x, int y) {
          this.type = type;
          this.positionX = x;
          this.positionY = y;
      }

      // Getters
      public String getType() { return type; }
      public int getPositionX() { return positionX; }
      public int getPositionY() { return positionY; }
  }
  ```
</details>

#### Exercise 1.1 -- Implement Movement
Add methods in the `Player` class to move the player:

- `moveUp()`
- `moveDown()`
- `moveLeft()`
- `moveRight()`

Ensure the player cannot move out of bounds (assume a 5x5 grid).

<details>
  <summary> 🛠 Example 1.1 Method Implementation </summary>

  ```java
  public void moveUp() {
      if (positionY > 0) {
          positionY--;
      }
  }

  public void moveDown() {
      if (positionY < 4) {
          positionY++;
      }
  }

  public void moveLeft() {
      if (positionX > 0) {
          positionX--;
      }
  }

  public void moveRight() {
      if (positionX < 4) {
          positionX++;
      }
  }
  ```
</details>

#### Exercise 1.2 -- Scoring System
Update the `Player` class to include a method to increase the score, and integrate this logic to simulate collecting points:

- `collectPoint()`: Increases `score` by 1.

<details>
  <summary> 🛠 Example 1.2 Method </summary>

  ```java
  public void collectPoint() {
      score++;
  }
  ```
</details>

#### Exercise 1.3 -- Enemy Interactions
Add a method in the `Game` class to check interactions between the player and enemies. If they occupy the same position, print a message:

- `checkCollisions(Player player, Enemy[] enemies)`

<details>
  <summary> 🛠 Example 1.3 Method </summary>

  ```java
  public void checkCollisions(Player player, Enemy[] enemies) {
      for (Enemy enemy : enemies) {
          if (player.getPositionX() == enemy.getPositionX() &&
              player.getPositionY() == enemy.getPositionY()) {
              System.out.println("Player encountered an enemy: " + enemy.getType());
          }
      }
  }
  ```
</details>

#### Exercise 1.4 -- Variable Shadowing
Explore and understand scope mistakes by examining the following `Game` class example. Identify how to resolve the variable shadowing issue here:

```java
public class Game {
    private int width = 5;
    
    public void displayGrid() {
        int width = 10;
        System.out.println("The grid width is: " + width); // This is printing the wrong value
    }
}
```

> **Hint:** Utilize the `this` keyword to resolve shadowing.

### 🐞 Bugs and errors?
If there are any issues or errors with this exercise, please notify us by opening a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the subject "Game Task Error: [summary of error]". Your feedback is appreciated!