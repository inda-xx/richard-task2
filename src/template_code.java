import org.junit.Before;
    import org.junit.Test;
    import static org.junit.Assert.*;
    import java.util.Arrays;
    import java.util.List;

public class Cookie {
    
    // Fields: Declare the private fields for the class
    private String flavor;
    private int size; // in cm
    private boolean hasChips;
    private int calories;

    // Constructor: Initialize the object's attributes
    public Cookie(String flavor, int size, boolean hasChips, int calories) {
        // Use the 'this' keyword to resolve variable shadowing
        this.flavor = flavor;
        this.size = size;
        this.hasChips = hasChips;
        this.calories = calories;
    }

    // Getters: Add getter methods to access private fields
    public String getFlavor() {
        return flavor;
    }

    public int getSize() {
        return size;
    }

    public boolean isHasChips() {
        return hasChips;
    }

    public int getCalories() {
        return calories;
    }

    // Setters: Add setter methods to modify private fields
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setHasChips(boolean hasChips) {
        this.hasChips = hasChips;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    // printInfo method: Prints the cookie's information to the console
    public void printInfo() {
        System.out.println("Cookie Info:");
        System.out.println("Flavor: " + getFlavor());
        System.out.println("Size: " + getSize() + " cm");
        System.out.println("Has Chips: " + isHasChips());
        System.out.println("Calories: " + getCalories());
    }

    // Main method: Create instances and demonstrate the functionality
    public static void main(String[] args) {
        // Create a Cookie object using the constructor
        Cookie chocolateChipCookie = new Cookie("Chocolate", 10, true, 250);

        // Print the cookie's information using printInfo method
        chocolateChipCookie.printInfo();

        // Demonstrate the use of getters to retrieve field values
        System.out.println("Getting flavor: " + chocolateChipCookie.getFlavor());

        // Demonstrate the use of setters to modify field values
        chocolateChipCookie.setCalories(300);
        System.out.println("Updated Calories: " + chocolateChipCookie.getCalories());
    }
}