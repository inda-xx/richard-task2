# Game On! ⌨️🎮

In this exercise for Java Programming, you are going to build upon fundamental aspects of Java by creating a simple video game. This game will include player movement, a scoring system, and enemies to engage with!

### 📅 Deadline
This assignment should be completed by the following date: **Friday 3rd December**.

### 👨‍🏫 Instructions
For instructions regarding the assignment submission, please see the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📚 Preparation
Before starting, ensure you go through the OLI material for Module 4.

- Read [Thinking in Objects](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)

### ✅ Learning Goals

This week, you are going to familiarise yourself with:
* Designing Java classes
* Adding instance fields/view state
* Adding a constructor method
* Creating *getters* and *setters*
* Outputting game progress to the terminal
* Leveraging the `main` method
* Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide
If you run into any issues, follow this protocol:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Have others experienced similar issues?
2. If not, create your own [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Give it a succinct title that summarises the problem.
3. Ask for help from a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Remember, as per your schedule, to check for the last lab's timings.

Feel free to engage in discussions with your coursemates, but ensure you **DO NOT share answers**!

### 📝 Assignment

You're tasked with coding a simple, text-based, one-player game. The game revolves around a Hero character that moves within a grid (the game arena), collects points (gold coins) and encounters enemies. This assignment serves as an exercise on Java classes, control structures, user interfaces (via terminal), and exception handling. 

#### Exercise 4.0 -- Game Arena
Start off by creating a new class called `GameArena.java`. The GameArena class should have the following fields:

- `int` width: The width of the game arena.
- `int` height: The height of the game arena.

The fields should be private, and thus, you must include *getters* and *setters* for each. Confirm that your implementation is correct by testing it using the provided main method in Example 1.

<details>
  <summary> 🛠 Example 1 </summary>

```java
class GameArena {
  // Fields go here!

  public static void main(String[] args) {
    // Define the game arena.
    GameArena game = new GameArena();
    
    // Assign the instance variables.
    game.setWidth(10);
    game.setHeight(10);

    // Print the dimensions.
    System.out.println("Game arena is " + game.getWidth() + " by " + game.getHeight() + " units.");
  }
}
```
</details>

#### Exercise 4.1 -- The Player
Create a new class `Player.java`. This class should have the following fields:

- `String` name
- `int` xPosition
- `int` yPosition
- `int` score

Remember to add *getters* and *setters* for each field and a constructor. Confirm the correctness of your implementation using the provided main method in Example 2.

<details>
  <summary> 🛠 Example 2 </summary>

```java
class Player {

  // Fields go here!

  // Constructor, getters, and setters go here!

  public static void main(String[] args) {
    // Define a player.
    Player hero = new Player();

    // Assign attributes.
    hero.setName("Hero");
    hero.setXPosition(5);
    hero.setYPosition(5);
    hero.setScore(0);

    // Print player details.
    System.out.println("Player " + hero.getName() + " is at position " + hero.getXPosition() + ", " + hero.getYPosition() + ".");
    System.out.println("The current score is: " + hero.getScore() + ".");
  }
}
```
</details>

#### Exercise 4.2 -- The Enemy
Create a new class `Enemy.java`, similar to `Player.java`. The Enemy class has the same fields (`name`, `xPosition`, `yPosition`) but doesn't need `score`.

#### Exercise 4.3 -- Moving the Player
Implement `move()` methods for the Player class to enable movement in four directions: up, down, left, and right. Each movement should change the player's position by one unit in each direction. Ensure to prevent the player from moving outside the game arena dimensions.

#### Exercise 4.4 -- Point Interaction and Scoring
Implement a method in the GameArena class, `pickPoint()`, that generates a random point within the game arena, increments the player's score if they reach the generated point position, and regenerates a point if the current one gets picked up. 

#### Exercise 4.5 -- Enemy Interaction
Create another method, `meetEnemy()`, that randomly generates an enemy in the game arena. If the player encounters an enemy, the player loses, and the game restarts. Otherwise, the enemy relocates to a new position.

#### Exercise 4.6 -- Game Progress and Interface
Implement a method, `printGameProgress()`, in the GameArena class that prints the game progress after every player input. It should display the game arena grid, the player's position, point's position, enemy's position, and the current score.

#### Exercise 4.7 -- Variable Shadowing
Study the process of variable shadowing using various examples from the learning resources.

### 🕷 Bugs and Errors?
If you encounter any errors or inconsistencies in the assigned tasks, please open a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task *x* Error: *brief summary of error*". Identified issues will earn special mentions in the acknowledgment section.