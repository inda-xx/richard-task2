# Java Jamboree: Let's Create a Band 🎵🎸✨

For the inaugural assignment of the INDA course, we'll dive into the core principles of working with Java. You'll model real-world objects, and design and interact with Java classes.

### 💀 Deadline
This work should be completed before the exercise, on **Friday 16th September**.

### 👩‍🏫 Instructions
For instructions on how to do and submit the assignment, please see the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation
Complete the reading and answer the questions in module 2 of OLI.
- Read [Looking Inside Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- If you haven't done so already visit [kth.oli.cmu.edu](https://kth.oli.cmu.edu/), sign up and register for the course with the course key `dd1337-ht22`.

> **Assistant's Note:** The OLI material and tasks might be slightly misaligned this year, so it is okay to read ahead if you did not find all the material.

### ✅ Learning Goals

This weeks learning goals include:
* Designing Java classes 🏗
* Adding instance fields 📝
* Adding a constructor method 🚧
* Creating *getters* and *setters* 🔑
* Printing to the terminal 🖨
* Using the `main` method 📚
* Scope (or *variable shadowing*) 👥

### 🚨 Troubleshooting Guide
Encountered an issue or need clarification? Follow these steps:

1. Check out this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Have other students encountered a similar problem?
2. If not, go ahead and post your question by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Remember to add a descriptive title, start it with "Task *x*: *summary of problem here*".
3. Ask a TA directly during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule to see when your next lab is scheduled.

We encourage you to discuss with your classmates but remember, **do not share answers**!

### 🏛 Assignment

Let's form a band! This assignment is to model a 'Band' in Java. Your task is to design a `Person` class where each `Person` is a member of the band, and has attributes, such as a name and a musical role in the band. The `Person` class should have the following attributes:

- `String` name
- `String` role
- `int` experience
- `boolean` isBandLeader

And these attributes will be manipulated using the OOP concepts you'll learn in this assignment.

#### Exercise 1.0 -- Fields
In the [`src`](src) folder, create a new class called `Person.java`. In Java, the attributes of real-world objects are modelled using [fields](https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html). The `Person` class should have the fields described above.

If done correctly, the main method provided in Example 1 should compile if added to `Person.java`.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  class Person {

    // Put your fields here!

    public static void main(String[] args) {
      // create a new "Person" object
      Person alice = new Person();

      // assign the instance variables to meaningful values
      alice.name = "Alice";
      alice.role = "Guitarist";
      alice.experience = 10;
      alice.isBandLeader = true;

      // get the information of the assigned values
      System.out.println("Name: " + alice.name);
      System.out.println("Role: " + alice.role);
      System.out.println("Experience value: " + alice.experience);
      System.out.println("Is band leader: " + alice.isBandLeader);
    } // end main method

  } // end class
  ```
</details>

#### Exercise 1.1 -- Getters and Setters
Avoid direct access to the state of your Person objects by setting the [access modifiers](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html) of the fields in the `Person` class to `private`. Then, use **accessors** and **mutators** (the so-called *getters* and *setters* methods) to read from and write to the fields. Implement these methods for all fields. The provided main method in Example 2 should compile if added to `Person.java`.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  class Person {

    // Put your fields here!

    // Put your getters and setters here!

    public static void main(String[] args) {
      // create a new "Person" object
      Person alice = new Person();

      // assign the instance variables to meaningful values
      alice.setName("Alice");
      alice.setRole("Guitarist");
      alice.setExperience(10);
      alice.setIsBandLeader(true);

      // get the information of the assigned values
      System.out.println("Name: " + alice.getName());
      System.out.println("Role: " + alice.getRole());
      System.out.println("Experience value: " + alice.getExperience());
      System.out.println("Is band leader: " + alice.getIsBandLeader());
    } // end main method

  } // end class
  ```
</details>

> **Assistant's Note:** The getters and setters of a field of `boolean` type follows a different naming convention from the usual `getXXX()` and `setXXX`: `isBandLeader()` and `setIsBandLeader()`.

#### Exercise 1.2 -- Constructor
Now, implement a constructor for your `Person` class as per the examples in the OLI material (or the [Official Oracle tutorial](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)). This constructor will allow you to add attributes to each object you create much more easily.

#### Exercise 1.3 -- `printInfo()`
Implement a method called `printInfo()` for printing all the info about the person to the terminal. This method should return `void`.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public static void main(String[] args){
    // create a new "Person" object
    Person alice = new Person("Alice", "Guitarist", 10, true);

    // print information
    alice.printInfo();
  }
  ```

  This code should output:

  ```
  > INFO
  > Name: Alice
  > Role: Guitarist
  > Experience: 10 years
  > Band Leader: true
  ```
</details>

#### Exercise 1.4 -- Practice!
Model a 'Band' class that encompasses multiple 'Person' objects (the band members). Implement functions like `addMember()`, `removeMember()`, and `changeLeader()`. 

#### Exercise 1.5 -- Scope (or Variable Shadowing)
Understand the concept of variable shadowing. Ensure you can explain how to fix the examples provided in the 'Scope (or Variable Shadowing)' section.

### 🐞 Bugs and errors?
Spot any errors or inconsistencies? Kindly open a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task *x* Error: *summary of error here*". Found bugs will be rewarded with special mentions in the acknowledgment section. Happy programming! 🎉