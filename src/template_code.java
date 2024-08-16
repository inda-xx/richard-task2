```java
// Import necessary libraries (if any)

public class Player {
    // Step 1:
    private String name; // Player's name
    private int xPosition; // Player's X position
    private int yPosition; // Player's Y position
    private int score; // Player's score
    
    // Step 3:
    public Player(/* Your parameters here */) {
        // initialize attributes here
    }
    
    // Step 2: Add getters and setters for all instance variables.
    // Add your getters here:
    //...

    // Add your setters here:
    //...

    // Step 4:
    public void move(int x, int y) {
        // update the player's position here
    }
    
    // Step 6:
    public void hitEnemy(Enemy enemy) {
        // Increase the score and call enemy's hitByPlayer method here
    }
}

public class Enemy {
    // Step 1:
    private String name; // Enemy's name
    private int xPosition; // Enemy's X position
    private int yPosition; // Enemy's Y position
    private int health; // Enemy's health

    // Step 3:
    public Enemy(/* Your parameters here */) {
        // initialize attributes here
    }

    // Step 2: Add getters and setters for all instance variables.
    // Add your getters here:
    //...

    // Add your setters here:
    //...
    
    // Step 5:
    public void hitByPlayer() {
        // Decrease the health here, if health <= 0 print defeated message
    }
}

public class Game {
    // Step 7:
    public static void main(String[] args) {
        // Create Player and Enemy objects here
        // Make player hit enemy here
        // Print Player's score and Enemy's health here
    }
}
```