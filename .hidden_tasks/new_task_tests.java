// Player.java
public class Player {
    private String name;
    private int score;
    private int x;
    private int y;
    
    public Player(String name, int startX, int startY) {
        this.name = name;
        this.x = startX;
        this.y = startY;
        this.score = 0;
    }
    
    public String getName() {
        return name; 
    }
    
    public int getScore() { 
        return score; 
    }
    
    public void setScore(int score) { 
        this.score = score; 
    }
    
    public int getX() { 
        return x; 
    }
    
    public int getY() { 
        return y; 
    }
    
    public void move(int deltaX, int deltaY) {
        this.x = Math.max(0, Math.min(4, this.x + deltaX));
        this.y = Math.max(0, Math.min(4, this.y + deltaY));
    }
    
    public void addScore(int points) {
        this.score += points;
    }
    
    public void printPosition() {
        System.out.println(name + " is at position (" + x + ", " + y + ").");
    }
}

// Enemy.java
public class Enemy {
    private int x;
    private int y;
    private int damage;
    
    public Enemy(int startX, int startY, int damage) {
        this.x = startX;
        this.y = startY;
        this.damage = damage;
    }
    
    public void interact(Player player) {
        if (player.getX() == this.x && player.getY() == this.y) {
            player.setScore(player.getScore() - damage);
            System.out.println("Oh no! " + player.getName() + " encountered an enemy and lost " + damage + " points.");
        }
    }
    
    public void printPosition() {
        System.out.println("Enemy is at position (" + x + ", " + y + ").");
    }
}

// Game.java
public class Game {
    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0);
        Enemy enemy = new Enemy(1, 1, 5);
        
        player.move(1, 1);
        enemy.interact(player);
        
        player.printPosition();
        System.out.println("Player score: " + player.getScore());
    }
}

// GameTest.java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

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
    public void testPlayerMoveOutOfBoundsAbove() {
        player.move(6, 6);
        assertEquals("Player should be at the maximum x=4", 4, player.getX());
        assertEquals("Player should be at the maximum y=4", 4, player.getY());
    }

    @Test
    public void testPlayerMoveOutOfBoundsBelow() {
        player.move(-1, -1);
        assertEquals("Player should be at the minimum x=0", 0, player.getX());
        assertEquals("Player should be at the minimum y=0", 0, player.getY());
    }

    @Test
    public void testEncounterWithEnemy() {
        player.move(1, 1);
        enemy.interact(player);
        assertEquals("Player score should be -5 after encounter", -5, player.getScore());
    }

    @Test
    public void testNoEncounterWithEnemyOtherPosition() {
        player.move(2, 2);
        enemy.interact(player);
        assertEquals("Player score should be unchanged when no encounter", 0, player.getScore());
    }

    @Test
    public void testAddScore() {
        player.addScore(10);
        assertEquals("Player score should be 10", 10, player.getScore());
    }

    @Test
    public void testAddScoreNegative() {
        player.addScore(-5);
        assertEquals("Player score should be -5", -5, player.getScore());
    }
}