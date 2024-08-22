```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameOnTest {
    private Player player;
    private Enemy enemy;
    private Scoreboard scoreboard;

    @Before
    public void setUp() {
        player = new Player("Gamer");
        enemy = new Enemy(100);
        scoreboard = new Scoreboard();
    }

    @Test
    public void testPlayerGetName() {
        assertEquals("Gamer", player.getName());
    }

    @Test
    public void testPlayerHealth() {
        assertEquals(100, player.getHealth());
    }

    @Test
    public void testPlayerScore() {
        assertEquals(0, player.getScore());
    }

    @Test
    public void testEnemyHealth() {
        assertEquals(100, enemy.getHealth());
    }

    @Test
    public void testAttack() {
        player.attack(enemy);
        assertEquals(90, enemy.getHealth());
    }
    
    @Test
    public void testInvalidAttack() {
        enemy.setHealth(0);
        player.attack(enemy);
        assertEquals(0, enemy.getHealth());
    }

    @Test
    public void testScoreboardPrint() {
        player.setScore(50);
        scoreboard.printScore(player);
        assertEquals(50, player.getScore());
    }
}
```