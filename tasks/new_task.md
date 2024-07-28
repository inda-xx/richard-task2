Create a Simple Arcade Game

## Instructions

For the next task at INDA, you are embarking on a journey to become a game developer! Your first task in this journey is to create a simple 2D Arcade game in Java. You are going to build your game on your knowledge of Java classes and objects. 

The game is set in a grid universe with fierce creatures called Indamons which are controlled by players. The aim of the game is to move your indamon, collect items to increase your hit points (hp), attack other indamons and dodge enemy indamons. Remember, if indamon's hp reaches 0, the player is out of the game!

### Deadline

**Friday, 16th September**

### Learning Goals

In this week's exercise you will:
* Develop a basic game in Java.
* Design classes and objects to model different entities in the game.
* Develop methods to handle interactions between objects.
* Implement a simple scoring system.

### Details

For this assignment:

1. Continue with the `Indamon` class you have previously created. Add a new class `Game` which will contain the main method of the application.
2. Create a new class `Player`. The `Player` class should have the following fields:
    - `String` username 
    - `Indamon` indamon (the indamon controlled by the player)
    -  `int` score
3. Create a new class `Item`. The `Item` class should represent the items that indamons can collect to increase their hit points. It should contain the following attributes:
    - `String` name
    - `int` hpPoints
4. Extend the `Indamon` class to include a new field `position` which is a `Point` object from `java.awt.Point`.

The classes should also contain appropriate constructors, getter and setter methods.

5. Write a method `collectItem(Item item)` in `Indamon` class to collect a `item` and increase the `hp` of `indamon` by the `hpPoints` of `item`.
6. Write a method `move(Direction direction)` in `Indamon` class to move the `indamon` in the universe. The `Direction` can be an enum with values `UP`, `DOWN`, `LEFT`, `RIGHT`.
7. Implement a command-line interface for your game in the `Game` class. Ask the player for username, the name of the indamon, and every turn, ask the player where to move or whether to collect an item or attack an enemy player. 

### Scoring system

The player gets points every time their indamon collects items or attacks enemy indamons.

### Troubleshooting Guide

If you encounter any questions or problems, you should:

1. Look at this week's posted issues. Did someone else ask your question?
2. Post your own question by creating a new issue. 
3. Ask a competent friend or TA in person during the lab sessions.

### Assignment

Create a new Java project and implement the classes as described above. Run the game and test all features. 

Assistant's Note: Remember to use encapsulation and private visibility for instance fields, and provide getter and setter methods for them. For `attack`, `collectItem` and `move` methods do not forget to add appropriate print statements for player interactions.

### Testing

Unfortunately, unit testing for an interactive command-line game can be difficult, you should test your code by hand (by playing the game!). Think about what types of input might cause the game to crash, or think about ways the game might behave that a player wouldn’t expect. For instance, what happens if a user tries to move an Indamon outside the grid area?

Enjoy the game development. Happy Coding