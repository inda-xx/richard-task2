# Code Quest: The Legend of JavaLandia! 🎮
In the third exercise of INDA, you are delving into the world of Java game development! Let's build simple game fundamentals in Java.

### 📅 Deadline
This work should be completed before **Friday 23rd September**.

### 📚 Instructions
For steps on how to do and submit the assignment, please see the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation
You should complete the following before starting the assignment:

- Read [How to design classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f3e5a808ac1f088812f2a8ce315b8754)
- If you have not done so, go to https://kth.oli.cmu.edu/, signup and register for the course key `dd1337-ht22`
- Familiarize yourself with Java game development basics.

### ✅ Learning Goals

This week's learning goals include:
* Designing Java classes 🏗️
* Adding instance fields 📦
* Adding a constructor method 🚧
* Creating *getters* and *setters* 🔧🔩
* Printing to the terminal 🖨️
* Using the `main` method 🖥️
* Scope (or *variable shadowing*) 🕵️‍♀️

### 🔨 Assignment

You're tasked with creating an adventure game set in JavaLandia. Hastily, three main components have been identified as necessary to start your quest: `Player.java`, `Enemy.java`, and `Score.java`. 

#### Exercise 3.1 -- The Adventurous Player
In the `Player.java` class, create the player attributes using `private` instance fields:

- `String` playerName
- `int` playerHealth
- `int` playerAttack
- `int` playerDefense
- `boolean` playerAlive

All fields must have *getters* and *setters*. Create a constructor for `Player.java` class, and then instantiate `Player` in `main` method. Test the constructor and *getters* by printing field values to the terminal.

#### Exercise 3.2 -- The Ferocious Enemy
In `Enemy.java` create enemy attributes similar to the player, but do not include `playerName`. Instead add `enemyId` as `int`. 
Create a `main` method and follow Exercise 3.1 steps for instantiation and testing.

#### Exercise 3.3 -- Scoring System
In `Score.java` class, characterize the score using the following `private` instance fields:

- `int` playerId
- `int` enemiesDefeated
- `int` totalScore

Create *getters* and *setters*, a constructor, instantiate `Score` in `main` method, and test it out like before.

#### Exercise 3.4 -- Battle Royale: Player vs. Enemy
Back in `Player.java`, create a `void` method called `battle` that receives an `Enemy` object. 

This method should simulate a battle between the player and the enemy using a simple damage formula: `damage = playerAttack - enemyDefense` (if the result is less than 0, consider it as 0).

Decrease the `Enemy` object's health by `damage`. If `enemyHealth` becomes 0 or less, set `enemyAlive` to `false`.

Print the battle summary to the terminal, including enemy ID, damage dealt, remaining enemy health, and whether they're alive.

#### Exercise 3.5 -- High Scores
In `Score.java`, create a `void` method called `updateScore` that takes a `Player` and `Enemy` objects as parameters.

If `enemyAlive` of `Enemy` is `false`, increase `enemiesDefeated` by 1, and `totalScore` by `enemyId * 10`.

In the `main` method, create a `Player` and multiple `Enemy` objects along with a `Score` object. Simulate battles and score updates. 

#### Exercise 3.6 -- Shadows in JavaLandia
Add a local variable in `updateScore` method with the same name as one of the instance variables, and try adding to that variable instead of the instance variable. Run the program. Analyze what happens, with focus on variable shadowing concepts.

### 🐜 Bugs and Errors?
If you encounter any, please open a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) titled "Task *x* Error: *summary of error here*". Your contribution will be appreciated!