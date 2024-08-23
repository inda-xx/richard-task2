# Code the Cosmos! 🚀

For this assignment, you will be diving into the cosmic universe of classes and objects in Java. You will be creating a `Planet` class.

### 🗓 Deadline
This assignment should be completed before Monday, 19th September.

### 💼 Instructions
For a step-by-step guide on how to undertake and submit the assignment, follow the link to the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📖 Preparation
Ensure you have finished the OLI material for Module 2, and make sure you can answer everything.

- Review the topic [Understanding Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f6fd6485a8fe02482719ee1f07d5860e)
- If you haven't already, register on https://kth.oli.cmu.edu/, signup and use the course key `dd1337-ht22`

> **Assistant's Note:** Though the OLI material and tasks might not exactly align, it’s okay to read ahead if you find something new.

### 📚 Learning Goals

This week's learning goals include:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Crafting getters and setters
* Printing to the terminal
* Using the `main` method
* Understanding scope (or variable shadowing)

### 🎯 Troubleshooting Guide
Follow this procedure for help:

1. Take a look at this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Someone might have asked your question already!
2. If not, post a question yourself by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Add a descriptive title, beginning with "Task x: summary of problem here".
3. Ask a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule for the next lab.

You can discuss with your peers, but **don't share answers**!

### 🪐 Assignment

Your task is to model celestial bodies, or more simply, 'Planets', in Java. Each `Planet` instance should represent its own unique planet, with its own characteristics.

#### Exercise 1.0 -- Fields
In the [`src`](src) folder, create a new class named `Planet.java`. Use [fields](https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html) to model the attributes of a planet. The `Planet` class should have these fields:

- `String` name
- `double` mass (in kilograms)
- `double` radius (in kilometers)
- `boolean` inhabited

#### Exercise 1.1 -- Constructor
In the `Planet` class, define a constructor to initialize all the fields. Ensure that the constructor accepts appropriate arguments to initialize all instance fields. 

#### Exercise 1.2 -- Getters and Setters
Add getters and setters for each field in the `Planet` class. Remember to use the appropriate return types for the getter methods.

#### Exercise 1.3 -- `printPlanetDetails()`
Define a method named `printPlanetDetails()`, which prints details of a planet to the console. The method should print the name, mass, radius, and whether the planet is inhabited or not.

#### Exercise 1.4 -- `calculateGravity()`
Define a method called `calculateGravity()` which calculates the gravity of the planet based on its mass and radius. The formula to calculate gravity is:

Gravity = (G * mass) / (radius ^ 2)

Here, G is the gravitational constant, approximately equal to 6.674 × 10^-11. Have this method return the calculated gravity value. Make sure to test the method with some sample planets!

#### Exercise 1.5 -- Variable Shadowing
Shadowing is a topic to be aware of when working with classes. It occurs when a variable in a scope has the same name as a variable in an outer scope, and can cause confusion if not handled properly. In your `Planet` class, add a method named `shadowedMethod().`

In this method, declare a local variable that has the same name as one of your instance variables, and assign it a different value. Now, within this method, try printing out both variable's values. Remember to use the `this` keyword!

### 💼 Additional Exercises (Optional)

#### Exercise 2.1 -- `compareGravity(Planet p)`
Create a method `compareGravity(Planet p)` which receives an instance of `Planet`, calculates the difference between the current Planet's gravity and the received planet's gravity, and prints a message comparing them.

#### Exercise 2.2 -- `isHabitable()`
Provide an implementation for a method named `isHabitable()` in the `Planet` class. This method should return `true` if the planet is suitable for life in some way and `false` otherwise. The condition to determine this? Well, leave this up for your creative interpretation!  

#### Exercise 2.3 -- Scope Practice
Modify the `printPlanetDetails()` method. Add a new local variable that shadows one of the instance fields and try using both in this method.

### 🐞 Bugs and errors?
Report any errors or inconsistencies in this assignment by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) titled "Task x Error: summary of error here". Your timely reports will be duly acknowledged in the acknowledgment section.