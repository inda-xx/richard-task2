import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

import java.util.*;

public class Game {
    // fields
    private String playerName;
    private int playerScore;
    private int playerPosition;
    private String enemyName;
    private int enemyPosition;

    // constructor
    public Game(String playerName, int playerScore, int playerPosition, String enemyName, int enemyPosition) {
        this.playerName = playerName;
        this.playerScore = playerScore;
        this.playerPosition = playerPosition;
        this.enemyName = enemyName;
        this.enemyPosition = enemyPosition;
    }

    // getters and setters
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public int getEnemyPosition() {
        return enemyPosition;
    }

    public void setEnemyPosition(int enemyPosition) {
        this.enemyPosition = enemyPosition;
    }

    // method for player movement
    public void movePlayer(int steps) {
        playerPosition += steps;
        updateScore(steps);
        System.out.println(playerName + " moved to position " + playerPosition);
        checkEncounter();
    }

    // method to update score
    public void updateScore(int steps) {
        playerScore += steps;
        System.out.println(playerName + " has a score of " + playerScore);
    }

    // method for enemy interaction
    public void checkEncounter() {
        if (playerPosition == enemyPosition) {
            System.out.println("Encounter! " + playerName + " is fighting " + enemyName);
        }
    }

    // main method
    public static void main(String[] args) {
        Game game = new Game("Player1", 0, 0, "Enemy1", 5);

        System.out.println("Player: " + game.getPlayerName() + " is at position " + game.getPlayerPosition());
        System.out.println("Enemy: " + game.getEnemyName() + " is at position " + game.getEnemyPosition());

        // Test moving the player
        game.movePlayer(3);
        game.movePlayer(2); // This move should initiate an encounter with the enemy
    }
}

// Shadowing Example
class ShadowGame {
    private int position = 0; // We want this position printed

    public void printShadow() {
        System.out.println(this.position); // Using this.position to print the instance variable
    }

    public static void main(String[] args) {
        new ShadowGame().printShadow();
    }
}

// Shadowing Example
class Creature {
    private String name;

    public Creature(String name) {
        this.name = name; // Using this.name to refer to the instance variable
    }

    public void announce() {
        System.out.println(this.name + " approaches!"); // Using this.name to access the instance variable
    }
}