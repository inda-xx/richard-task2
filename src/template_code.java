import org.junit.Before;
    import org.junit.Test;
    import static org.junit.Assert.*;
    import java.util.Arrays;
    import java.util.List;

class Tree {
    
    // Step 1: Define private instance fields
    // Declare the private fields for the Tree class
    private String species;
    private double height;
    private int age;
    private boolean evergreen;
    
    // Step 2: Constructor
    // Implement a constructor for initializing Tree objects
    public Tree(String species, double height, int age, boolean evergreen) {
        // Initialize the instance fields using parameter values
        this.species = species;
        this.height = height;
        this.age = age;
        this.evergreen = evergreen;
    }
    
    // Step 3: Getters
    // Implement getter methods for each field
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
    
    // Step 4: Setters
    // Implement setter methods for each field
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
    
    // Step 5: describe method
    // Implement a describe method to print tree details
    public void describe() {
        System.out.println("> TREE INFO");
        System.out.println("> Species: " + getSpecies());
        System.out.println("> Height: " + getHeight() + " meters");
        System.out.println("> Age: " + getAge() + " years");
        System.out.println("> Evergreen: " + isEvergreen());
    }
    
    // Step 6: grow method
    // Implement a grow method that increases the tree's height and age
    public void grow(double growthFactor) {
        System.out.println("\n> Growing by " + growthFactor + " meters...");
        
        // Increase the tree's height and age
        this.height += growthFactor;
        this.age += 1;
    }
    
    // Step 7: Main method
    public static void main(String[] args) {
        // Create an instance of Tree using the constructor
        Tree oak = new Tree("Oak", 15.5, 80, false);
        
        // Use the describe() method to print the tree's details
        oak.describe();

        // Grow the tree
        oak.grow(0.5);

        // Use the describe() method again to print the updated details
        oak.describe();
    }
}