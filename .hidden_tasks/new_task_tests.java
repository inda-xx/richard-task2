import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BicycleTest {

    private Bicycle bicycle;

    @Before
    public void setUp() {
        bicycle = new Bicycle("TestModel", 7, 0.0, "TestColor");
    }

    @Test
    public void testModelName() {
        assertEquals("TestModel", bicycle.getModelName());
    }

    @Test
    public void testGearCount() {
        assertEquals(7, bicycle.getGearCount());
    }

    @Test
    public void testCurrentSpeed() {
        assertEquals(0.0, bicycle.getCurrentSpeed(), 0.01);
    }

    @Test
    public void testColor() {
        assertEquals("TestColor", bicycle.getColor());
    }

    @Test
    public void testSettersAndGetters() {
        bicycle.setModelName("NewModel");
        assertEquals("NewModel", bicycle.getModelName());

        bicycle.setGearCount(10);
        assertEquals(10, bicycle.getGearCount());

        bicycle.setCurrentSpeed(15.0);
        assertEquals(15.0, bicycle.getCurrentSpeed(), 0.01);

        bicycle.setColor("NewColor");
        assertEquals("NewColor", bicycle.getColor());
    }

    @Test
    public void testAccelerate() {
        bicycle.accelerate(10.0);
        assertEquals(10.0, bicycle.getCurrentSpeed(), 0.01);

        bicycle.accelerate(0.0);
        assertEquals(10.0, bicycle.getCurrentSpeed(), 0.01);

        bicycle.accelerate(-5.0);
        assertEquals(5.0, bicycle.getCurrentSpeed(), 0.01);
    }

    @Test
    public void testDecelerate() {
        bicycle.decelerate(5.0);
        assertEquals(0.0, bicycle.getCurrentSpeed(), 0.01);

        bicycle.setCurrentSpeed(15.0);
        bicycle.decelerate(10.0);
        assertEquals(5.0, bicycle.getCurrentSpeed(), 0.01);

        bicycle.decelerate(10.0);
        assertEquals(0.0, bicycle.getCurrentSpeed(), 0.01);

        bicycle.decelerate(0.0);
        assertEquals(0.0, bicycle.getCurrentSpeed(), 0.01);

        bicycle.decelerate(-5.0);
        assertEquals(0.0, bicycle.getCurrentSpeed(), 0.01);
    }

    @Test
    public void testNegativeGearCount() {
        bicycle.setGearCount(-3);
        assertEquals(-3, bicycle.getGearCount());
    }

    @Test
    public void testPerformance() {
        for (int i = 0; i < 1000000; i++) {
            bicycle.accelerate(0.1);
        }
        assertEquals(100000.0, bicycle.getCurrentSpeed(), 10.0);

        for (int i = 0; i < 1000000; i++) {
            bicycle.decelerate(0.1);
        }
        assertEquals(0.0, bicycle.getCurrentSpeed(), 10.0);
    }
    
    @Test(expected = NullPointerException.class)
    public void testNullModelName() {
        bicycle.setModelName(null);
        assertNull(bicycle.getModelName());
    }

}