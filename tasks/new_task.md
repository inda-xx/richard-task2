# Code Clash: Battle of Pixels 🕹️

For this exercise of your Programming course, you will be practicing object-oriented programming in Java. You will interact with classes, instance fields, and constructors while working towards creating a simple game application.

### 📅 Deadline
Complete this assignment before **Friday, 16th October**.

### 👩‍🏫 Instructions
For detailed instructions on how to complete and submit the assignment, please visit the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📚 Preparation
You must finish the lessons and quizzes for Module 2.

- Read [Looking Inside Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- If you have not done so, go to https://kth.oli.cmu.edu/, sign up, and register for the course key `dd1337-ht22`

> **Assistant's Note:** The provided material and tasks might not be perfectly aligned, so it is recommended to read ahead if you did not find all the material.

### ✅ Learning Goals

After this week, you should be able to:
* Design Java classes 🏗️
* Add instance fields to classes 📝
* Create a constructor method 🟢
* Craft *getters* and *setters* 🔧
* Print output to the terminal 🖨️
* Execute a `main` method 🔄
* Understand Scope (or *variable shadowing*) 📏

### 🚨 Troubleshooting Guide
If you encounter any issues or have any queries, follow these steps:

1. Look at this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Are other students experiencing the same problem?
2. If not, post your question by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Add a descriptive title, starting with "Task *x*: *summary of problem here*"
3. Consult with a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Consult your schedule to determine the next lab.

We promote discussion with your peers, but remember, **do not share solutions**!

### 🏛 Assignment

You have been tasked with simulating an exciting pixel-based combat game, Code Clash. This game will entail pixel soldiers battling out with pixel enemies on a digital terrain. Your mission is to write a Java application that models this epic clash!

#### Exercise 1: The Soldier Class

Start off by creating a new Soldier class. Your soldier should have the following attributes:

- `String` name
- `int` health
- `int` strength
- `int` defense
- `boolean` alive

The `alive` attribute will represent whether the soldier is still alive in the game.

After creating your Soldier class, try instantiating a Soldier object and setting its attributes in the `main` function.

#### Exercise 2: Encapsulation with Getters and Setters

Now, you're going to encapsulate the attributes of the Soldier class. Make the attributes private and provide appropriate getter and setter methods for all attributes. 
After encapsulating your Soldier class, amend your code in the `main` function to use getters and setters.

#### Exercise 3: The Constructor 

Constructors allow us to simplify our work. Define a constructor for your Soldier class that accepts arguments for all attributes. Modify your code in the `main` function to use the constructor when creating Soldier objects.

#### Exercise 4: Display Information

Your soldiers are ready for battle, and it's time to print out their stats. Implement a method called `displayInfo()` that outputs to the console the name, health, strength, defense, and living status of a soldier.

#### Exercise 5: Battle system

Time for some action! Implement a `fight()` method in the Soldier class. The `fight()` method receives another Soldier object (the enemy) and inflicts damage on it based on the attacking Soldier's strength and the defending Soldier's defense. When the health of a soldier reaches 0 or below, the soldier is marked as not alive. 

#### Exercise 6: Variable Shadowing

Learn about variable shadowing by reading from reliable sources. Understand how the keyword 'this' works in Java. Try creating examples where variable shadowing happens, identify the issues, and fix them. This will not be graded, but it's a good practice to understand scope in Java.

### 🐞 Bugs and errors?

If you find inconsistencies or errors in this exercise, please open a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task *x* Error: *summary of error here*". Bug spotters will be rewarded with mentions in the acknowledgment section.