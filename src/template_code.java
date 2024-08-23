import org.junit.Before;
    import org.junit.Test;
    import static org.junit.Assert.*;
    import java.util.Arrays;
    import java.util.List;

class StarVoyager {
    // Declare private fields for encapsulation
    private String name;
    private int age;
    private double speed;
    private boolean active;

    // Constructor to initialize a new StarVoyager object
    public StarVoyager(String name, int age, double speed, boolean active) {
        // Initialize fields with the parameters
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for speed
    public double getSpeed() {
        return speed;
    }

    // Setter for speed
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    // Getter for active
    public boolean isActive() {
        return active;
    }

    // Setter for active
    public void setActive(boolean active) {
        this.active = active;
    }

    // Method to print the status of the StarVoyager
    public void printStatus() {
        System.out.println(">> VOYAGER STATUS <<");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Speed: " + speed + " light-years/year");
        System.out.println("Active: " + active);
    }

    // Method to simulate interaction between this StarVoyager and another
    public void interact(StarVoyager voyager) {
        // Decrease this object's speed by a constant and prevent negative values
        System.out.println(name + " interacted with " + voyager.getName());
        System.out.println(name + "'s new speed: " + speed + " light-years/year");
    }

    public static void main(String[] args) {
        // Example of creating a new StarVoyager object using the constructor
        StarVoyager voyager = new StarVoyager("Nebula Nomad", 180, 3.0, true);

        // Example of using getters to print information
        System.out.println("Voyager Details:");
        System.out.println("Name: " + voyager.getName());
        System.out.println("Age: " + voyager.getAge());
        System.out.println("Speed: " + voyager.getSpeed() + " light-years/year");
        System.out.println("Active: " + voyager.isActive());

        // Call printStatus to display voyager's information
        voyager.printStatus();

        // Example of interacting with another StarVoyager
        StarVoyager anotherVoyager = new StarVoyager("Celestial Drifter", 230, 7.5, false);
        voyager.interact(anotherVoyager);
    }
}