import org.junit.Before;
    import org.junit.Test;
    import static org.junit.Assert.*;
    import java.util.Arrays;
    import java.util.List;

import java.util.ArrayList;
import java.util.List;


// Player class for representing the player in the game
class Player {
    private String name;
    private int score;
    private int health;
    private int positionX;
    private int positionY;

    // Constructor for initializing a Player object with a given name
    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.health = 100;
        this.positionX = 0;
        this.positionY = 0;
    }

    // Getters and Setters for the Player fields
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }
    public int getPositionX() { return positionX; }
    public void setPositionX(int positionX) { this.positionX = positionX; }
    public int getPositionY() { return positionY; }
    public void setPositionY(int positionY) { this.positionY = positionY; }

    // Method to move the player by an offset (deltaX, deltaY)
    public void move(int deltaX, int deltaY) {
        this.positionX += deltaX;
        this.positionY += deltaY;
        System.out.println("Player moved to position: (" + positionX + ", " + positionY + ")");
    }

    // Method to add points to the player's score and print the new score
    public void scorePoints(int points) {
        this.score += points;
        System.out.println("Score updated: " + score);
    }

    // Method for interaction with an enemy. If the player and enemy are at the same position, decrease player health
    public void interactWithEnemy(Enemy enemy) {
        if (this.positionX == enemy.getPositionX() && this.positionY == enemy.getPositionY()) {
            this.health -= 10;
            System.out.println("Encountered an enemy! Health now: " + health);
        } else {
            System.out.println("No enemy encountered.");
        }
    }
}

// Enemy class for representing enemies in the game
class Enemy {
    private String type;
    private int positionX;
    private int positionY;

    // Constructor for initializing an Enemy object with a given type and position
    public Enemy(String type, int positionX, int positionY) {
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getters and Setters for the Enemy fields
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public int getPositionX() { return positionX; }
    public void setPositionX(int positionX) { this.positionX = positionX; }
    public int getPositionY() { return positionY; }
    public void setPositionY(int positionY) { this.positionY = positionY; }
}

// Game class to manage the game logic and simulate the player interacting in the maze
public class Game {
    private Player player;
    private List<Enemy> enemies;

    // Constructor for initializing the Game with a player
    public Game(Player player) {
        this.player = player;
        this.enemies = new ArrayList<>();
    }

    // Method to add an enemy to the game
    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    // Method to move the player and check for enemy interactions
    public void play() {
        // Example of player movement and actions
        player.move(1, 0); // move right
        player.scorePoints(10); // increase score by 10
        for (Enemy enemy : enemies) {
            player.interactWithEnemy(enemy);
        }
    }

    // Main method to start the game simulation
    public static void main(String[] args) {
        Player player = new Player("Hero");
        Enemy enemy1 = new Enemy("Goblin", 1, 0);
        Game game = new Game(player);
        game.addEnemy(enemy1);
        game.play();
    }
}