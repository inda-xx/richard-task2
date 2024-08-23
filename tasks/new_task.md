# 🎮 Adventure in Code Land!

Embark on a journey to create a simple game using Java! You'll design a game featuring player movement, a scoring system, and enemy interactions. Ready your IDE, adventurer, and let's dive into the world of object-oriented programming.

### ⚡ Deadline
Complete and submit this assignment by **Friday, 6th October**.

### 👨‍🏫 Instructions
Refer to the [course instructions](https://gits-15.sys.kth.se/game-23/course-instructions#assignments) for details on submitting this assignment.

### 📝 Preparation
Before starting, make sure to review the following resources:

- Read about [Java Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html).
- Understand [Encapsulation in Java](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html).

### ✅ Learning Goals

Through this exercise, you will:
* Design Java classes
* Add instance fields
* Implement constructor methods
* Create *getters* and *setters*
* Print information to the terminal
* Use the `main` method to run your application
* Understand variable scope and *variable shadowing*

### 🕹️ Game Over, Man! (Troubleshooting Guide)
If you encounter issues:

1. Check the [discussion board](https://gits-15.sys.kth.se/game-23/help/issues) for common issues.
2. If your problem is unique, post a question using the [New Issue](https://gits-15.sys.kth.se/game-23/help/issues/new) feature.
3. Visit a TA during lab hours. Find the schedule [here](https://queue.csc.kth.se/Queue/GAME).

Collaborate with peers but remember, **no sharing of answers**!

### 🎲 Assignment: Create a Simple Game!

You're tasked with crafting a game featuring a player, a scoring system, and interactions with enemies. Utilize Java to build a basic game setup and prepare your skills for more advanced projects.

#### Exercise 1.0 -- Fields and Player Class
In the `src` directory, create a new class called `Player.java`. This class should contain the following fields:

- `String` name
- `int` score
- `int` positionX
- `int` positionY

Ensure the fields are declared with the appropriate access modifiers (`private` recommended for encapsulation).

<details>
  <summary> 📜 Example </summary>

  ```java
  public class Player {
      private String name;
      private int score;
      private int positionX;
      private int positionY;

      // other methods will be added here
  }
  ```
</details>

#### Exercise 1.1 -- Getters and Setters
Encapsulate the `Player` class fields by implementing *getters* and *setters* for each field. This will provide controlled access to the object's properties.

<details>
  <summary> 📜 Example </summary>

  ```java
  public class Player {
      private String name;
      private int score;
      private int positionX;
      private int positionY;

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      // implement the rest of the getters and setters
  }
  ```
</details>

#### Exercise 1.2 -- Constructor Method
Design a constructor for the `Player` class that initializes the `name` and starting position (`positionX`, `positionY`) of the player. Set the initial score to zero.

<details>
  <summary> 📜 Example </summary>

  ```java
  public Player(String name, int positionX, int positionY) {
      this.name = name;
      this.positionX = positionX;
      this.positionY = positionY;
      this.score = 0;
  }
  ```
</details>

#### Exercise 1.3 -- Player Movement
Implement a `move` method that updates the player's position. This method should take two parameters representing the movement in the X and Y directions respectively.

<details>
  <summary> 📜 Example </summary>

  ```java
  public void move(int deltaX, int deltaY) {
      this.positionX += deltaX;
      this.positionY += deltaY;
      System.out.println("Player moved to position: (" + positionX + ", " + positionY + ")");
  }
  ```
</details>

#### Exercise 1.4 -- Scoring System
Create a method `addScore` which increases the player's score. The amount to increase will be passed as a parameter to this method.

<details>
  <summary> 📜 Example </summary>

  ```java
  public void addScore(int points) {
      this.score += points;
      System.out.println("Score updated: " + score);
  }
  ```
</details>

#### Exercise 2.0 -- Enemy Class
Create another class in the `src` directory called `Enemy.java` with the following fields:

- `String` type
- `int` health
- `int` positionX
- `int` positionY

You should also implement *getters*, *setters*, and a constructor for the `Enemy` class.

#### Exercise 2.1 -- Enemy Interactions
Implement a method in the `Player` class that allows the player to "attack" an enemy. This method should reduce the enemy's health and update the player's score.

<details>
  <summary> 📜 Example Method in Player Class </summary>

  ```java
  public void attack(Enemy enemy, int attackDamage) {
      enemy.setHealth(enemy.getHealth() - attackDamage);
      System.out.println("Attacked " + enemy.getType() + " for " + attackDamage + " damage!");
      if (enemy.getHealth() <= 0) {
          System.out.println(enemy.getType() + " defeated!");
          this.addScore(100);
      }
  }
  ```
</details>

#### Exercise 3.0 -- The Main Method and Testing
In a `Game.java` file, implement the `main` method to instantiate and interact with the `Player` and `Enemy` objects. Demonstrate all functionalities, including player movement, scoring, and enemy interactions.

<details>
  <summary> 📜 Example Main Method </summary>

  ```java
  public class Game {
      public static void main(String[] args) {
          Player hero = new Player("Hero", 0, 0);
          Enemy goblin = new Enemy("Goblin", 30, 5, 5);

          hero.move(1, 1);
          hero.attack(goblin, 10);
          hero.attack(goblin, 20);
      }
  }
  ```
</details>

#### Exercise 4.0 -- Scope and Variable Shadowing
Review the examples below on variable shadowing. You may be asked to explain the concept in the class, illustrating the use of `this` to resolve shadowing issues. Research using [Wikipedia](https://en.wikipedia.org/wiki/Variable_shadowing) and the [Oracle tutorial](https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html).

> **Note:** Pay careful attention to when a local variable or a parameter shadows an instance field.

```Java
public class Example {
    private int value = 42; // This is the intended value to print

    public void demonstrateShadowing() {
        int value = 100; // This shadows the instance variable
        System.out.println(value); // Prints the local variable
    }

    public static void main(String[] args){
        new Example().demonstrateShadowing();
    }
}
```

Consider how to fix such examples by properly using `this`.

### 🐛 Bugs and Errors?
Spot inconsistencies or errors in this task? Report them by opening a [New Issue](https://gits-15.sys.kth.se/game-23/help/issues/new) with the title "Task Error: *describe your issue here*". Credits to those who find and help fix bugs!