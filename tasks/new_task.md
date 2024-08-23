# Ace the Space! 🚀

In this assignment for JProg, you are going to practice object-oriented programming using Java by building a simple game. You will create classes and implement methods to model a fun space-themed game.

### 🗓️ Due Date 
This assignment should be completed by **Monday, 12th December**.

### 👩‍🏫 Instructions
You can find instructions on how to approach and submit your work in the [assignment section of the course portal](https://jprog.kth.se/assignments#ace-space).

### 📚 Preparation
Before starting, it's recommended to read and answer the questions in the W3Schools tutorial for Java OOP.

- Read [Java OOP](https://www.w3schools.com/java/java_oop.asp)

### ✅ Learning Goals
By completing this assignment, you will achieve the following learning goals:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding of Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide
Having problems? Here's what to do:

1. Check the [posted issues](https://jprog.kth.se/help/issues) to see if any other students are facing the same issue.
2. If not found, post a question yourself by creating a [New Issue](https://jprog.kth.se/help/issues/new) and summarize the problem in the title.
3. Consult a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/JProg). Check your timetable for the next session.

It's encouraged to discuss and collaborate with your coursemates but remember **not to share solutions!**

### 🕹️ Assignment

Your game, called "Ace the Space", features a rocket that flies in space evading asteroids and scoring points. Your rocket and asteroids will be modeled in Java!

#### Exercise 1 - Rocket Class 🚀

Create a new class called `Rocket.java`. Your Rocket should have these attributes:

- `String` name
- `float` speed
- `int` score
- `boolean` crashed

#### Exercise 2 - Getters and Setters 🛠️

Prevent direct access of Rocket's state by setting field access modifiers to `private`. Then add getters and setters for each field. 

#### Exercise 3 - Rocket Constructor 🏗️

Implement a constructor in `Rocket.java` that sets name, speed, score, and crashed status of the rocket when a new rocket object is created. 

#### Exercise 4 - Asteroid Class ☄️

Next, you need to model the asteroids. Create a new class called `Asteroid.java`. Your Asteroid should have these attributes:

- `String` asteroidType
- `float` speed

Create all necessary getters, setters and a constructor for creating an Asteroid object.

#### Exercise 5 - Collision Function 🔥

Now, model a collision between the rocket and an asteroid. Add a method named `collideWith` in Rocket class that checks if the rocket has collided with the asteroid. If rocket's speed is greater than or equal to that of the asteroid, the rocket survives and gains 10 points, else it crashes. Remember to update rocket's score and crashed status accordingly.

#### Exercise 6 - Print Stats Function 📊

Implement a method named `printStats` in Rocket class. This method prints all info about the rocket to the console.

#### Exercise 7 - Main Method 🎮

Finally, create a main method to run your game. Inside the main method, create a rocket and a few asteroids. Let them interact and print the game results to the console. 

#### Exercise 8 - Understand Scope 🎯

Create a separate Java file named "ScopeExample.java" and replicate the given examples of Variable Shadowing to understand them better. Experiment by fixing them and observe the outcomes.

### 🐞 Bugs and Errors
In case you find mistakes in this description or the code examples, please report them as a [New Issue](https://jprog.kth.se/help/issues/new) and mention "Ace the Space: *error summary*" in the title. Your involvement in debugging will be much appreciated.