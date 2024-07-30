```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FireDrakeTest {
    private FireDrake fireDrake1;
    private FireDrake fireDrake2;
    
    @Before
    public void setUp() {
        fireDrake1 = new FireDrake("Drako", 20, 6, 4);
        fireDrake2 = new FireDrake("Blaze", 25, 7, 5);
    }

    @Test
    public void testGetName() {
        assertEquals("Drako", fireDrake1.getName());
        assertEquals("Blaze", fireDrake2.getName());
    }

    @Test
    public void testGetHp() {
        assertEquals(20, fireDrake1.getHp());
        assertEquals(25, fireDrake2.getHp());
    }

    @Test
    public void testGetAttack() {
        assertEquals(6, fireDrake1.getAttack());
        assertEquals(7, fireDrake2.getAttack());
    }

    @Test
    public void testGetDefense() {
        assertEquals(4, fireDrake1.getDefense());
        assertEquals(5, fireDrake2.getDefense());
    }
    
    @Test
    public void testIsActive() {
        assertEquals(true, fireDrake1.isActive());
        assertEquals(true, fireDrake2.isActive());
    }
    
    @Test
    public void testSetName() {
        fireDrake1.setName("Spark");
        assertEquals("Spark", fireDrake1.getName());
    }

    @Test
    public void testSetHp() {
        fireDrake1.setHp(30);
        assertEquals(30, fireDrake1.getHp());
    }

    @Test
    public void testSetAttack() {
        fireDrake1.setAttack(8);
        assertEquals(8, fireDrake1.getAttack());
    }

    @Test
    public void testSetDefense() {
        fireDrake1.setDefense(6);
        assertEquals(6, fireDrake1.getDefense());
    }

    @Test
    public void testSetIsActive() {
        fireDrake1.setActive(false);
        assertEquals(false, fireDrake1.isActive());
    }

    @Test
    public void testBattle() {
        fireDrake1 = new FireDrake("Drako", 20, 6, 4);
        fireDrake2 = new FireDrake("Blaze", 25, 7, 5);
        fireDrake1.battle(fireDrake2);
        // As attack is 6 and defense is 5, damage should be 6/5=1.2(rounded to 1), and thus HP should reduce by 1 from 25 to 24
        assertEquals(24, fireDrake2.getHp()); 
        assertEquals(true, fireDrake2.isActive());
    }

    @Test
    public void testBattle_FireDrakeIsDefeated() {
        fireDrake1 = new FireDrake("Drako", 20, 50, 4);
        fireDrake2 = new FireDrake("Blaze", 2, 7, 5);
        fireDrake1.battle(fireDrake2);
        assertEquals(0, fireDrake2.getHp());
        assertEquals(false, fireDrake2.isActive());
    }
}
```