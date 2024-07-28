```java
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    private Game game;
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Player", 0, 0, 0);
        enemy = new Enemy("Enemy", 2, 2);
        List<Enemy> enemies = new ArrayList<>();
        enemies.add(enemy);
        game = new Game(player, enemies);
    }

    @Test
    public void testPlayerMovement(){
        player.moveRight();
        Assertions.assertEquals(1, player.getPositionX());
        player.moveDown();
        Assertions.assertEquals(1, player.getPositionY());

        player.moveLeft();
        Assertions.assertEquals(0, player.getPositionX());
        player.moveUp();
        Assertions.assertEquals(0, player.getPositionY());
    }

    @Test
    public void testManageScore(){
        game.manageScore(10);
        Assertions.assertEquals(10, player.getScore());
        game.manageScore(20);
        Assertions.assertEquals(30, player.getScore());
    }

    @Test
    public void testEncounterEnemy(){
        player.moveRight();
        player.moveRight();
        player.moveDown();
        player.moveDown();
        boolean encountered = game.encounterEnemy();
        Assertions.assertTrue(encountered);
    }
}
```