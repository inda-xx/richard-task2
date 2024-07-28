```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class KnightTest {
    private Knight knight;
    private Dragon dragon;
    private Treasure treasure;

    @Before
    public void setUp() {
        knight = new Knight("Sir Arthur", 50);
        dragon = new Dragon("Drako", 30, 50);
        treasure = new Treasure(25, 50);
    }

    @Test
    public void testMoveForward() {
        knight.moveForward(10);
        assertEquals(60, knight.getPosition());
    }

    @Test
    public void testMoveBackward() {
        knight.moveBackward(10);
        assertEquals(40, knight.getPosition());
    }

    @Test
    public void testMoveForwardBoundary() {
        knight.moveForward(60);
        assertEquals(100, knight.getPosition());
    }

    @Test
    public void testMoveBackwardBoundary() {
        knight.moveBackward(60);
        assertEquals(1, knight.getPosition());
    }

    @Test
    public void testFightDragon() {
        assertTrue(knight.fightDragon(dragon));
    }

    @Test
    public void testFightDragonLoss() {
        knight.setPosition(20);
        assertFalse(knight.fightDragon(dragon));
    }

    @Test
    public void testDragonStrengthExceedsKnightPosition() {
        dragon.setStrength(60);
        knight.setPosition(50);
        assertFalse(knight.fightDragon(dragon));
    }

    @Test
    public void testCollectTreasure() {
        knight.collectTreasure(treasure);
        assertEquals(25, knight.getScore());
    }

    @Test
    public void testCollectTreasureNotAtSamePosition() {
        treasure.setPosition(60);
        knight.collectTreasure(treasure);
        assertEquals(0, knight.getScore());
    }

    @Test
    public void testIncreasedScoreAfterFightAndTreasure() {
        knight.fightDragon(dragon);
        knight.collectTreasure(treasure);
        assertEquals(35, knight.getScore());
    }
}
```