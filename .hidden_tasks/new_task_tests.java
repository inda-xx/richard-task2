```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JavamonTest {
    private Javamon javamon1;
    private Javamon javamon2;

    @Before
    public void setUp() {
        javamon1 = new Javamon("Blastoise", 100, 10, "Water");
        javamon2 = new Javamon("Charizard", 100, 8, "Fire");
    }

    @Test
    public void testGetName() {
        assertEquals("Blastoise", javamon1.getName());
        assertEquals("Charizard", javamon2.getName());
    }

    @Test
    public void testGetHealth() {
        assertEquals(100, javamon1.getHealth());
        assertEquals(100, javamon2.getHealth());
    }

    @Test
    public void testGetPower() {
        assertEquals(10, javamon1.getPower());
        assertEquals(8, javamon2.getPower());
    }

    @Test
    public void testGetType() {
        assertEquals("Water", javamon1.getType());
        assertEquals("Fire", javamon2.getType());
    }

    @Test
    public void testSetName() {
        javamon1.setName("Buli");
        assertEquals("Buli", javamon1.getName());
    }

    @Test
    public void testSetHealth() {
        javamon1.setHealth(80);
        assertEquals(80, javamon1.getHealth());
    }

    @Test
    public void testSetPower() {
        javamon1.setPower(12);
        assertEquals(12, javamon1.getPower());
    }

    @Test
    public void testSetType() {
        javamon1.setType("Leaf");
        assertEquals("Leaf", javamon1.getType());
    }

    @Test
    public void testBattle() {
        Javamon attacker = new Javamon("Machamp", 80, 20, "Fight");
        Javamon defender = new Javamon("Gengar", 100, 8, "Ghost");
        attacker.battle(defender);
        assertEquals(80, defender.getHealth());
        attacker.battle(defender);
        attacker.battle(defender);
        attacker.battle(defender);
        attacker.battle(defender);
        // defender should have 0 health after 5 attacks of 20 power each
        assertEquals(0, defender.getHealth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBattleWithNullOpponent() {
        Javamon attacker = new Javamon("Blastoise", 100, 10, "Water");
        attacker.battle(null);
    }
}

```