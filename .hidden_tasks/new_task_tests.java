import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    private Player player;

    @Before
    public void setUp() {
        player = new Player("Hero", 0, 0);
    }

    @Test
    public void testInitialPlayerProperties() {
        assertEquals("Hero", player.getName());
        assertEquals(0, player.getScore());
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testMoveUpWithinBounds() {
        player.setPositionY(1);
        player.moveUp();
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testMoveUpOutOfBounds() {
        player.setPositionY(0);
        player.moveUp();
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testMoveDownWithinBounds() {
        player.moveDown();
        assertEquals(1, player.getPositionY());
    }

    @Test
    public void testMoveDownOutOfBounds() {
        player.setPositionY(4);
        player.moveDown();
        assertEquals(4, player.getPositionY());
    }

    @Test
    public void testMoveLeftWithinBounds() {
        player.setPositionX(1);
        player.moveLeft();
        assertEquals(0, player.getPositionX());
    }

    @Test
    public void testMoveLeftOutOfBounds() {
        player.setPositionX(0);
        player.moveLeft();
        assertEquals(0, player.getPositionX());
    }

    @Test
    public void testMoveRightWithinBounds() {
        player.moveRight();
        assertEquals(1, player.getPositionX());
    }

    @Test
    public void testMoveRightOutOfBounds() {
        player.setPositionX(4);
        player.moveRight();
        assertEquals(4, player.getPositionX());
    }

    @Test
    public void testCollectPointIncreasesScore() {
        int initialScore = player.getScore();
        player.collectPoint();
        assertEquals(initialScore + 1, player.getScore());
    }

    @Test
    public void testMultipleActions() {
        player.moveRight();
        player.moveRight();
        player.collectPoint();
        player.moveDown();
        player.moveLeft();
        assertEquals(1, player.getScore());
        assertEquals(1, player.getPositionX());
        assertEquals(1, player.getPositionY());
    }
}

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnemyTest {
    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy("Goblin", 2, 2);
    }

    @Test
    public void testInitialEnemyProperties() {
        assertEquals("Goblin", enemy.getType());
        assertEquals(2, enemy.getPositionX());
        assertEquals(2, enemy.getPositionY());
    }
}

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    
    @Test
    public void testCollisionDetection() {
        Player player = new Player("TestPlayer", 2, 2);
        Enemy[] enemies = { new Enemy("Goblin", 2, 2), new Enemy("Orc", 3, 3) };
        
        assertTrue(checkCollision(player, enemies));
    }

    @Test
    public void testNoCollision() {
        Player player = new Player("TestPlayer", 0, 0);
        Enemy[] enemies = { new Enemy("Goblin", 2, 2), new Enemy("Orc", 3, 3) };
        
        assertFalse(checkCollision(player, enemies));
    }

    private boolean checkCollision(Player player, Enemy[] enemies) {
        for (Enemy enemy : enemies) {
            if (player.getPositionX() == enemy.getPositionX() &&
                player.getPositionY() == enemy.getPositionY()) {
                return true;
            }
        }
        return false;
    }
}