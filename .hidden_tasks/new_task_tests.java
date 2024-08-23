import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CookieTest {
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

    @Test(expected = IllegalArgumentException.class)
    public void testSetNegativeSize() {
        testCookie.setSize(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNegativeCalories() {
        testCookie.setCalories(-100);
    }

    @Test
    public void testBoundarySize() {
        testCookie.setSize(0);
        assertEquals(0, testCookie.getSize());
    }

    @Test
    public void testBoundaryCalories() {
        testCookie.setCalories(0);
        assertEquals(0, testCookie.getCalories());
    }

    @Test
    public void testFlavorTrimmed() {
        testCookie.setFlavor(" Chocolate ");
        assertEquals("Chocolate", testCookie.getFlavor().trim());
    }

    @Test
    public void testLargeCookieSizePerformance() {
        Cookie largeCookie = new Cookie("BigCookie", 10000, false, 5400);
        assertEquals(10000, largeCookie.getSize());
    }

    @Test
    public void testLargeCalorieCountPerformance() {
        Cookie highCalorieCookie = new Cookie("BigCookie", 15, true, Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, highCalorieCookie.getCalories());
    }

    @Test
    public void testPrintInfo() {
        Cookie cookie = new Cookie("Tester", 5, true, 250);
        // Redirect System.out to test the printed output
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));
        
        cookie.printInfo();
        String expectedOutput = "Cookie Info:\n" +
                                "Flavor: Tester\n" +
                                "Size: 5 cm\n" +
                                "Has Chips: true\n" +
                                "Calories: 250\n";
        assertEquals(expectedOutput, outContent.toString());
        
        // Reset System.out to its original stream
        System.setOut(System.out);
    }
}