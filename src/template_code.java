import org.junit.Before;
    import org.junit.Test;
    import static org.junit.Assert.*;
    import java.util.Arrays;
    import java.util.List;

class JungleBeast {
    // Fields
    private String species;
    private int energyLevel;
    private int strength;
    private int agility;
    private boolean asleep;

    // Constructor
    // Initialize your JungleBeast object here with parameters for each field
    public JungleBeast(String species, int energyLevel, int strength, int agility) {
        // Assign the parameters to the class fields
        this.species = species;
        this.energyLevel = energyLevel;
        this.strength = strength;
        this.agility = agility;
        this.asleep = false; // Default value
    }

    // Getters
    // Add getters for each field
    public String getSpecies() {
        return species;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public boolean isAsleep() {
        return asleep;
    }

    // Setters
    // Add setters for each field
    public void setSpecies(String species) {
        this.species = species;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setAsleep(boolean asleep) {
        this.asleep = asleep;
    }

    // Method to display information about the JungleBeast
    // Print each field in a formatted manner
    public void displayInfo() {
        System.out.println("Species: " + species);
        System.out.println("Energy Level: " + energyLevel);
        System.out.println("Strength: " + strength);
        System.out.println("Agility: " + agility);
        System.out.println("Asleep: " + asleep);
    }

    // Method to simulate a tussle between two JungleBeasts
    // Implement logic to determine the outcome based on strength and agility
    public void tussle(JungleBeast opponent) {
        // Example: Check strength or agility to determine the result and print outcome
        System.out.println(this.species + " engages " + opponent.getSpecies() + " in a tussle!");
        // Placeholder for actual tussle computation and effects
    }

    public static void main(String[] args) {
        // Create JungleBeast objects using the constructor
        JungleBeast leopard = new JungleBeast("Leopard", 100, 80, 90);
        JungleBeast tiger = new JungleBeast("Tiger", 120, 85, 88);
        JungleBeast elephant = new JungleBeast("Elephant", 150, 50, 30);
        
        // Use the displayInfo method to print JungleBeast details
        elephant.displayInfo();

        // Example of tussle
        JungleBeast jaguar = new JungleBeast("Jaguar", 100, 70, 85);
        JungleBeast lion = new JungleBeast("Lion", 110, 75, 80);

        jaguar.tussle(lion);

        // Example for variable shadowing discussion
        // Other examples are additional learning materials, not part of code execution
    }
}