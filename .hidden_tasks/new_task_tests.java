ava.util.List;
import java.util.ArrayList;

class Game {
  
  private String playerName;
  private int playerScore;
  private boolean gameStatus;
  private List<String> enemies; 

  public Game(String playerName, int playerScore, boolean gameStatus) {
    this.playerName = playerName;
    this.playerScore = playerScore;
    this.gameStatus = gameStatus;
    this.enemies = new ArrayList<>();
  }

  public String getPlayerName() {
    return playerName;
  }

  public int getPlayerScore() {
    return playerScore;
  }

  public boolean isGameStatus() {
    return gameStatus;
  }

  public List<String> getEnemies() {
    return enemies;
  }

  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }

  public void setPlayerScore(int playerScore) {
    this.playerScore = playerScore;
  }

  public void setGameStatus(boolean gameStatus) {
    this.gameStatus = gameStatus;
  }

  public void setEnemies(List<String> enemies) {
    this.enemies = enemies;
  }

  public void printGameInfo() {
    System.out.println("Player Name: " + playerName);
    System.out.println("Player Score: " + playerScore);
    System.out.println("Game Status: " + gameStatus);
    System.out.println("Enemies: " + enemies);
  } 


  public void updateScore(int score) {
    playerScore += score;
  }

  class Enemy {
    
    private String name;
    private int enemyAttackPower;

    public Enemy(String name, int enemyAttackPower) {
      this.name = name;
      this.enemyAttackPower = enemyAttackPower;
      enemies.add(this.name);
    }

    public String getName() {
      return name;
    }

    public int getEnemyAttackPower() {
      return enemyAttackPower;
    }

    public void setName(String name) {
      this.name = name;
    }

    public void setEnemyAttackPower(int enemyAttackPower) {
      this.enemyAttackPower = enemyAttackPower;
    }

    public void generateEnemy() {
      System.out.println("New enemy " + name + " generated.");
    }

    public boolean isEnemyDefeated() {
      return playerScore > enemyAttackPower;
    }

    public void enemyAttack() {
      if (isEnemyDefeated()) {
        System.out.println("Player dodged the attack.");
        updateScore(5);
      } else {
        System.out.println("Enemy attacked the player.");
        gameStatus = false;
      }
    }

  }

  public static void main(String[] args) {
    Game newGame = new Game("Player1", 0, true);
    newGame.printGameInfo();
    newGame.setPlayerScore(10);

    Enemy enemy = newGame.new Enemy("Dragon", 15);
    enemy.generateEnemy();
    enemy.enemyAttack();
    newGame.printGameInfo();

    enemy.setEnemyAttackPower(5);
    enemy.enemyAttack();
    newGame.printGameInfo();
  } 
}



import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GameTest {

  private Game game;

  @Before
  public void setUp() {
    game = new Game("Player1", 10, true);
  }

  @Test
  public void testGetPlayerName() {
    assertEquals("Player1", game.getPlayerName());
  }

  @Test
  public void testGetPlayerScore() {
    assertEquals(10, game.getPlayerScore());
  }

  @Test
  public void testIsGameStatus() {
    assertTrue(game.isGameStatus());
  }

  @Test
  public void testGetEnemies() {
    List<String> enemies = game.getEnemies();
    assertTrue(enemies.isEmpty());
  }

  @Test
  public void testSetPlayerScore() {
    game.setPlayerScore(15);
    assertEquals(15, game.getPlayerScore());
  }

  @Test
  public void testSetGameStatus() {
    game.setGameStatus(false);
    assertTrue(!game.isGameStatus());
  }

  @Test
  public void testSetEnemies() {
    List<String> newEnemies = Arrays.asList("Dragon", "Witch");
    game.setEnemies(newEnemies);
    assertEquals(newEnemies, game.getEnemies());
  }

  @Test
  public void testUpdateScore() {
    game.updateScore(5);
    assertEquals(15, game.getPlayerScore());
  }

  @Test
  public void testEnemyAttack() {
    Game.Enemy enemy = game.new Enemy("Dragon", 15);
    enemy.enemyAttack();
    assertTrue(!game.isGameStatus());

    game.setPlayerScore(20);
    enemy.enemyAttack();
    assertEquals(25, game.getPlayerScore());
    assertTrue(game.isGameStatus());
  }