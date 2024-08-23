# Epic Battle of the Bots 🤖🔥

For this exercise, you are going to improve your Java skills by creating a simple game application. You will learn more about Java classes, instance fields, constructors, getters and setters, and more.

### 💀 Deadline
You are expected to complete this task by **Friday 6th September**.

### 👩‍🏫 Instructions
For guidance on how to accomplish and submit this assignment, please follow the link to our [assignments instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation
You are required to read and answer the questions in the OLI material for Module 2.

- Read through [Looking Inside Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- If you haven't yet, head over to https://kth.oli.cmu.edu/, sign up and register for the course key `dd1337-ht22`

> **Assistant's Note:** Even if the OLI material and tasks may seem somewhat unrelated this year, it's okay to read in advance if you can't find all the materials.

### ✅ Learning Goals

The learning goals for this week include:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide
If you encounter any issues, please follow these steps:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). See if other students are discussing your concern.
2. If not, post your question by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Include a descriptive title, beginning with "Task *x*: *summary of problem here*"
3. Get assistance from a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Refer to your schedule for time and date.

Even though discussion among peers is encouraged, **do not share answers**!

### 🏛 Assignment

Imagine two advanced battle robots are about to duel in an epic showdown! Your task is to create a simple game app in Java to simulate this encounter. Using your creativity, let us bring these war machines to life!

#### Exercise 2.0 -- Fields
Create a new class named `Robot.java` within the [`src`](src) folder. The `Robot` class should have the following fields:

- `String` name
- `int` health
- `int` attackPower
- `int` defense
- `boolean` isDisabled

After completing these steps, add the Example 1 main method to the `Robot.java` class. If everything is appropriately done, the code will compile.

#### Exercise 2.1 -- Getters and Setters
We want to prevent direct access to the robot's state – a principle in object-oriented programming known as [encapsulation](https://en.wikipedia.org/wiki/Encapsulation_(computer_programming)). Set the [access modifiers](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html) of the Robot class fields to `private`. Make sure you also create **accessor** and **mutator** methods (getters and setters) for all fields.

After making these changes, add the Example 2 main method to your `Robot.java` file. It should compile if everything is set correctly.

#### Exercise 2.2 -- Constructor
Use a constructor to repeat Example 2, this will make your code less tedious.

#### Exercise 2.3 -- `printStatus()`
Develop a method called `printStatus()`, which prints the current information about the robot to the console. The method should return `void`.

#### Exercise 2.4 -- Robot, Fight!
Now, let's make the robots fight! Create an `attack` method in your `Robot` class. The method should receive another Robot object (the opponent). The damage inflicted on the opponent should be calculated using the formula attached in the Exercise 2.4 example. 

The method should print the status after the attack.

#### Exercise 2.5 -- Variable Shadowing
Review the *Variable shadowing*-examples below. Be prepared to explain how to fix these examples in class, as you might be asked to do so.

### 🐞 Bugs and errors?
If any errors or inconsistencies are found in this exercise, please create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task *x* Error: *summary of error here*". Contributors who spot bugs will receive acknowledgment.