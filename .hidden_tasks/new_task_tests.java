PlayerTest.java
```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    private Player player;

    @Before
    public void setUp() {
        player = new Player("John Doe", 1, 1, 0);
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", player.getName());
    }

    @Test
    public void testGetPosX() {
        assertEquals(1, player.getPosX());
    }

    @Test
    public void testGetPosY() {
        assertEquals(1, player.getPosY());
    }

    @Test
    public void testGetScore() {
        assertEquals(0, player.getScore());
    }

    @Test
    public void testSetter() {
        player.setName("Jane Doe");
        player.setPosX(2);
        player.setPosY(3);
        player.setScore(1);

        assertEquals("Jane Doe", player.getName());
        assertEquals(2, player.getPosX());
        assertEquals(3, player.getPosY());
        assertEquals(1, player.getScore());
    }

    @Test
    public void testInvalidSetPosX() {
        player.setPosX(-1);
        assertEquals(1, player.getPosX());
    }

    @Test
    public void testInvalidSetPosY() {
        player.setPosY(-200);
        assertEquals(1, player.getPosY());
    }

    @Test
    public void testInvalidSetScore() {
        player.setScore(-50);
        assertEquals(0, player.getScore());
    }
}
```

EnemyTest.java
```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnemyTest {
    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy(5, 6);
    }

    @Test
    public void testGetPosX() {
        assertEquals(5, enemy.getPosX());
    }

    @Test
    public void testGetPosY() {
        assertEquals(6, enemy.getPosY());
    }

    @Test
    public void testSetter() {
        enemy.setPosX(8);
        enemy.setPosY(9);

        assertEquals(8, enemy.getPosX());
        assertEquals(9, enemy.getPosY());
    }

    @Test
    public void testInvalidSetPosX() {
        enemy.setPosX(-10);
        assertEquals(5, enemy.getPosX());
    }

    @Test
    public void testInvalidSetPosY() {
        enemy.setPosY(-20);
        assertEquals(6, enemy.getPosY());
    }
}
```

ItemTest.java
```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTest {
    private Item item;

    @Before
    public void setUp() {
        item = new Item(3, 4);
    }

    @Test
    public void testGetPosX() {
        assertEquals(3, item.getPosX());
    }

    @Test
    public void testGetPosY() {
        assertEquals(4, item.getPosY());
    }

    @Test
    public void testSetter() {
        item.setPosX(7);
        item.setPosY(8);

        assertEquals(7, item.getPosX());
        assertEquals(8, item.getPosY());
    }

    @Test
    public void testInvalidSetPosX() {
        item.setPosX(-30);
        assertEquals(3, item.getPosX());
    }

    @Test
    public void testInvalidSetPosY() {
        item.setPosY(-40);
        assertEquals(4, item.getPosY());
    }
}
```