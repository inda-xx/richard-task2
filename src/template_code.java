### Template

```java
// Exercise 3.1 -- Book Class
class Book {
    private String title;
    private String author;
    private int yearPublished;
    private boolean isBorrowed;

    // Create a constructor method
    public Book(String title, String author, int yearPublished, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isBorrowed = isBorrowed;
    }

    // getters
    public String getTitle() { /* Code here to return title */ }
    public String getAuthor() { /* Code here to return author */ }
    public int getYearPublished() { /* Code here to return yearPublished */ }
    public boolean isBorrowed() { /* Code here to return isBorrowed */ }

    // setters
    public void setTitle(String title) { /* Code here to set title */ }
    public void setAuthor(String author) { /* Code here to set author */ }
    public void setYearPublished(int yearPublished) { /* Code here to set yearPublished */ }
    public void setBorrowed(boolean isBorrowed) { /* Code here to set isBorrowed */ }

    // bookInfo method
    public void bookInfo() { /* Code here to print book info */ }

    public static void main(String[] args) {
        /* Code here to create a new Book object and call its methods */
    }
}
```

```java
// Exercise 3.2 -- Library Class
class Library {
    private Book[] books;
    private int bookCount;

    // Create a constructor method
    public Library(int size) {
       this.books = new Book[size];
       this.bookCount = 0;
    }

    // getters
    public Book[] getBooks() { /* Code here to return books */ }
    public int getBookCount() { /* Code here to return bookCount */ }

    // setters
    public void setBooks(Book[] books) { /* Code here to set books */ }
    public void setBookCount(int bookCount) { /* Code here to set bookCount */ }

    // Method to add a book to the library
    public void addBook(Book book) { /* Code here to add book to library */ }

    // Method to borrow a book from the library
    public Book borrowBook(String title) { /* Code here to borrow book from library */ }

    // Method to return a book to the library
    public void returnBook(Book book) { /* Code here to return book to library */ }

    public static void main(String[] args) {
        /* Code here to create a new Library object and call its methods */
    }
}
```

```java
// Exercise 3.3 -- Scope or Variable Shadowing
class Library {
    // ...
    // Add your experiment method here. It should contain a local variable with the same name
    // as one of the fields and demonstrate how Java decides between them.
    public void demonstrateVariableShadowing() {
        int bookCount = 0; // This variable shadows the field 'bookCount'
        /*
        * Add your explanation here. Describe what happens when you try to 
        * access 'bookCount' in this method and why.
        */
    }
}
```