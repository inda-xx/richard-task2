```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    private Player player;
    private Player player2;
    private Map map;
    
    @Before
    public void setUp()  {
        player = new Player("player1", new int[]{0,0});
        player2 = new Player("player2", new int[]{1,1});
        map = new Map(5, 5, new Player[]{});
    }

    @Test
    public void testGetPlayerName() {
        assertEquals("player1", player.getPlayerName());
    }

    @Test
    public void testSetPlayerName() {
        player.setPlayerName("newPlayerName");
        assertEquals("newPlayerName", player.getPlayerName());
    }

    @Test
    public void testGetAndSetPlayerScore() {
        player.setPlayerScore(10);
        assertEquals(10, player.getPlayerScore());
    }

    @Test
    public void testMovePlayer() {
        player.movePlayer(1, 1);
        assertArrayEquals(new int[]{1, 1}, player.getPlayerPosition());
    }

    @Test
    public void testIncreaseScore() {
        player.increaseScore(10);
        assertEquals(10, player.getPlayerScore());
    }

    @Test
    public void testRemovePlayer() {
        map.addPlayer(player);
        map.removePlayer(player);
        assertEquals(0, map.getPlayerList().length);
    }

    @Test
    public void testGameOver() {
        map.addPlayer(player);
        map.removePlayer(player);
        assertTrue(map.gameOver());
    }

    @Test
    public void testRename() {
        Cat cat = new Cat("Tom");
        cat.rename("Jerry");
        assertEquals("Jerry", cat.getName());
    }
}

```