```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleGameTest {
    private Player player;
    private Enemy enemy;
    private Game game;

    @Before
    public void setUp() {
        player = new Player();
        enemy = new Enemy();
        game = new Game(player, enemy);
    }

    @Test
    public void testPlayerMovement() {
        player.move(5);
        assertEquals(5, player.getPosition());
        
        player.move(-10);
        assertEquals(0, player.getPosition());
    }

    @Test
    public void testPlayerScore() {
        player.increaseScore(5);
        assertEquals(5, player.getScore());
        
        player.increaseScore(10);
        assertEquals(15, player.getScore());
        
        game.checkForEnemy();
        assertEquals(15, player.getScore());
        
        enemy.move(5);
        game.checkForEnemy();
        assertEquals(10, player.getScore());
    }

    @Test
    public void testEnemyPosition() {
        enemy.move(5);
        assertEquals(5, enemy.getPosition());
    }
}
```