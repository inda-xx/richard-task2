```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    private Player player;
    private Score score;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player(0, 0);
        score = new Score(0);
        enemy = new Enemy(5, 5);
    }

    @Test
    public void testPlayerPosition() {
        assertEquals(0, player.getXPosition());
        assertEquals(0, player.getYPosition());
        
        player.movePlayer(3, 4);
        assertEquals(3, player.getXPosition());
        assertEquals(4, player.getYPosition());
    }

    @Test
    public void testEnemyPosition() {
        assertEquals(5, enemy.getXPosition());
        assertEquals(5, enemy.getYPosition());
        
        enemy.setXPosition(2);
        enemy.setYPosition(3);
        assertEquals(2, enemy.getXPosition());
        assertEquals(3, enemy.getYPosition());
    }

    @Test
    public void testScorePoints() {
        assertEquals(0, score.getPoints());
  
        score.increaseScore(5);
        assertEquals(5, score.getPoints());
    }

    // Boundary tests
    @Test(expected = IllegalArgumentException.class)
    public void testNegativePosition() {
        new Player(-1, -2);
    }

    // Performance test
    @Test(timeout = 100)
    public void testPlayerMovementPerformance() {
        for(int i = 0; i < 1000000; i++) {
            player.movePlayer(i, i);
        }
        assertEquals(999999, player.getXPosition());
        assertEquals(999999, player.getYPosition());
    }
}
```