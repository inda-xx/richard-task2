# 👾 Java Game Task: Simple Game Application

Welcome to your Java game development assignment! In this task, you will create a simple text-based game application that incorporates player movement, scoring, and enemy interactions.

### 💀 Deadline
This assignment is due by **Friday, 18th November**. Make sure to submit your solution before the deadline.

### 👩‍🏫 Instructions
For submission instructions, please refer to the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation
To prepare for this task, review the following materials:

- Study [Java Class Design](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
- Read about [Encapsulation in Java](https://en.wikipedia.org/wiki/Encapsulation_(computer_programming))

### ✅ Learning Goals

Upon completing this assignment, you should be able to:

- Design Java classes
- Add instance fields
- Add a constructor method
- Create *getters* and *setters*
- Print to the terminal
- Use the `main` method
- Understand **Scope** (or variable shadowing)

### 🚨 Troubleshooting Guide
If you encounter issues during the task, follow these steps:

1. Check the [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues) to see if others have experienced your problem.
2. If your problem is not listed, create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with a detailed description.
3. Talk to a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Refer to your schedule for lab timings.

Discussing concepts with peers is encouraged, but **do not share code solutions**!

### 🏛️ Assignment

In this assignment, you will create a simple Java game! Your game will have a player, a scoring system, and interactions with enemies. Ready to start coding your adventure?

#### 🌟 Exercise 1.0 -- Game Classes

Create a new Java class called `Game.java` inside the `src` directory. In this class, you'll begin by modeling the game's basic components. Start by defining these fields:

- `String` playerName
- `int` playerScore
- `int` playerPosition
- `int` enemyPosition
- `String` enemyName

Create a main method within the `Game` class to instantiate a new player and an enemy, initializing default values for all fields.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public class Game {
      // Define fields here!
      
      public static void main(String[] args) {
          Game game = new Game();
          game.playerName = "Player1";
          game.playerScore = 0;
          game.playerPosition = 0;
          game.enemyName = "Enemy1";
          game.enemyPosition = 5;
      
          System.out.println("Player: " + game.playerName + " is at position " + game.playerPosition);
          System.out.println("Enemy: " + game.enemyName + " is at position " + game.enemyPosition);
      }
  }
  ```
</details>

#### 🌟 Exercise 1.1 -- Implement Getters and Setters

Encapsulate the fields by making them `private`. Implement their respective *getters* and *setters* to allow controlled access to their values.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public class Game {
      private String playerName;
      private int playerScore;
      private int playerPosition;
      private String enemyName;
      private int enemyPosition;
      
      // Getters and Setters
      public String getPlayerName() { return playerName; }
      public void setPlayerName(String playerName) { this.playerName = playerName; }
      
      public int getPlayerScore() { return playerScore; }
      public void setPlayerScore(int playerScore) { this.playerScore = playerScore; }
      
      public int getPlayerPosition() { return playerPosition; }
      public void setPlayerPosition(int playerPosition) { this.playerPosition = playerPosition; }
      
      public String getEnemyName() { return enemyName; }
      public void setEnemyName(String enemyName) { this.enemyName = enemyName; }
      
      public int getEnemyPosition() { return enemyPosition; }
      public void setEnemyPosition(int enemyPosition) { this.enemyPosition = enemyPosition; }
      
      public static void main(String[] args) {
          Game game = new Game();
          game.setPlayerName("Player1");
          game.setPlayerScore(0);
          game.setPlayerPosition(0);
          game.setEnemyName("Enemy1");
          game.setEnemyPosition(5);
      
          System.out.println("Player: " + game.getPlayerName() + " is at position " + game.getPlayerPosition());
          System.out.println("Enemy: " + game.getEnemyName() + " is at position " + game.getEnemyPosition());
      }
  }
  ```
</details>

#### 🌟 Exercise 1.2 -- Constructor Method

Define a constructor for the `Game` class to initialize objects more efficiently. Use parameters to set initial values.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public class Game {
      
      public Game(String playerName, int playerScore, int playerPosition, String enemyName, int enemyPosition) {
          this.playerName = playerName;
          this.playerScore = playerScore;
          this.playerPosition = playerPosition;
          this.enemyName = enemyName;
          this.enemyPosition = enemyPosition;
      }
      
      // Other existing methods...

      public static void main(String[] args) {
          Game game = new Game("Player1", 0, 0, "Enemy1", 5);
          
          System.out.println("Player: " + game.getPlayerName() + " is at position " + game.getPlayerPosition());
          System.out.println("Enemy: " + game.getEnemyName() + " is at position " + game.getEnemyPosition());
      }
  }
  ```
</details>

#### 🌟 Exercise 1.3 -- Player Movement

Implement a method to allow the player to "move" by changing their position. Print the new position each time the player moves.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public class Game {
      
      public void movePlayer(int steps) {
          playerPosition += steps;
          System.out.println(playerName + " moved to position " + playerPosition);
      }
      
      // Implement main method...
  }
  ```

  Modify your `main` method to test `movePlayer()`.
</details>

#### 🌟 Exercise 1.4 -- Scoring System

Implement a method that adds points to the player's score every time they move. Add 1 point per step moved.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public class Game {
      
      public void updateScore(int steps) {
          playerScore += steps;
          System.out.println(playerName + " has a score of " + playerScore);
      }
      
      public void movePlayer(int steps) {
          playerPosition += steps;
          updateScore(steps);
          System.out.println(playerName + " moved to position " + playerPosition);
      }
      
      // main method...
  }
  ```

  Update your `main` method to observe changes in the player's score.
</details>

#### 🌟 Exercise 1.5 -- Enemy Interaction

Develop a method that detects when the player encounters the enemy, printing a fight message.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public class Game {
      
      public void checkEncounter() {
          if (playerPosition == enemyPosition) {
              System.out.println("Encounter! " + playerName + " is fighting " + enemyName);
          }
      }
      
      public void movePlayer(int steps) {
          playerPosition += steps;
          updateScore(steps);
          System.out.println(playerName + " moved to position " + playerPosition);
          checkEncounter();
      }
      
      // main method...
  }
  ```

  Ensure your `main` method tests player movement to the enemy's position.
</details>

#### 🌟 Exercise 1.6 -- Variable Shadowing

Understand variable shadowing by exploring the examples below. What changes would you make to correctly refer to instance variables?

Example 1:

```java
public class ShadowGame {
    private int position = 0; // We want this position printed

    public void printShadow() {
        int position = 5;
        System.out.println(position); // It's printing the wrong position :( What's happening?
    }

    public static void main(String[] args) {
        new ShadowGame().printShadow();
    }
}
```

Example 2:

```java
public class Creature {
    private String name;

    public Creature(String name) {
        name = name; // This doesn't set the instance variable :( Why not?
    }

    public void announce() {
        String name = "Unknown";
        System.out.println(name + " approaches!"); // It's printing the wrong name :( 
    }
}
```

> **Hint:** Review how the `this` keyword is used in context of variable shadowing to access instance fields.

### 🐞 Bugs and errors?
If you discover any errors or inconsistencies in the task, please create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with a detailed description. Identified bugs will be acknowledged!