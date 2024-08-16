```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ResearcherTest {

    private Researcher researcher;

    @Before
    public void setUp() {
        researcher = new Researcher("January Doe", 32, "Computer Science", true);
    }

    @Test
    public void testGetName() {
        assertEquals("January Doe", researcher.getName());
    }

    @Test
    public void testGetAge() {
        assertEquals(32, researcher.getAge());
    }

    @Test
    public void testGetField() {
        assertEquals("Computer Science", researcher.getField());
    }

    @Test
    public void testGetIsPhd() {
        assertEquals(true, researcher.getIsPhd());
    }

    @Test
    public void testSetName() {
        researcher.setName("February Doe");
        assertEquals("February Doe", researcher.getName());
    }

    @Test
    public void testSetAge() {
        researcher.setAge(33);
        assertEquals(33, researcher.getAge());
    }

    @Test
    public void testSetField() {
        researcher.setField("Physics");
        assertEquals("Physics", researcher.getField());
    }

    @Test
    public void testSetIsPhd() {
        researcher.setIsPhd(false);
        assertEquals(false, researcher.getIsPhd());
    }
}
```