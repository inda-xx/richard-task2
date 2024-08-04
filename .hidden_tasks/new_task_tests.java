```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AliumTest {
    private Alium alium1;
    private Alium alium2;

    @Before
    public void setUp() {
        alium1 = new Alium("Xyzel", 50, 20, 10, false);
        alium2 = new Alium("Qopel", 40, 15, 5, false);
    }

    @Test
    public void testNameGetter() {
        assertEquals("Xyzel", alium1.getName());
        assertEquals("Qopel", alium2.getName());
    }

    @Test
    public void testHpGetter() {
        assertEquals(50, alium1.getHp());
        assertEquals(40, alium2.getHp());
    }

    @Test
    public void testAttackGetter() {
        assertEquals(20, alium1.getAttack());
        assertEquals(15, alium2.getAttack());
    }

    @Test
    public void testDefenseGetter() {
        assertEquals(10, alium1.getDefense());
        assertEquals(5, alium2.getDefense());
    }

    @Test
    public void testDefeatedGetter() {
        assertFalse(alium1.isDefeated());
        assertFalse(alium2.isDefeated());
    }

    @Test
    public void testAttackMethod() {
        alium1.attack(alium2);
        //Damage = 20 - 5 = 15, so alium2's hp = 40 - 15 = 25
        assertEquals(25, alium2.getHp());
        assertFalse(alium2.isDefeated());

        //Alium2 attacks Alium1 now
        alium2.attack(alium1);
        //Damage = 15 - 10 = 5, so alium1's hp = 50 - 5 = 45
        assertEquals(45, alium1.getHp());
        assertFalse(alium1.isDefeated());
    }

    @Test
    public void testDefeatedAlium() {
        //Alium1 attacks Alium2 few times till alium2 is defeated
        for(int i = 0; i < 3; i++) alium1.attack(alium2);

        assertTrue(alium2.isDefeated());
        assertFalse(alium1.isDefeated());
    }
}
```