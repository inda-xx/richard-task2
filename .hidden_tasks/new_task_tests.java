```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameSimulatorTest {
    private Player player;
    private Zombie zombie;
    private Robot robot;
    private GameSimulator gameSimulator;

    @Before
    public void setUp() {
        player = new Player("Warrior", 100);
        zombie = new Zombie("Zed", 10);
        robot = new Robot("Robo", 20);
        gameSimulator = new GameSimulator(player);
    }

    @Test
    public void testPlayerConstructor() {
        assertEquals("Warrior", player.getName());
        assertEquals(100, player.getHealthPoints());
        assertEquals(0, player.getScore());
    }

    @Test
    public void testEnemyConstructor() {
        assertEquals("Zed", zombie.getName());
        assertEquals(10, zombie.getDamage());
        assertEquals("Robo", robot.getName());
        assertEquals(20, robot.getDamage());
    }

    @Test
    public void testAttack() {
        zombie.attack(player);
        robot.attack(player);
        assertEquals(70, player.getHealthPoints());
    }

    @Test
    public void testGameSimulator() {
        gameSimulator.addEnemy(zombie);
        gameSimulator.addEnemy(robot);
        gameSimulator.runTurn();
        assertTrue((player.getHealthPoints() <= 80) && (player.getHealthPoints() >= 60));
    }
}
```