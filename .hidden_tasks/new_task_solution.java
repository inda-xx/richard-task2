import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JungleBeast {
    // Fields
    private String species;
    private int energyLevel;
    private int strength;
    private int agility;
    private boolean asleep;

    // Constructor
    public JungleBeast(String species, int energyLevel, int strength, int agility) {
        this.species = species;
        this.energyLevel = energyLevel;
        this.strength = strength;
        this.agility = agility;
        this.asleep = false;
    }

    // Getters
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
    public void displayInfo() {
        System.out.println("Species: " + species);
        System.out.println("Energy Level: " + energyLevel);
        System.out.println("Strength: " + strength);
        System.out.println("Agility: " + agility);
        System.out.println("Asleep: " + asleep);
    }

    // Method to simulate a tussle between two JungleBeasts
    public void tussle(JungleBeast opponent) {
        System.out.println(this.species + " engages " + opponent.getSpecies() + " in a tussle!");

        int outcome = (this.strength + this.agility) - (opponent.getStrength() + opponent.getAgility());
        if (outcome > 0) {
            int damage = Math.min(outcome, opponent.getEnergyLevel());
            opponent.setEnergyLevel(opponent.getEnergyLevel() - damage);
            System.out.println(opponent.getSpecies() + " sustains " + damage + " points of damage and now has a decreased energy level of " + opponent.getEnergyLevel() + "!");
        } else if (outcome < 0) {
            int damage = Math.min(-outcome, this.energyLevel);
            this.energyLevel = this.energyLevel - damage;
            System.out.println(this.species + " sustains " + damage + " points of damage and now has a decreased energy level of " + this.energyLevel + "!");
        } else {
            System.out.println("Both " + this.species + " and " + opponent.getSpecies() + " are equally matched and take no damage!");
        }
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
    }
}