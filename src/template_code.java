import org.junit.Before;
    import org.junit.Test;
    import static org.junit.Assert.*;
    import java.util.Arrays;
    import java.util.List;

import java.util.Scanner;


class Player {
    // Fields for Player class
    private String name;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor for Player, initializes name and starting position, score starts at 0
    public Player(String name, int positionX, int positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.score = 0;
    }

    // Getters and Setters for encapsulation
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

    // Method to move the player by updating position
    public void move(int deltaX, int deltaY) {
        this.positionX += deltaX;
        this.positionY += deltaY;
        System.out.println("Player moved to position: (" + positionX + ", " + positionY + ")");
    }

    // Method to add score to the player
    public void addScore(int points) {
        this.score += points;
        System.out.println("Score updated: " + score);
    }

    // Method for player to attack an enemy
    public void attack(Enemy enemy, int attackDamage) {
        enemy.setHealth(enemy.getHealth() - attackDamage);
        System.out.println("Attacked " + enemy.getType() + " for " + attackDamage + " damage!");
        if (enemy.getHealth() <= 0) {
            System.out.println(enemy.getType() + " defeated!");
            this.addScore(100);
        }
    }
}

class Enemy {
    // Fields for Enemy class
    private String type;
    private int health;
    private int positionX;
    private int positionY;

    // Constructor for Enemy
    public Enemy(String type, int health, int positionX, int positionY) {
        this.type = type;
        this.health = health;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getters and Setters for encapsulation
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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

public class Game {
    public static void main(String[] args) {
        // Create player and enemy instances
        Player hero = new Player("Hero", 0, 0);
        Enemy goblin = new Enemy("Goblin", 30, 5, 5);

        // Interact with the game objects to demonstrate functionality
        hero.move(1, 1);
        hero.attack(goblin, 10);
        hero.attack(goblin, 20);

        // Example to demonstrate variable shadowing
        Example example = new Example();
        example.demonstrateShadowing();
    }
}

class Example {
    private int value = 42; // This is the intended value to print

    public void demonstrateShadowing() {
        int value = 100; // This shadows the instance variable
        System.out.println(value); // Prints the local variable
        System.out.println(this.value); // Use 'this' to access the instance variable
    }
}