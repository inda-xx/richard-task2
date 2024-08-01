```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SpaceRookieTest {
    private SpaceRookie rookie;
    private Alien alien;

    @Before
    public void setUp() {
        rookie = new SpaceRookie("Rookie", "Start");
        alien = new Alien("Alien", 5);
    }

    @Test
    public void testGetPlayerName() {
        assertEquals("Rookie", rookie.getPlayerName());
    }

    @Test
    public void testGetPlayerScore() {
        assertEquals(0, rookie.getPlayerScore());
    }

    @Test
    public void testGetPlayerPosition() {
        assertEquals("Start", rookie.getPlayerPosition());
    }

    @Test
    public void testMove() {
        rookie.move("New Position");
        assertEquals("New Position", rookie.getPlayerPosition());
    }

    @Test
    public void testScore() {
        rookie.score(5);
        assertEquals(5, rookie.getPlayerScore());
    }

    @Test
    public void testInteractWithAlien() {
        rookie.score(10);
        rookie.interactWithAlien(alien);
        assertEquals(5, rookie.getPlayerScore());
    }

    @Test
    public void testNameAlien() {
        assertEquals("Alien", alien.getAlienName());
    }

    @Test
    public void testStrengthAlien() {
        assertEquals(5, alien.getAlienStrength());
    }
}

```