# 🎮 Simple Game Design: Java Game Adventure!

In this exercise, you'll create a simple game application using Java. You'll focus on object-oriented design principles to model game components such as players, scoring systems, and enemy interactions. Be prepared to showcase your skills in designing Java classes, practicing encapsulation, and handling scope.

### 🕒 Deadline
Please complete this exercise by **Friday, 23 September**.

### 📚 Instructions
For details on submission, check out the [course assignments section](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation
Prior to diving into the task, review these essential materials:

- Read [Introduction to Object-Oriented Programming in Java](https://some-java-oop-course.com)
- Familiarize yourself with [Java Encapsulation](https://docs.oracle.com/javase/tutorial/java/javaOO/encapsulation.html)

> **Note:** Ensure you are comfortable with Java basics before attempting this exercise.

### 🎯 Learning Goals

This exercise aims to help you achieve the following:

- Designing Java classes
- Adding instance fields
- Developing constructor methods
- Creating *getters* and *setters*
- Printing information to the terminal
- Using the `main` method effectively
- Understanding and working with scope (or *variable shadowing*)

### ⚙️ Troubleshooting Guide

Facing issues? Follow these steps:

1. Review issues posted by peers [here](https://gits-15.sys.kth.se/inda-22/help/issues).
2. If unresolved, post your query with a new [issue submission](https://gits-15.sys.kth.se/inda-22/help/issues/new).
3. Consult with your TA during weekly labs available on [this schedule](https://queue.csc.kth.se/Queue/INDA).

Remember to collaborate with classmates, but avoid sharing code solutions.

### 🕹️ Assignment Description

Dive into the world of game coding by creating a Java-based adventure with a player, enemies, and a scoring system.

#### Exercise 3.0 -- Game Entities
In the `src` folder, create a new class called `Player.java` and another class called `Enemy.java`.

#### Player.java
- Fields: `String name`, `int score`, `int positionX`, `int positionY`
- Methods: Detailed instructions on methods are below in exercises.

#### Enemy.java
- Fields: `String type`, `int health`, `int attackPower`, `int positionX`, `int positionY`
- Methods: Detailed instructions on methods are below in exercises.

#### Exercise 3.1 -- Player and Enemy Movement
Implement methods to handle movement for your `Player` and `Enemy` classes. Each should be able to move up, down, left, and right, adjusting their `positionX` and `positionY` values.

```java
public class Player {
  private String name;
  private int score;
  private int positionX;
  private int positionY;

  // Constructor
  public Player(String name, int startX, int startY) {
    this.name = name;
    this.positionX = startX;
    this.positionY = startY;
    this.score = 0; // initial score
  }

  // Movement methods
  public void moveUp() {
    this.positionY -= 1;
  }

  public void moveDown() {
    this.positionY += 1;
  }

  public void moveLeft() {
    this.positionX -= 1;
  }

  public void moveRight() {
    this.positionX += 1;
  }

  // Other methods as needed
}
```

#### Exercise 3.2 -- Scoring System
Create methods to increase and decrease the player's score. Ensure that the score cannot be negative.

```java
public void increaseScore(int points) {
  this.score += points;
}

public void decreaseScore(int points) {
  this.score = Math.max(this.score - points, 0);
}
```

#### Exercise 3.3 -- Implement Interactions
Define a method for interaction between `Player` and `Enemy`. Players should be able to "attack" enemies, reducing their health and potentially increasing the score.

In `Player.java`:

```java
public void attack(Enemy enemy) {
  enemy.reduceHealth(5);
  if (enemy.getHealth() <= 0) {
    increaseScore(10);
    System.out.println("Enemy defeated!");
  }
}
```

In `Enemy.java`:

```java
public void reduceHealth(int damage) {
  this.health -= damage;
  if (this.health < 0) this.health = 0;
}
```

#### Exercise 3.4 -- Constructors and Method Demonstration
Ensure each class has a constructor that initializes all fields. Use getters and setters as necessary to maintain encapsulation.

#### Exercise 3.5 -- printInfo()
Implement a `printInfo()` method in both classes to display the current state of the player and enemy to the terminal.

#### Exercise 3.6 -- Main Method
Create a `Game.java` class with a `main` method to initialize `Player` and `Enemy` objects and simulate gameplay using the methods you've implemented.

```java
public class Game {
  public static void main(String[] args) {
    Player player = new Player("Hero", 0, 0);
    Enemy enemy = new Enemy("Goblin", 30, 5, 5, 5);

    player.printInfo();
    enemy.printInfo();

    player.moveRight();
    player.attack(enemy);

    player.printInfo();
    enemy.printInfo();
  }
}
```

#### Exercise 3.7 -- Scope and Variable Shadowing
Understand and fix any issues of variable shadowing in your code implementations. Here’s an example you can reference when fixing shadowing issues:

```java
public class Example {
    private int value = 0;

    public void setValue(int value) {
      this.value = value; // Avoids shadowing
    }
}
```

### 🐞 Bugs?
Notice anything off or incorrect? Report an issue [here](https://gits-15.sys.kth.se/inda-22/help/issues/new). Your feedback is invaluable!

---

Good luck, future game developer! 🚀