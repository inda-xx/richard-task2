In the test cases, we assume that all the instances are initialized at the position (0,0).

```java
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AdventureQuestTest {
    private Player player;
    private Chest chest;
    private Monster monster;

    @Before
    public void setUp() {
        player = new Player("Hero", 0, 0, 0);
        chest = new Chest(50, false, 0, 0);
        monster = new Monster(20, true, 0, 0);
    }

    @Test
    public void testMoveUp() {
        player.move("up");
        assertThat(player.getPlayerPosY(), is(-1));
    }

    @Test
    public void testMoveDown() {
        player.move("down");
        assertThat(player.getPlayerPosY(), is(1));
    }

    @Test
    public void testMoveLeft() {
        player.move("left");
        assertThat(player.getPlayerPosX(), is(-1));
    }

    @Test
    public void testMoveRight() {
        player.move("right");
        assertThat(player.getPlayerPosX(), is(1));
    }

    @Test
    public void testOpenChest() {
        player.openChest(chest);
        assertThat(player.getScore(), is(50));
        assertTrue(chest.getIsOpened());
    }

    @Test
    public void testAvoidMonster() {
        player.avoidMonster(monster);
        assertThat(player.getScore(), is(-20));
    }
}
```