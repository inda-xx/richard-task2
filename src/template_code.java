e: Journey of the Knight

## Theme
In this exercise, you will create a simple game application that simulates a knight's journey, defeating dragons and collecting treasures. The functionalities you are going to develop include player movement, scoring system, and enemy interactions, using Java.

### 💀 Deadline
This work should be completed before the exercise, on **Friday 30th September**.

### 👩‍🏫 Instructions
For instructions on how to do and submit the assignment, please see the
[assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation
You must read and answer the questions in the OLI material for Module 3.

> **Assistant's Note:** The OLI material and tasks might be slightly out of line this year, so it is ok to read ahead if you did not find all the material.

### ✅ Learning Goals
With this exercise, you will practice:
* Managing code flow and designing Java classes
* Implementing game logic using basic programming concepts
* Creating and using special methods like `toString()`, `equals()`, and `hashcode()`
* Implementing methods for player movement, scoring and enemy interactions 

### 🚨 Troubleshooting Guide
If you have any questions or problems, follow the procedure mentioned above.

### 🖼️ Assignment

You will imagine and model a knight's movement in his journey, fighting dragons, collecting treasures, and keeping a score.

#### Exercise 3.0 -- Knight Movement
Design a `Knight` Java class. A `Knight` should have a name (of type String), and a position (an integer between 1 and 100). Add fields, a constructor, getters and setters for these attributes.

Also, implement two methods: 

* `moveForward(int steps)`: it will change the knight's position by adding the received steps to his current position. Make sure the knight does not go beyond position 100. 
* `moveBackward(int steps)`: it will subtract the received steps from the knight's current position. Ensure the knight does not go beyond position 1.

#### Exercise 3.1 -- Dragon Encounters
Add one more class to your project: the `Dragon`. A `Dragon` should have a name (String), strength (int), and position (also an integer between 1 and 100). Similar to the `Knight` class, this class should have fields, a constructor, getters and setters for these three attributes.

Now, update your `Knight` class to include a `fightDragon(Dragon dragon)` method. This method should check if the knight is at the same position as the dragon; if yes, the knight will defeat the dragon if his position is greater than or equal to the dragon's strength, and lose otherwise. The resulting Boolean should be returned by this method.

#### Exercise 3.2 -- Scoring System
Go back to the `Knight` class and add a `score` field to it (int). Now, modify the `fightDragon` method such that if the `Knight` wins a fight, 10 points are added to his score.

#### Exercise 3.3 -- Collecting Treasures
In your project, design a third class named `Treasure`. A `Treasure` should have value (int) and a position (int between 1 and 100). Once again, the class should include fields for these, a constructor, and respective getters and setters.

Now in your `Knight` class, add a `collectTreasure(Treasure treasure)` method. This method should check if the knight is at the same position as the treasure, and if he is, add the value of the treasure to his score.

### ⚠️ Assignment Constraints
Remember, the position of any object (Knight, Dragon, or Treasure) should always be between 1 and 100.

The knight's score and a dragon's strength should always be greater than or equal to 0.

Make sure to keep your code structure clean and meaningful. It would be a good idea to keep separate sections or even files for each of the class codes.

### ✅ Submission
You should submit your assignment through the link provided in the instructions. You must submit:

* The source code for your Java classes (`Knight.java`, `Dragon.java`, and `Treasure.java`),
* Any supporting insights or notes you used for debugging or implementing this task.

**Good Luck!**