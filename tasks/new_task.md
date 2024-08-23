# 🚀 Journey to the Stars: Java Galaxy Exploration!

In this exercise, you will explore object-oriented programming in Java by modeling interstellar objects. You'll design classes, use instance fields, create constructors, and more. Ready to embark on this cosmic venture?

### 💀 Deadline
Please complete this exercise by **Friday 15th October**.

### 👩‍🏫 Instructions
Ensure you follow the [assignment submission guidelines](https://gits-15.sys.kth.se/java-course/submissions).

### 📝 Preparation
To be prepared for this assignment, please review the following OLI material:

- [Objects and Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=9c8e5e45de7e714b9128c3e7f9c2ffa8)
- Visit [OLI website](https://kth.oli.cmu.edu/) and register with the course code `dd1337-ht23` if you have not already done so.

> **Teacher's Note:** There may be slight discrepancies in sequence with the OLI material this year, so it's perfectly fine to explore additional topics.

### ✅ Learning Goals

This exercise focuses on:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding scope and variable shadowing

### 🚧 Help and Troubleshooting
If you need assistance, here's what you can do:

1. Check the [current issues](https://gits-15.sys.kth.se/java-course/help/issues) to see if someone else has a similar question.
2. Post a new question by creating a [New Issue](https://gits-15.sys.kth.se/java-course/help/issues/new).
3. Reach out to a TA during the [scheduled lab sessions](https://queue.csc.kth.se/Queue/INDA).

Discussion with peers is encouraged, but remember to submit original work!

### 🌌 Assignment: Galactic Voyager

🪐 In the cosmos far away, astronomers have identified celestial objects known as **StarVoyagers**. Your mission? To encapsulate these interstellar explorers in a Java class. To aid your imagination, here's an artistic depiction of these galactic wonders:

<img src="images/starvoyager.png" width="800">

#### Exercise 1.0 -- Fields
In your project’s `src` directory, create a new class `StarVoyager.java`. Your class should include these fields:

- `String` name
- `int` age
- `double` speed (in light-years per year)
- `boolean` active

If set up correctly, the Example 1 main method should compile when added to `StarVoyager.java`.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  class StarVoyager {

    // Declare your fields here!

    public static void main(String[] args) {
      // Instantiating a new StarVoyager
      StarVoyager voyager1 = new StarVoyager();

      // Assign values to instance variables
      voyager1.name = "Galaxion";
      voyager1.age = 100;
      voyager1.speed = 2.5;
      voyager1.active = true;

      // Print fields
      System.out.println("Name: " + voyager1.name);
      System.out.println("Age: " + voyager1.age);
      System.out.println("Speed: " + voyager1.speed + " light-years/year");
      System.out.println("Active: " + voyager1.active);
    }
  }
  ```
</details>

#### Exercise 1.1 -- Getters and Setters
To embrace encapsulation, make fields `private`. Implement `getters` and `setters`:

- `getName()`, `setName(String name)`
- `getAge()`, `setAge(int age)`
- `getSpeed()`, `setSpeed(double speed)`
- `isActive()`, `setActive(boolean active)`

The Example 2 code should compile if the methods are correctly implemented.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  class StarVoyager {

    // Declare fields here!

    // Declare getters and setters here!

    public static void main(String[] args) {
      // Instantiating a new StarVoyager
      StarVoyager voyager2 = new StarVoyager();

      // Use setters
      voyager2.setName("Astral Hunter");
      voyager2.setAge(300);
      voyager2.setSpeed(4.7);
      voyager2.setActive(false);

      // Print via getters
      System.out.println("Name: " + voyager2.getName());
      System.out.println("Age: " + voyager2.getAge());
      System.out.println("Speed: " + voyager2.getSpeed() + " light-years/year");
      System.out.println("Active: " + voyager2.isActive());
    }
  }
  ```
</details>

> **Assistant's Note:** `boolean` getters often use the `is` prefix, for example, `isActive()`.

#### Exercise 1.2 -- Constructor
Refactor the class to use a constructor to set initial values for `name`, `age`, `speed`, and `active`:

```java
public StarVoyager(String name, int age, double speed, boolean active) {
  // Initialize fields with constructor parameters.
}
```

Use this constructor in Example 3 to prove implementation correctness.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public static void main(String[] args) {
    // Instantiate with constructor
    StarVoyager voyager3 = new StarVoyager("Nebula Nomad", 180, 3.0, true);

    // Direct info print
    System.out.println("Voyager Details:\n" + "Name: " + voyager3.getName() +
                       "\nAge: " + voyager3.getAge() +
                       "\nSpeed: " + voyager3.getSpeed() + " light-years/year" +
                       "\nActive: " + voyager3.isActive());
  }
  ```
</details>

#### Exercise 1.3 -- `printStatus()`
Implement a method `printStatus()` that prints voyager information in a pre-formatted string.

<details>
  <summary> 🛠 Example 4 </summary>

  ```java
  class StarVoyager {

    // Fields, constructor, getters, and setters ...

    public void printStatus() {
      System.out.println(">> VOYAGER STATUS <<");
      System.out.println("Name: " + this.name);
      System.out.println("Age: " + this.age);
      System.out.println("Speed: " + this.speed + " light-years/year");
      System.out.println("Active: " + this.active);
    }

    // Test in the main method:
    public static void main(String[] args) {
      StarVoyager voyager = new StarVoyager("Light Strider", 200, 5.2, true);
      voyager.printStatus();
    }
  }
  ```
</details>

🐾 The expected output format should be:

```
>> VOYAGER STATUS <<
Name: Light Strider
Age: 200
Speed: 5.2 light-years/year
Active: true
```

#### Exercise 1.4 -- Celestial Interaction
The `interact` method simulates a Voyager having a hypothetical interaction with another. Assume interactions decrease speed by a constant (e.g., 0.5). Print the interaction effects on the terminal.

<details>
  <summary> 🛠 Example 5 </summary>

  ```java
  public void interact(StarVoyager voyager) {
    // Interact logic
    this.speed -= 0.5;
    if (this.speed < 0) this.speed = 0; // Guard against negative speed

    System.out.println(this.name + " interacted with " + voyager.getName());
    System.out.println(this.name + "'s new speed: " + this.speed + " light-years/year");
  }

  public static void main(String[] args) {
    StarVoyager voyager1 = new StarVoyager("Comet Cruiser", 150, 6.2, true);
    StarVoyager voyager2 = new StarVoyager("Celestial Drifter", 230, 7.5, false);

    voyager1.interact(voyager2);
  }
  ```

  The console output should resemble:

  ```
  Comet Cruiser interacted with Celestial Drifter
  Comet Cruiser's new speed: 5.7 light-years/year
  ```
</details>

#### Exercise 1.5 -- Shadowing Examples
Review the examples below and be ready to discuss potential solutions in class:

```java
public class SpaceAttributes {
  private String type = "Dwarf Star"; // This should print

  public void showType() {
    String type = "Giant Star";
    System.out.println(type); // Prints the incorrect type.
  }

  public static void main(String[] args) {
    new SpaceAttributes().showType();
  }
}
```

Another scenario:

```java
public class CelestialBody {
  private String identifier;
  private double mass;

  public CelestialBody(String identifier, double mass) {
    identifier = identifier; // Misleading assignment
    mass = mass;
  }

  public void displayInfo() {
    System.out.println("Identifier: " + identifier + ", Mass: " + mass);
  }
}
```

> **Student Note:** Reflect on the concepts of scope, local vs. global variables, and the use of `this` in Java to address these issues.

### 🌌 Problem Solving and Debugging
If you spot errors or inconsistencies, document them by opening a [New Issue](https://gits-15.sys.kth.se/java-course/help/issues/new) titled "Galactic Task Error: *brief description*" for a chance to be acknowledged in future references. 

Embark on this celestial coding journey and discover uncharted territories of Java programming!