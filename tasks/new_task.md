# Battle Beasts: The Java Quest! 🐾🔥

In this exciting assignment of INDA, you're going to simulate a Game App by creating Java objects for gaming components. Buckle up to encounter the cutting-edge principles of Object-Oriented Programming (OOP).

### 💀 Deadline
This work should be accomplished before the exercise GHC Lab **4P, Tuesday 27th September**.

### 👩‍🏫 Instructions
For instructions on how to do and submit the assignment, please check out the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments). 

### 📝 Preparation
You should complete the following tasks in the OLI material prior to diving into the assignment:

- Read [The Structure of a Java Class](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f8e5ca808ac1f088812f2a8ce315bac60)
- Complete the Registration process on `https://kth.oli.cmu.edu/`, using our course key `dd1337-ht22`

> **Assistant's Note:** The OLI material and tasks might be slightly off-track for the current year. If you don't find all the material directly related, feel free to skip through or read ahead.

### ✅ Learning Goals

The learning goals for this assignment are as follows:
* Designing Java Classes
* Adding Instance Fields
* Adding Constructor methods
* Creating *getters* and *setters*
* Printing to the Terminal
* Using the `main` method
* Understanding Scope (or *Variable Shadowing*)

### 🚨 Troubleshooting Guide
In case of pressing questions or issues, follow this procedure:

1. Refer to this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). You might find someone who has the same issue.
2. If not, start a new query yourself, by raising a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Make sure to provide an expressive title, and always start with "Task *x*: *Brief of your issue*"
3. Seek guidance from a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Keep track of your schedule for the next lab timing.

Feel free to connect with other students in the course, but **please refrain from sharing answers**!

### 🏛 Assignment

You're about to enter a fictional gaming world where Battle Beasts are the epic heroes! With distinct player rankings and enemy interactions, the game has gained popularity in the Royal Institute of Technology. Your task is to extract these collections into a tempting Java Model! The *[modern technology](https://huggingface.co/spaces/dalle-mini/dalle-mini)* has helped us with an image to visualize:

<img src="images/dallemini-battlebeasts.png" width="800">

#### Exercise 1.0 -- Fields
In the [`src`](src) folder, create a new class called `BattleBeast.java`. Model all the properties of the Battle Beasts using [fields](https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html). Refer to the given main method for the correct names and types for these fields.


#### Exercise 1.1 -- Getters and Setters
Your next task is to implement **accessors** and **mutators**; the so-called *getters* and *setters* for all fields. All fields must be accompanied with these, in total ten methods!


#### Exercise 1.2 -- Constructor
Move on to implement a *constructor* for the BattleBeast class. This will enable you to instantiate objects with meaningful values. Test your implementation by again referring to the main method.


#### Exercise 1.3 -- `printInfo()`
For a fast and complete display of current game objects' details, implement a method named `printInfo()`. This should print all information to the Terminal.


#### Exercise 1.4 -- BattleBeast, Fight!
The action-packed Battle Beasts Game revolves around fierce fights between multiple beasts. Update your model to incorporate this aspect. You need to define an `attack` method that takes a BattleBeast object (the enemy) as an argument and computes damage following a formula. 

Refer to the provided main method to see how it's integrated.

#### Exercise 1.5 -- Variable Shadowing
In this final exercise, you need to identify and fix an issue of *Variable Shadowing* in the provided examples. Understand the local and global scopes for variables and correct any possible shadowing effects.

### 🐞 Bugs and errors?
If you encounter any problems with the task, please open a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task *x* Error: *summary of error here*". Bug finders will be credited in the acknowledgment section.