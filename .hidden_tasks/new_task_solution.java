import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

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

    // Default constructor for flexibility and testing
    public Cookie() {
        // Initialize default cookie attributes
        this.flavor = "Plain";
        this.size = 0; 
        this.hasChips = false;
        this.calories = 0;
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
        
        // Create another Cookie object using the default constructor and setters
        Cookie oatmealRaisin = new Cookie();
        oatmealRaisin.setFlavor("Oatmeal Raisin");
        oatmealRaisin.setSize(12);
        oatmealRaisin.setHasChips(false);
        oatmealRaisin.setCalories(180);
        oatmealRaisin.printInfo();

        // Demonstrate the use of getters to retrieve field values
        System.out.println("Getting flavor: " + chocolateChipCookie.getFlavor());

        // Demonstrate the use of setters to modify field values
        chocolateChipCookie.setCalories(300);
        System.out.println("Updated Calories: " + chocolateChipCookie.getCalories());
    }
}

class CookieTest {
    private Cookie testCookie;

    @Before
    public void setUp() {
        testCookie = new Cookie("Vanilla", 8, false, 150);
    }

    @Test
    public void testDefaultConstructorValues() {
        Cookie defaultCookie = new Cookie();
        assertEquals("Plain", defaultCookie.getFlavor());
        assertEquals(0, defaultCookie.getSize());
        assertFalse(defaultCookie.isHasChips());
        assertEquals(0, defaultCookie.getCalories());
    }

    @Test
    public void testConstructorInitialization() {
        assertEquals("Vanilla", testCookie.getFlavor());
        assertEquals(8, testCookie.getSize());
        assertFalse(testCookie.isHasChips());
        assertEquals(150, testCookie.getCalories());
    }

    @Test
    public void testSetFlavor() {
        testCookie.setFlavor("Chocolate");
        assertEquals("Chocolate", testCookie.getFlavor());
    }

    @Test
    public void testSetSize() {
        testCookie.setSize(12);
        assertEquals(12, testCookie.getSize());
    }

    @Test
    public void testSetHasChips() {
        testCookie.setHasChips(true);
        assertTrue(testCookie.isHasChips());
    }

    @Test
    public void testSetCalories() {
        testCookie.setCalories(200);
        assertEquals(200, testCookie.getCalories());
    }
}