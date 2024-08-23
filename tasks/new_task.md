# Build Your Own Library - Java Edition! 📚🚀

Get ready for the third exercise of the Java Fundamentals course! Here, we will put into practice important aspects of Java such as creating and designing classes, using constructors, creating getters and setters, understanding scope and utilizing the main method.

### ⏱ Deadline
This work should be completed before the exercise, which is due on **Friday 19th November**.

### 🔧 Instructions
For instructions on how to complete and submit the assignment, please follow the [course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📖 Preparation
Before you start the assignment, make sure you have read the material for Module 2.

- Please review [Designing Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac65)
- Go to https://kth.oli.cmu.edu/ and sign up using the course key `kth001-ht22`.

### ✅ Learning Goals

After this assignment, you should be comfortable with:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating getters and setters
* Printing to the terminal
* Using the main method
* Understanding scope (or variable shadowing)

### 🚒 Troubleshooting

If you have any issues, please follow these steps:

1. Check out this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Are other students asking about the same problem?
2. If not, create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with a descriptive title starting with "Task 3: *summary of the issue*".
3. Consult a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule to see when the next lab is scheduled.

Please, discuss the assignment with your classmates, but **do not share answers**!

### 🏰 Assignment

In this assignment, you are tasked to create a simplified simulation of a library's book repository. You are to model the `Book` class first and then build a `Library` that holds a collection of books.

#### Exercise 3.1 -- Book Class

In the `src` folder, build a new class called `Book.java`. The `Book` class should contain the following fields:

- `String` title
- `String` author
- `int` yearPublished
- `boolean` isBorrowed

In addition, you should create getters (accessors) and setters (mutators) for each of these fields. 

The `Book` class should also contain a `bookInfo()` method that prints information of the book to the terminal, similar to the example below.

```java
System.out.println("Title: " + book.getTitle());
System.out.println("Author: " + book.getAuthor());
System.out.println("Year Published: " + book.getYearPublished());
System.out.println("Is the book available: " + book.isBorrowed());
```

#### Exercise 3.2 -- Library Class

Now that we have our `Book` class, let's create a `Library` class that holds an array of Book objects.

Create a new class called `Library.java`. This class should contain the following:

- An array instance field that will hold `Book` objects
- A constructor method to establish the size of the library
- Getter and Setter methods
- A method to add a book to the library
- A method to borrow a book from the library
- A method to return a book to the library
 
Keep in mind that the library's capacity should not exceed the size set when instantiated, which implies that you should keep track of the current number of books in the library.

#### Exercise 3.3 -- Scope or Variable Shadowing

Look into the concept of 'Variable Shadowing'. You can check this article on [Wikipedia](https://en.wikipedia.org/wiki/Variable_shadowing) to help you understand this concept. 

Create another method in the `Library` class that experimentally demonstrates the concept of *variable shadowing* and explain what's happening in that method through comments.

### ✨ Credits
If you find any inconsistencies, please raise a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) titled "Task 3 Error: *summary of error*" . Contributors to bug reports and fixes will be credited in the acknowledgment section.