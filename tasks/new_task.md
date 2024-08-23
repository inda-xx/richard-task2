# 📚 Library Inventory System

In this programming task, you will design and implement a simple Library Inventory system using Java. You will get hands-on experience with Java classes, constructors, getters and setters, and more!

## 📅 Deadline
This assignment is due by **Friday 30th September**.

## 🧑‍🏫 Instructions
For detailed instructions on how to submit your assignment, please refer to the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

## 📖 Preparation
Review the concepts listed below in your textbook or online resources:

- [Understanding Java Classes](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
- [How Constructors Work](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)
- [Access Modifiers: public, private, and protected](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)
- [Variable Shadowing](https://en.wikipedia.org/wiki/Variable_shadowing)

If you haven't already, visit https://your-learning-platform.edu to sign up and register using the course key `cs101-ht23`.

## 🎯 Learning Goals

By completing this task, you will learn to:
- Design Java classes with attributes
- Add instance fields to classes
- Implement constructors
- Create getters and setters for encapsulation
- Print results to the terminal
- Utilize the `main` method
- Understand variable scope and shadowing in Java

## 🤔 Got Questions?
If you encounter any issues, you can:
1. Check this week’s [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues) to see if your question has already been answered.
2. Post your question by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Add a descriptive title starting with "Task *x*".
3. Ask a TA during the weekly labs as per your class schedule.

Feel free to discuss with peers, but remember—no sharing of code answers!

## 📌 Assignment: Building a Library Inventory

You will create a basic system to manage library books. Let's get started!

### Exercise 1: Define the Book Class
Create a file named `Book.java` under the `src` folder. Define a `Book` class with the following private fields:
- `String title`
- `String author`
- `String isbn` (International Standard Book Number)
- `boolean isAvailable`

In addition, add the main method to test your `Book` class after implementing it.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  class Book {

    // Define fields here

    public static void main(String[] args) {
      Book exampleBook = new Book("1984", "George Orwell", "1234567890123", true);
      System.out.println("Title: " + exampleBook.getTitle());
      System.out.println("Author: " + exampleBook.getAuthor());
      System.out.println("ISBN: " + exampleBook.getIsbn());
      System.out.println("Available: " + exampleBook.isAvailable());
    }
  }
  ```
</details>

### Exercise 2: Implement Getters and Setters
Encapsulate the fields by creating proper getters and setters in the `Book` class. Use them to access or modify the private fields.

<details>
  <summary> 🛠 Example Usage </summary>

  ```java
  public static void main(String[] args) {
    Book exampleBook = new Book("1984", "George Orwell", "1234567890123", true);

    // Modify fields using setters
    exampleBook.setIsAvailable(false);

    // Access fields using getters
    System.out.println("Is the book available? " + exampleBook.isAvailable());
  }
  ```
</details>

### Exercise 3: Add a Constructor
Implement a constructor to initialize the fields of the `Book` class. The constructor should accept arguments for all the fields.

<details>
  <summary> 🛠 Constructor Example </summary>

  ```java
  public Book(String title, String author, String isbn, boolean isAvailable) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.isAvailable = isAvailable;
  }
  ```
</details>

### Exercise 4: Printing Book Information
Create a method `printInfo()` in the `Book` class to print all the information of a book object to the terminal.

<details>
  <summary> 🛠 Print Method Example </summary>

  ```java
  public void printInfo() {
    System.out.println("Book Information:");
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("ISBN: " + isbn);
    System.out.println("Available: " + isAvailable);
  }
  ```
</details>

### Exercise 5: Understand Variable Shadowing
Examine the code below. Be prepared to discuss how variable shadowing is occurring and how to correct it using `this`.

```java
public class Library {
   private String name;
   private int booksCount;

   public void addBook(String name) {
     int booksCount = 1;
     System.out.println("We now have " + booksCount + " books in the library.");
   }

   public static void main(String[] args) {
     Library lib = new Library();
     lib.addBook("Java Programming");
   }
}
```

To fix the example above, remember to use `this` to access instance variables when they are shadowed by method or constructor parameters.

## 🐞 Reporting Issues
If you discover any errors in the exercises, please report them by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task *x* Error: *describe error here*". Acknowledgments will be given for bugs found.

Good luck and have fun coding your Library Inventory System! 📚✨