import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {
    
    private Book book;

    @Before
    public void setUp() {
        book = new Book("Test Title", "Test Author", "1234567890123", true);
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("Test Title", book.getTitle());
        assertEquals("Test Author", book.getAuthor());
        assertEquals("1234567890123", book.getIsbn());
        assertTrue(book.isAvailable());
    }

    @Test
    public void testSetTitle() {
        book.setTitle("New Title");
        assertEquals("New Title", book.getTitle());
    }

    @Test
    public void testSetAuthor() {
        book.setAuthor("New Author");
        assertEquals("New Author", book.getAuthor());
    }

    @Test
    public void testSetIsbn() {
        book.setIsbn("0987654321098");
        assertEquals("0987654321098", book.getIsbn());
    }

    @Test
    public void testSetIsAvailable() {
        book.setIsAvailable(false);
        assertFalse(book.isAvailable());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidIsbnLength() {
        new Book("Invalid", "Author", "1234", true);
    }

    @Test(timeout = 1000)
    public void testPerformanceUnderLoad() {
        // Simulate a heavy load by performing multiple set operations
        for (int i = 0; i < 1000000; i++) {
            book.setTitle("Title " + i);
            book.setAuthor("Author " + i);
        }
        assertEquals("Title 999999", book.getTitle());
    }
}

public class LibraryTest {

    private Library library;

    @Before
    public void setUp() {
        library = new Library("Local Library");
    }

    @Test
    public void testLibraryInitialization() {
        assertEquals("Local Library", library.name);
    }

    @Test
    public void testAddBookIncrementsCount() {
        library.addBook("Some Book");
        assertEquals(1, ((Integer)library.booksCount).intValue());
    }

    @Test
    public void testAddMultipleBooks() {
        library.addBook("Book One");
        library.addBook("Book Two");
        assertEquals(2, ((Integer)library.booksCount).intValue());
    }
}