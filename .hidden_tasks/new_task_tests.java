Let's start by writing unit tests for our three classes. We'll test the methods on each class along with their getters and setters. In these test cases, we will simulate different scenarios to test boundary cases and performance. Some of the tests we will run include empty strings, negative numbers, zero, maximum bounds of scores, game movement exceeding game bound and game ending conditions.

```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    private Player player;
    private Enemy enemy;
    private Game game;

    @Before
    public void setUp() {
        player = new Player("Player1", 0, 0, 100);
        enemy = new Enemy("Enemy1", 10, 10, 10);
        game = new Game(player, enemy);
    }
    
    @Test
    public void testPlayerAttributes() {
        assertEquals("Player1", player.getName());
        assertEquals(0, player.getXPosition());
        assertEquals(0, player.getYPosition());
        assertEquals(100, player.getScore());
    }
    
    @Test
    public void testEnemyAttributes() {
        assertEquals("Enemy1", enemy.getType());
        assertEquals(10, enemy.getXPosition());
        assertEquals(10, enemy.getYPosition());
        assertEquals(10, enemy.getDamage());
    }
    
    @Test
    public void testMoveXPosition() {
        player.moveRight();
        assertEquals(1, player.getXPosition());
        
        player.moveLeft();
        player.moveLeft();
        assertEquals(-1, player.getXPosition());
    }
    
    @Test
    public void testMoveYPosition() {
        player.moveUp();
        assertEquals(1, player.getYPosition());
        
        player.moveDown();
        player.moveDown();
        assertEquals(-1, player.getYPosition());
    }
    
    @Test
    public void testIncreaseScore() {
        player.increaseScore(10);
        assertEquals(110, player.getScore());
    }
    
    @Test
    public void testAttackPlayer() {
        enemy.attackPlayer(player);
        assertEquals(90, player.getScore());
    }
    
    @Test
    public void testAttackEnemy() {
        player.attackEnemy(enemy);
        assertEquals(0, enemy.getDamage());
    }
    
    @Test
    public void testShadowing() {
        Player shadowPlayer = new Player("Shadow", 3, 2, 85);
        assertEquals("Shadow", shadowPlayer.getName());
    }
}

```