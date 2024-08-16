```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    private Player player1;
    private Player player2;
    private Enemy enemy1;
    private Enemy enemy2;

    @Before
    public void setUp() {
        player1 = new Player("Alice", 0, 0, 0);
        player2 = new Player("Bob", 0, 0, 0);
        enemy1 = new Enemy("Enemy1", "TypeA", 5, 5);
        enemy2 = new Enemy("Enemy2", "TypeB", 10, 10);
    }

    // test getters for Player and Enemy
    @Test
    public void testGetters() {
        assertEquals("Alice", player1.getName());
        assertEquals("Bob", player2.getName());
        assertEquals(0, player1.getPoints());
        assertEquals("Enemy1", enemy1.getId());
        assertEquals("TypeA", enemy1.getType());
    }

    // test setters for Player and Enemy
    @Test
    public void testSetters() {
        player1.setName("ChangedAlice");
        player1.setPoints(10);
        player1.setXPosition(5);
        player1.setYPosition(5);
        enemy1.setId("NewEnemy1");
        enemy1.setType("NewTypeA");
        enemy1.setXPosition(10);
        enemy1.setYPosition(10);
        
        assertEquals("ChangedAlice", player1.getName());
        assertEquals(10, player1.getPoints());
        assertEquals(5, player1.getXPosition(), 0.001);
        assertEquals(5, player1.getYPosition(), 0.001);
        assertEquals("NewEnemy1", enemy1.getId());
        assertEquals("NewTypeA", enemy1.getType());
        assertEquals(10, enemy1.getXPosition(), 0.001);
        assertEquals(10, enemy1.getYPosition(), 0.001);
    }

    // test Move method
    @Test
    public void testMove() {
        player1.move(5, 5);
        assertEquals(5, player1.getXPosition(), 0.001);
        assertEquals(5, player1.getYPosition(), 0.001);
    }

    // test attack method and point system
    @Test
    public void testAttackAndPoints() {
        player1.attack(enemy1);
        assertEquals(1, player1.getPoints());
        String attackMessage = player1.attack(enemy2);
        // Asserting that the message is as per the message formatting decided in the actual class.
        assertEquals("Player Alice attacked enemy Enemy2, type TypeB.", attackMessage);
        assertEquals(2, player1.getPoints());
    }
}
```