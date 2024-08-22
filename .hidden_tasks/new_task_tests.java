```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JavaKnightTest {

    private JavaKnight knight1;
    private JavaKnight knight2;

    @Before
    public void setUp() {
        knight1 = new JavaKnight("Sir Code-a-lot", 20, 10, 5, true);
        knight2 = new JavaKnight("Sir Write-a-lot", 30, 15, 7, true);
    }

    @Test
    public void testGetName() {
        assertEquals("Sir Code-a-lot", knight1.getName());
        assertEquals("Sir Write-a-lot", knight2.getName());
    }

    @Test
    public void testGetHealthPoints() {
        assertEquals(20, knight1.getHealthPoints());
        assertEquals(30, knight2.getHealthPoints());
    }

    @Test
    public void testGetAttackPower() {
        assertEquals(10, knight1.getAttackPower());
        assertEquals(15, knight2.getAttackPower());
    }

    @Test
    public void testGetDefensePower() {
        assertEquals(5, knight1.getDefensePower());
        assertEquals(7, knight2.getDefensePower());
    }

    @Test
    public void testGetIsAlive() {
        assertEquals(true, knight1.getIsAlive());
        assertEquals(true, knight2.getIsAlive());
    }

    @Test
    public void testSetName() {
        knight1.setName("NewKnight");
        assertEquals("NewKnight", knight1.getName());
    }

    @Test
    public void testSetHealthPoints() {
        knight1.setHealthPoints(25);
        assertEquals(25, knight1.getHealthPoints());
    }

    @Test
    public void testSetAttackPower() {
        knight1.setAttackPower(12);
        assertEquals(12, knight1.getAttackPower());
    }

    @Test
    public void testSetDefensePower() {
        knight1.setDefensePower(6);
        assertEquals(6, knight1.getDefensePower());
    }

    @Test
    public void testSetIsAlive() {
        knight1.setIsAlive(false);
        assertEquals(false, knight1.getIsAlive());
    }
}
```