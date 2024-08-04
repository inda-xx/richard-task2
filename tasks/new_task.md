# Let's make a game: Mission Impossible!

In this task, you will discover the beauty of implementing a simple game in Java. Throughout this task, we will see how different variables play their roles in designing the game's activities.

### 🎯 Deadline
Your work should be completed and submitted before **Friday 18th March**.

### 👩‍💻 Instructions
For detailed steps on how to complete and submit the task, please visit the [task section of the course instructions](https://www.example.com).

### 📚 Preparation
Before you dive into the task, you should complete these reading materials to familiarize yourself with the core concepts.

- Head to [Inside the Classes](https://www.example.com), and comprehend the essentials.
- If you haven't enrolled, feel free to sign up and register for the course key `pp1337-ht22` at https://kth.pp.edu/.

> **Assistant's Notice:** You might explore slightly ahead as all the mentioned concepts and tasks play a crucial role in understanding this task better.

### 🎯 Learning Outcomes

On completing this task, you will have a solid grasp of:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and setters
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### 🆘 Troubleshooting Guide
If you encounter any difficulties:

1. Check out this week's [posted issues](https://gits-15.sys.kth.se/pp22/help/issues). You might find someone else experiencing the same problem.
2. If your problem persists, feel free to post a question yourself by creating a [New Issue](https://gits-15.sys.kth.se/pp22/help/issues/new). Make your title descriptive, beginning with "Task *x*: *summary of problem here*"
3. Finally, don't hesitate to approach a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/PP). Don't forget to check your schedule for the next lab timing.

Ensure to discuss your problems with your course mates but **never share answers**!

### 🕹️ Assignment

Building a version of the popular game called *Mission Impossible*, set in the mythical world of *Indamon*. Your first quest is to architect these mythical creatures in Java:

- `String` name
- `int` hp (**hit points**)
- `int` attack
- `int` defense
- `boolean` captured

Your game will feature player movement, a scoring system, and enemy interactions.

#### Exercise 1 - Implement the Character Class
Your first step will be to implement the rules that dictate how enemies directly interact and how their hit points are affected. Remember, the damage done is your character's attack multiplied by (100 / (100 + the enemy's defense)). If a character's hit points reach 0, they've been captured.

#### Exercise 2 - Player Movement Implementations
In the game world, you'll need to allow the player's character to move around. Create the necessary methods that will dictate this behavior.

#### Exercise 3 - Create The Scoring System
Create a method to keep track of the player's score throughout the game. The score should increase each time an enemy is captured.

#### Exercise 4 - Game Interface
Develop a simple terminal menu to allow players to move, attack enemies, and see their score. 

#### Exercise 5 - Testing Everything Out
Finally, it's time to test everything out! Write the main method that will allow you to run and test your game.

> **Assistant's Note:** Pay close attention to variable shadowing when writing your Java classes. It might make your code behave differently than you expect! Also, don't forget to use clear and concise comments within your code to make its purpose clear.

On completion of the tasks, you should be able to run your game, move your character around the game world, attack and capture enemies, and keep track of your score. Best of all, you'll have developed your understanding and skills in some of the core principles of Java programming. Good luck and have fun!