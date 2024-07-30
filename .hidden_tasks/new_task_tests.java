```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    private AvengerBot avengerBot;
    private RoboRaider roboRaider1, roboRaider2;

    @Before
    public void setUp() {
        avengerBot = new AvengerBot("Avenger", 5);
        roboRaider1 = new RoboRaider(10, 2);
        roboRaider2 = new RoboRaider(5, 1);
    }

    @Test
    public void testAvengerBotCreation() {
        assertEquals("Avenger", avengerBot.getName());
        assertEquals(5, avengerBot.getSpeed());
        assertEquals(0, avengerBot.getScore());
        assertTrue(avengerBot.getStatus());
    }

    @Test
    public void testRoboRaiderCreation() {
        assertEquals(10, roboRaider1.getHealth());
        assertEquals(2, roboRaider1.getDamagePotential());

        assertEquals(5, roboRaider2.getHealth());
        assertEquals(1, roboRaider2.getDamagePotential());
    }

    @Test
    public void testDestroyRoboRaider() {
        avengerBot.destroyRoboRaider(roboRaider1);
        assertEquals(0, roboRaider1.getHealth());
        assertEquals(10, avengerBot.getScore());

        avengerBot.destroyRoboRaider(roboRaider2);
        assertEquals(-5, roboRaider2.getHealth());
        assertEquals(15, avengerBot.getScore()); // The score should be increased by 5 more after the second destroy
    }

    @Test
    public void testPrintStatus() {
        avengerBot.destroyRoboRaider(roboRaider1);
        assertEquals("AvengerBot Avenger: Score=10, Status=true", avengerBot.printStatus());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullRoboRaiderException() {
        avengerBot.destroyRoboRaider(null);
    }
}
```