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
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYearPublished() { return yearPublished; }
    public boolean isBorrowed() { return isBorrowed; }

    // setters
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setYearPublished(int yearPublished) { this.yearPublished = yearPublished; }
    public void setBorrowed(boolean isBorrowed) { this.isBorrowed = isBorrowed; }

    // bookInfo method
    public void bookInfo() { 
      System.out.println("Title: " + this.getTitle());
      System.out.println("Author: " + this.getAuthor());
      System.out.println("Year Published: " + this.getYearPublished());
      System.out.println("Is the book available: " + !this.isBorrowed());
    }
}

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
    public Book[] getBooks() { return books; }
    public int getBookCount() { return bookCount; }

    // Method to add a book to the library
    public void addBook(Book book) { 
      if (bookCount < books.length) {
        books[bookCount++] = book;
      }
    }

    // Method to borrow a book from the library
    public void borrowBook(String title) {
      for (Book book : books) {
        if (book != null && book.getTitle().equals(title)) {
          book.setBorrowed(true);
          return;
        }
      }
    }

    // Method to return a book to the library
    public void returnBook(Book book) {
      if (book != null) {
        book.setBorrowed(false);
      }
    }
}

// Exercise 3.3 -- Scope or Variable Shadowing
class Library {
    // ...
    // Add your experiment method here. It should contain a local variable with the same name
    // as one of the fields and demonstrate how Java decides between them.
    public void demonstrateVariableShadowing() {
        int bookCount = 5; // This variable shadows the field 'bookCount'
        // Here, the `bookCount` variable that was declared inside the method will be 
        // printed because it shadows the instance variable `bookCount`.
        System.out.println("Local 'bookCount': " + bookCount);
        System.out.println("Instance 'bookCount': " + this.bookCount); // Use `this` to access the instance variable
    }
}
```