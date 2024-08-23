import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

class Tree {
    
    // Declare the private fields for the Tree class
    private String species;
    private double height;
    private int age;
    private boolean evergreen;
    
    // Constructor to initialize Tree objects
    public Tree(String species, double height, int age, boolean evergreen) {
        this.species = species;
        this.height = height;
        this.age = age;
        this.evergreen = evergreen;
    }
    
    // Getter methods for each field
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
    
    // Setter methods for each field
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
    
    // Method to print tree details
    public void describe() {
        System.out.println("> TREE INFO");
        System.out.println("> Species: " + getSpecies());
        System.out.println("> Height: " + getHeight() + " meters");
        System.out.println("> Age: " + getAge() + " years");
        System.out.println("> Evergreen: " + isEvergreen());
    }
    
    // Method that increases the tree's height and age
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
    public void testGrow() {
        double initialHeight = tree.getHeight();
        int initialAge = tree.getAge();

        tree.grow(1.5);

        assertEquals(initialHeight + 1.5, tree.getHeight(), 0.01);
        assertEquals(initialAge + 1, tree.getAge());
    }
}