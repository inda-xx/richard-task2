```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    private Hunter hunter;
    private Enemy enemy;

    @Before
    public void setUp() {
        hunter = new Hunter("Role", 0, 0);
        enemy = new Enemy("Orc", 10, 2, 2);
    }

    @Test
    public void testGetHunterName() {
        assertEquals("Role", hunter.getName());
    }

    @Test
    public void testGetHunterLocation() {
        assertEquals(0, hunter.getXLocation());
        assertEquals(0, hunter.getYLocation());
    }

    @Test
    public void testGetHunterScore() {
        assertEquals(0, hunter.getScore());
    }

    @Test
    public void testSetHunterLocation() {
        hunter.setXLocation(5);
        hunter.setYLocation(10);
        assertEquals(5, hunter.getXLocation());
        assertEquals(10, hunter.getYLocation());
    }

    @Test
    public void testSetHunterScore() {
        hunter.setScore(10);
        assertEquals(10, hunter.getScore());
    }

    @Test
    public void testGetEnemyType() {
        assertEquals("Orc", enemy.getType());
    }

    @Test
    public void testGetEnemyStrength() {
        assertEquals(10, enemy.getStrength());
    }

    @Test
    public void testGetEnemyLocation() {
        assertEquals(2, enemy.getXLocation());
        assertEquals(2, enemy.getYLocation());
    }

    @Test
    public void testSetEnemyStrength() {
        enemy.setStrength(5);
        assertEquals(5, enemy.getStrength());
    }

    @Test
    public void testHunterMove() {
        hunter.tallyScore(); // No enemies to avoid score = 0
        hunter.move(2, 2); // Moving to enemy location, score reduces by enemy strength
        assertEquals(-10, hunter.getScore());
    }

    @Test
    public void testHunterAvoidEnemy() {
        hunter.move(5, 5); // Moving away from enemies
        hunter.tallyScore(); // Avoiding 1 enemy, score = 1
        assertEquals(1, hunter.getScore());
    }
}

```