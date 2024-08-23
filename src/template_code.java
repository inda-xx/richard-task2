import org.junit.Before;
    import org.junit.Test;
    import static org.junit.Assert.*;
    import java.util.Arrays;
    import java.util.List;

class Player {
    // Declare private fields for name, score, x and y position
    private String name;
    private int score;
    private int x;
    private int y;
    
    // Constructor to initialize name, starting x and y position, and score
    public Player(String name, int startX, int startY) {
        this.name = name;
        this.x = startX;
        this.y = startY;
        this.score = 0; // Initialize score to zero
    }
 
    // Getter for name
    public String getName() { return name; }

    // Getter for score
    public int getScore() { return score; }
    
    // Setter for score
    public void setScore(int score) { this.score = score; }
    
    // Method to move the player
    public void move(int deltaX, int deltaY) {
        // Update x and y with deltaX and deltaY
        // Ensure player stays within bounds (0-4 for a 5x5 grid)
        this.x = Math.max(0, Math.min(4, this.x + deltaX));
        this.y = Math.max(0, Math.min(4, this.y + deltaY));
    }
    
    // Method to add score
    public void addScore(int points) {
        this.score += points; // Increase score by points
    }
    
    // Method to print player's current position
    public void printPosition() {
        // Print player's current x and y position
        System.out.println(name + " is at position (" + x + ", " + y + ").");
    }
}

class Enemy {
    // Declare private fields for x position, y position, and damage
    private int x;
    private int y;
    private int damage;
    
    // Constructor to initialize x, y, and damage
    public Enemy(int startX, int startY, int damage) {
        this.x = startX;
        this.y = startY;
        this.damage = damage;
    }

    // Method to interact with Player
    public void interact(Player player) {
        // Check if player position matches enemy position
        // If so, reduce player's score by enemy damage
        if (player.getX() == this.x && player.getY() == this.y) {
            player.setScore(player.getScore() - damage);
            // Print encounter message
            System.out.println("Oh no! " + player.getName() + " encountered an enemy and lost " + damage + " points.");
        }
    }
    
    // Method to print enemy's position
    public void printPosition() {
        // Print enemy's current x and y position
        System.out.println("Enemy is at position (" + x + ", " + y + ").");
    }
}

public class Game {
    public static void main(String[] args) {
        // Create a Player object with name and initial position
        Player player = new Player("Hero", 0, 0);
        
        // Create an Enemy object with initial position and damage
        Enemy enemy = new Enemy(1, 1, 5);

        // Move player and check interactions
        player.move(1, 1);
        enemy.interact(player);

        // Print player's position and score
        player.printPosition();
        System.out.println("Player score: " + player.getScore());
    }
}