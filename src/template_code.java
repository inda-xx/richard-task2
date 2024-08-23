import org.junit.Before;
    import org.junit.Test;
    import static org.junit.Assert.*;
    import java.util.Arrays;
    import java.util.List;

import java.util.Scanner;


public class GameCharacter {
    // Instance fields
    private String name;
    private int health;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor to initialize the GameCharacter
    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
        this.score = 0;
        this.positionX = 0;
        this.positionY = 0;
    }

    // Getters and setters for encapsulation
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }
    public int getPositionX() { return positionX; }
    public void setPositionX(int positionX) { this.positionX = positionX; }
    public int getPositionY() { return positionY; }
    public void setPositionY(int positionY) { this.positionY = positionY; }

    // Method to move the player up
    public void moveUp() {
        positionY += 1;
        System.out.println(name + " moves up to (" + positionX + ", " + positionY + ")");
    }

    // Method to move the player down
    public void moveDown() {
        positionY -= 1;
        System.out.println(name + " moves down to (" + positionX + ", " + positionY + ")");
    }

    // Method to move the player left
    public void moveLeft() {
        positionX -= 1;
        System.out.println(name + " moves left to (" + positionX + ", " + positionY + ")");
    }

    // Method to move the player right
    public void moveRight() {
        positionX += 1;
        System.out.println(name + " moves right to (" + positionX + ", " + positionY + ")");
    }

    // Method to update the score with given points
    public void updateScore(int points) {
        score += points;
        System.out.println("Score updated! Current score: " + score);
    }

    // Method for interacting with an enemy
    public void interactWithEnemy(GameCharacter enemy) {
        if (health > 0 && enemy.health > 0) {
            System.out.println(name + " attacks " + enemy.name + "!");
            enemy.health -= 10;
            System.out.println(enemy.name + " health is now " + enemy.health);

            if (enemy.health <= 0) {
                System.out.println(enemy.name + " is defeated!");
                updateScore(10);
            }
        }
    }

    // Main method to run the game simulation
    public static void main(String[] args) {
        GameCharacter hero = new GameCharacter("Hero", 100);
        GameCharacter enemy = new GameCharacter("Enemy", 50);

        hero.moveUp();
        hero.moveRight();
        hero.interactWithEnemy(enemy);
        hero.updateScore(5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter movement direction (w/a/s/d) or 'q' to quit:");
        char direction;

        while ((direction = scanner.nextLine().charAt(0)) != 'q') {
            switch (direction) {
                case 'w':
                    hero.moveUp();
                    break;
                case 'a':
                    hero.moveLeft();
                    break;
                case 's':
                    hero.moveDown();
                    break;
                case 'd':
                    hero.moveRight();
                    break;
                default:
                    System.out.println("Invalid input, please enter w, a, s, or d.");
            }
            System.out.println("Enter movement direction (w/a/s/d) or 'q' to quit:");
        }

        scanner.close();
    }
}