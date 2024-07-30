```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IndamonGameTest {
   private IndamonGame game;
   private Indamon indamon;

   @Before
   public void setUp() {
       game = new IndamonGame();
       indamon = new Indamon("Enemy", 20, 10, 5);
   }

   @Test
   public void testMovePlayer() {
       game.movePlayer("up");
       assertEquals("You moved up", game.lastMove());
       game.movePlayer("left");
       assertEquals("You moved left", game.lastMove());
   }

   @Test (expected = IllegalArgumentException.class)
   public void testInvalidMovePlayerDirection() {
       game.movePlayer("underground");
   }

   @Test
   public void testScorePoint() {
       assertEquals(0, game.getPlayerScore());
       game.scorePoint();
       assertEquals(1, game.getPlayerScore());
   }

   @Test
   public void testEncounterEnemy() {
       game.encounterEnemy(indamon);
       assertEquals(indamon, game.getLastEncounteredEnemy());
   }

   @Test
   public void testGameStatus() {
       assertTrue(game.gameStatus().contains("Score: 0"));
       game.scorePoint();
       assertTrue(game.gameStatus().contains("Score: 1"));
   }

   @Test (expected = NullPointerException.class)
   public void testEncounterEnemyNullIndamon() {
       game.encounterEnemy(null);
   }
}
```