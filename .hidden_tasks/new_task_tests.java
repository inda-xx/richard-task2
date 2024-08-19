```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    private Spaceship spaceship1;
    private Alien alien1;
    private Score score;

    @Before
    public void setUp() {
        spaceship1 = new Spaceship("S1", 100, 50);
        alien1 = new Alien("A1", 50);
        score = new Score();
    }

    @Test
    public void testGetSpaceshipID() {
        assertEquals("S1", spaceship1.getSpaceshipID());
    }

    @Test
    public void testGetSpaceshipHealth() {
        assertEquals(100, spaceship1.getHealth());
    }

    @Test
    public void testGetSpaceshipAttackDamage() {
        assertEquals(50, spaceship1.getAttackDamage());
    }

    @Test
    public void testGetAlienID() {
        assertEquals("A1", alien1.getAlienID());
    }

    @Test
    public void testGetAlienHealth() {
        assertEquals(50, alien1.getHealth());
    }
    
    @Test
    public void testSpaceshipAttack() {
        spaceship1.attack(alien1);
        assertEquals(0, alien1.getHealth()); 
        assertEquals(true, alien1.getIsDestroyed());
    }

    @Test
    public void testScoreUpdate() {
        spaceship1.attack(alien1);
        score.setSpaceshipScore(1);
        assertEquals(1, score.getSpaceshipScore()); 
    }
}
```