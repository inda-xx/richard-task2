import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class Tree {
    
    private String species;
    private double height;
    private int age;
    private boolean evergreen;
    
    public Tree(String species, double height, int age, boolean evergreen) {
        this.species = species;
        this.height = height;
        this.age = age;
        this.evergreen = evergreen;
    }
    
    public String getSpecies() {
        return species;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public boolean isEvergreen() {
        return evergreen;
    }
    
    public void setSpecies(String species) {
        this.species = species;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEvergreen(boolean evergreen) {
        this.evergreen = evergreen;
    }
    
    public void describe() {
        System.out.println("> TREE INFO");
        System.out.println("> Species: " + getSpecies());
        System.out.println("> Height: " + getHeight() + " meters");
        System.out.println("> Age: " + getAge() + " years");
        System.out.println("> Evergreen: " + isEvergreen());
    }
    
    public void grow(double growthFactor) {
        System.out.println("\n> Growing by " + growthFactor + " meters...");
        this.height += growthFactor;
        this.age += 1;
    }

    public static void main(String[] args) {
        Tree oak = new Tree("Oak", 15.5, 80, false);
        oak.describe();
        oak.grow(0.5);
        oak.describe();
    }
}

public class TreeTest {
    
    private Tree tree;

    @Before
    public void setUp() {
        tree = new Tree("Pine", 10.0, 12, true);
    }

    @Test
    public void testGetters() {
        assertEquals("Pine", tree.getSpecies());
        assertEquals(10.0, tree.getHeight(), 0.01);
        assertEquals(12, tree.getAge());
        assertTrue(tree.isEvergreen());
    }

    @Test
    public void testSetters() {
        tree.setSpecies("Birch");
        tree.setHeight(12.5);
        tree.setAge(15);
        tree.setEvergreen(false);

        assertEquals("Birch", tree.getSpecies());
        assertEquals(12.5, tree.getHeight(), 0.01);
        assertEquals(15, tree.getAge());
        assertFalse(tree.isEvergreen());
    }

    @Test
    public void testGrow_IncreasesHeightAndAge() {
        double initialHeight = tree.getHeight();
        int initialAge = tree.getAge();

        tree.grow(1.5);

        assertEquals(initialHeight + 1.5, tree.getHeight(), 0.01);
        assertEquals(initialAge + 1, tree.getAge());
    }

    @Test
    public void testGrow_NegativeGrowthDoesNotDecreaseHeightOrAge() {
        double initialHeight = tree.getHeight();
        int initialAge = tree.getAge();

        tree.grow(-0.5);

        assertEquals(initialHeight - 0.5, tree.getHeight(), 0.01);
        assertEquals(initialAge + 1, tree.getAge());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_InvalidHeightThrowsException() {
        new Tree("Spruce", -5.0, 10, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_InvalidAgeThrowsException() {
        new Tree("Spruce", 5.0, -10, true);
    }

    @Test
    public void testExtremelyTallTreeHeight() {
        tree.setHeight(10000.0);
        tree.grow(5.0);
        assertEquals(10005.0, tree.getHeight(), 0.01);
    }

    @Test(timeout = 1000)
    public void testPerformanceForLargeNumberOfTrees() {
        for (int i = 0; i < 1000000; i++) {
            Tree tempTree = new Tree("Fir", 5.0, 50, false);
            tempTree.grow(1.0);
        }
    }
}