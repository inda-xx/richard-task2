# Javamon: The Battle Begins! 🕹

In this exercise of JAV101, you're about to dive deeper into the realm of Object-Oriented Programming (OOP) in Java. You'll engage in creating instances and experiences for a simple but addictive game.

### 👾 Deadline
This task should be completed before **Friday 21st October**.

### 👩‍🔬 Instructions
For help on how to complete and submit the assignment, visit the [assignment section of the course handbook](https://jav101.edu/assignments).

## 📖 Preparation
You must read through and grasp the provided learning materials for Chapter 3.

- Visit [Learning Java Basics](https://jav101.edu/java/basics)
- If you haven't done so, visit https://jav101.edu, sign up, and bookmark the course using the key `jav101-2022`

> **Assistant's Note:** The task and learning materials may not be entirely synchronous, please read through the material to ensure you understand the concepts.

## ✅ Learning Goals

The learning goals for this chapter include:

* Designing robust Java classes
* Declaring and utilizing instance fields
* Adding a constructor method
* Creating getter and setter methods
* Outputting information to the console
* Utilizing the `main` method correctly
* Understanding variable scope (or *variable shadowing*)

## 📚 Assignment

The small but bustling city of Javatown is known for its popular game, *Javamon*. Your task is to model these game elements in Java! 

#### Exercise 3.1 -- Fields
To get started, create a new `Javamon.java` in the [`src`](src) folder. You need to model game characters called Javamon using [fields](https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html). The class, `Javamon`, should include the following fields:

* `String` name
* `int` health (HP)
* `int` power 
* `String` type

#### Exercise 3.2 -- Getters and Setters
Next, introduce [encapsulation](https://en.wikipedia.org/wiki/Encapsulation_(computer_programming)) by applying *getters* and *setters* to all fields. This will offer controlled access to the class properties from outside.

#### Exercise 3.3 -- Constructor
To save time and make your class more robust, create a *constructor* that can initialize a Javamon instance with one line of code.

#### Exercise 3.4 -- `printStatus()`
To print out a Javamon's current status, implement a `printStatus()` method. This should output the Javamon's name, health, power, and type.

#### Exercise 3.5 -- The Battle System
Implement a method called `battle` that takes another Javamon as a parameter. This method should simulate a battle between the Javamon that calls `battle` and the opponent Javamon. The attack causes damage to the opponent's health equal to the attacking Javamon's power. If a Javamon's health drops to 0 or below, it is considered "fainted".

#### Exercise 3.6 -- Scope and Variable Shadowing
Look at the examples below. Try to understand the potential issues with *variable shadowing* illustrated. Be prepared to explain how to fix these issues, you might be asked during class. Read more about [variable shadowing](https://en.wikipedia.org/wiki/Variable_shadowing) and the [`this` keyword](https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html) in Java.

## 💡 Troubleshooting
In case of questions:

1. Check the [Assignment FAQ](https://jav101.edu/assignments/faq.md)
2. Post your question on the course forum (avoid sharing answers!)
3. Speak in person with a teaching assistant during the [weekly lab](https://jav101.edu/labs)

Remember, it's always smart to query a friend or the internet for help. But, you should never share answers in the end.

Enjoy diving into Java classes and OOP concepts, and most importantly, have fun! 🎮