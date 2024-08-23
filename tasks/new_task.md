# Battle in the Console Realm! 🎮

You are tasked to create a digital realm straight from your Java console. For the third exercise, you will practice creating a simple game application. In this task, you will fine-tune your skills in designing Java classes, adding instance fields, constructors, and getter and setter methods. 

### 💀 Deadline
This task should be completed and submitted before **Friday, October 28th**.

### 👩‍🏫 Instructions
For instructions on how to complete and submit the assignment, please see the [assignments section of your course portal](https://your-course-portal/assignments).

### 📝 Preparation
You should have completed and understood the OLI material for Module 2.

- Read [Looking Inside Classes](https://kth.oli.cmu.edu/OLI-material-link)
- If you haven't done so, visit https://kth.oli.cmu.edu/, signup and register for the course key `dd1337-ht22`

### ✅ Learning Goals

This week's learning goals include:
- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating getters and setters
- Printing to the terminal
- Using the main method
- Scope (or *variable shadowing*)

### 🏛 Assignment

Your mission is to design the console game "Battle in the Console Realm!" featuring the brave hero CharacterX and the fearsome foe VillainY. Your game must include player movement, scoring systems, and enemy interactions. 

#### Exercise 3.0 -- Initialize Your Characters

Create new classes `CharacterX.java` and `VillainY.java`. Both will contain the following attributes:

- `String` characterName for the player's name
- `int` xPos and `int` yPos for the character's current position
- `int` health for player's health points
- `int` strength representing the player's attack power

Ensure they contain getters and setters for their respective attributes and constructor methods to initialize these attributes. 

#### Exercise 3.1 -- Moving Around

Create a method `move()` within both classes that will accept String parameters 'UP', 'DOWN', 'LEFT', 'RIGHT' and 'STAID' to move the character accordingly. Make sure the move results in a change in xPos and/or yPos and prints the character's new position. 'STAY' will keep the character in their current position. 

#### Exercise 3.2 -- Scoring System

Create a simple scoring system. For every successful movement, the character gains 1 point. Implement a `score` attribute and a `gainPoint()` method in each class. After each move, `gainPoint()` should be invoked.

#### Exercise 3.3 -- Enjoy Your Confrontation

Implement the `confront()` method in the `CharacterX.java` class. In a confrontation between the player and the villain, the method should consider both the player’s and the villain’s strength attribute. If the player’s strength is more, the villain loses an amount of health equivalent to the difference in strength between both characters. If the villain's strength is more or equal to the player's, the player loses an equal amount of health points. The method should print the result of every confrontation.

#### Exercise 3.4 -- Game Over 

Finally, when the health of either character reaches 0, the game is over. Implement the method `isGameOver()` in both classes. The method should return `true` if health <= 0, `false` otherwise.

#### Exercise 3.5 -- Variable Shadowing

Create an instance method in the `CharacterX.java` class and create a shadow variable within this method. Print out both the instance and the local variable within the method. Discuss the outputs and understand the concept of Scope or Variable Shadowing.

### 🚨 Troubleshooting

In case you're having issues:

1. Look at this week's [posted questions](https://your-course-portal/questions). See if other students are experiencing the same problem.
2. If not, post your question by creating a [New Question](https://your-course-portal/questions/new). Provide a descriptive title and detailed problem description.
3. Alternatively, ask a TA in person during the [weekly lab](https://your-course-portal/weeklylab).

Remember, collaboration is key, but **do not share answers**!

### 🐞 Found any Misalignments?

If you find any inconsistencies or mistakes in this assignment, please open a [New Issue](https://gits-15.sys.kth.se/dd1337-ht22/help/issues/new) with the title "Assignment Task 3 Error: *summary of error here*". Contributors will be mentioned in the acknowledgment section!