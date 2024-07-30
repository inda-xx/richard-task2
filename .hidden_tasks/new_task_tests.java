```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TIMBotTest {
    private TIMBot timBot1;
    private TIMBot timBot2;

    @Before
    public void setUp() {
        timBot1 = new TIMBot("Aurora", 100, 50, 60, 100, false);
        timBot2 = new TIMBot("Orion", 90, 55, 55, 105, true);
    }

    @Test
    public void testGetName() {
        assertEquals("Aurora", timBot1.getName());
        assertEquals("Orion", timBot2.getName());
    }

    @Test
    public void testGetHp() {
        assertEquals(100, timBot1.getHp());
        assertEquals(90, timBot2.getHp());
    }

    @Test
    public void testGetStrength() {
        assertEquals(50, timBot1.getStrength());
        assertEquals(55, timBot2.getStrength());
    }

    @Test
    public void testGetDefense() {
        assertEquals(60, timBot1.getDefense());
        assertEquals(55, timBot2.getDefense());
    }

    @Test
    public void testGetScore() {
        assertEquals(100, timBot1.getScore());
        assertEquals(105, timBot2.getScore());
    }

    @Test
    public void testGetStopped() {
        assertEquals(false, timBot1.getStopped());
        assertEquals(true, timBot2.getStopped());
    }

    @Test
    public void testSetName() {
        timBot1.setName("Nova");
        assertEquals("Nova", timBot1.getName());
    }

    @Test
    public void testSetHp() {
        timBot1.setHp(150);
        assertEquals(150, timBot1.getHp());
    }

    @Test
    public void testSetStrength() {
        timBot1.setStrength(75);
        assertEquals(75, timBot1.getStrength());
    }

    @Test
    public void testSetDefense() {
        timBot1.setDefense(70);
        assertEquals(70, timBot1.getDefense());
    }

    @Test
    public void testSetScore() {
        timBot1.setScore(120);
        assertEquals(120, timBot1.getScore());
    }

    @Test
    public void testSetStopped() {
        timBot1.setStopped(true);
        assertEquals(true, timBot1.getStopped());
    }

    @Test
    public void testAttack() {
        timBot1.attack(timBot2);
        assertTrue(timBot2.getHp() <= 90); // Orion's HP should be less than or equal to it's original HP after taking a hit
    }

    @Test
    public void testShield() {
        timBot1.shield(timBot2.getStrength());
        assertTrue(timBot1.getHp() <= 100); // Aurora's HP should be less than or equal to its original HP after shielding an attack
    }

    @Test
    public void testMove() {
        timBot1.move();
        assertFalse(timBot1.getStopped()); // Aurora should not be stationary after moving
    }
}

```