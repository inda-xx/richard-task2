import org.junit.Before;
    import org.junit.Test;
    import static org.junit.Assert.*;
    import java.util.Arrays;
    import java.util.List;

import java.util.Scanner;


public class Game {

    public static void main(String[] args) {
        // Create player and enemy instances
        Player player = new Player("Adventurer", 0, 0, 0);
        Enemy enemy = new Enemy("Goblin", 5, 5);

        // Sample interaction
        player.printStatus();
        player.moveRight();
        player.moveUp();

        // Check interaction with enemy
        player.interactWithEnemy(enemy);
        player.printStatus();
    }

}

class Player {
    // Private fields for encapsulation
    private String name;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor to initialize Player fields
    public Player(String name, int score, int positionX, int positionY) {
        this.name = name;
        this.score = score;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    // Methods to move the player
    public void moveLeft() {
        positionX--;
        System.out.println(name + " moved left.");
    }

    public void moveRight() {
        positionX++;
        System.out.println(name + " moved right.");
    }

    public void moveUp() {
        positionY++;
        System.out.println(name + " moved up.");
    }

    public void moveDown() {
        positionY--;
        System.out.println(name + " moved down.");
    }

    // Method to interact with an Enemy
    public void interactWithEnemy(Enemy enemy) {
        if (this.positionX == enemy.getPositionX() && this.positionY == enemy.getPositionY()) {
            System.out.println("Encountered an enemy: " + enemy.getType());
            score += 10; // Example score increment
        }
    }

    // Method to print player status
    public void printStatus() {
        System.out.println("Player " + name + " is at position: (" + positionX + ", " + positionY + ")");
        System.out.println("Current score: " + score);
    }
}

class Enemy {
    // Fields for Enemy class
    private String type;
    private int positionX;
    private int positionY;

    // Constructor to initialize Enemy fields
    public Enemy(String type, int positionX, int positionY) {
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getter and Setter methods
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
}