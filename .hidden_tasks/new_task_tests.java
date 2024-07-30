```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BotTest {
    private Bot bot1;
    private Bot bot2;

    @Before
    public void setUp() {
        bot1 = new Bot("Alpha", 100, 20, 10);
        bot2 = new Bot("Beta", 120, 25, 5);
    }

    @Test
    public void testGetName() {
        assertEquals("Alpha", bot1.getName());
        assertEquals("Beta", bot2.getName());
    }

    @Test
    public void testGetHp() {
        assertEquals(100, bot1.getHp());
        assertEquals(120, bot2.getHp());
    }

    @Test
    public void testGetAttack() {
        assertEquals(20, bot1.getAttack());
        assertEquals(25, bot2.getAttack());
    }

    @Test
    public void testGetDefense() {
        assertEquals(10, bot1.getDefense());
        assertEquals(5, bot2.getDefense());
    }

    @Test
    public void testSetName() {
        bot1.setName("Gamma");
        assertEquals("Gamma", bot1.getName());
    }

    @Test
    public void testSetHp() {
        bot1.setHp(200);
        assertEquals(200, bot1.getHp());
    }

    @Test
    public void testSetAttack() {
        bot1.setAttack(30);
        assertEquals(30, bot1.getAttack());
    }

    @Test
    public void testSetDefense() {
        bot1.setDefense(15);
        assertEquals(15, bot1.getDefense());
    }

    @Test
    public void testAttack() {
        bot1 = new Bot("Alpha", 100, 20, 10);
        bot2 = new Bot("Beta", 120, 25, 5);
        bot1.attack(bot2);
        assertEquals(115, bot2.getHp()); // As attack is 20 and defense is 5, Actual damage should be 20-5=15, and thus HP should reduce by 15 from 120 to 105
    }
}
```