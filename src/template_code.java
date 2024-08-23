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

    // methods to be implemented by student

    // method for player movement
    public void movePlayer(int steps) {
        // update player position
        // update score based on movement
        // print new player position
    }

    // method to update score
    public void updateScore(int steps) {
        // update player score
        // print current score
    }

    // method for enemy interaction
    public void checkEncounter() {
        // check if player position is same as enemy position
        // print encounter message if true
    }

    // main method
    public static void main(String[] args) {
        Game game = new Game("Player1", 0, 0, "Enemy1", 5);
        
        System.out.println("Player: " + game.getPlayerName() + " is at position " + game.getPlayerPosition());
        System.out.println("Enemy: " + game.getEnemyName() + " is at position " + game.getEnemyPosition());
        
        // initialize player and enemy
        // test movement of player
        // test encounter function
    }
}