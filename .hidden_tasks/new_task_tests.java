```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {
    private Book book1;
    private Book book2;

    @Before
    public void setUp() {
        book1 = new Book("Harry Potter", "J.K. Rowling", 1997, false);
        book2 = new Book("Lord of the Rings", "J.R.R. Tolkien", 1954, true);
    }

    @Test
    public void testGetTitle() {
        assertEquals("Harry Potter", book1.getTitle());
        assertEquals("Lord of the Rings", book2.getTitle());
    }

    @Test
    public void testGetAuthor() {
        assertEquals("J.K. Rowling", book1.getAuthor());
        assertEquals("J.R.R. Tolkien", book2.getAuthor());
    }

    @Test
    public void testGetYearPublished() {
        assertEquals(1997, book1.getYearPublished());
        assertEquals(1954, book2.getYearPublished());
    }

    @Test
    public void testIsBorrowed() {
        assertEquals(false, book1.isBorrowed());
        assertEquals(true, book2.isBorrowed());
    }

    @Test
    public void testSetTitle() {
        book1.setTitle("Fantastic Beasts");
        assertEquals("Fantastic Beasts", book1.getTitle());
    }

    @Test
    public void testSetAuthor() {
        book1.setAuthor("Newton Scamander");
        assertEquals("Newton Scamander", book1.getAuthor());
    }

    @Test
    public void testSetYearPublished() {
        book1.setYearPublished(2001);
        assertEquals(2001, book1.getYearPublished());
    }

    @Test
    public void testSetBorrowed() {
        book1.setBorrowed(true);
        assertEquals(true, book1.isBorrowed());
    }
}

public class LibraryTest {
    private Library library;

    @Before
    public void setup() {
        library = new Library(5);
    }

    @Test
    public void testAddBook() {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 1997, false);
        library.addBook(book1);
        assertEquals(book1, library.getBooks()[0]);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void testBorrowBook() {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 1997, false);
        library.addBook(book1);
        library.borrowBook("Harry Potter");
        assertTrue(book1.isBorrowed());
    }

    @Test
    public void testReturnBook() {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 1997, true);
        library.addBook(book1);
        library.returnBook(book1);
        assertFalse(book1.isBorrowed());
    }

    @Test
    public void testExceedLibrarySize() {
        for(int i = 0; i < 6; ++i) {
            library.addBook(new Book("Book" + i, "Author" + i, 2000 + i, false));
        }
        assertEquals(5, library.getBookCount());
    }
}
```