# Game On!

JAva Venture for Extraordinary Recruits (J.A.V.E.R.). In this task, you will expand your skills in creating classes and manipulating data in Java through building a simple game application.

### ⏳ Deadline
This work should be completed before the exercise, on **Friday 9th November**.

### 👩‍🏫 Instructions
For instructions on how to do and submit the assignment, please see the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation
Read the provided OLI material for Module 3:

- Read [Scope Visibility and Lifetime of Variables](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=bd0a5970ac1f088812f2a8ce315bac60)

- If you have not done so, goto https://kth.oli.cmu.edu/, signup and register for the course key `dd1337-ht22`

### ✅ Learning Goals
By the end of this task, you should be able to understand:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### 🆘 Troubleshooting Guide
Facing any troubles? Follow these steps:

1. Look at the weekly [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Someone might've asked the same question.
2. If you are still unaided, post a question yourself by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Begin the title with "Task *x*: *Summary of your problem*".
3. You can also consult the TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Always check your schedule for the next lab.

Please follow academic integrity while discussing with your peers, **do not share answers**!

### 🏛 Assignment

Your mission is to create a small-scale game application in Java. 

#### Exercise 1 - The Player 🚶

In the [`src`](src) folder, create a new class named `Player.java`. This class should contain the following fields:

- `String` name
- `int` score
- `double` xPosition
- `double` yPosition

During this exercise, remember to include the following in your progress: instance fields, a proper constructor, and appropriate getters and setters. 

#### Exercise 2 - The Enemy 👾

Design a class named `Enemy.java`. This class should have attributes such as `String` enemyType, `double` speed, `double` xPosition, and `double` yPosition. Again, remember to include instance fields, a proper constructor, and getters and setters.

#### Exercise 3 - Player's Movements 🏃

In the Player class, include methods that move the player by updating the `xPosition` and `yPosition` instance fields. The player can move up, down, right, and left. Remember to encapsulate your data properly.

#### Exercise 4 - Scoring System 🎯

In the Player class, add a method that allows the player to earn points. This method should update the `score` instance field.

#### Exercise 5 - Enemy Interactions 🎭

Implement interactions between the player and the enemy. If the enemy comes too close or if the enemy hits the player, the player should lose some score points.

#### Exercise 6 - Show Game Status 🖥️

Create a method that prints the current status of the game to the terminal, including the player's name, score, and position, along with the enemy's type and position. 

#### Exercise 7 - Manage the Scope 🧭

Throughout the above exercises, explore *variable shadowing* and show how `this` keyword can be used to distinguish between class fields and local variables within the methods.

### 🐞 Bugs?
If you encounter errors, please open a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task *x* Error: *summary of error here*". Reported bugs will be celebrated for their contribution to the course.