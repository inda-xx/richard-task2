```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConstellationTest {
    private Constellation constellation1;
    private Constellation constellation2;

    @Before
    public void setUp() {
        constellation1 = new Constellation("Pegasus", 14, true, "Autumn");
        constellation2 = new Constellation("Orion", 20, false, "Winter");
    }

    @Test
    public void testGetName() {
        assertEquals("Pegasus", constellation1.getName());
        assertEquals("Orion", constellation2.getName());
    }

    @Test
    public void testGetStars() {
        assertEquals(14, constellation1.getStars());
        assertEquals(20, constellation2.getStars());
    }

    @Test
    public void testGetVisible() {
        assertEquals(true, constellation1.getVisible());
        assertEquals(false, constellation2.getVisible());
    }

    @Test
    public void testGetSeasonalViewing() {
        assertEquals("Autumn", constellation1.getSeasonalViewing());
        assertEquals("Winter", constellation2.getSeasonalViewing());
    }

    @Test
    public void testSetName() {
        constellation1.setName("NewName");
        assertEquals("NewName", constellation1.getName());
    }

    @Test
    public void testSetStars() {
        constellation1.setStars(20);
        assertEquals(20, constellation1.getStars());
    }

    @Test
    public void testSetVisible() {
        constellation1.setVisible(false);
        assertEquals(false, constellation1.getVisible());
    }

    @Test
    public void testSetSeasonalViewing() {
        constellation1.setSeasonalViewing("Winter");
        assertEquals("Winter", constellation1.getSeasonalViewing());
    }

    @Test
    public void testIsVisible() {
        assertEquals(true, constellation1.isVisible("Autumn"));
        assertEquals(false, constellation2.isVisible("Winter"));
    }
}
```