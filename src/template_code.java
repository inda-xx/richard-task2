import org.junit.Before;
    import org.junit.Test;
    import static org.junit.Assert.*;
    import java.util.Arrays;
    import java.util.List;

public class Player {
    // instance fields
    private String name;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor
    public Player(String name, int startX, int startY) {
      // set the appropriate instance fields
    }

    // Getter and Setter methods for each field
    // ...

    // Movement methods
    public void moveUp() {
        // implement movement logic
    }

    public void moveDown() {
        // implement movement logic
    }

    public void moveLeft() {
       // implement movement logic
    }

    public void moveRight() {
        // implement movement logic
    }

    // dynamic scoring methods
    public void increaseScore(int points) {
        // implement scoring logic
    }

    public void decreaseScore(int points) {
        // implement scoring logic
    }

    // Player interaction methods
    public void attack(Enemy enemy) {
         // implement attack logic
    }

    // Print current state
    public void printInfo() {
      // implement print logic
    }

    // Other methods as needed...
}

public class Enemy {
    // instance fields
    private String type;
    private int health;
    private int attackPower;
    private int positionX;
    private int positionY;

    // Constructor
    public Enemy(String type, int health, int attackPower, int startX, int startY) {
       // set the appropriate instance fields
    }

    // Getter and Setter methods for each field
    // ...

    // Enemy Movement methods
    public void moveUp() {
       // implement movement logic
    }

    public void moveDown() {
       // implement movement logic
    }

    public void moveLeft() {
       // implement movement logic
    }

    public void moveRight() {
       // implement movement logic
    }

    // Enemy Interaction methods
    public void reduceHealth(int damage) {
       // implement logic to reduce health
    }

    // Print current state
    public void printInfo() {
      // implement print logic
    }

    // Other methods as needed...
}

public class Game {
    public static void main(String[] args) {
        // Create Player object

        // Create Enemy object

        // Simulate gameplay by calling methods

        // Ensure everything prints out as expected
    }
}