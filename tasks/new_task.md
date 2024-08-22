# Game On, Code On! 🎮👩‍💻

For this round of programming adventure, we'll be diving deep into the world of object-oriented design and Java syntax. The task ahead: a simple game!

## 📅 Deadline
Our journey should wrap up by **Tuesday, 15th February**.

## 💡 Instructions
To get started and submit this assignment, follow the guide in the [course instructions' assignments section](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

## 📚 Preparation
For a successful mission, please study the OLI material for Module 2.

- Review [Looking Inside Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
  
Remember to sign up and register for the course key `dd1337-ht22` if you haven't.

> **Assistant's Note:** The OLI material and tasks might not sync perfectly, so feel free to read forward if needed.

## 🎯 Learning Goals
The objectives for this week are:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding Scope (or *variable shadowing*)

## 🆘 Troubleshooting 
If you stumble upon any obstacles or have questions, follow these steps:

1. Consult this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Are others facing the same problem?
2. If not, create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) yourself. Title it "Task *x*: *problem summary*".
3. Reach out to a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA) in person. Consult your schedule for the next lab's timing.

Result exchange with peers is allowed, but **do not share the solution**!

## 📝 Assignment

Your mission is to create a basic game application including a player, scoring system, and enemies. 

Here are the exercises:

**Exercise 1:** Implement a `Player` class. Model following attributes using fields:

- `String` name
- `int` health
- `int` score

Create `getters` and `setters` for each field. Set access modifiers to `private`.

**Exercise 2:** Add a constructor method to the `Player` class. It should receive the player's name as a parameter and initialize the name, health (100), and score (0).

**Exercise 3:** Add methods for player movement: `moveUp()`, `moveDown()`, `moveLeft()`, and `moveRight()`. Print corresponding movement messages within these methods.

**Exercise 4:** Implement an `Enemy` class with an `int` health field. Add a constructor method and `getters` and `setters`.

**Exercise 5:** In the `Player` class, implement a `attack(Enemy enemy)` method. The method should decrease the enemy's health by 10. Print a message indicating the enemy's remaining health.

**Exercise 6:** Create a `Scoreboard` class. Add a `printScore(Player player)` method that prints the current score of the given player.

**Exercise 7:** Run a simple game in the `main` method. Create a player, an enemy, and a scoreboard. Make the player attack the enemy and update the scoreboard accordingly.

**Exercise 8:** Discuss variable shadowing and how to avoid it with an example. Understand and explain the scope in Java and how the `this` keyword can be used.

**Bonus:** Enhance your game. Add multiples enemies, more complex mechanics or a graphical interface if you wish!

> **Assistant's Note:** Aim to create a well-structured and organized code with a clear separation of concerns among your classes.


## 🥳 Acknowledgments
Keep your spirits up, and rock this coding adventure! Your contribution could end up in our next acknowledgment section!