### Template

```java
// Start by implementing the Player class
public class Player {
    // Exercise 1: Add fields for name, health, and score
    private String name;
    private int health;
    private int score;
    
    // Exercise 2: Implement the constructor method for the Player class
    public Player(String name) {
        // Assign the parameter value to the field
        // Note: use "this" to refer to the class field
        // ...
        
        // Initialize health and score to their default values
        // ...
    }
    
    // Implement getters and setters for name, health, and score
    // name getter
    public String getName() {
        // return the name
        // ...
    }

    // name setter
    public void setName(String name) {
        // set the name
        // ...
    }

    // Implement health getter and setter and score getter and setter the same way

    // Exercise 3: Implement player movement methods
    public void moveUp() {
        // Print movement message
        // ...
    }

    // Implement moveDown, moveLeft, moveRight the same way

    // Exercise 5: Implement the attack method
    public void attack(Enemy enemy) {
        // Decrease the enemy's health by 10
        // Print a message indicating the enemy's remaining health
        // ...
    }
}

// Exercise 4: Implement the Enemy class
public class Enemy {
    // Add a field for health
    private int health;

    // Implement the constructor method, getters, and setters for health
    // ...
}

// Exercise 6: Implement the Scoreboard class
public class Scoreboard {
    // Implement the method to print the score of a player
    public void printScore(Player player) {
        // Print the player's score
        // ...
    }
}

public class Main {
    // Exercise 7: Implement the game in the main method
    public static void main(String[] args) {
        // Create a new player, enemy, and scoreboard
        // ...
        
        // Have the player attack the enemy
        // Update the scoreboard accordingly
        // ...
    }
}
```

Exercise 8: Understand variable shadowing and its consequences. Make use of the `this` keyword in your explanations. Analyze and explain the scope in Java. Provide examples.

Note: You can extend the game as a bonus exercise. Implement additional game mechanics or even a graphical interface if you wish. Make sure to maintain a clear separation of responsibilities among your classes.