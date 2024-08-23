import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JungleBeastTest {
    
    private JungleBeast leopard;
    private JungleBeast tiger;
    private JungleBeast elephant;
    
    @Before
    public void setUp() {
        leopard = new JungleBeast("Leopard", 100, 80, 90);
        tiger = new JungleBeast("Tiger", 120, 85, 88);
        elephant = new JungleBeast("Elephant", 150, 50, 30);
    }
    
    @Test
    public void testConstructorAndGetters() {
        assertEquals("Leopard", leopard.getSpecies());
        assertEquals(100, leopard.getEnergyLevel());
        assertEquals(80, leopard.getStrength());
        assertEquals(90, leopard.getAgility());
        assertFalse(leopard.isAsleep());

        assertEquals("Tiger", tiger.getSpecies());
        assertEquals(120, tiger.getEnergyLevel());
        assertEquals(85, tiger.getStrength());
        assertEquals(88, tiger.getAgility());
        assertFalse(tiger.isAsleep());
    }
    
    @Test
    public void testSetters() {
        leopard.setSpecies("Jaguar");
        leopard.setEnergyLevel(90);
        leopard.setStrength(70);
        leopard.setAgility(85);
        leopard.setAsleep(true);

        assertEquals("Jaguar", leopard.getSpecies());
        assertEquals(90, leopard.getEnergyLevel());
        assertEquals(70, leopard.getStrength());
        assertEquals(85, leopard.getAgility());
        assertTrue(leopard.isAsleep());
    }
    
    @Test
    public void testTussleGreaterStrength() {
        JungleBeast lion = new JungleBeast("Lion", 110, 75, 80);
        JungleBeast jaguar = new JungleBeast("Jaguar", 100, 70, 85);

        jaguar.tussle(lion);
        assertEquals(110, lion.getEnergyLevel()); // Lion should be undamaged
        assertEquals(100 - 10, jaguar.getEnergyLevel()); // Jaguar should lose 10 points of energy
    }
    
    @Test
    public void testTussleEqualStrength() {
        JungleBeast beastOne = new JungleBeast("Wolf", 100, 60, 60);
        JungleBeast beastTwo = new JungleBeast("Fox", 90, 60, 60);

        beastOne.tussle(beastTwo);
        assertEquals(100, beastOne.getEnergyLevel());
        assertEquals(90, beastTwo.getEnergyLevel());
    }

    @Test
    public void testTussleNegativeStrength() {
        JungleBeast gorilla = new JungleBeast("Gorilla", 120, 55, 70);
        JungleBeast cheetah = new JungleBeast("Cheetah", 90, 80, 85);

        gorilla.tussle(cheetah);
        assertEquals(120 - 40, gorilla.getEnergyLevel()); // Gorilla should lose 40 points of energy
        assertEquals(90, cheetah.getEnergyLevel()); // Cheetah should be undamaged
    }

    @Test 
    public void testPerformanceTussle() {
        JungleBeast strongBeast = new JungleBeast("StrongBeast", 100000, 999, 999);
        JungleBeast weakBeast = new JungleBeast("WeakBeast", 100000, 1, 1);
        
        long start = System.currentTimeMillis();
        strongBeast.tussle(weakBeast);
        long duration = System.currentTimeMillis() - start;

        assertTrue(duration < 1000); // The method should run in less than 1000 milliseconds
    }
}