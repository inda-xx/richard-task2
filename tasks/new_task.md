# SuperRide: The Java Adventure 🚴

In this exercise, you will dive into designing and implementing Java classes through the lens of a bike registration system. This task will enable you to practice object-oriented programming concepts while crafting your own bicycle model.

### 🚨 Deadline
This assignment is due on **Friday, November 10th**.

### 💻 Instructions
Please ensure you follow the guidelines laid out in the [course instructions](https://example-university.edu/java-course-instructions#assignments) for submission.

### 📚 Preparation
To prepare for this task, ensure you read the following resources:

- [Java Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)
- [Encapsulation in Java](https://www.baeldung.com/java-encapsulation)
- [Understanding Constructors](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)

### 🎯 Learning Goals

This exercise aims to strengthen your understanding in several areas:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating getters and setters
* Printing to the terminal
* Using the `main` method
* Scope (or variable shadowing)

### 📈 Assignment

Welcome to SuperRide, a fictional bicycle company dedicated to providing high-performing and environmentally friendly bikes. Your task is to create a Java class model for these bikes!

#### Exercise 1.0 -- Instance Fields

Create a `Bicycle.java` class in the `src` folder. This class should include the following fields to represent the attributes of a Bicycle:

- `String` modelName
- `int` gearCount
- `double` currentSpeed
- `String` color

If done correctly, the main method provided in Example 1 should compile.

<details>
  <summary>🛠 Example 1</summary>

  ```java
  public class Bicycle {

    // Fields for Bicycle class

    public static void main(String[] args) {
      Bicycle tropical = new Bicycle();

      // Assigning values
      tropical.modelName = "Tropical";
      tropical.gearCount = 21;
      tropical.currentSpeed = 0.0;
      tropical.color = "Blue";

      // Printing information
      System.out.println("Model: " + tropical.modelName);
      System.out.println("Gears: " + tropical.gearCount);
      System.out.println("Speed: " + tropical.currentSpeed + " km/h");
      System.out.println("Color: " + tropical.color);
    }
  }
  ```
</details>

#### Exercise 1.1 -- Getters and Setters

To adhere to the principles of encapsulation, modify the `Bicycle` class to make its fields private. Add getters and setters for all fields so external classes can interact with them safely.

<details>
  <summary>🛠 Example 2</summary>

  ```java
  public class Bicycle {

    // Fields with private access

    // Getters and Setters

    public static void main(String[] args) {
      Bicycle mountainMaster = new Bicycle();

      // Using setters
      mountainMaster.setModelName("MountainMaster");
      mountainMaster.setGearCount(18);
      mountainMaster.setCurrentSpeed(0.0);
      mountainMaster.setColor("Red");

      // Using getters
      System.out.println("Model: " + mountainMaster.getModelName());
      System.out.println("Gears: " + mountainMaster.getGearCount());
      System.out.println("Speed: " + mountainMaster.getCurrentSpeed() + " km/h");
      System.out.println("Color: " + mountainMaster.getColor());
    }
  }
  ```
</details>

#### Exercise 1.2 -- Constructor Method

Create a constructor for the `Bicycle` class that initializes all its fields. Update the previous examples to utilize this constructor.

<details>
  <summary>🛠 Example 3</summary>

  ```java
  public class Bicycle {

    // Fields with private access

    // Constructor

    // Getters and Setters

    public static void main(String[] args) {
      Bicycle roadRunner = new Bicycle("RoadRunner", 10, 25.5, "Yellow");

      // Printing information
      System.out.println("Model: " + roadRunner.getModelName());
      System.out.println("Gears: " + roadRunner.getGearCount());
      System.out.println("Speed: " + roadRunner.getCurrentSpeed() + " km/h");
      System.out.println("Color: " + roadRunner.getColor());
    }
  }
  ```
</details>

#### Exercise 1.3 -- `printInfo()` Method

Incorporate a method named `printInfo()` that prints all details of the Bicycle object. The method should not return any value.

<details>
  <summary>🛠 Example 4</summary>

  ```java
  public void printInfo() {
    System.out.println("Bicycle Model: " + modelName);
    System.out.println("Number of Gears: " + gearCount);
    System.out.println("Current Speed: " + currentSpeed + " km/h");
    System.out.println("Color: " + color);
  }

  // Example print call
  roadRunner.printInfo();
  ```
  This should produce:
  ```
  Bicycle Model: RoadRunner
  Number of Gears: 10
  Current Speed: 25.5 km/h
  Color: Yellow
  ```
</details>

#### Exercise 1.4 -- Speed Control

Add functionality to your Bicycle class for accelerating and decelerating. Implement `accelerate(double increment)` and `decelerate(double decrement)` methods. These methods should adjust the `currentSpeed` and ensure the speed never drops below 0 km/h.

<details>
  <summary>🛠 Example 5</summary>

  ```java
  public class Bicycle {

    // [Fields, Constructor, PrintInfo from previous exercises]

    public void accelerate(double increment) {
      currentSpeed += increment;
    }

    public void decelerate(double decrement) {
      currentSpeed -= decrement;
      if (currentSpeed < 0) currentSpeed = 0;
    }

    public static void main(String[] args) {
      Bicycle cityCruiser = new Bicycle("CityCruiser", 8, 15.5, "Green");

      // Testing speed control
      cityCruiser.accelerate(5.0);
      System.out.println("Accelerated Speed: " + cityCruiser.getCurrentSpeed() + " km/h"); // Should be 20.5 km/h

      cityCruiser.decelerate(10.0);
      System.out.println("Decelerated Speed: " + cityCruiser.getCurrentSpeed() + " km/h"); // Should be 10.5 km/h

      cityCruiser.decelerate(15.0);
      System.out.println("Decelerated Speed: " + cityCruiser.getCurrentSpeed() + " km/h"); // Should be 0 km/h
    }
  }
  ```
</details>

#### Exercise 1.5 -- Understanding Variable Shadowing

Examine the following shadowing problems. Be prepared to explain how to resolve them in class. Refer to articles on [Variable Shadowing](https://en.wikipedia.org/wiki/Variable_shadowing) and the `this` keyword [documentation](https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html).

```java
public class TestShadowing {
    private int speed = 25;

    public void testShadow() {
        int speed = 50;
        System.out.println(speed); // Prints the wrong speed
    }

    public static void main(String[] args){
        new TestShadowing().testShadow();
    }
}
```

```java
public class PaintedBike {
  private String color;

  public PaintedBike(String color) {
    color = color; // This doesn't work. Why?
  }

  public void display() {
    String color = "Red";
    System.out.println("Bike color: " + color); // Prints the wrong color
  }

  public static void main(String[] args){
        PaintedBike myBike = new PaintedBike("Blue");
        myBike.display(); // Problem with output
  }
}
```

### 🐞 Troubleshooting
If you encounter issues or find errors in this exercise, open a [New Issue](https://example-university.edu/java-course-issues/new) labeled "Exercise Error: Bicycle Task". Your feedback will help improve materials for everyone!

Happy coding! 🧑‍💻