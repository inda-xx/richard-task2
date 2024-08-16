ed Tests

```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalTest {
    private Animal lion1;
    private Animal lion2;

    @Before
    public void setUp() {
        lion1 = new Animal("Lion", 14, "Africa", true, "Meat");
        lion2 = new Animal("Lion", 14, "Africa", true, "Meat");
    }

    @Test
    public void testGetSpecies() {
        assertEquals("Lion", lion1.getSpecies());
        assertEquals("Lion", lion2.getSpecies());
    }

    @Test
    public void testGetLifespan() {
        assertEquals(14, lion1.getLifespan());
        assertEquals(14, lion2.getLifespan());
    }

    @Test
    public void testGetOrigin() {
        assertEquals("Africa", lion1.getOrigin());
        assertEquals("Africa", lion2.getOrigin());
    }

    @Test
    public void testIsCarnivore() {
        assertEquals(true, lion1.isCarnivore());
        assertEquals(true, lion2.isCarnivore());
    }

    @Test
    public void testGetDiet() {
        assertEquals("Meat", lion1.getDiet());
        assertEquals("Meat", lion2.getDiet());
    }

    @Test
    public void testSetSpecies() {
        lion1.setSpecies("Tiger");
        assertEquals("Tiger", lion1.getSpecies());
    }

    @Test
    public void testSetLifespan() {
        lion1.setLifespan(20);
        assertEquals(20, lion1.getLifespan());
    }

    @Test
    public void testSetOrigin() {
        lion1.setOrigin("Asia");
        assertEquals("Asia", lion1.getOrigin());
    }

    @Test
    public void testSetCarnivore() {
        lion1.setCarnivore(false);
        assertEquals(false, lion1.isCarnivore());
    }

    @Test
    public void testSetDiet() {
        lion1.setDiet("Plant");
        assertEquals("Plant", lion1.getDiet());
    }

    @Test
    public void testAttemptEat() {
        assertEquals(true, lion1.attemptEat("Meat")); // Expectation is true because lion's diet is "Meat"
        assertEquals(false, lion1.attemptEat("Plant")); // Expectation is false because lion's diet is "Meat", not "Plant"
    }
}
```

### Suggested Solution

```java
public class Animal {
    private String species;
    private int lifespan;
    private String origin;
    private boolean carnivore;
    private String diet;

    // Constructor
    public Animal(String species, int lifespan, String origin, boolean carnivore, String diet) {
        this.species = species;
        this.lifespan = lifespan;
        this.origin = origin;
        this.carnivore = carnivore;
        this.diet = diet;
    }

    // Getters and Setters
    public String getSpecies() { return species; }
    public int getLifespan() { return lifespan; }
    public String getOrigin() { return origin; }
    public boolean isCarnivore() { return carnivore; }
    public String getDiet() { return diet; }

    public void setSpecies(String species) { this.species = species; }
    public void setLifespan(int lifespan) { this.lifespan = lifespan; }
    public void setOrigin(String origin) { this.origin = origin; }
    public void setCarnivore(boolean carnivore) { this.carnivore = carnivore; }
    public void setDiet(String diet) { this.diet = diet; }

    // Method to print out animal's information
    public void printAnimalInfo() {
        System.out.println("Animal: " + species);
        System.out.println("Lifespan: " + lifespan);
        System.out.println("Origin: " + origin);
        System.out.println("Carnivore: " + carnivore);
        System.out.println("Diet: " + diet);
    }

    // Method to emulate an animal attempting to eat a certain type of food
    public boolean attemptEat(String food) {
        if (food.equals(diet))
            return true;
        else
            return false;
    }

    // Main Method
    public static void main(String[] args){
        Animal lion = new Animal("Lion", 14, "Africa", true, "Meat");
        lion.printAnimalInfo();
        System.out.println("Attempt to eat meat: " + lion.attemptEat("Meat"));
        System.out.println("Attempt to eat plant: " + lion.attemptEat("Plant"));
    } // end main method

}
```