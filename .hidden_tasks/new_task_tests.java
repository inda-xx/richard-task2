```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

// PlayerTest.java
public class PlayerTest {
    private Player player;

    @Before
    public void setUp() {
        player = new Player("John", 100, 20, 20);
    }

    @Test
    public void testGetters() {
        assertEquals("John", player.getName());
        assertEquals(100, player.getHealth());
        assertEquals(20, player.getPositionX());
        assertEquals(20, player.getPositionY());
    }

    @Test
    public void testSetters() {
        player.setName("Mark");
        player.setHealth(90);
        player.setPositionX(30);
        player.setPositionY(30);
        assertEquals("Mark", player.getName());
        assertEquals(90, player.getHealth());
        assertEquals(30, player.getPositionX());
        assertEquals(30, player.getPositionY());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeHealth() {
        player.setHealth(-50);
    }
}

// EnemyTest.java
public class EnemyTest {
    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy("Goblin", 10, 10, true);
    }

    @Test
    public void testGetters() {
        assertEquals("Goblin", enemy.getType());
        assertEquals(10, enemy.getPositionX());
        assertEquals(10, enemy.getPositionY());
        assertTrue(enemy.isAlive());
    }

    @Test
    public void testSetters() {
        enemy.setType("Dragon");
        enemy.setPositionX(30);
        enemy.setPositionY(30);
        enemy.setAlive(false);
        assertEquals("Dragon", enemy.getType());
        assertEquals(30, enemy.getPositionX());
        assertEquals(30, enemy.getPositionY());
        assertFalse(enemy.isAlive());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPositionOutOfBoundsX() {
        enemy.setPositionX(110);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPositionOutOfBoundsY() {
        enemy.setPositionY(-10);
    }
}

// ScoreTest.java
public class ScoreTest {
    private Score score;
    private Player player;

    @Before
    public void setUp() {
        player = new Player("Player1", 100, 10, 10);
        score = new Score(0, player);
    }

    @Test
    public void testGettersAndSetters() {
        assertEquals(0, score.getPoints());
        assertEquals("Player1", score.getPlayer().getName());

        score.setPoints(10);
        assertEquals(10, score.getPoints());
    }

    @Test
    public void testIncrement() {
        score.increment(10);
        assertEquals(10, score.getPoints());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeIncrement() {
        score.increment(-5);
    }
}
```