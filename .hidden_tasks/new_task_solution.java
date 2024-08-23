ayer.java
public class Player {
  private String name;
  private int score;
  private int positionX;
  private int positionY;

  public Player(String name, int startX, int startY) {
    this.name = name;
    this.positionX = startX;
    this.positionY = startY;
    this.score = 0;
  }
  
  public String getName() {
    return this.name;
  }
  
  public int getScore() {
    return this.score;
  }
  
  public int getPositionX() {
    return this.positionX;
  }
  
  public int getPositionY() {
    return this.positionY;
  }

  public void setName(String name) {
    this.name = name; 
  }

  public void moveUp() {
    this.positionY -= 1;
  }

  public void moveDown() {
    this.positionY += 1;
  }

  public void moveLeft() {
    this.positionX -= 1;
  }

  public void moveRight() {
    this.positionX += 1;
  }

  public void increaseScore(int points) {
    this.score += points;
  }

  public void decreaseScore(int points) {
    this.score = Math.max(this.score - points, 0); 
  }

  public void attack(Enemy enemy) {
    enemy.reduceHealth(5);
    if (enemy.getHealth() <= 0) {
      this.increaseScore(10);
      System.out.println("Enemy defeated!");
    }
  }

  public void printInfo() {
    System.out.println("Player Name: " + this.name
      + "\nScore: " + this.score 
      + "\nPosition: (" + this.positionX + "," + this.positionY + ")");
  }
}

// Class Enemy.java
public class Enemy {
  private String type;
  private int health;
  private int attackPower;
  private int positionX;
  private int positionY;

  public Enemy(String type, int health, int attackPower, int startX, int startY) {
    this.type = type;
    this.health = health;
    this.attackPower = attackPower;
    this.positionX = startX;
    this.positionY = startY;
  }

  public String getType() {
    return this.type;
  }
  
  public int getHealth() {
    return this.health;
  }
  
  public int getAttackPower() {
    return this.attackPower;
  }

  public int getPositionX() {
    return this.positionX;
  }
  
  public int getPositionY() {
    return this.positionY;
  }

  public void setType(String type) {
    this.type = type; 
  }

  public void moveUp() {
    this.positionY -= 1;
  }

  public void moveDown() {
    this.positionY += 1;
  }

  public void moveLeft() {
    this.positionX -= 1;
  }

  public void moveRight() {
    this.positionX += 1;
  }

  public void reduceHealth(int damage) {
    this.health = Math.max(this.health - damage, 0);
  }

  public void printInfo() {
    System.out.println("Enemy Type: " + this.type
      + "\nHealth: " + health
      + "\nAttack Power: " + this.attackPower
      + "\nPosition: (" + this.positionX + "," + this.positionY + ")");
  }
}

// Class Game.java
public class Game {
  public static void main(String[] args) {
    Player player = new Player("Hero", 0, 0);
    Enemy enemy = new Enemy("Goblin", 30, 5, 5, 5);

    player.printInfo();
    enemy.printInfo();

    player.moveRight();
    player.attack(enemy);

    player.printInfo();
    enemy.printInfo();
  }
}


// Test Classes

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
  private Player player;

  @Before
  public void setUp() {
    player = new Player("Hero", 0, 0);
  }

  @Test
  public void testGetName() {
    assertEquals("Hero", player.getName());
  }

  @Test
  public void testGetScore() {
    assertEquals(0, player.getScore());
  }

  @Test
  public void testNameSetter() {
    player.setName("Warrior");
    assertEquals("Warrior", player.getName());
  }

  @Test
  public void testPositionAfterMovement() {
    player.moveRight();
    assertEquals(1, player.getPositionX());
    assertEquals(0, player.getPositionY());
  }
}

public class EnemyTest {
  private Enemy enemy;

  @Before
  public void setUp() {
    enemy = new Enemy("Goblin", 30, 5, 5, 5);
  }

  @Test
  public void testGetType() {
    assertEquals("Goblin", enemy.getType());
  }

  @Test
  public void testGetHealth() {
    assertEquals(30, enemy.getHealth());
  }

  @Test
  public void testTypeSetter() {
    enemy.setType("Dragon");
    assertEquals("Dragon", enemy.getType());
  }

  @Test
  public void testPositionAfterMovement() {
    enemy.moveUp();
    assertEquals(5, enemy.getPositionX());
    assertEquals(4, enemy.getPositionY());
  }
}