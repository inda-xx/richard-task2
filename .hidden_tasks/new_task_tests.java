```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BattleBeastTest {
    private BattleBeast beast1;
    private BattleBeast beast2;

    @Before
    public void setUp() {
        beast1 = new BattleBeast("Griffon", 20, 10, 10);
        beast2 = new BattleBeast("Phoenix", 30, 15, 20);
    }

    @Test
    public void testGetName() {
        assertEquals("Griffon", beast1.getName());
        assertEquals("Phoenix", beast2.getName());
    }

    @Test
    public void testGetHp() {
        assertEquals(20, beast1.getHp());
        assertEquals(30, beast2.getHp());
    }

    @Test
    public void testGetAttack() {
        assertEquals(10, beast1.getAttack());
        assertEquals(15, beast2.getAttack());
    }

    @Test
    public void testGetDefense() {
        assertEquals(10, beast1.getDefense());
        assertEquals(20, beast2.getDefense());
    }

    @Test
    public void testGetFainted() {
        assertFalse(beast1.getFainted());
        assertFalse(beast2.getFainted());
    }

    @Test
    public void testSetName() {
        beast1.setName("Dragon");
        assertEquals("Dragon", beast1.getName());
    }

    @Test
    public void testSetHp() {
        beast1.setHp(25);
        assertEquals(25, beast1.getHp());
    }

    @Test
    public void testSetAttack() {
        beast1.setAttack(12);
        assertEquals(12, beast1.getAttack());
    }

    @Test
    public void testSetDefense() {
        beast1.setDefense(15);
        assertEquals(15, beast1.getDefense());
    }

    @Test
    public void testSetFainted() {
        beast1.setFainted(true);
        assertTrue(beast1.getFainted());
    }

    @Test
    public void testAttack() {
        beast1 = new BattleBeast("Dragon", 20, 10, 10);
        beast2 = new BattleBeast("Phoenix", 30, 15, 20);
        beast1.attack(beast2);
        assertEquals(20, beast2.getHp()); // As Beast1's attack is 10 and Beast2's defense is 20, damage should be 10/20=0.5 (rounded down to 0), and thus HP should reduce by 0 from 30 to 30
        assertFalse(beast2.getFainted());
    }
}

```