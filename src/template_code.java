import org.junit.Before;
    import org.junit.Test;
    import static org.junit.Assert.*;
    import java.util.Arrays;
    import java.util.List;

class Book {
    // Define private fields
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, String isbn, boolean isAvailable) {
        // Initialize fields using constructor parameters
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for isbn
    public String getIsbn() {
        return isbn;
    }

    // Setter for isbn
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Getter for isAvailable
    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter for isAvailable
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Method to print book information
    public void printInfo() {
        System.out.println("Book Information:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Available: " + isAvailable);
    }

    public static void main(String[] args) {
        // Create a new Book object and test the class
        Book exampleBook = new Book("1984", "George Orwell", "1234567890123", true);

        // Print the details of the book
        exampleBook.printInfo();

        // Modify fields using setters
        exampleBook.setIsAvailable(false);

        // Access fields using getters
        System.out.println("Is the book available? " + exampleBook.isAvailable());
    }
}

public class Library {
    private String name;
    private int booksCount;

    // Method that demonstrates variable shadowing
    public void addBook(String name) {
        int booksCount = 1;
        // Consider using 'this' to refer to instance variables if necessary
        System.out.println("We now have " + booksCount + " books in the library.");
    }

    public static void main(String[] args) {
        // Demonstrate the shadowing problem
        Library lib = new Library();
        lib.addBook("Java Programming");
    }
}