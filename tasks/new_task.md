# 🌳 Tree Adventure!

Welcome to the mystical world of Java programming! In this task, you'll delve into the wonders of object-oriented design by creating your very own "Tree" objects. This exercise will help you master the art of structuring Java classes and manipulating object properties.

### 📅 Deadline
Please complete this assignment by **Friday 20th October**.

### 📚 Instructions
For detailed submission guidelines, refer to the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📖 Preparation
Before you embark on this adventure, make sure to explore the concepts in the OLI material for Module 3:

- Read [Classes and Objects](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60).
- Complete any necessary sign-ups at https://kth.oli.cmu.edu/ and register using the course key `dd1337-ht22`.

> **Assistant's Note:** The references may not perfectly align with this year's curriculum, so feel free to explore further if needed.

### 🎯 Learning Goals

This week’s objectives include:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding Scope (including *variable shadowing*)

### 🦸‍♀️ Troubleshooting Guide
If you encounter challenges, consider the following steps:

1. Review this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues) to see if your problem is covered.
2. Post your own question if needed by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with a descriptive title.
3. Seek assistance from a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA).

While collaboration with peers is encouraged, remember to **keep your work to yourself!**

### 🌲 Assignment Overview

In the fantasy woodlands of the Royal Institute of Technology, there's a legendary species known as the **Arboretus**. Your mission is to represent these mythical trees in Java. Imagine the grandeur of these trees and let your creativity take root.

#### Exercise 3.0 -- Fields
Create a new class called `Tree.java` in the `src` directory. In this class, define these fields representing characteristics of the Arboretus tree:

- `String species`
- `double height` (in meters)
- `int age` (in years)
- `boolean evergreen`

If completed correctly, the initial example should compile when added to `Tree.java`.

<details>
  <summary> 🌳 Example 1 </summary>

  ```java
  class Tree {

    // Define your fields here!

    public static void main(String[] args) {
      Tree oak = new Tree();

      oak.species = "Oak";
      oak.height = 15.5;
      oak.age = 80;
      oak.evergreen = false;

      System.out.println("Species: " + oak.species);
      System.out.println("Height: " + oak.height + " meters");
      System.out.println("Age: " + oak.age + " years");
      System.out.println("Evergreen: " + oak.evergreen);
    } // end main method

  } // end class
  ```
</details>

#### Exercise 3.1 -- Getters and Setters
To instill encapsulation, mark the fields in `Tree` as `private`. Then, create *getter* and *setter* methods for each field. This delicate balance of access requires ten methods in total! Verify your setup with the main method below.

<details>
  <summary> 🌳 Example 2 </summary>

  ```java
  class Tree {

    // Your fields go here!

    // Add your getters and setters here!

    public static void main(String[] args) {
      Tree oak = new Tree();

      oak.setSpecies("Oak");
      oak.setHeight(15.5);
      oak.setAge(80);
      oak.setEvergreen(false);

      System.out.println("Species: " + oak.getSpecies());
      System.out.println("Height: " + oak.getHeight() + " meters");
      System.out.println("Age: " + oak.getAge() + " years");
      System.out.println("Evergreen: " + oak.isEvergreen());
    } // end main method

  } // end class
  ```
</details>

> **Assistant's Note:** Boolean getters use the `isXXX()` convention, such as `isEvergreen()`.

#### Exercise 3.2 -- Constructor
Using a constructor can streamline the object creation process found in Example 2. Amend the code with a more elegant constructor-based approach.

#### Exercise 3.3 -- `describe()`
Implement a `describe()` method in the `Tree` class to succinctly print its attributes. Aim for a pleasing, informative output as shown in the next example.

<details>
  <summary> 🌳 Example 3 </summary>

  ```java
  public static void main(String[] args){
    Tree oak = new Tree("Oak", 15.5, 80, false);

    oak.describe();
  }
  ```

  Expected Output:

  ```
  > TREE INFO
  > Species: Oak
  > Height: 15.5 meters
  > Age: 80 years
  > Evergreen: false
  ```
</details>

#### Exercise 3.4 -- `grow()`
Introduce a `grow` method for your trees to mimic growth over a year. This method increases the `height` by a `growthFactor` and `age` by one year, printing the changes to the terminal.

<details>
  <summary> 🌳 Example 4 </summary>

  ```java
  public static void main(String[] args) {
    Tree pine = new Tree("Pine", 10.0, 12, true);

    pine.describe();
    pine.grow(0.5);  // The tree grows by 0.5 meters in height
    pine.describe();
  }
  ```

  Example Output:

  ```
  > TREE INFO
  > Species: Pine
  > Height: 10.0 meters
  > Age: 12 years
  > Evergreen: true

  > Growing by 0.5 meters...

  > TREE INFO
  > Species: Pine
  > Height: 10.5 meters
  > Age: 13 years
  > Evergreen: true
  ```
</details>

#### Exercise 3.5 -- Variable Shadowing
Observe these examples showing variable shadowing issues. Prepare to discuss potential solutions and understand the concept during class. Explore more about [Java variable shadowing](https://en.wikipedia.org/wiki/Variable_shadowing) and the `this` keyword [here](https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html).

```Java
public class Shadow2 {
    private String description = "Shadowy field"; // This should display.

    public void printShadow() {
        String description = "Unclear"; 
        System.out.println(description); // What will this print?
    }

    public static void main(String[] args){
        new Shadow2().printShadow();
    }
}
```

Another classical case:

```Java
public class Forest {
  private int numberOfTrees;

  public Forest(int numberOfTrees) {
    numberOfTrees = numberOfTrees; // Can this be resolved?
  }

  public void announce(){
    int numberOfTrees = 100; // Local scope takes over?
    System.out.println("The forest hosts " + numberOfTrees + " trees.");
  }
}
```

> **Assistant's Note:** Reflect on the distinction between local and instance-level variables. How can `this` be employed to resolve shadowing?

### 🔎 Spot a Bug?
If there's a mistake or anomaly in this exercise, please inform us by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Contributions shall be acknowledged in the acknowledgments section. Happy Coding! 🌳