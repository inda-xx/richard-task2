
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AceTheSpaceTest {

    private Rocket rocket;
    private Asteroid asteroid1, asteroid2;

    @Before
    public void setUp() {
        rocket = new Rocket("Rocket X", 100f, 0, false);
        asteroid1 = new Asteroid("Asteroid 1", 50f);
        asteroid2 = new Asteroid("Asteroid 2", 200f);
    }

    @Test
    public void testRocketInitialAttributes() {
        assertEquals("Rocket X", rocket.getName());
        assertEquals(100f, rocket.getSpeed(), 0);
        assertEquals(0, rocket.getScore());
        assertFalse(rocket.isCrashed());
    }

    @Test
    public void testAsteroidInitialAttributes() {
        assertEquals("Asteroid 1", asteroid1.getAsteroidType());
        assertEquals(50f, asteroid1.getSpeed(), 0);
    }

    @Test
    public void testRocketSetters() {
        rocket.setName("Rocket 2");
        rocket.setSpeed(150f);
        rocket.setScore(10);
        rocket.setCrashed(true);
        
        assertEquals("Rocket 2", rocket.getName());
        assertEquals(150f, rocket.getSpeed(), 0);
        assertEquals(10, rocket.getScore());
        assertTrue(rocket.isCrashed());
    }
    
    @Test
    public void testCollisionSurvival() {
        rocket.collideWith(asteroid1);
        assertFalse(rocket.isCrashed());
        assertEquals(10, rocket.getScore());
    }
    
    @Test
    public void testCollisionCrash() {
        rocket.collideWith(asteroid2);
        assertTrue(rocket.isCrashed());
        assertEquals(0, rocket.getScore());
    }
    
}
