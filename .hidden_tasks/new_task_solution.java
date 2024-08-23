import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class Player {
    // Declare private fields for name, score, x, and y position
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
    
    // Getter for x position
    public int getX() { return x; }
    
    // Getter for y position
    public int getY() { return y; }
    
    // Method to move the player, ensuring they stay within a 5x5 grid
    public void move(int deltaX, int deltaY) {
        this.x = Math.max(0, Math.min(4, this.x + deltaX));
        this.y = Math.max(0, Math.min(4, this.y + deltaY));
    }
    
    // Method to add score
    public void addScore(int points) {
        this.score += points;
    }
    
    // Method to print the player's current position
    public void printPosition() {
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
        if (player.getX() == this.x && player.getY() == this.y) {
            // Reduce player's score by enemy damage
            player.setScore(player.getScore() - damage);
            // Print encounter message
            System.out.println("Oh no! " + player.getName() + " encountered an enemy and lost " + damage + " points.");
        }
    }
    
    // Method to print enemy's position
    public void printPosition() {
        System.out.println("Enemy is at position (" + x + ", " + y + ").");
    }
}

public class Game {
    public static void main(String[] args) {
        // Create a Player with name and initial position
        Player player = new Player("Hero", 0, 0);
        
        // Create an Enemy with initial position and damage
        Enemy enemy = new Enemy(1, 1, 5);
        
        // Move player and check interactions with enemy
        player.move(1, 1);
        enemy.interact(player);
        
        // Print player's position and score
        player.printPosition();
        System.out.println("Player score: " + player.getScore());
    }
}

// Testing the game logic
class GameTest {

    private Player player;
    private Enemy enemy;

    @Before
    public void setup() {
        player = new Player("TestPlayer", 0, 0);
        enemy = new Enemy(1, 1, 5);
    }

    @Test
    public void testPlayerMoveWithinBounds() {
        player.move(3, 3);
        assertEquals("Player should be at x=3", 3, player.getX());
        assertEquals("Player should be at y=3", 3, player.getY());
    }
    
    @Test
    public void testPlayerMoveOutOfBounds() {
        player.move(6, 6);
        assertEquals("Player should be at the maximum x=4", 4, player.getX());
        assertEquals("Player should be at the maximum y=4", 4, player.getY());
    }

    @Test
    public void testEncounterWithEnemy() {
        player.move(1, 1); // Move player to enemy's location
        enemy.interact(player);
        assertEquals("Player score should be -5 after encounter", -5, player.getScore());
    }

    @Test
    public void testAddScore() {
        player.addScore(10);
        assertEquals("Player score should be 10", 10, player.getScore());
    }
}