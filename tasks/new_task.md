# Game On Java!

It's time for our next exercise! In this exercise, we'll design a simple game application featuring moving players, scores, and enemy interactions in Java.

### ⏰ Deadline

Your completed work should be ready by **Sunday, 26th September**.

### 👩‍🏫 Instructions

To finish and submit this assignment, make sure to follow the guidelines given in the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation

To prepare for this task, familiarize yourself with Module 2's OLI material:

- Look through [Introduction to Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f9b585b0401f09bb3ca9649bd3b68b22)
- If you haven't done so already, sign up at https://kth.oli.cmu.edu/ and use the course key `dd1337-ht22` to register.

> **Assistant's Note:** The OLI material might not always align perfectly with the tasks, so consider reading ahead if you're unable to find everything you need.

### ✅ Learning Goals

During this assignment, you'll practice:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding and applying Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide

Experiencing issues? Follow this troubleshooting guide:

1. Check the week's [established issues](https://gits-15.sys.kth.se/inda-22/help/issues). Is anyone else encountering the same problem?
2. If not, create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with a descriptive title, starting with "Task *x*: *summary of problem here*".
3. Ask a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA) in person. Refer to your schedule to find the next available lab.

It's great to discuss things with your peers—but **don't share answers**!

### 🎮 Assignment

Welcome to the world of "Game On!", where you'll design a gaming application featuring player movement, live scores, and enemy interactions.

In this game, the player moves through different levels, gaining points along the way. However, enemies lurk in every corner, and interactions can either boost the player's score or end the game! 

Your mission, should you choose to accept it, is to model this game in Java.

#### Exercise 1: Design a `Player` Class 🎖️

In the `src` folder, create a class named `Player.java`. This class is the heart of our game. It should have:

- `String` playerName
- `int` playerScore
- `int` playerHealth
- `boolean` isAlive
 
####  Exercise 2: Add a `Constructor` method, `Getters` & `Setters` 💫

By using encapsulation principles, ensure that the fields in the `Player` class are set to private, and then create *getters* and *setters* methods.

Afterwards, create a constructor to initialize the player's attributes quickly.

#### Exercise 3: Create a `printStatus` Method 🖨️

We need a way to print the player's current details to the terminal. Create a `printStatus()` method that prints out the player's name, score, health, and alive status.

####  Exercise 4: Create `Enemy` Class 🦹

Create an `Enemy` class with mentionable attributes like enemyType and enemyStrength. Create a constructor, getters, and setters.

#### Exercise 5: Player Encounters Enemy Interaction 🤺

Create a method `encounterEnemy()` in the `Player` class, which takes an `Enemy` object as an argument. When the player encounters an enemy, there's a 50% chance of losing and getting knocked out, or winning and gaining points adding to the player's score. 

#### Exercise 6: Handling Scope and Shadowing 🌑

Ensure that your code doesn't contain any variable shadowing. If you're unsure about what this means, investigate variable shadowing and the use of 'this' in Java.

### 🕷️ Bugs and Errors?

If you notice any mistakes or inconsistencies in this exercise, kindly open a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task *x* Error: *summary of error here*". Accurate bug reports will be acknowledged in the acknowledgment section. Happy coding, and Game On!