# 🕹️ Game On: The Simple Java Adventure!

For this task, you'll create a simple game using Java that introduces fundamental programming concepts by implementing player movement, a scoring system, and interactions with enemies. This exercise will help you refine your skills in object-oriented design, class structure, and basic Java programming.

### 📅 Deadline
Complete this assignment by **Friday, October 20th**.

### 🔍 Instructions
For guidance on how to complete and submit the assignment, refer to the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📖 Preparation
Prior to starting the assignment, complete the following:

- Review the [Java Classes and Objects Tutorial](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html).
- Read the material on [Encapsulation](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60).

### 🎯 Learning Goals

This week's learning goals include:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating getters and setters
* Printing information to the terminal
* Using the `main` method
* Understanding scope and variable shadowing

### 🛠 Troubleshooting Guide
If you encounter any problems, follow these steps:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). 
2. If your issue isn't listed, create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Describe your problem briefly.
3. Seek assistance from a TA during lab sessions.

Collaboration for understanding is encouraged, but ensure to craft your unique solutions!

### 🎮 Assignment

In this task, you will create a simple Java game featuring a player character, a score-tracking mechanism, and enemy interactions. Follow the exercises below to incrementally build your game.

#### Exercise 1: Designing the Player 🎮

Create a `Player` class in your `src` folder. This class should represent the player's character in the game. 

- **Fields**: Add the following fields: `String name`, `int score`, `int positionX`, `int positionY`.
  
Example code setup:

```java
public class Player {
    // Define fields here

    public static void main(String[] args) {
        Player player = new Player();

        player.name = "Adventurer";
        player.score = 0;
        player.positionX = 0;
        player.positionY = 0;

        System.out.println("Player: " + player.name);
        System.out.println("Score: " + player.score);
    }
}
```

#### Exercise 2: Encapsulation and Movement 🚶‍♂️

Implement encapsulation by creating getters and setters for your Player class. Also, add methods to move the player:

- `moveLeft()`, `moveRight()`, `moveUp()`, `moveDown()`
  
Example code outline:

```java
public class Player {
    // Fields and methods

    // Implement move methods
    public void moveLeft() {
        // Logic to move left
    }

    public void moveRight() {
        // Logic to move right
    }

    // Additional movement methods
}
```

#### Exercise 3: Introducing the Enemy 👾

Design an `Enemy` class with at least the following attributes:

- Fields: `String type`, `int positionX`, `int positionY`
  
Example partial setup:

```java
public class Enemy {
    // Add fields

    public Enemy(String type, int posX, int posY) {
        // Constructor logic
    }

    // Getters and setters
}
```

#### Exercise 4: Player and Enemy Interaction ✨

Add a method in the Player class to handle interactions with enemies, such as scoring points when defeating an enemy.

- Method: `interactWithEnemy(Enemy enemy)`

Example interaction code:

```java
public void interactWithEnemy(Enemy enemy) {
    if (this.positionX == enemy.getPositionX() && this.positionY == enemy.getPositionY()) {
        System.out.println("Enemy encountered: " + enemy.getType());
        // Update score or other interaction logic
    }
}
```

#### Exercise 5: Displaying Game Information 🖥️

Create a method in the Player class named `printStatus()` to print the player's current status including position and score.

Example method implementation:

```java
public void printStatus() {
    System.out.println("Player " + name + " is at position: (" + positionX + ", " + positionY + ")");
    System.out.println("Current score: " + score);
}
```

#### Exercise 6: Constructor Practice ⛑️

Revise your classes to include constructors properly initializing your objects with attributes and default values.

For instance, your Player constructor should allow setting initial position and name.

#### Exercise 7: Scope and Variable Shadowing 🤔

Examine the following code samples demonstrating variable shadowing issues. Be ready to discuss how to fix these problems using the `this` keyword:

```java
public class ShadowExample {
    private int level = 1;

    public void setLevel(int level) {
        // Correctly assign the class-level variable
    }
}
```

### 🐛 Bug Reports

If you find any errors or inconsistencies in the task, please open a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Game Task Error: Description of error". As a reward, your contribution will be recognized in the acknowledgments section.

Now, ready your IDE, channel your creativity, and dive into Java development with this interactive game-making assignment! 🌟