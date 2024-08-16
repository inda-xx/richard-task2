```java
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
    private Player player;
    private static final double DELTA = 1e-15;

    @Before
    public void setUpPlayer() {
        player = new Player("John", 1, 1, 0);
    }

    @Test
    public void testInitialPlayerPosition() {
        assertEquals(1, player.getXPosition());
        assertEquals(1, player.getYPosition());
    }

    @Test
    public void testPlayerMovement() {
        player.move(2, 3);
        assertEquals(2, player.getXPosition());
        assertEquals(3, player.getYPosition());
    }

    @Test
    public void testPlayerScoreAfterHittingEnemy() {
        Enemy enemy = new Enemy("Monster", 1, 1, 10);
        player.hitEnemy(enemy);
        assertEquals(1, player.getScore(), DELTA);
    }
}

public class EnemyTest {
    private Enemy enemy;

    @Before
    public void setUpEnemy() {
        enemy = new Enemy("Monster", 2, 2, 3);
    }

    @Test
    public void testEnemyInitialHealth() {
        assertEquals(3, enemy.getHealth());
    }

    @Test
    public void testEnemyHealthAfterBeingHit() {
        enemy.hitByPlayer();
        assertEquals(2, enemy.getHealth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEnemyNegativeHealth() {
        enemy = new Enemy("Monster", 2, 2, -2);
    }
}
```