Description

Long ago in the Kingdom of Javaland, there was an ancient dungeon guarded by fiery creatures called **FireDrakes**. The dungeon holds the "Golden Artefact", which is the symbol of ultimate knowledge in Javaland. Your mission, brave adventurer, is to model these fiery creatures in Java, defeat them to progress through the dungeon, keep track of your scores and ultimately collect the "Golden Artefact".

### Learning Goals

Your mission is to accomplish the following goals:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating getters and setters
* Printing to the terminal
* Using the main method in Java
* Understanding Scope (or variable shadowing)

#### Exercise 1.0: Creation of FireDrake Class 

In the `src` folder, create a new Java class titled `FireDrake.java`. The FireDrake class should contain the following attributes (instance fields): 

- `String`: name
- `int`: hp (**hit points**)
- `int`: attack 
- `int`: defence
- `boolean`: active (A FireDrake is active if it is not yet defeated)

#### Exercise 1.1: Create Getters and Setters

To ensure encapsulation, set field access modifiers to `private` and create getters & setters for each of the fields. The naming convention for a `boolean` field varies: For the `active` field you should use `isActive()` and `setActive(boolean active)`. 

#### Exercise 1.2: Create a Constructor 

Create a FireDrake constructor that accepts `name`, `hp`, `attack`, and `defence`. Initialize `active` to `true`.

#### Exercise 1.3: Create a method to print FireDrake's info 

Create a method `printFireDrakeInfo()` in the `FireDrake` class that prints all the info about the FireDrake to the terminal.

#### Exercise 1.4: Battle Simulation with FireDrakes

Create a method `battle()` that simulates a battle between two FireDrakes. The `battle()` method should take another FireDrake as a parameter and perform an operation that simulates an attack. 

> Note: The damage done by a FireDrake "A" to a FireDrake "B" is given by `(A.attack / B.defence)`. 

In each battle (i.e., in each call to `battle()`), deduct from the `hp` of the FireDrake being attacked. If a FireDrake's `hp` falls to 0 or below, set its `active` status to `false`.

#### Exercise 1.5: Understand Variable Shadowing

As a bonus exercise, take a look at the concept of Variable Shadowing. Try to identify if it's occurring in your code and understand what effects it has on your class level variables or instance fields.