# Java Challenge: Create a Simple Game, "Battle Geeks"!💥

Get ready for a fun Java ride! In this task, you will develop a simple game application called "Battle Geeks". This is a lighthearted, simulation game where the program characters battle it out while you watch the chaos unfold!

### 🚀 Deadline
We expect you to complete this task by **Friday, 16th September**.

### 😇 Instructions
For detailed instructions on how to do and submit this task, please refer to the [Task Guidelines section of this course](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📚 Preparation
Please ensure to go through the following resources:

- Study [Classes and Objects in Java](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- Register on https://kth.oli.cmu.edu/ and register for the course key **dd1337-ht22**

> **Assistant's Note:** In case the sequence of tasks and OLI material does not match this year, feel free to read ahead.

### 🎯 Learning Goals

Your learning outcomes from this task will be:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### 🏢 Assignment

In this assignment, you will:

1. Design a `Player` class with attributes as instance fields. A player should have the following attributes: `name (String)`, `health (double)`, `power (double)`, `score (int)`, and `isAlive (boolean)`.
2. Add a constructor method to the class for initializing the player attributes when creating a new player object.
3. Create *getters* and *setters* for each attribute.
4. Implement a method `attack(Player opponent)`. This method demonstrates interaction between Player objects.
5. Incorporate a scoring system. Every time a player wins a fight, their score should increase by some value. Define this system according to your preference.
6. Create an application that initializes a few players, makes those players interact (i.e., fight each other), and then reports the state of each player.
7. Consider using the concept of variable shadowing where needed.

You might want to mimic the following flow in your application:

```bash
> Player Bob attacks Player Alice
> Player Bob wins the fight
> Player Alice is now dead
> Player Bob's score is now 100
>
> State of the game:
> Player Bob is alive with a score of 100
> Player Alice is dead with a score of 0
```

Don't forget that your code should compile and run without errors. 

### 🐛 Stuck?
In case you encounter an error or a problem, follow this procedure:

1. Go through the [questions posted this week](https://gits-15.sys.kth.se/inda-22/help/issues). Can you find your issue?
2. If your error is not listed, create a new issue yourself. Start the title with "Task *x*: *summary of problem here*"
3. Engage your fellow students, **but do not share answers**!

### 🏆 Wrap Up 
After completing this task, you would have learned how to create and design Java classes, add instance fields and create a constructor, create getters and setters, create methods for inter-object interaction, manage scoring systems, implement the main method, print to the terminal, and apply scope or variable shadowing. Enjoy coding!