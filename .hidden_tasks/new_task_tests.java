import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StarVoyagerTest {
    
    private StarVoyager voyager1;
    private StarVoyager voyager2;

    @BeforeEach
    void setUp() {
        voyager1 = new StarVoyager("Nebula Nomad", 180, 3.0, true);
        voyager2 = new StarVoyager("Celestial Drifter", 230, 7.5, false);
    }

    @Test
    void testCreationOfStarVoyager() {
        assertEquals("Nebula Nomad", voyager1.getName(), "Name should be Nebula Nomad");
        assertEquals(180, voyager1.getAge(), "Age should be 180");
        assertEquals(3.0, voyager1.getSpeed(), "Speed should be 3.0");
        assertTrue(voyager1.isActive(), "Voyager should be active");
    }

    @Test
    void testSetName() {
        voyager1.setName("Galactic Wanderer");
        assertEquals("Galactic Wanderer", voyager1.getName(), "Name should be Galactic Wanderer");
    }

    @Test
    void testSetAge() {
        voyager1.setAge(300);
        assertEquals(300, voyager1.getAge(), "Age should be 300");
    }

    @Test
    void testSetSpeed() {
        voyager1.setSpeed(4.5);
        assertEquals(4.5, voyager1.getSpeed(), "Speed should be 4.5");
    }

    @Test
    void testSetActive() {
        voyager1.setActive(false);
        assertFalse(voyager1.isActive(), "Voyager should not be active");
    }

    @Test
    void testInteraction() {
        voyager1.interact(voyager2);
        assertEquals(2.5, voyager1.getSpeed(), "Speed should be reduced by 0.5");
    }

    @Test
    void testInteractionDoesNotResultInNegativeSpeed() {
        voyager1.setSpeed(0.3);
        voyager1.interact(voyager2);
        assertEquals(0.0, voyager1.getSpeed(), "Speed should not be negative");
    }

    @Test
    void testMaximumSpeedValueInteraction() {
        voyager1.setSpeed(Double.MAX_VALUE);
        voyager1.interact(voyager2);
        assertEquals(Double.MAX_VALUE - 0.5, voyager1.getSpeed(), "Speed should be Double.MAX_VALUE - 0.5");
    }

    @Test
    void testMinimumAgeBoundary() {
        voyager1.setAge(0);
        assertEquals(0, voyager1.getAge(), "Age should be 0");
    }

    @Test
    void testMaximumAgeBoundary() {
        voyager1.setAge(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, voyager1.getAge(), "Age should be Integer.MAX_VALUE");
    }

    @Test
    void testNegativeAgeInput() {
        voyager1.setAge(-10);
        assertEquals(-10, voyager1.getAge(), "Negative age should be set without constraint");
    }

    @Test
    void testPerformanceUnderHighLoad() {
        int count = 100000;
        StarVoyager[] voyagers = new StarVoyager[count];
        for (int i = 0; i < count; i++) {
            voyagers[i] = new StarVoyager("Voyager " + i, i, i * 0.1, i % 2 == 0);
        }
        assertEquals(count, voyagers.length, "Correct number of StarVoyagers should be created");
    }
}