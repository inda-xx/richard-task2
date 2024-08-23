```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlanetTest {
    private Planet planet1;
    private Planet planet2;

    @Before
    public void setUp() {
        planet1 = new Planet("Earth", 5.972 * Math.pow(10, 24), 6371, true);
        planet2 = new Planet("Mars", 6.39 * Math.pow(10, 23), 3389.5, false);
    }

    @Test
    public void testGetName() {
        assertEquals("Earth", planet1.getName());
        assertEquals("Mars", planet2.getName());
    }

    @Test
    public void testGetMass() {
        assertEquals(5.972 * Math.pow(10, 24), planet1.getMass(), 1e-10);
        assertEquals(6.39 * Math.pow(10, 23), planet2.getMass(), 1e-10);
    }

    @Test
    public void testGetRadius() {
        assertEquals(6371, planet1.getRadius(), 1e-10);
        assertEquals(3389.5, planet2.getRadius(), 1e-10);
    }

    @Test
    public void testIsInhabited() {
        assertEquals(true, planet1.isInhabited());
        assertEquals(false, planet2.isInhabited());
    }

    @Test
    public void testSetName() {
        planet1.setName("Venus");
        assertEquals("Venus", planet1.getName());
    }

    @Test
    public void testSetMass() {
        planet1.setMass(4.867 * Math.pow(10, 24));
        assertEquals(4.867 * Math.pow(10, 24), planet1.getMass(), 1e-10);
    }

    @Test
    public void testSetRadius() {
        planet1.setRadius(6051.8);
        assertEquals(6051.8, planet1.getRadius(), 1e-10);
    }

    @Test
    public void testSetInhabited() {
        planet1.setInhabited(false);
        assertEquals(false, planet1.isInhabited());
    }

    @Test
    public void testCalculateGravity() {
        final double G = 6.674 * Math.pow(10, -11);
        assertEquals((G * planet1.getMass()) / Math.pow(planet1.getRadius() * 1000, 2), planet1.calculateGravity(), 1e-10); // Gravity in m/s^2
        assertEquals((G * planet2.getMass()) / Math.pow(planet2.getRadius() * 1000, 2), planet2.calculateGravity(), 1e-10); // Gravity in m/s^2
    }
    
    @Test
    public void testShadowedMethod() {
        planet1.shadowedMethod();
        // The test for this method will be subjective as it is hard to test console output in Java in an automated manner
    }
}
```