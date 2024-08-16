# The Chronicles of Cars 🚗 

Buckle up! In this programming task under the module of INDA, you will learn to enrich your Java programming skills by designing classes associated with the theme of cars.

### 😱 Deadline

This task should be wrapped up by **Wednesday 9th November**.

### 👨‍🏫 Instructions

To understand how to complete and submit this assignment, please visit the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📚 Preparation

For this assignment, you must thoroughly go through the Module 3 OLI materials.

- Dive into [Creating and Using Objects](https://kth.oli.cmu.edu/jcourse/webui/guest/module.do?context=dca4e88680020ca607fcf9f5c0a63d1c)
- If you haven't yet, please sign up on https://kth.oli.cmu.edu/ and remember to register for the course key `dd1337-ht22`

> **Assistant's Note:** Slight misalignment in OLI material and tasks might be possible this year, so if you don't find all the material, continue reading ahead.

### ✔️ Learning Goals

This week's learning goals:
- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating getters and setters
- Printing to the terminal
- Using the `main` method
- Understanding of Scope (or variable shadowing)

### 🚧 Troubleshooting Guide

In case you encounter any issue or have any questions:

1. Visit week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues).
2. If you can't find your issue, post a question yourself by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Start the title with "Task 3: *summary of problem here*"
3. During the [weekly lab](https://queue.csc.kth.se/Queue/INDA), don't hesitate to ask a TA. 

Feel free to discuss with your course peers, but beware of not sharing answers!

### 🏰 Assignment

In Stockholm, we're bringing the essence of automobile designing into programming. You will be creating Java classes for different parts of a car model. But remember, not to share any answers with your friends!

#### Exercise 3.0 -- Fields

In the folder tagged as [`src`](src), build a new class named `Car.java`. Your task is to assign the following attributes (fields):

- `String` brand
- `String` model
- `int` year
- `int` speed
- `boolean` engineStatus

Try running the main method from Example 1 once you have added these fields to `Car.java`.

<details>
  <summary> 🧰 Example 1 </summary>

  ```java
  class Car {

    // Insert the fields here

    public static void main(String[] args) {
      // establish a new "Car" item
      Car mycar = new Car();

      // assign the values
      mycar.brand = "Tesla";
      mycar.model = "Model S";
      mycar.year = 2022;
      mycar.speed = 0;

      // retrieve the information of the assigned values
      System.out.println("Brand: " + mycar.brand);
      System.out.println("Model: " + mycar.model);
      System.out.println("Year: " + mycar.year);
      System.out.println("Speed: " + mycar.speed);
    } // close the main method

  } // close the class
  ```
</details>

#### Exercise 3.1 -- Getters and Setters

After encapsulating the state of your Car, include private access modifiers for the fields. Additionally, get on with creating *getters* and *setters* for all attributes, leading to ten methods in total. Upon completion, try running the main method in Example 2. 

<details>
  <summary> 🧰 Example 2 </summary>

  ```java
  class Car {

    // Insert your fields here!

    // Alongside the getters and setters!

    public static void main(String[] args) {
      // developing a new "Car" object
      Car mycar = new Car();

      // assigning new values to the object
      mycar.setBrand("Tesla");
      mycar.setModel("Model S");
      mycar.setYear(2022);
      mycar.setSpeed(0);

      // print the details of the assigned attributes
      System.out.println("Brand: " + mycar.getBrand());
      System.out.println("Model: " + mycar.getModel());
      System.out.println("Year: " + mycar.getYear());
      System.out.println("Speed: " + mycar.getSpeed());
      System.out.println("Engine Status: " + mycar.isEngineStatus());
    } // close main method

  } // terminate the class
  ```
</details>

> **Assistant's Note:** The getters and setters for boolean type attribute has a different naming convention in comparison to others.

#### Exercise 3.2 -- Constructor

Bringing back a constructor from the OLI material will save you plenty of efforts. Once implemented, you can repeat Exercise 2 again.

#### Exercise 3.3 -- `printDetails()`

Create a method named `printDetails()`. The aim of this method is to print all the details about the car without any requirement of a return type. Look at Example 3 for a reference implementation. 

<details>
  <summary> 🧰 Example 3 </summary>

  ```java
  public static void main(String[] args){
    // develop a new "Car" object
    Car mycar = new Car("Tesla", "Model S", 2022, 0);

    // print the details of the car on the terminal
    mycar.printDetails();
  }
  ```

  This call must print the following details on the terminal:

  ```
  > DETAILS OF THE CAR:
  > Brand: Tesla
  > Model: Model S
  > Year of manufacturing: 2022
  > Speed: 0
  > Engine Status: False
  ```
</details>

#### Exercise 3.4 -- Speed up!

For this exercise, create a method `speedUp` which receives an int arguement and increases speed. When this function is called, be sure to print the information on the terminal.

<details>
  <summary> 🧰 Example 4 </summary>

  ```java
  public static void main(String[] args){
    // creating a new "Car" object
    Car mycar = new Car("Tesla", "Model S", 2022, 0);

    // call the "speedUp" method on mycar with increased speed
    mycar.speedUp(60);
  }
  ```

  The call should thus print:

  ```
  > The Tesla Model S is now running at 60 km/h speed!
  ```
</details>

#### Exercise 3.5 -- Variable Shadowing

Reflect on the given examples below about variable shadowing. Remember, you may have to articulate about these in class.

```Java
public class Shadow {
    private int num = 0;

    public void printNum() {
        int num = 7;
        System.out.println(num); 
    }

    public static void main(String[] args){
        new Shadow().printNum();
    }
}
```

The second example can be found here:

```Java
import java.awt.Color;

public class Car {
  private String brand;
  private Color color;

  public Car(String brand, Color color) {
    brand = brand;
    color = color;
  }

  public driveFast(){
    String brand = "Ferrari";
    System.out.println("A " + brand + " drives very fast!"); 
  }
}
```

>**Assistant's Note:** Keep local scope, global variables, and instance fields in mind for these examples.

### 🐜 Bugs And Errors?

If you caught any inconsistency in this exercise, kindly, open a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task 3 Error: *summary of error here*". Acknowledgments will be given to the person who spots the bug!