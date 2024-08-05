# Retro-Rescue: Vintage Video Game Reinvention! 🎮

In this INDA assignment, you are going to embark on a journey to create a simple but exciting game using Java classes. Our focus is to understand and get hands-on experience with object design and manipulation in Java.

### ⏰ Deadline

This task should be completed by **Monday, 20th September**.

### 🏫 Instructions

Refer to the [assignments section of the course instructions](https://links.com/course-instructions) to understand the standards necessary for the task completion and submission process.

### 📚 Preparation

Before diving into the assignment, ensure to go through:

- Read the material for Module 2: [Exploring Java Classes](https://kth.academy/java-classes)
- Sign up if you haven't, and register for the course using the key `code-vest-21-22` at https://learningsite.com/

### ✅ Learning Goals

In this assignment, you'll get to practice on:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating getters and setters
* Printing to the terminal using `println`
* Understanding and using the `main` method
* Implementing scope (or variable shadowing)

### 🆘 Need Help?

If you face any roadblocks or have queries, follow these steps:

1. Browse through this week's [posted issues](www.gitsite.com/issues). Is your query already answered?
2. If not, create a [new issue](www.gitsite.com/issues/new) and briefly explain your problem.
3. Approach a TA during the weekly lab. Check your schedule for specific times.

Remember, collaboration is key, but avoid sharing answers directly!

### 💡 Assignment

Let's hop into the exciting world of Retro Gaming! You are tasked to recreate an old-school video game. You'll create classes to represent the player, the scoring system, and enemies.

#### Exercise 1: Player Class
In the `src` folder, create a new class called `Player.java`. This class should hold information about the player's name (String), score (int), position (x, y as ints), and life status (boolean to track if the player is alive or not).

#### Exercise 2: Game Class
Create a `Game.java` class to manage the game's score. This class should have a score (int) field. The score should be `private` to protect against unauthorized modifications. You'll need to create appropriate getter and setter methods for this.

#### Exercise 3: Enemy Class
Create an `Enemy.java` class. Each enemy should have a name (String), strength (int), and position (x, y as ints). Include methods to set and get these properties.

#### Exercise 4: Player Movement
Add a method in the `Player` class to simulate player movement. The method should accept direction (up, down, left, right) and change the player's position accordingly. Consider each movement as one unit.

#### Exercise 5: Enemy Encounter
When the player coordinates match with an enemy's, a battle ensues. The player's score decreases by the enemy's strength. If the score falls below 0, the player's life status changes to false.

#### Exercise 6: Score
When the player avoids an enemy (moves to a spot where no enemy exists), the score increases by a point.

#### Exercise 7: Playing the Game
In the `main` method of the `Game` class, instantiate a few enemies and a player. Simulate a game by calling the move method for the player and checking if this results in a battle or a score increase.

#### Exercise 8: Variable Shadowing
Analyse the provided code snippet and explain how to fix the variable shadowing problem. This exercise is crucial for understanding the concept of scope in Java.

```java
public class Shadow {
    private int number = 10;

    public void printShadow() {
        int number = 5;
        System.out.println(number); 
    }

    public static void main(String[] args) {
        new Shadow().printShadow();
    }
}
```

### 🐛 Bugs or Errors?

If you encounter any issues or find an error, please raise it by opening a [new issue](https://gitsite.com/issues/new) with the title "Task error: *summary of error here*". Your assistance in spotting errors is greatly appreciated, and some features in the acknowledgment section can be expected!