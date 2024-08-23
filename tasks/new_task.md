# 🕹️ Simple Java Game Assignment

In this exercise, you'll design and implement a simple game application in Java that incorporates player movement, scoring, and enemy interactions. Through this task, you will become familiar with Java classes and object-oriented programming concepts.

### 📅 Deadline
Complete and submit the assignment before **Friday, October 20th**.

### 📘 Instructions
For more information on submission procedures, refer to the [course instructions](https://example.com/course/instructions#assignments).

### 📝 Preparation
To prepare, review the following materials:

- [Java Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
- If you're unfamiliar with Java, sign up and complete the essential modules at [Java Programming Basics](https://example.com/online-java-course).

> **Assistant's Note:** The materials might have slight discrepancies, so it's advisable to explore further if necessary.

### 🎯 Learning Goals
This assignment aims to bolster the following skills:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding and managing variable scope, including shadowing

### 🛠️ Troubleshooting Guide
In case of queries or issues, follow these steps:

1. Check this week’s [posted issues](https://example.com/help/issues) to see if other students have similar problems.
2. If not, create a [New Issue](https://example.com/help/issues/new) with a clear title, such as "Game Task: specific problem".
3. Seek help from a TA during weekly labs. Refer to the schedule for details.

Collaborate constructively with peers, but **do not share solutions directly**.

### 🕹️ Game Assignment

In this task, you'll create a basic and engaging text-based game. Your game will allow a player to move around a grid, collect points, and interact with enemies.

#### Exercise 1 -- Setting Up the Game Classes
In the `src` folder, create a new Java file named `Game.java`. Implement the following components:

1. **Player Class**

   - Fields: `String name`, `int score`, `int x`, `int y`
   - Methods: `constructor`, `move(int deltaX, int deltaY)`, `addScore(int points)`, `printPosition()`

2. **Enemy Class**

   - Fields: `int x`, `int y`, `int damage`
   - Methods: `constructor`, `interact(Player player)`, `printPosition()`

Ensure this setup matches the structure illustrated below:

```java
class Player {
    private String name;
    private int score;
    private int x;
    private int y;

    public Player(String name, int startX, int startY) {
        this.name = name;
        this.score = 0;
        this.x = startX;
        this.y = startY;
    }

    // Getters and setters here
    // Other methods here
}

class Enemy {
    private int x;
    private int y;
    private int damage;

    public Enemy(int startX, int startY, int damage) {
        this.x = startX;
        this.y = startY;
        this.damage = damage;
    }

    // Methods here
}
```

#### Exercise 2 -- Implement Movement and Scoring
Extend your `Player` class with:

- **Move Method**: Updates the player's current position. Enforce a grid size (5x5).
- **AddScore Method**: Increases the player's score by specified points.

Demonstrate functionality with the example main method provided:

```java
public class Game {
    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0);
        player.move(1, 1);
        player.printPosition();
        player.addScore(10);
    }
}
```

Output Sample:

```
> Player is at position (1, 1).
> Current score: 10 points.
```

#### Exercise 3 -- Interacting with Enemies
Add interaction capabilities to the `Enemy` class:

- **Interact Method**: Modifies the player's position and/or score upon enemy encounter.

Sample main method to show interaction:

```java
public class Game {
    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0);
        Enemy enemy = new Enemy(1, 1, 5);

        player.move(1, 1);
        enemy.interact(player); // Player encounters enemy

        player.printPosition();
        System.out.println("Player score: " + player.getScore());
    }
}
```

Expected Output:

```
> Player is at position (1, 1).
> Oh no! Player encountered an enemy and lost 5 points.
> Player score: -5
```

#### Exercise 4 -- Variable Shadowing Exploration
Study and correct the shadowing problems shown below:

```java
public class ShadowExample {
    private int value = 10;

    public void showValue() {
        int value = 5;
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        new ShadowExample().showValue();
    }
}
```

Consider how to utilize the `this` keyword to avoid scope issues like in the examples.

In conclusion, reflect on how declaring `Variable` at a different scope changes the output. Implement the fixes inside your game classes if necessary.

### 🐛 Bug Reporting
Spot any discrepancies or bugs? Report them via a [New Issue](https://example.com/help/issues/new) under the title "Game Task Issue: *brief summary*". Acknowledgements await for valid bug finds!