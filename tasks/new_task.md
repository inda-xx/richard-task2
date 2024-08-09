# 🏰 Adventure Quest 🕹️ 

Embark on a programming journey to create a simple game application. For this exercise, you are going to practice Java object-oriented programming and acquaint yourself with Java classes components.

### 💀 Deadline
This exercise must be completed before **Friday 23rd September**.

### 👩‍🏫 Instructions
Detailed instructions for completing and submitting the assignment can be found on the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation
You must read and answer the questions in the OLI material for Module 3:

- Read [Looking Inside Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f98f7979851fee529f9072a1321c6c43)
- If necessary, register for the course key `dd1337-ht22`https://kth.oli.cmu.edu/, and sign up.

> **Assistant's Note:** It's alright to read ahead if you did not find all the material, as the OLI material and tasks might slightly differ this year.

### ✅ Learning Goals

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating getters and setters
- Printing to the terminal
- Using the `main` method
- Understanding Scope (or variable shadowing)

### 🚨 Troubleshooting Guide
If you encounter issues or have any questions, follow these steps:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Are other students experiencing similar problems?
2. If not, post your question by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). The title should be "Task *x*: *issue summary*".
3. Consult a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule for the next lab session.

While discussing with classmates is beneficial,**never share your solutions**!

### 🏛 Assignment

You will build a simple adventure game with a hero, treasure chests, and monsters. The hero must open treasure chests while avoiding monsters. 

#### Exercise 3.1 -- Player, Chest, and Monster Classes

In the `src` folder, create `Player.java`, `Chest.java`, and `Monster.java` classes. These classes will have the following fields:

- `Player` Class: `String` name, `int` score, `int` playerPosX, `int` playerPosY
- `Chest` Class: `int` value, `boolean` isOpened, `int` chestPosX, `int` chestPosY
- `Monster` Class: `int` damage, `boolean` isAlive, `int` monsterPosX, `int` monsterPosY

Implement the constructor, getters, and setters for each class. 

#### Exercise 3.2 -- Player's Movement

Now, add the functionalities to control the player's movement. Implement a `move` method in the `Player` class that takes a string-direction argument ('up', 'down', 'left', 'right') and adjusts the player's position accordingly. 

#### Exercise 3.3 -- Interactions

Create methods in `Player.java` to interact with chests and monsters. 

- Add a `openChest` method that increases the player's score if the chest is not yet opened and they're in the same position as the chest.
- Add an `avoidMonster` method that decreases the player's score by Monster's damage if both are in the same position.

#### Exercise 3.4 -- Score Display

In `Player.java`, add a method `printScore` that prints the player's score to the terminal.

#### Exercise 3.5 -- Main Game Method

In a new `Game.java` class, implement a `main` method that creates a new Player, Chests, and Monsters. Use a loop for continuous gameplay until the player walks into a Monster.

#### Exercise 3.6 -- Scope (variable shadowing)

To ensure you understand the concept of variable shadowing correctly, analyze the shadowing examples given in the OLI material. Note the difference between local and field (instance) variables.

### 🐞 Bugs and errors?
If you find any errors or inconsistencies, please open a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with "Task *x* Error: *summary of error here*" in the title. Bug reports will be rewarded with an acknowledgment mention.