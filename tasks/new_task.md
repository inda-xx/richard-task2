# Game on the Console! 🎮

In this next task of your course, you will practice designing basic game objects using Java. This task is perfect for you to familiarize yourself with object-oriented programming, particularly the concept of classes and objects.

### ☠️ Deadline
You have until **Friday 30th September** to finish this assignment. No extensions will be given.

### 👩‍🏫 Instructions
For a complete guide on how to complete and submit the assignment, kindly refer to the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation
Before starting, make sure to complete this reading assignment:

- Study [Writing Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- If you haven't performed the appropriate registration, proceed to https://kth.oli.cmu.edu/ and sign up using the course key `dwa123-ht22`.

> **Assistant's Note:** It's perfectly okay if the OLI material doesn't directly correspond to this week's task, proceed to study the chapters ahead if needed.

### ✅ Learning Goals

This task will help you achieve the following learning objectives:

* Designing Java classes 📐
* Adding instance fields 🔍
* Adding a constructor method 🏗️
* Creating *getters* and *setters* 🔄
* Printing to the terminal 🖨️
* Using the `main` method ✔️
* Understand the concept of Scope (or *variable shadowing*)  🕳️

### ❗What to do when you encounter issues?

Follow these steps:

1. Go to the [posted issues section](https://gits-15.sys.kth.se/inda-22/help/issues) of this week. Maybe some students also face similar problems?
2. If no one has reported the problem you are facing, post a new question by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Add a descriptive title, such as "Task *x*: *summary of problem here*".
3. Come and ask your TA in the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule for the next lab session.

Make sure to discuss with your friends in the course, but remember not to share answers!

### 🚀 Get Started!

You are expected to create a simple game that runs in the terminal. In this game, you will make a `Player` class that can move around in a 2D space, accumulate scores, and interact with `Enemy` objects.

#### Exercise 1.0 -- Player Class
For the first exercise, create a new class named `Player.java`. The `Player` class should comprise of the following [fields](https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html):

- `String` playerName
- `int` score
- `int` x-position
- `int` y-position

Then add the getters and setters for these fields.

#### Exercise 1.1 -- Player Movement
Your `Player` should be able to move around on a 2D grid. This grid will have a width `x` and a height `y`, with (0,0) being the bottom left point of the grid.

So, add two methods `moveX(int distance)` and `moveY(int distance)` in your `Player` class to change the player's coordinate. The `distance` parameter specifies the distance to move; it can be positive (move right or up) or negative (move left or down).

However, if the player attempts to move outside the grid boundaries, the player`s position should not change and it should print a warning message to the console.

#### Exercise 1.2 -- Enemy Class
Next, create an `Enemy` class with the same fields as `Player`: `name`, `x-position`, `y-position`.

Add the getters and setters for these fields. 

#### Exercise 1.3 -- Game Interaction
To simulate an interaction in the game, add a method `checkCollision(Player player)`. This method should check if the enemy's x and y position is the same as the player's. If it indeed is, print a message to the console saying the player has been spotted by the enemy.

If a collision is detected, the player's score should be decreased, again by using the `setScore()` method.

#### Exercise 1.4 -- Scope
To understand the concept of Scope, create a situation where variable shadowing occurs. Then explain why it happens and how you would solve it.

### 🐞 Found A Bug?
If you find any errors or inconsistencies in this task, report it by creating [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task *x* Error: *summary of error here*". Recognized issues will earn acknowledgement in the acknowledgment section.