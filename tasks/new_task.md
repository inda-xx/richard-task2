# Java Chronicles: The Quest of the Galactic Explorer 🚀

For this programming task, you will be designing Java classes to model a Galactic Explorer. You will experience how to define classes in Java and understand the relationship between an object's attributes and its behavior.

### 💀 Deadline
Please submit this exercise, by **Monday, 30th May**.

### 👩‍🏫 Instructions
The steps to complete the assignment and how to submit the work can be found in the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation
You need to read and answer the questions in the Course Material for Module 2. 

- Read: [Defining a Class](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a943ac1f088812f89ce315bac60)
- Don't forget to sign up and register for the course key `dd1341-ht23` at https://kth.oli.cmu.edu/

> **Assistant's Note:** If the course material doesn't quite align with the task, don't hesitate to read ahead.

### ✅ Learning Goals

Following are the learning goals for this task:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding scope (or *variable shadowing*)

### 🚧 Troubleshooting Guide
If you encounter any questions or problems, follow these steps:

1. Check the issues area [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Are other students having the same problem?
2. If not, post your query by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Ensure to use a descriptive title starting with "Task *x*: *summary of problem here*".
3. Speak directly to a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Review your course schedule to know the next lab session.

Feel free to discuss with your course friends, but **refrain from sharing answers**!


### 🌠 Assignment

You are to design a `GalacticExplorer` class for your expedition in the endless galaxies 🌌. The attributes of GalacticExplorer are:

- `String` name
- `int` fuelLevel
- `int` exploredPlanets
- `boolean` isAlive

Start by creating an empty `GalacticExplorer.java` class in your `src` folder with the above instance fields 

### Tasks
#### Task 1 - Instance and Getters and Setters methods
After declaring your instance fields, you should now create *getters* and *setters* methods for each field. Your field declarations should look something like this:

```Java
public class GalacticExplorer{

    private String name;
    private int fuelLevel;
    private int exploredPlanets;
    private boolean isAlive;

    //getters and setters here

}
```
#### Task 2 - Constructor
Now, create a constructor method for `GalacticExplorer` that takes in some initial values and uses those values to initialize `name`, `fuelLevel`, `exploredPlanets` and `isAlive`. The constructor should look something like this:

```Java
public GalacticExplorer(String name, int fuelLevel, int exploredPlanets){
    this.name = name;
    this.fuelLevel = fuelLevel;
    this.exploredPlanets = exploredPlanets;
    this.isAlive = true;
}
```

#### Tasks 3 - Behaviours
Add `fly()` and `explore()` behaviours/methods to the `GalacticExplorer` class.
- The `fly()` method should decrease the fuel level by 50 units each time it's called and print the remaining fuel level. If fuel drops to zero or below, set `isAlive` to false.
- The `explore()` method should increment `exploredPlanets` by 1 each time it's called.

#### Task 4 - Print Info
Provide another method `printInfo()` that will print out the `GalacticExplorer`'s details (name, fuelLevel, exploredPlanets, and isAlive) to the console in a well-formatted manner.

### Remember

- Always use your getters and setters instead of accessing the instance variables directly.
- Keep your instance variables private and provide public getters and setters to access them.

Congratulations! After finishing this task, you should have a good understanding of how to define a class in Java including its attributes, constructor, and behaviours.