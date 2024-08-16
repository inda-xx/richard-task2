```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    private Player player1;
    private Player player2;
    private Enemy enemy1;

    @Before
    public void setUp() {
        player1 = new Player("Player1", 0, 100, true);
        player2 = new Player("Player2", 100, 0, false);
        enemy1 = new Enemy("Enemy1", 50);
    }

    @Test
    public void testGetPlayerName() {
        assertEquals("Player1", player1.getPlayerName());
        assertEquals("Player2", player2.getPlayerName());
    }

    @Test
    public void testGetPlayerScore() {
        assertEquals(0, player1.getPlayerScore());
        assertEquals(100, player2.getPlayerScore());
    }

    @Test
    public void testGetPlayerHealth() {
        assertEquals(100, player1.getPlayerHealth());
        assertEquals(0, player2.getPlayerHealth());
    }

    @Test
    public void testGetIsAlive() {
        assertEquals(true, player1.getIsAlive());
        assertEquals(false, player2.getIsAlive());
    }

    @Test
    public void testSetPlayerName() {
        player1.setPlayerName("New Player");
        assertEquals("New Player", player1.getPlayerName());
    }

    @Test
    public void testSetPlayerScore() {
        player1.setPlayerScore(50);
        assertEquals(50, player1.getPlayerScore());
    }

    @Test
    public void testSetPlayerHealth() {
        player1.setPlayerHealth(60);
        assertEquals(60, player1.getPlayerHealth());
    }

    @Test
    public void testSetIsAlive() {
        player1.setIsAlive(false);
        assertEquals(false, player1.getIsAlive());
    }

    @Test
    public void testGetEnemyType() {
        assertEquals("Enemy1", enemy1.getEnemyType());
    }

    @Test
    public void testGetEnemyStrength() {
        assertEquals(50, enemy1.getEnemyStrength());
    }

    @Test
    public void testSetEnemyType() {
        enemy1.setEnemyType("New Enemy");
        assertEquals("New Enemy", enemy1.getEnemyType());
    }

    @Test
    public void testSetEnemyStrength() {
        enemy1.setEnemyStrength(70);
        assertEquals(70, enemy1.getEnemyStrength());
    }

    @Test
    public void testEncounterEnemy() {
        player1.encounterEnemy(enemy1);
        assertTrue(player1.getPlayerScore() == 50 || !player1.getIsAlive());
    }
}
```