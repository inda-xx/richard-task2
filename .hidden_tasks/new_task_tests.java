```Java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero", 100, 100, true);
        enemy = new Enemy("Monster", 200, "Savage Beast", false);
    }

    @Test
    public void playerGetName() {
        assertEquals("Hero", player.getName());
    }

    @Test
    public void playerGetScore() {
        assertEquals(100, player.getScore());
    }

    @Test
    public void playerGetHealthPOINTS() {
        assertEquals(100, player.getHealthPOINTS());
    }

    @Test
    public void playerGetIsAlive() {
        assertTrue(player.getIsAlive());
    }

    @Test
    public void playerSetName() {
        player.setName("New Hero");
        assertEquals("New Hero", player.getName());
    }

    @Test
    public void playerSetScore() {
        player.setScore(200);
        assertEquals(200, player.getScore());
    }

    @Test
    public void playerSetHealthPOINTS() {
        player.setHealthPOINTS(150);
        assertEquals(150, player.getHealthPOINTS());
    }

    @Test
    public void playerSetIsAlive() {
        player.setIsAlive(false);
        assertFalse(player.getIsAlive());
    }

    @Test
    public void enemyGetName() {
        assertEquals("Monster", enemy.getName());
    }

    @Test
    public void enemyGetHealthPOINTS() {
        assertEquals(200, enemy.getHealthPOINTS());
    }

    @Test
    public void enemyGetType() {
        assertEquals("Savage Beast", enemy.getType());
    }

    @Test
    public void enemyGetIsDefeated() {
        assertFalse(enemy.getIsDefeated());
    }

    @Test
    public void enemySetName() {
        enemy.setName("New Monster");
        assertEquals("New Monster", enemy.getName());
    }

    @Test
    public void enemySetHealthPOINTS() {
        enemy.setHealthPOINTS(250);
        assertEquals(250, enemy.getHealthPOINTS());
    }

    @Test
    public void enemySetType() {
        enemy.setType("Wild Beast");
        assertEquals("Wild Beast", enemy.getType());
    }

    @Test
    public void enemySetIsDefeated() {
        enemy.setIsDefeated(true);
        assertFalse(enemy.getIsDefeated());
    }

    @Test
    public void playerAttack() {
        player.playerAttack(enemy);
        assertEquals(150, enemy.getHealthPOINTS());
        assertFalse(enemy.getIsDefeated());
    }

    @Test
    public void enemyAttack() {
        enemy.enemyAttack(player);
        assertEquals(50, player.getHealthPOINTS());
        assertTrue(player.getIsAlive());
    }

    @Test
    public void playerDiesWhenHealthPointsReachZero() {
        player.setHealthPOINTS(0);
        assertFalse(player.getIsAlive());
    }

    @Test
    public void enemyDefeatedWhenHealthPointsReachZero() {
        enemy.setHealthPOINTS(0);
        assertTrue(enemy.getIsDefeated());
    }
}
```