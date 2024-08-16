# Let's Build A Game: Simple Shadows!

Congratulations! You've been chosen to create a game for INDA! The game will involve a player, their score, and various enemies. More features can be added in future versions.

### ⏰ Deadline
This task should be completed before the exercise on **Tuesday, 20th September**.

### 👩‍🏫 Instructions
For instructions on how to do and submit the assignment, please see the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📚 Preparation
Before starting the task, ensure you've read and answered the questions on the OLI material for Module 3.
- Read [Looking Inside Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- Sign up at https://kth.oli.cmu.edu/ if you haven't done so already, and register for the course key `dd1337-ht22`

> 📌 **Note:** The OLI material and tasks might be slightly different, so it is suggested to read ahead if you did not find all the information.

### 💡 Learning Goals
The primary learning goals for this task are:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Implementing *getters* and *setters*
* Printing information to the terminal
* Using the `main` method
* Understanding Scope (or *variable shadowing*)

###  🛠 If You Run Into Problems
Refer to the following guide if you encounter issues:
1. Check the [posted issues this week](https://gits-15.sys.kth.se/inda-22/help/issues). Maybe other students have faced your problem?
2. If not, open a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with a descriptive title starting with "Task *x*: *summary of the problem*".
3. Seek help from a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA) (see your schedule for the next lab timing).

While discussing with classmates is encouraged, **do not share answers**!

### 🕹 Assignment
The task at hand involves creating a simple game called "Simple Shadows" in Java. Your game should comprise the following components:
1. A `Player` class.
2. A `Score` class.
3. An `Enemy` class.

Make sure that each class has relevant fields, getters, setters, and a constructor method. You may add additional methods if required.

#### Exercise 3.1 -- The Player Class

The `Player` class should include the following fields:
- `String` name
- `int` health
- `int` positionX
- `int` positionY

Construct relevant getters, setters, and a constructor for `Player` class. Make sure the health value of a player cannot be negative.

#### Exercise 3.2 -- The Enemy Class

The `Enemy` class should have these fields:
- `String` type
- `int` positionX
- `int` positionY
- `boolean` isAlive

Generate appropriate getters, setters, and a constructor method for the `Enemy` class. Make sure the enemy can only be positioned within the game boundaries.

#### Exercise 3.3 -- The Score Class

The `Score` class should comprise:
- `int` points
- `Player` player

Create setters, getters, and a constructor. Implement a method to increment the points when an enemy is defeated.

#### Exercise 3.4 -- Printing the Status
Implement a `printStatus()` method in each class to print all field values to the console. 

#### Exercise 3.5 -- Variable Shadowing
Take a few moments to answer the following questions:

1. What is 'variable shadowing' in Java and how can it cause problems in your code?
2. How can you avoid variable shadowing?

> 📌 **Note:** You may find the term 'this' in Java.
   
#### Exercise 3.6 -- The Main Method
Implement a `main()` method, where you create a `Player` object, multiple `Enemy` objects, and a `Score` object. Invoke the `printStatus()` method on each object.   

Storyboard your entire game flow in comments in your `main()` function. This includes how the player moves, earns points, and interacts with enemies.

### 🐛 Found Any Bugs?
If you find any errors or have suggestions for this exercise, kindly open a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task *x* Error: *summary of the bug here*". You will be acknowledged for your significant contributions!