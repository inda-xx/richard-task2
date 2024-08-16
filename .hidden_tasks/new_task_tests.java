```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GalacticExplorerTest {
    private GalacticExplorer explorer;

    @Before
    public void setUp() {
        explorer = new GalacticExplorer("Neil", 200, 0);
    }

    @Test
    public void testGetName() {
        assertEquals("Neil", explorer.getName());
    }

    @Test
    public void testGetFuelLevel() {
        assertEquals(200, explorer.getFuelLevel());
    }

    @Test
    public void testGetExploredPlanets() {
        assertEquals(0, explorer.getExploredPlanets());
    }

    @Test
    public void testGetIsAlive() {
        assertEquals(true, explorer.getIsAlive());
    }

    @Test
    public void testSetName() {
        explorer.setName("Gustav");
        assertEquals("Gustav", explorer.getName());
    }

    @Test
    public void testSetFuelLevel() {
        explorer.setFuelLevel(150);
        assertEquals(150, explorer.getFuelLevel());
    }

    @Test
    public void testSetExploredPlanets() {
        explorer.setExploredPlanets(5);
        assertEquals(5, explorer.getExploredPlanets());
    }

    @Test
    public void testSetIsAlive() {
        explorer.setIsAlive(false);
        assertEquals(false, explorer.getIsAlive());
    }

    @Test
    public void testFly() {
        explorer.fly();
        assertEquals(150, explorer.getFuelLevel());
        assertEquals(true, explorer.getIsAlive());
    }

    @Test
    public void testFlyWithoutFuel() {
        explorer.setFuelLevel(0);
        explorer.fly();
        assertEquals(0, explorer.getFuelLevel());
        assertEquals(false, explorer.getIsAlive());
    }

    @Test
    public void testExplore() {
        explorer.explore();
        assertEquals(1, explorer.getExploredPlanets());
    }
}
```