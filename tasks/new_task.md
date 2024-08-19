# Build your Space Squadron: Blast the Alien Invaders! 🚀👽

For this activity in your Programming class, you will design and construct a simplified game application in Java. Players will dodge meteors and engage in cosmic encounters with alien spaceships!

### 📅 Deadline
This assignment is due **Friday 16th September**.

### 👩‍🏫 Instructions
Instructions for completing and submitting the assignment can be found [here](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📚 Preparation
You must read and answer the questions in the OLI material for Module 2.

- Read [Looking Inside Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- If you haven't done so yet, go to https://kth.oli.cmu.edu/, sign up and register for the course key `dd1337-ht22`

### ✅ Learning Goals
The goals for this task include:
* Design of Java classes
* Addition of instance fields
* Addition of a constructor method
* Creation of *getters* and *setters*
* Writing to the terminal
* Usage of the `main` method
* Scope (or *variable shadowing*)

### 🚀 Assignment
In the heights of the cosmos, your mission is to put together a squadron of spaceships to push back against alien invaders. This will involve the design of Java classes to represent the Space Squadron and Alien Invaders currently occupying space around modern-day Earth. 

#### Exercise 1.0 -- Spaceship Class
Create a new class called `Spaceship.java` in the `src` folder. This class will model attributes of a spaceship. It should have:

- `String` spaceshipID
- `int` health (base HP for a spaceship is **100**)
- `int` attackDamage
- `boolean` isDestroyed

Implement `getters` and `setters` for these instance fields. Test your implementation by adding an instance of your Spaceship class to your `main` method and print the instance variables to the terminal.

#### Exercise 2.0 -- Alien Class
Create a new class called `Alien.java`. It should have:

- `String` alienID
- `int` health (base HP for an alien invader is **50**)
- `boolean` isDestroyed

Add `getters` and `setters` and test your class in a similar way to the Spaceship class.

#### Exercise 3.0 -- Combat System
Implement a method called `attack` in the Spaceship class. The `attack` method will deduct the `attackDamage` of the spaceship from the `health` of the Alien. Implement similar functionality in the Alien class.

If an Alien or Spaceship's `health` reaches 0, update the `isDestroyed` field for that object.

#### Exercise 4.0 - Scoring System
Add a class `Score.java` with `int` spaceshipScore and `int` alienScore. Every time a spaceship succeeds in attacking an alien, the spaceship score increases. The same happens for the alien side. Implement `getters` and `setters` for these two fields.

#### Exercise 5.0 - Extensive Use of Getters, Setters, and Constructors
In this exercise, reflect on the `getters` and `setters` you created. Are there any places where you could replace direct field access with a getter or setter? Are there places where a constructor could simplify your code?

#### Exercise 6.0 -- Variable Shadowing
When two variables of different scopes have the same name, the most local instance shadows the other. Inspect your code for occurrences of variable shadowing and correct them. 

This assignment offers a good balance of structure and creativity, so feel free to add more attributes and methods to your classes as you see fit. Most importantly, have fun and let your imagination run wild!

### 🐞 Bugs and errors?
If you find any errors in this assignment, please open an [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task *x* Error: *summary of error here*".