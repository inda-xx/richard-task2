# 🕹️ Java Game Development: Adventure Quest

Welcome to your new adventure in Java programming! This assignment involves creating a simple game application with player movement, a scoring system, and enemy interactions. You will learn and apply foundational concepts in object-oriented programming while designing a fun and interactive game.

### 💀 Deadline
This assignment should be completed by **Friday 22nd October**.

### 👨‍🏫 Instructions
For submission guidelines and additional resources, please refer to the [assignment section in the course instructions](https://your-course-url/assignments).

### 📝 Preparation
Before starting this assignment, ensure you have completed the following readings from the course materials:

- [Object-Oriented Programming Principles](https://your-course-url/topics/oop-principles)
- [Classes and Objects in Java](https://your-course-url/topics/java-classes-objects)
- [Encapsulation](https://your-course-url/topics/encapsulation)

> **Note:** It is recommended to familiarize yourself with the Java Standard Library for additional utility.

### ✅ Learning Goals

Through this assignment, you will achieve the following learning goals:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide

If you encounter any problems during this assignment, follow these steps:

1. Check the [issues forum](https://your-course-url/issues) to see if your question has already been addressed.
2. If your problem is not listed, create a [new issue](https://your-course-url/issues/new) with a concise title.
3. Seek assistance during the [weekly lab session](https://your-course-url/labs).

You are encouraged to collaborate and discuss with peers, but remember to complete your work independently.

### 🏛 Assignment

You will create a basic game application consisting of a player that can move around a grid, interact with enemies, and score points. Your game will feature three main components:

- **Player Movement**
- **Scoring System**
- **Enemy Interactions**

Let's delve into the exercises:

#### Exercise 1: Designing Classes and Fields
Create a new class called `GameCharacter.java` to model characters in your game. Include the following fields:

- `String` name
- `int` health
- `int` score
- `int` positionX
- `int` positionY

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public class GameCharacter {

    // instance fields
    private String name;
    private int health;
    private int score;
    private int positionX;
    private int positionY;

    public static void main(String[] args) {
      GameCharacter hero = new GameCharacter();
      hero.name = "Hero";
      hero.health = 100;
      hero.score = 0;
      hero.positionX = 0;
      hero.positionY = 0;

      // Display character information
      System.out.println("Character Name: " + hero.name);
      System.out.println("Health: " + hero.health);
      System.out.println("Score: " + hero.score);
      System.out.println("Position: (" + hero.positionX + ", " + hero.positionY + ")");
    }
  }
  ```

</details>

#### Exercise 2: Constructor and Methods
Add a constructor to `GameCharacter` to initialize its attributes using parameters. Create getters and setters for each field to manage encapsulation in your class.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public class GameCharacter {
    // fields
    private String name;
    private int health;
    private int score;
    private int positionX;
    private int positionY;

    // constructor
    public GameCharacter(String name, int health) {
      this.name = name;
      this.health = health;
      this.score = 0;
      this.positionX = 0;
      this.positionY = 0;
    }

    // getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }
    public int getPositionX() { return positionX; }
    public void setPositionX(int positionX) { this.positionX = positionX; }
    public int getPositionY() { return positionY; }
    public void setPositionY(int positionY) { this.positionY = positionY; }
  }
  ```

</details>

#### Exercise 3: Player Movement
Implement methods to handle movement of the player. The methods `moveUp()`, `moveDown()`, `moveLeft()`, and `moveRight()` will modify the player's position while printing the new location to the terminal.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public void moveUp() {
    positionY += 1;
    System.out.println(name + " moves up to (" + positionX + ", " + positionY + ")");
  }

  public void moveDown() {
    positionY -= 1;
    System.out.println(name + " moves down to (" + positionX + ", " + positionY + ")");
  }

  public void moveLeft() {
    positionX -= 1;
    System.out.println(name + " moves left to (" + positionX + ", " + positionY + ")");
  }

  public void moveRight() {
    positionX += 1;
    System.out.println(name + " moves right to (" + positionX + ", " + positionY + ")");
  }
  ```

</details>

#### Exercise 4: Scoring System
Design a simple scoring system. Implement a method `updateScore(int points)` to modify the score based on different interactions, such as collecting items or defeating enemies.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public void updateScore(int points) {
    score += points;
    System.out.println("Score updated! Current score: " + score);
  }
  ```

</details>

#### Exercise 5: Enemy Interactions
Create a basic enemy interaction system. Implement a method called `interactWithEnemy()` where the player can attack an enemy, and vice-versa, affecting the health of each.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public void interactWithEnemy(GameCharacter enemy) {
    if (health > 0 && enemy.health > 0) {
      System.out.println(name + " attacks " + enemy.name + "!");
      enemy.health -= 10;
      System.out.println(enemy.name + " health is now " + enemy.health);

      if (enemy.health <= 0) {
        System.out.println(enemy.name + " is defeated!");
        updateScore(10);
      }
    }
  }
  ```

</details>

#### Exercise 6: Understanding Variable Shadowing
Review the shadowing examples below. Analyze and understand how shadowing affects variable usage and initialization within your classes.

```java
public class ShadowExample {
    private int value = 10; // I want this value used :(

    public void showValue() {
        int value = 5;
        System.out.println(value); // Prints the wrong value :(
    }

    public static void main(String[] args) {
        new ShadowExample().showValue();
    }
}
```

**Discussion:** Discuss with your peers or in the lab how you would resolve these shadowing issues and appropriately use the `this` keyword.

> **Note:** Consider the scope and proper initialization of variables in object-oriented programming.

### 🐞 Bugs and Errors?
If you discover any inconsistencies or errors in this task, please report them by opening a [new issue](https://your-course-url/issues/new) tagged with the description "Game Task Error: [summary of error]." Your feedback is greatly appreciated!