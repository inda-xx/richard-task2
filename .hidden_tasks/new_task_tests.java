```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnchantedForestGameTest {
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player(100, "Sword");
        player.setName("Hero");
        player.setScore(0);

        enemy = new Enemy(50, "Axe");
        enemy.setName("Goblin");
        enemy.setWeaponDamage(10);
    }

    @Test
    public void testPlayerGetters() {
        assertEquals("Hero", player.getName());
        assertEquals(100, player.getHealth());
        assertEquals(0, player.getScore());
        assertEquals("Sword", player.getWeapon());
    }

    @Test
    public void testPlayerSetters() {
        player.setName("New Hero");
        player.setHealth(150);
        player.setScore(50);
        player.setWeapon("New Sword");

        assertEquals("New Hero", player.getName());
        assertEquals(150, player.getHealth());
        assertEquals(50, player.getScore());
        assertEquals("New Sword", player.getWeapon());
    }

    @Test
    public void testEnemyGetters() {
        assertEquals("Goblin", enemy.getName());
        assertEquals(50, enemy.getEnemyHealth());
        assertEquals("Axe", enemy.getWeapon());
        assertEquals(10, enemy.getWeaponDamage());
    }

    @Test
    public void testEnemySetters() {
        enemy.setName("New Goblin");
        enemy.setEnemyHealth(60);
        enemy.setWeapon("New Axe");
        enemy.setWeaponDamage(15);

        assertEquals("New Goblin", enemy.getName());
        assertEquals(60, enemy.getEnemyHealth());
        assertEquals("New Axe", enemy.getWeapon());
        assertEquals(15, enemy.getWeaponDamage());
    }

    @Test
    public void testPlayerFight() {
        player.fight(enemy);

        assertEquals(90, player.getHealth());
    }
}
```