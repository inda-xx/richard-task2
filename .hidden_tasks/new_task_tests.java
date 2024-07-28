```java
import org.junit.Before;
import org.junit.Test;
import java.awt.Point;
import static org.junit.Assert.*;

public class IndamonTest {
    private Indamon indamon;
    private Player player;
    private Item potion;

    @Before
    public void setUp() {
        indamon = new Indamon("Glassey", 10, 5, 5, new Point(5, 5));
        player = new Player("Player1", indamon);
        potion = new Item("Potion", 5);
    }

    @Test
    public void testGetPosition() {
        assertEquals(new Point(5, 5), indamon.getPosition());
    }

    @Test
    public void testMove() {
        indamon.move(Direction.UP);
        assertEquals(new Point(5, 4), indamon.getPosition());
        indamon.move(Direction.RIGHT);
        assertEquals(new Point(6, 4), indamon.getPosition());
        indamon.move(Direction.DOWN);
        assertEquals(new Point(6, 5), indamon.getPosition());
        indamon.move(Direction.LEFT);
        assertEquals(new Point(5, 5), indamon.getPosition());
    }

    @Test
    public void testCollectItem() {
        indamon.collectItem(potion);
        assertEquals(15, indamon.getHp());
    }

    @Test
    public void testPlayerUsername() {
        assertEquals("Player1", player.getUsername());
    }

    @Test
    public void testPlayerIndamon() {
        assertEquals(indamon, player.getIndamon());
    }

    @Test
    public void testItemName() {
        assertEquals("Potion", potion.getName());
    }

    @Test
    public void testItemHpPoints() {
        assertEquals(5, potion.getHpPoints());
    }
    
    @Test
    public void testScore() {
        player.addScore(1);
        assertEquals(1, player.getScore());
    }
}
```