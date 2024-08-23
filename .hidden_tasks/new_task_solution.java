import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class Player {
    // Fields
    private String name;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor
    public Player(String name, int startX, int startY) {
        this.name = name;
        this.score = 0; // Initial score set to zero
        this.positionX = startX;
        this.positionY = startY;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    // Setters
    public void setPositionX(int x) {
        this.positionX = x;
    }

    public void setPositionY(int y) {
        this.positionY = y;
    }

    // Movement methods
    public void moveUp() {
        if (positionY > 0) {
            positionY--;
        }
    }

    public void moveDown() {
        if (positionY < 4) { // Assuming a 5x5 grid
            positionY++;
        }
    }

    public void moveLeft() {
        if (positionX > 0) {
            positionX--;
        }
    }

    public void moveRight() {
        if (positionX < 4) { // Assuming a 5x5 grid
            positionX++;
        }
    }

    // Method to increase score
    public void collectPoint() {
        score++;
    }

    // Print Info
    public void printInfo() {
        System.out.printf("Player: %s, Score: %d, Position: (%d, %d)\n", name, score, positionX, positionY);
    }
}

class Enemy {
    // Fields
    private String type;
    private int positionX;
    private int positionY;

    // Constructor
    public Enemy(String type, int x, int y) {
        this.type = type;
        this.positionX = x;
        this.positionY = y;
    }

    // Getters
    public String getType() {
        return type;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
}

public class Game {
    private int gridWidth = 5; // Define the grid width as a class variable

    // Main method to run the game
    public static void main(String[] args) {
        // Create player and enemies here
        Player player = new Player("Hero", 0, 0);

        // Example of enemy creation (create multiple enemies as needed)
        Enemy[] enemies = { new Enemy("Goblin", 2, 2), new Enemy("Orc", 3, 3) };

        // Move the player around and interact with the environment
        player.moveRight();
        player.moveUp();
        player.collectPoint();

        // Check for interactions
        checkCollisions(player, enemies);

        // Print player information
        player.printInfo();
    }

    // Method to check for player-enemy collisions
    public static void checkCollisions(Player player, Enemy[] enemies) {
        for (Enemy enemy : enemies) {
            if (player.getPositionX() == enemy.getPositionX() &&
                player.getPositionY() == enemy.getPositionY()) {
                System.out.println("Player encountered an enemy: " + enemy.getType());
            }
        }
    }

    // Method to demonstrate variable shadowing resolution
    public void displayGrid() {
        int width = 10; // Local variable shadowing the instance variable
        System.out.println("The grid width is: " + this.gridWidth); // Correctly using the instance variable
    }
}