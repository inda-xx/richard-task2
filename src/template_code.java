```java
// Initial Template for the Java Challenge: Create a Simple Game, "Battle Geeks"

// Starting with the Player class

public class Player {  
    // Placeholder for instance fields
    private String name;
    private double health;
    private double power;
    private int score;
    private boolean isAlive;

    // Placeholder for the constructor
    public Player(String name, double health, double power, int score, boolean isAlive) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.score = score;
        this.isAlive = isAlive;
    }

    // Placeholder for Getters and Setters 

    /* getName() method */
    public String getName() {
        return this.name;
    }

    /* getHealth() method */
    public double getHealth() {
        return this.health;
    }

    /* getPower() method */
    public double getPower() {
        return this.power;
    }

    /* getScore() method */
    public int getScore() {
        return this.score;
    }

    /* isAlive() method */
    public boolean isAlive() {
        return this.isAlive;
    }

    // Methods
    
    /* attack() method: The interaction method between players. Update this as per your scoring system */
    public void attack(Player opponent) {
        // Update this
    }

    // Other methods as per your requirement
}

/* main class where you will initialize your players, they will interact (fight), 
 * and then we will check each player's state.
 */

public class BattleGeeks {
    public static void main(String[] args) {
        // Create players, make them fight and check their state here
    }
}
```
Note: The above code is just a template. Please make sure to adhere to the given task requirements and instructions while implementing your game logic. I encourage you to add comments, adjust variable names, exception handling and access modifiers as per your design.