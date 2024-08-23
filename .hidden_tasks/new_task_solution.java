ss for Player
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    private Player player;

    @Before
    public void setUp() {
        player = new Player("SuperCoder", 0, 3);
    }

    @Test
    public void testName() {
        assertEquals("SuperCoder", player.getName());
    }

    @Test
    public void testScore() {
        assertEquals(0, player.getScore());
    }
    
    @Test
    public void testLives() {
        assertEquals(3, player.getLives());
    }
    
    @Test
    public void testSettingScore() {
        player.setScore(5);
        assertEquals(5, player.getScore());
    }
    
    @Test
    public void testSettingLives() {
        player.setLives(2);
        assertEquals(2, player.getLives());
    }
}

// test class for Enemy
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnemyTest {
    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy("BugMonster", 0);
    }

    @Test
    public void testName() {
        assertEquals("BugMonster", enemy.getName());
    }

    @Test
    public void testScore() {
        assertEquals(0, enemy.getScore());
    }
    
    @Test
    public void testSettingScore() {
        enemy.setScore(5);
        assertEquals(5, enemy.getScore());
    }
}

// test class for Game
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    private Game game;
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        game = new Game();
        player = new Player("SuperCoder", 0, 3);
        enemy = new Enemy("BugMonster", 0);
    }

    @Test
    public void testPlayerWins() {
        player.setScore(50); //setting player's score such that player wins
        game.startGame(player, enemy);
        assertTrue(player.getScore() > enemy.getScore());
    }
    
    @Test
    public void testEnemyWins() {
        enemy.setScore(90); //setting enemy's score such that enemy wins
        game.startGame(player, enemy);
        assertTrue(player.getScore() < enemy.getScore());
    }
    
    @Test
    public void testPlayerLosesLife() {
        game.startGame(player, enemy);
        assertEquals(0, player.getLives());
    }
}