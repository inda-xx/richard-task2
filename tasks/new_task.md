# Java: Let the Games Begin!

For this exercise of INDA, you are going to immerse yourself in the basics of game development. We are going to simulate a basic gaming scenario in Java!

### ⏳ Deadline
This task should be accomplished before **Friday 7th October**.

### 📚 Instructions
You could refer to the [guidelines section of the course instructions](https://gits-15.sys.kth.se/inda-22/game-instructions#course-work) for instructions on how to accomplish and upload the task.

### 📖 Preparation
You must read and answer the questions in the OLI material for Module 2.

- Study [Understanding Class Structures](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- If you have not done so yet, visit https://kth.oli.cmu.edu/, signup and register for the course key `dd1337-ht22`

> **Assistant's Note:** The OLI material might not be exactly identical to the task this year, so it's alright to skim through the essential content.

### 🎯 Learning Goals

Aim to achieve the following learning goals:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding Scope (or *variable shadowing*)

### 👩‍🔧 Troubleshooting Guide
If you come across any queries or technical difficulties, follow the steps below:

1. Look at this week's [existing issues](https://gits-15.sys.kth.se/inda-22/course-issues). Can you find your problem discussed by other students?
2. If not, create a [New Issue](https://gits-15.sys.kth.se/inda-22/course-issues/new). Provide a descriptive title, starting with "Exercise *number*: *outline of issue*"
3. Consult a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Refer to your schedule to know when the next lab session is.

Discuss your exercise with your course-mates but **refrain from sharing answers**!

### 🎮 Assignment

Your task is to develop the foundation of a straightforward game application in Java. It will include a player and an enemy. Both will have basic attributes and actions that they can perform.

#### Exercise 3.0 -- Construct the Player

In the [`src`](src) folder, start off by creating a new class called `Player.java`. This class should have the following attributes:

- `String` name
- `int` score
- `int` healthPOINTS
- `boolean` isAlive

Now add a `main` method to the class and initialize an instance of the `Player` class. Create two methods named `checkScore()` and `checkHealth()` which will print the player's current score and health respectively.

#### Exercise 3.1 -- Adding Getters and Setters

Ensure your `Player` class attributes can't be directly accessed by applying the `private` access modifier. However, we still want to interact with the attributes:

- For reading the attribute - implement *getters* or accessor methods.
- For modifying the attribute - implement *setters* or mutator methods.

Implement a total of eight *getters* and *setters* for all four attributes. In the `main` method, initialize the instance using these methods and verify your solution's effectiveness.

#### Exercise 3.2 -- Adding a Constructor

Setting each attribute for every instance of the `Player` class can be inefficient. Incorporate a *constructor* method to your `Player` class, which accepts necessary parameters to initialize an instance all at once.

Once the *constructor* method is functioning as expected, refactor your `main` method's initialization instance process.

#### Exercise 3.3 -- Adding Action Methods

Incorporate three methods, `move()`, `jump()`, and `attack()`. Each method should print a statement when it is called.

#### Exercise 3.4 -- Create the Enemy

Now, let's create an adversary for our player.

In the [`src`](src) folder, create a class called `Enemy.java`. This class will have similar attributes and methods as the `Player` class, but with the following differences:

- Instead of a `score` attribute, it should have a `String` attribute called `type`. 
- Instead of the `isAlive` attribute, use `boolean isDefeated`

Implement *getters*, *setters*, and a *constructor* method just like you did in the `Player` class. 

#### Exercise 3.5 -- Implement Interactions

Lastly, create two methods - `playerAttack()` and `enemyAttack()`. Both methods will take an object of the opposite class as a parameter and simulate an attack.

Adjust the `healthPOINTS` of the attacked party and set the `isAlive` or `isDefeated` boolean accordingly.

#### Exercise 3.6 -- Understanding Scope

In the context of this exercise, explore the topic of 'Scope' with respect to member variables and local variables.

Can you discern a situation in your current game implementation that could be optimized by understanding and applying the concept of 'Variable Shadowing' or 'Scope'? Discuss this in class. 

### 🐛 Bugs and Errors

If you stumble upon any discrepencies or faults in this task, please raise a [New Issue](https://gits-15.sys.kth.se/inda-22/course-issues/new) with the heading "Task *x* Error: *Summary of the error*". Those who find bugs will be acknowledged in the assignment report.