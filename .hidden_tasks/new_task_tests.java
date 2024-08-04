```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CavemonTest {
    private Cavemon player;
    private Cavemon enemy;

    @Before
    public void setUp() {
        player = new Cavemon("Geo", 100, 20, 10, false);
        enemy = new Cavemon("Terra", 110, 21, 15, true);
    }
    
    @Test
    public void testGetName() {
        assertEquals("Geo", player.getName());
        assertEquals("Terra", enemy.getName());
    }
    
    @Test
    public void testGetDefence() {
        assertEquals(10, player.getDefense());
        assertEquals(15, enemy.getDefense());
    }
    
    @Test
    public void testGetHp() {
        assertEquals(100, player.getHp());
        assertEquals(110, enemy.getHp());
    }
    
    @Test
    public void testGetAttack() {
        assertEquals(20, player.getAttack());
        assertEquals(21, enemy.getAttack());
    }
    
    @Test
    public void testGetIsEnemy() {
        assertFalse(player.getIsEnemy());
        assertTrue(enemy.getIsEnemy());
    }
    
    @Test
    public void testSetName() {
        player.setName("NewName");
        assertEquals("NewName", player.getName());
    }

    @Test
    public void testSetHp() {
        enemy.setHp(90);
        assertEquals(90, enemy.getHp());
    }
    
    @Test
    public void testIsDead() {
        player.setHp(0);
        assertTrue(player.isDead());
    }
    
    @Test
    public void testSetAttackAndDefense() {
        player.setAttack(30);
        player.setDefense(20);
        assertEquals(30, player.getAttack());
        assertEquals(20, player.getDefense());
    }
    
    @Test
    public void testDoAttack() {
        player.doAttack(enemy);
        assertTrue(enemy.getHp() < 110); // The enemy HP must decrease
    }
    
    @Test
    public void testUpdateScore() {
        player.updateScore(10);
        assertEquals(10, player.getScore());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidSetHp() {
        player.setHp(-5);
    }
}
```