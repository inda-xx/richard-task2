```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    private Person person1;
    private Person person2;

    @Before
    public void setUp() {
        person1 = new Person("Alice", "Guitarist", 10, true);
        person2 = new Person("Bob", "Bass Guitarist", 5, false);
    }

    @Test
    public void testGetName() {
        assertEquals("Alice", person1.getName());
        assertEquals("Bob", person2.getName());
    }

    @Test
    public void testGetRole() {
        assertEquals("Guitarist", person1.getRole());
        assertEquals("Bass Guitarist", person2.getRole());
    }

    @Test
    public void testGetExperience() {
        assertEquals(10, person1.getExperience());
        assertEquals(5, person2.getExperience());
    }

    @Test
    public void testIsBandLeader() {
        assertEquals(true, person1.isBandLeader());
        assertEquals(false, person2.isBandLeader());
    }

    @Test
    public void testSetName() {
        person1.setName("NewName");
        assertEquals("NewName", person1.getName());
    }

    @Test
    public void testSetRole() {
        person1.setRole("Drummer");
        assertEquals("Drummer", person1.getRole());
    }

    @Test
    public void testSetExperience() {
        person1.setExperience(7);
        assertEquals(7, person1.getExperience());
    }

    @Test
    public void testSetIsBandLeader() {
        person1.setIsBandLeader(false);
        assertEquals(false, person1.isBandLeader());
    }
}
```