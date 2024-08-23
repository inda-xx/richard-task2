# Let The Game Begin! 🕹️

In this programming assignment, you are going to get hands-on practice with core object-oriented programming concepts in Java. Get ready to design classes, add instance fields, constructor methods, getters, and setters, and more for your new game application!

## 📅 Submission Deadline
Your completed assignment needs to be submitted before **Friday 24th September**.

## 👓 Instructions
Kindly follow the detailed instructions provided in the assignment section of our [course instructions](https://upenn-assignment-platform/course-instructions#assignment-submission).

## 📚 Preparation
Before diving into the assignment, ensure you've covered the readings in Module 2.

- Check out the tutorial [Interacting with Classes and Objects](https://java-tutorial/classes-and-objects)
- If you haven't yet, visit https://java-tutorial/classes-and-objects, and enroll with the course key `java-intro-2022`

> **Assistant's Note:** It's perfectly okay to pace yourself with the content, even if it means reading ahead.

## ✅ Learning Goals
Upon completion of this assignment, you should be comfortable with:
* Designing Java classes
* Adding instance fields 
* Adding a constructor method
* Creating *getters and setters*
* Printing to the terminal
* Utilizing the `main` method
* Scope (or *variable shadowing*)

## 🔄 Troubleshooting
In case you run into any problems:
1. Start by looking at the [posted issues](https://upenn-assignment-platform/issues) to see if other students are facing the same problem.
2. If your issue hasn't been addressed, post a question by creating a [New Issue](https://upenn-assignment-platform/issues/new). Please provide a detailed summary of your problem along with a descriptive title.
3. Seek help from the TA during the [weekly lab](https://upenn-assignment-platform/Queue/Java). The lab schedule can be found in your course schedule.

Remember, you are encouraged to discuss with your peers, just make sure to **not share answers**!

## 💻 Assignment
You are now tasked with creating a simple game application in Java. Your application should have basic interactive functionalities such as player movement, a scoring system, and interactions with enemies.

#### Exercise 1.0 -- Design Game Class with Fields
Create a new class named `Game.java` for your game application. Each Game Class's instance will have the following fields:

- `String` playerName
- `int` playerScore
- `boolean` gameStatus
- `List` enemies 

Implement your class such that, as required in Example 1, the provided main method compiles successfully when included in `Game.java`.

<details>
  <summary> 🛠 Example 1</summary>

 ```java
    class Game {

        // Declare your fields here!

        public static void main(String[] args) {
            // Create a new "Game" object
            Game newGame = new Game();

            // Set instance variables to specific values
            newGame.playerName = "Player1";
            newGame.playerScore = 0;
            newGame.gameStatus = true;
            newGame.enemies = new List <>();

            // Retrieve the information of the set values
            System.out.println("Player Name: " + newGame.playerName);
            System.out.println("Player Score: " + newGame.playerScore);
            System.out.println("Game Status: " + newGame.gameStatus);
        }
    } 
```
</details>

#### Exercise 1.1 -- Getters and Setters
Protect the class's state from direct access by changing the access modifiers of your fields to `private`. Employ encapsulation by introducing *getters* and *setters* methods. Your class should now successfully compile with the main method as provided in Example 2 when included in `Game.java`.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  class Game {

    // Declare your fields here!

    // Getters and Setters go here!

    public static void main(String[] args) {
      // Create a new "Game" object
      Game newGame = new Game();

      // Set instance variables to specific values
      newGame.setPlayerName("Player1");
      newGame.setPlayerScore(0);
      newGame.setGameStatus(true);

      // Retrieve the information of the set values
      System.out.println("Player Name: " + newGame.getPlayerName());
      System.out.println("Player Score: " + newGame.getPlayerScore());
      System.out.println("Game Status: " + newGame.isGameStatus());
    }
  }
  ```
</details>

#### Exercise 1.2 -- Game Class Constructor
Introduce a *constructor* in your Game class to simplify and organize instantiation. Implement this functionality following the example in the course material.

#### Exercise 1.3 -- `printGameInfo()`
To allow printing all the game's information to the terminal, implement a method called `printGameInfo()` with a `void` return type.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public static void main(String[] args){
    // create a new "Game" object
    Game newGame = new Game("Player1", 0, true);

    // print information
    newGame.printGameInfo();
  }
  ```

  Expected terminal output:

  ```
  > Player Name: Player1
  > Player Score: 0
  > Game Status: true
  ```
</details>

#### Exercise 1.4 -- Player Movement & Scoring System
Introduce methods to handle player movements (e.g., `moveLeft()`, `moveRight()`, `jump()`, `duck()`) and a scoring system (e.g., a `updateScore()` method that increments player score per successful enemy dodge).

Think about how you wish to implement these methods, but remember to use the `getters` and `setters` methods to modify field values.

#### Exercise 1.5 -- Enemy Interactions
You need to model the interaction between the player and enemies. Introduce a class for Enemies and implement methods such as `generateEnemy()`, `isEnemyDefeated()`, and `enemyAttack()`. Each method prints the status of the interaction to the terminal.

> **Assistant's Note:** Remember, methods should only do what it’s designed to perform. This one-way functionality ensures your method remains reusable and easy to read and debug. Take the `getters` and `setters` methods as examples for this.

#### Exercise 1.6 -- Variable Shadowing
Consider the examples on *Variable Shadowing* provided in the course material and be prepared to discuss how to fix such examples in Java.

> **Assistant's Note:** Understanding the Local Scope, Global Variables, and Instance Fields will be beneficial in this exercise.

## 👾 Found Bugs?
If you identify any errors or inconsistencies in this assignment, please open a [New Issue](https://upenn-assignment-platform/issues/new). Assign the title in the following format: "Task *x*: *summary of error*" Your contributions to identify bugs will be acknowledged in the assignment corrections.