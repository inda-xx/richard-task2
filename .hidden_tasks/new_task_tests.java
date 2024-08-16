```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SoldierTest {
    private Soldier soldier1;
    private Soldier soldier2;

    @Before
    public void setUp() {
        soldier1 = new Soldier("John", 100, 50, 30, true);
        soldier2 = new Soldier("Jane", 100, 60, 20, true);
    }

    /* Test Getters */
    @Test
    public void testGetName() {
        assertEquals("John", soldier1.getName());
        assertEquals("Jane", soldier2.getName());
    }

    @Test
    public void testGetHealth() {
        assertEquals(100, soldier1.getHealth());
        assertEquals(100, soldier2.getHealth());
    }

    @Test
    public void testGetStrength() {
        assertEquals(50, soldier1.getStrength());
        assertEquals(60, soldier2.getStrength());
    }

    @Test
    public void testGetDefense() {
        assertEquals(30, soldier1.getDefense());
        assertEquals(20, soldier2.getDefense());
    }

    @Test
    public void testGetAlive() {
        assertEquals(true, soldier1.getAlive());
        assertEquals(true, soldier2.getAlive());
    }

    /* Test Setters */
    @Test
    public void testSetName() {
        soldier1.setName("Jack");
        assertEquals("Jack", soldier1.getName());
    }

    @Test
    public void testSetHealth() {
        soldier1.setHealth(80);
        assertEquals(80, soldier1.getHealth());
    }

    @Test
    public void testSetStrength() {
        soldier1.setStrength(70);
        assertEquals(70, soldier1.getStrength());
    }

    @Test
    public void testSetDefense() {
        soldier1.setDefense(40);
        assertEquals(40, soldier1.getDefense());
    }

    @Test
    public void testSetAlive() {
        soldier1.setAlive(false);
        assertEquals(false, soldier1.getAlive());
    }

    /* Test fight method */
    @Test
    public void testFight() {
        soldier1.fight(soldier2);
        assertEquals(90, soldier2.getHealth()); // (Strength of 1st=50 - Defense of 2nd=20) = 30 left
        assertEquals(true, soldier2.getAlive());
    }

    /* Test for death in fight */
    @Test
    public void testDeathInFight() {
        Soldier soldier3 = new Soldier("Test", 20, 10, 5, true);
        soldier1.fight(soldier3);
        assertEquals(false, soldier3.getAlive()); // should be dead now
    }
}
```