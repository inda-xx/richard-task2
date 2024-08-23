import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    private Player player;
    private Enemy enemy;

    @BeforeEach
    public void setUp() {
        player = new Player("Hero", 0, 0);
        enemy = new Enemy("Goblin", 50, 5, 5);
    }

    @AfterEach
    public void tearDown() {
        player = null;
        enemy = null;
    }

    @Test
    public void testPlayerMovement() {
        player.move(3, 3);
        assertEquals(3, player.getPositionX());
        assertEquals(3, player.getPositionY());
    }

    @Test
    public void testPlayerScore() {
        player.addScore(10);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testPlayerAttack() {
        player.attack(enemy, 20);
        assertEquals(30, enemy.getHealth());
    }

    @Test
    public void testPlayerKillEnemy() {
        player.attack(enemy, 60);
        assertEquals(0, enemy.getHealth());
        assertEquals(100, player.getScore());
    }

    @Test
    public void testSettersAndGetters(){
        Player testPlayer = new Player("Test", 0, 0);
        testPlayer.setPositionX(10);
        testPlayer.setPositionY(20);
        testPlayer.setScore(30);
        testPlayer.setName("Changed");
        assertEquals(10, testPlayer.getPositionX());
        assertEquals(20, testPlayer.getPositionY());
        assertEquals(30, testPlayer.getScore());
        assertEquals("Changed", testPlayer.getName());

        Enemy testEnemy = new Enemy("Test", 30, 0, 0);
        testEnemy.setPositionX(1);
        testEnemy.setPositionY(2);
        testEnemy.setHealth(3);
        testEnemy.setType("Changed");
        assertEquals(1, testEnemy.getPositionX());
        assertEquals(2, testEnemy.getPositionY());
        assertEquals(3, testEnemy.getHealth());
        assertEquals("Changed", testEnemy.getType());
    }

    @Test
    public void testDemonstrateShadowing() {
        Example example = new Example();
        int value = example.demonstrateShadowing();
        assertEquals(42, value);
    }
}

class Example {
    private int value = 42;

    public int demonstrateShadowing() {
        int value = 100;
        return this.value;
    }
}