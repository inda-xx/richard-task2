```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameUnitTest {

    private Player player;
    private Enemy enemy1, enemy2;
    private Score score;

    @Before
    public void setUp() {
        player = new Player("JavaWarrior", 100, 20, 10, true);
        enemy1 = new Enemy(1, 50, 15, 5, true);
        enemy2 = new Enemy(2, 60, 25, 8, true);
        score = new Score(1, 0, 0);
    }

    // Testing Player getters
    @Test
    public void testPlayerGetters() {
        assertEquals("JavaWarrior", player.getPlayerName());
        assertEquals(100, player.getPlayerHealth()); 
    }

    // Testing Enemy getters
    @Test
    public void testEnemyGetters() {
        assertEquals(1, enemy1.getEnemyId());
        assertEquals(50, enemy1.getEnemyHealth()); 
    }

    // Testing Score getters
    @Test
    public void testScoreGetters() {
        assertEquals(1, score.getPlayerId());
        assertEquals(0, score.getEnemiesDefeated());
        assertEquals(0, score.getTotalScore());
    }

    // Testing Player battle method
    @Test
    public void testBattle() {
        player.battle(enemy1);
        assertEquals(35, enemy1.getEnemyHealth());
        assertEquals(true, enemy1.isEnemyAlive());
    }

    // Testing Score update method
    @Test
    public void testUpdateScore() {
        score.updateScore(player, enemy1);
        assertEquals(0, score.getEnemiesDefeated());
        assertEquals(0, score.getTotalScore());

        // Simulate a condition where enemy is defeated
        enemy1.setEnemyHealth(0);
        score.updateScore(player, enemy1);
        assertEquals(1, score.getEnemiesDefeated());
        assertEquals(10, score.getTotalScore());
    }

    // Testing multiple enemies and multiple battles
    @Test
    public void testMultipleBattles() {
        player.battle(enemy1);
        player.battle(enemy2);
        score.updateScore(player, enemy1);
        score.updateScore(player, enemy2);

        assertEquals(35, enemy1.getEnemyHealth());
        assertEquals(43, enemy2.getEnemyHealth());
        assertEquals(2, score.getEnemiesDefeated());
        assertEquals(30, score.getTotalScore());
    }
}
```