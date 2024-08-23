# 🍪 Java Cookie Factory

This exercise introduces you to Java classes, encapsulating data using fields, methods, and working with the concept of scope and variable shadowing by modeling a **Cookie**.

### 💀 Deadline
Please complete this assignment by **Friday, November 17th**.

### 👩‍🏫 Instructions
For complete instructions and submission guidelines, visit the [Java Course Assignments Page](https://java-course.example.edu/assignments).

### 📝 Preparation
Before starting the task, review the following materials to set up your understanding:

- Read the section on [Java Classes](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html).
- Study [Encapsulation](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html) techniques.
- Remember to register for our course using the code `java101-2023` on our learning platform if you haven't already.

### ✅ Learning Goals

By the end of this exercise, you should be able to:
* Design Java classes
* Add instance fields
* Add a constructor method
* Create *getters* and *setters*
* Print information to the terminal
* Use the `main` method
* Understand scope and practice variable shadowing

### 🏛 Assignment

In the magical world of Java City, there's a renowned establishment known as the **Java Cookie Factory**. Your task is to create a model of the cookies produced there!

#### Exercise 1.0 — Fields
Create a new Java class named `Cookie` in your project. A `Cookie` should have the following attributes:

- `String` flavor (e.g., chocolate, vanilla)
- `int` size (in cm)
- `boolean` hasChips (whether the cookie has chocolate chips)
- `int` calories

Ensure the fields correctly represent cookie attributes. To verify complete setup, run the code in Example 1:

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  public class Cookie {

    // Declare your fields here!

    public static void main(String[] args) {
      Cookie chocoChip = new Cookie();

      // Assign values to the cookie's attributes
      chocoChip.flavor = "Chocolate";
      chocoChip.size = 10;
      chocoChip.hasChips = true;
      chocoChip.calories = 250;

      // Display cookie information
      System.out.println("Flavor: " + chocoChip.flavor);
      System.out.println("Size: " + chocoChip.size + " cm");
      System.out.println("Has Chips: " + chocoChip.hasChips);
      System.out.println("Calories: " + chocoChip.calories);
    }
  }
  ```

</details>

#### Exercise 1.1 — Getters and Setters
To encapsulate your fields and limit direct access, change the access modifier of the fields to `private` and create *getters* and *setters*.

If worked correctly, the provided main method in Example 2 should function:

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  public class Cookie {

    // Fields go here

    // Getters and setters go here

    public static void main(String[] args) {
      Cookie oatmealRaisin = new Cookie();

      // Set values
      oatmealRaisin.setFlavor("Oatmeal Raisin");
      oatmealRaisin.setSize(12);
      oatmealRaisin.setHasChips(false);
      oatmealRaisin.setCalories(180);

      // Get and print values
      System.out.println("Flavor: " + oatmealRaisin.getFlavor());
      System.out.println("Size: " + oatmealRaisin.getSize() + " cm");
      System.out.println("Has Chips: " + oatmealRaisin.isHasChips());
      System.out.println("Calories: " + oatmealRaisin.getCalories());
    }
  }
  ```

</details>

> **Note:** Method `isHasChips()` instead of `getHasChips()` for boolean field.

#### Exercise 1.2 — Constructor
Streamline object creation by implementing a constructor for `Cookie`. Then repeat Example 2 using your constructor instead for setting initial values.

#### Exercise 1.3 — `printInfo()`
Create a method `printInfo()` that prints all the cookie details. Follow Example 3 for desired output:

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public class Cookie {

    // Existing code...

    public void printInfo() {
      System.out.println("Cookie Info:");
      System.out.println("Flavor: " + getFlavor());
      System.out.println("Size: " + getSize() + " cm");
      System.out.println("Has Chips: " + isHasChips());
      System.out.println("Calories: " + getCalories());
    }

    public static void main(String[] args) {
      Cookie sugarCookie = new Cookie("Sugar", 8, false, 150);
      sugarCookie.printInfo();
    }
  }
  ```

  This should output:

  ```
  > Cookie Info:
  > Flavor: Sugar
  > Size: 8 cm
  > Has Chips: false
  > Calories: 150
  ```

</details>

#### Exercise 1.4 — Variable Shadowing
Let’s explore the concept of variable shadowing. Study the following code examples and comprehend why they might not behave as expected. Be ready to discuss potential solutions.

```java
public class ShadowExample {
    private int width = 6; // Expect to use this width

    public void showShadow() {
        int width = 3;
        System.out.println("Width: " + width); // Prints the shadowed width
    }

    public static void main(String[] args){
        new ShadowExample().showShadow();
    }
}
```

Another illustration:

```java
public class Dessert {
  private String name;
  private int quantity;

  public Dessert(String name, int quantity) {
    name = name; // Why don't we assign correctly?
    quantity = quantity;
  }

  public void serve() {
    String name = "Anonymous Dessert";
    System.out.println(name + " is served!"); // It's not using the field name!
  }
}
```

> **Note:** Consider how scopes dictate variable visibility and how the `this` keyword can help manage variable shadowing difficulties.

### 🐞 Bugs and Errors
If you encounter errors or discrepancies in the exercise, please open a [New Issue](https://java-course.example.edu/issues/new) titled "Exercise Error: [brief issue summary]". Your feedback helps us improve the materials!