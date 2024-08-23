import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    private Game game;
    private Game encounterGame;

    @Before
    public void setup() {
        game = new Game("Player1", 0, 0, "Enemy1", 5);
        encounterGame = new Game("Player1", 10, 3, "Enemy1", 5);
    }

    @Test
    public void testInitialPlayerSetup() {
        assertEquals("Player1", game.getPlayerName());
        assertEquals(0, game.getPlayerScore());
        assertEquals(0, game.getPlayerPosition());
    }

    @Test
    public void testInitialEnemySetup() {
        assertEquals("Enemy1", game.getEnemyName());
        assertEquals(5, game.getEnemyPosition());
    }

    @Test
    public void testPlayerMovement() {
        game.movePlayer(3);
        assertEquals(3, game.getPlayerPosition());
        assertEquals(3, game.getPlayerScore());

        game.movePlayer(2);
        assertEquals(5, game.getPlayerPosition());
        assertEquals(5, game.getPlayerScore());
    }

    @Test
    public void testEncounter() {
        encounterGame.movePlayer(2);
        assertEquals(5, encounterGame.getPlayerPosition());
        assertEquals(12, encounterGame.getPlayerScore());
    }
    
    @Test
    public void testPlayerScoreAfterMove() {
        game.movePlayer(4);
        assertEquals(4, game.getPlayerScore());
        assertEquals(4, game.getPlayerPosition());
    }
    
    @Test
    public void testPlayerPositionAfterMove() {
        game.movePlayer(3);
        assertEquals(3, game.getPlayerPosition());
    }
    
    @Test
    public void testModifyPlayerName() {
        game.setPlayerName("NewPlayer");
        assertEquals("NewPlayer", game.getPlayerName());
    }

    @Test
    public void testModifyEnemyPosition() {
        game.setEnemyPosition(10);
        assertEquals(10, game.getEnemyPosition());
    }

    @Test
    public void testModifyPlayerPosition() {
        game.setPlayerPosition(8);
        assertEquals(8, game.getPlayerPosition());
    }

    @Test
    public void testNegativeMovement() {
        game.movePlayer(-3);
        assertEquals(-3, game.getPlayerPosition());
        assertEquals(-3, game.getPlayerScore());
    }
}

class ShadowGameTest {
    @Test
    public void testShadowingExample() {
        ShadowGame shadowGame = new ShadowGame();
        shadowGame.printShadow();
        // No assertions, this test is for verifying shadowing behavior and console output
    }
}

class CreatureTest {
    @Test
    public void testCreatureAnnouncement() {
        Creature creature = new Creature("Dragon");
        creature.announce();
        // No assertions, this test is for verifying creature announcement behavior and console output
    }
}