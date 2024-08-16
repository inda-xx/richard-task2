# Digital Duel: A Simple Game 🎮

For your new task in Java, you will design and implement a simple game application where you'll control a player and interact with enemies. You're expected to learn the ropes about object-oriented programming using Java.

### ⏳ Deadline
This task should be finished before the exercise, on **Tuesday 20th September**.

### 🧑‍🏫 Instructions
For the full details on how to carry out and submit the task, kindly refer to the [section on assignments](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments) of the course instruction manual. 

### 📝 Preparation
Read and provide responses to the questions in the OLI module for this week's material:
- [Taking a Peak Inside Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)

> **Assistant's Note:** The OLI assignments might differ slightly from what we've outlined, so feel free to get ahead of things if you don't find all the material immediately.

### ✅ Learning Goals

The learning goals for this week include:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Utilising the `main` method
* Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide
When faced with issues or uncertainties, follow this procedure:

1. Look through this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Are other students asking similar questions?
2. If not, create a new issue by clicking on [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new).
3. Next, find a TA at the [weekly lab](https://queue.csc.kth.se/Queue/INDA).

Remember, you're encouraged to engage in discussions with your peers. But please, **do not share answers**!

### 🏛 Assignment

You are required to create a simple game with Java where a player can move around and score points by interacting with enemies. The game will be console based and the complexity will depend on your creativity and expertise. 

#### Specification: 

Create 2 interrelated classes: `Player.java` and `Enemy.java`.

Follow the next steps:

#### Step 1: Player Class 🏃
Design a player class that includes the following:

The Player class should have the following instance fields:

* `String` name
* `int` points 
* `double` xPosition 
* `double` yPosition

Add a constructor method to the class. The constructor should have parameters for every field of the class and use these parameters to initialise the fields of a new player object.

Add *getters* and *setters* to all fields in the class.

#### Step 2: Enemy Class 👾
Design an enemy class that includes the following:

The Enemy class should have the following instance fields:

* `string` id
* `string` type
* `double` xPosition
* `double` yPosition

Add a constructor method to the class. The constructor should have parameters for every field of the class and use these parameters to initialise the fields of a new enemy object.

Add *getters* and *setters* to all fields in the class.

#### Step 3: Moving Player
Implement method `public void move(double x, double y)`, in the Player class which should update the xPosition and yPosition of the player using the x and y parameters it receives.

#### Step 4: Player Interactions with Enemies
In the Player class, create a method `public String attack(Enemy enemy)` which includes code to simulate the player attacking an enemy. The enemy's ID and type should be extracted by getter methods, and the method should return a String, such as "Player " + this.name + " attacked enemy " + enemy.getId() + ", type " + enemy.getType()+"."

#### Step 5: Scoring System
Establish a point scoring system related to player-enemy interaction. Add points to the player every time they attack an enemy.

#### Step 6: Main Method
Make use of the `main` method in your `Player` class to create instances of Player and Enemy classes, move the player and simulate player-enemy interaction with the attack method. 

#### Step 7: Variable Shadowing
Illustrate variable shadowing in your Game App by creating a field and local variable with the same name. Use the `this` keyword to rectify this problem and access the scope of the class instance field.

### 🐞 Bugs and errors?
Please open a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task *x* Error: *summary of error here*" if you notice any inconsistences or errors in this task. Bug identifiers will be rewarded with mentions in the acknowledgment section.