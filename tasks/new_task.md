# Java Knight Rise! 🛡️⚔️

In this exercise, you are going to delve deeper into object-oriented programming by further exploring components of a Java class.

### 🏷️ Deadline
This task should be completed before the day of the next class, **Saturday, 30th April**.

### 📚 Instructions
Please refer to the [assignment's section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments) for guidelines on how to do and submit the assignment.

### 🔍 Preparation
Before attempting the task, make sure to read and answer questions in the OLI material for Module 2:

- Read [Looking Inside Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- If you haven't done so already, go to https://kth.oli.cmu.edu/, sign up, and register for the course key `dd1337-ht22`

### ✏️ Learning Goals
This week's learning objectives include:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding Scope (or *variable shadowing*)

### 🚒 Troubleshooting Guide
If you encounter any issues or problems, follow the structure below:

1. Look at this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Are there questions asked by other students similar to yours?
2. If not, create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with a detailed title starting with "Task *x*: *summary of the problem here*"
3. Consult a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA), check your schedule for the next lab session.

Feel free to discuss the assignment with your classmates, but remember, **do not share answers**!

### 🏛️ Assignment

In the magical world of KTH, there are legendary warriors known as 'Java Knights'. Your task for the day is to model these legendary 'Java Knights' in Java! 

#### Exercise 2.1 -- Fields
In the [`src`](src) directory, create a new class titled `JavaKnight.java`. In this class, you should model attributes of the knights using [fields](https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html). The attributes of each `JavaKnight` should include:

- `String` name
- `int` healthPoints
- `int` attackPower
- `int` defensePower
- `boolean` isAlive

The fields attribute you create should allow the main method in Example 1 to compile and run successfully if added to `JavaKnight.java`.

<details>
  <summary> 🛠 Example 1</summary>

  ```java
  class JavaKnight {

    // Fields go here.

    public static void main(String[] args) {
      // Create a new "JavaKnight" object
      JavaKnight knight1 = new JavaKnight();

      // Assign values to instance variables
      knight1.name = "Sir Code-a-lot";
      knight1.healthPoints = 20;
      knight1.attackPower = 10;
      knight1.defensePower = 5;
      knight1.isAlive = true;

      // Retrieve and print the information of the assigned values
      System.out.println("Name: " + knight1.name);
      System.out.println("Health Points: " + knight1.healthPoints);
      System.out.println("Attack Power: " + knight1.attackPower);
      System.out.println("Defense Power: " + knight1.defensePower);
      System.out.println("Is Alive: " + knight1.isAlive);
    } 

  }
  ```
</details>

#### Exercise 2.2 -- Getters and Setters
To practice [encapsulation](https://en.wikipedia.org/wiki/Encapsulation_(computer_programming)), prevent direct access to the state of your JavaKnight by setting the [access modifiers](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html) of the fields to `private`. Yet, you'll still require the ability to read and write the fields. Implement *getters* and *setters* methods for each field. Confirm your solution by making sure the main method in Example 2 compiles when added to `JavaKnight.java`.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  class JavaKnight {

    // Fields go here.

    // Getters and setters go here!

    public static void main(String[] args) {
      // Create a new "JavaKnight" object
      JavaKnight knight1 = new JavaKnight();

      // Assign values to instance variables through setters
      knight1.setName("Sir Code-a-lot");
      knight1.setHealthPoints(20);
      knight1.setAttackPower(10);
      knight1.setDefensePower(5);
      knight1.setIsAlive(true);
      
      // Retrieve and print the information of the assigned values through getters
      System.out.println("Name: " + knight1.getName());
      System.out.println("Health Points: " + knight1.getHealthPoints());
      System.out.println("Attack Power: " + knight1.getAttackPower());
      System.out.println("Defense Power: " + knight1.getDefensePower());
      System.out.println("Is Alive: " + knight1.getIsAlive());
    }

  } 
  ```
</details>

#### Exercise 2.3 -- Constructor
Design a constructor method for the `JavaKnight` class. This constructor should accept values for all fields and assign them accordingly. Your solution should enable the main method provided in Example 3 to compile when added to `JavaKnight.java`.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  class JavaKnight {

    // Fields go here.

    // Constructor goes here!

    // Getters and setters go here!

    public static void main(String[] args) {
      // Create a new "JavaKnight" object
      JavaKnight knight1 = new JavaKnight("Sir Code-a-lot", 20, 10, 5, true);
      
      // Retrieve and print the information of the assigned values through getters
      System.out.println("Name: " + knight1.getName());
      System.out.println("Health Points: " + knight1.getHealthPoints());
      System.out.println("Attack Power: " + knight1.getAttackPower());
      System.out.println("Defense Power: " + knight1.getDefensePower());
      System.out.println("Is Alive: " + knight1.getIsAlive());
    }

  } 
  ```
</details>

Further assignment descriptions will be continued in the next part of the text due to character length restrictions.