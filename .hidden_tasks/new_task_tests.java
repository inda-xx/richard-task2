```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    private Player player;
    private Game game;
    private Enemy enemy;

    @Before
    public void setUp() {
      player = new Player("Player1", 10, 5, 5);
      game = new Game();
      enemy = new Enemy("Enemy1", 10, 5, 5);
    }

    @Test
    public void testPlayerMovement() {
      player.move("up");
      assertEquals(4, player.getY());
    }

    @Test
    public void testScoreIncreasedWhenAvoiding() {
      game.setScore(10);
      int scoreBeforeMoving = game.getScore();
      player.move("right");
      int scoreAfterMoving = game.getScore();
      assertTrue(scoreAfterMoving > scoreBeforeMoving);
    }

    @Test
    public void testScoreDecreaseWhenPlayerMeetsEnemy() {
      game.setScore(10);
      player.setX(5);
      player.setY(5);
      int scoreBeforeMoving = game.getScore();
      player.move("up");
      int scoreAfterMoving = game.getScore();
      assertTrue(scoreAfterMoving < scoreBeforeMoving);
    }

    @Test
    public void testPlayerIsAlive() {
      assertTrue(player.getLifeStatus());
    }
    
    @Test
    public void testPlayerDiesWhenScoreBelowZero() {
      game.setScore(-10);
      assertFalse(player.getLifeStatus());
    }
}
```