this task, you are required to create a simple game simulator. The game is a single-player game where the player navigates a game field filled with different types of enemies. The types of enemies are represented as objects with different properties and behaviors. The player can move around the game field, earn scores by eliminating enemies, and lose health points when hit by enemies. 

Your task is to model the player and the different enemy types as classes in Java, implement their properties and behaviors, and simulate a game where a player can move around and interact with the enemies.

Follow these steps:

1. **Create the Player Class**: Create a class `Player`. A player should have the following properties:
  - `String` name
  - `int` healthPoints
  - `int` score

  The player should also have the relevant getters and setters for these fields as well as a method `printStatus()` to print the player's current status. You must also implement a constructor to initialize these fields.

2. **Create the Enemy Class**: Create an abstract class `Enemy`. It should have the following fields:
  - `String` name
  - `int` damage

  The constructor of `Enemy` should take name and damage as parameters. The class should have corresponding getters and a method `attack()` that simulates the enemy's attack. The `attack()` reduces the player's health points by the damage of the enemy.

3. **Create Specific Enemy types**: Extend the `Enemy` class with specific enemy types. For instance, create a class `Zombie` and a class `Robot`. The `Zombie` and `Robot` class should both override the `attack()` method. 

4. **Create a Game Simulator**: Implement a `GameSimulator` class that lets the player interact with different enemies. The `GameSimulator` should contain a `Player` object and a list of `Enemy` objects. It should have methods for adding enemies to the game and for running game turns where player and enemy interactions are simulated.

Use the provided testing code `GameTest.java` to verify your simulator. Each function should pass all tests before you consider your task done. 

Note: While writing your classes and methods, be sure to think about how you could use inheritance, polymorphism, and encapsulation to make the code versatile and easy to maintain. 

# Template

You should structure your classes and methods based on the following class and method names. The provided testing code relies on the following structure:

```java
public class Player {
    private String name;
    private int healthPoints;
    private int score;

    public Player(String name, int healthPoints) {
        // Your code
    }

    //getter and setter methods for name, healthPoints and score

    public void printStatus() {
        // Your code
    }
}

public abstract class Enemy {
    private String name;
    private int damage;

    public Enemy(String name, int damage) {
        // Your code
    }

    //getter methods for name and damage

    public void attack(Player player) {
        // Your code
    }
}

public class Zombie extends Enemy {
    public Zombie(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attack(Player player) {
        // Your code
    }
}

public class Robot extends Enemy {
    public Robot(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attack(Player player) {
        // Your code
    }
}

public class GameSimulator {
    private Player player;
    private List<Enemy> enemies;

    public GameSimulator(Player player) {
        // Your code
    }

    public void addEnemy(Enemy enemy) {
        // Your code
    }

    public void runTurn() {
        // Your code
    }
}
```