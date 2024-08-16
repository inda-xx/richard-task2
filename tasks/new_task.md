# Pixel Weavers✨

For your Adventure in Programming (APR) exercise, you will be dabbling into game development. You'll be crafting a simple game application while mastering the basics of Java and object-oriented programming.

### ⌛ Deadline
The task must be completed and submitted before **Sunday, 20th March**.

### 👩‍🏫 Instructions
For details on how to complete and submit the assignment, please refer to the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation

Before starting the task, ensure you have completed the OLI material for Module 2.

- Go through [Inside Classes: A Deeper Look](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)

> **Assistant's Note:** The target material and tasks might not align perfectly; feel free to read ahead if necessary.

### ✅ Learning Goals

Your task will center on tackling the following concepts:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide
Are you encountering issues or facing questions? Follow these steps:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). You might find others having the same issues.
2. If not, post your issue by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Be sure to include a descriptive title which starts with "Task *x*: *summary of problem here*"
3. Speak with a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule for the next lab.

Interact with your peers but please **do not share answers**!

### 🏛 Assignment

It's game time! For this task, you will be creating a simple game application.

#### Exercise 2.1: Map and Player Class
Create a `Player` class in a separate Java file with following fields:
- `String playerName`
- `int playerScore`
- `int playerPosition[]` : This will represent the player's position on the game map using (x, y) coordinates.

Don't forget to add a constructor, *getters*, and *setters*. 

Also create a `map` class that has the following fields:
- `int mapHeight`
- `int mapWidth`
- `Player[] playerList` : This will hold the players in our game.

Again, remember to add a constructor, *getters*, and *setters*.

#### Exercise 2.2: Movement Function
Add a method to the `Player` class called `movePlayer(int dx, int dy)`. It should move the player in the direction specified by the (dx, dy) parameters. The function should check the boundaries of the map and not allow movements beyond it.

#### Exercise 2.3: Scoring Mechanics
Implement a method in the `Player` class called `increaseScore(int increase)`. As the name suggests, it should increase the player's score.

#### Exercise 2.4: Managing Players
Implement a `removePlayer(Player target)` method in the `Map` class. This method should remove the target player from `playerList`.

Verify that a player has been properly removed by creating a `printPlayers()` method in the `Map` class. This method should print out all players in `playerList`.

#### Exercise 2.5: Game Mechanics
Create a `spawnEnemy()` function in the `Map` class. This function should randomly spawn an enemy on the map.

Next, add an `encounter(int x, int y)` function. If a player moves onto a coordinate with an enemy, the player should be removed from the game.

Create a `gameOver()` function that checks if `playerList` is empty. If it is, the method should print "Game Over" and terminate the program.

#### Exercise 2.6: Shadowing Example
The following code has an error caused by variable shadowing:

```Java
public class Cat {
  private String name;

  public Cat(String name) {
    name = name; // this doesn't work :( Why?
  }

  public void Rename(String newName){
    String name = newName;
    System.out.println("The cat's new name is: " + name); // It's printing the wrong name :( 
  }
}
```

Study the code and learn how the use `this` keyword to eliminate the shadowing and fix the problem.

### 🐞 Found Bugs?
Please [open a new issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) titled "Task *x* Error: *\*summary of error here\**" if you come across inconsistencies or errors in the task. Contributions will be appreciated with mentions in the acknowledgment section.