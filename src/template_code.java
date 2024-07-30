ce Time Machine Adventures!

## Theme
Let's set the scene. You've just joined an elite team of programmers at the prestigious "Cosmic Coders Inc." and your mission should you choose to accept it, is to create a game application that simulates a match between two virtual machines. These virtual machines named `TIMBot` (Time-traveling Intelligent Machine Bot) are created for space time adventures during which they meet alien enemies and engage in battles. You are to implement player movement, a scoring system, and interactions with alien enemies and other objects found in the space-time environment.

### 📆 Deadline
The deadline is **Friday 16th September**.

### 👩‍🏫 Instructions
To do and submit the assignment, please see the
[instructions in the assignments section](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📚 Preparation
Study and complete all necessary exercises from the OLI material for Module 2.

### ✅ Learning Goals
For this week, your aims should include:
* Mastering the design of Java classes.
* Understanding and creating instance fields.
* Implementing a constructor method.
* Formulating *getters* and *setters*.
* Printing information to the terminal.
* Applying the `main` method.
* Grasping the concept of Scope (or *variable shadowing*).

### 🌟 The TASK
For the Royal Institute of Technology's prestigious space-time simulation challenge, develop the `TIMBot.java` class. This `TIMBot` has several properties, including:

- `String` name
- `int` hp (**hit points**)
- `int` strength (For attack and movement)
- `int` defense (For shielding against enemy attacks)
- `int` score (To track the player's score throughout the game)
- `boolean` stopped (Indicates whether the `TIMBot` is stationary or not)

### 🧪 Tests

Create test cases for your `TIMBot.java` class using the examples given in the template. Make sure all test cases pass.

### 🐛 Bug reporting 

If you encounter any bugs or inconsistencies, please create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task x Error: summary of error here".

### 📌 Rubric 
To pass this assignment, you must meet the following criteria:

* Code must compile without any errors.
* All methods must be implemented correctly.
* Code should be formatted and documented properly.
* All test cases must pass.

### 🏗 Template:

```java
class TIMBot {
    // Add your fields here
    
    // Constructor
    public TIMBot(String name, int hp, int strength, int defense, int score, boolean stopped) {
        // Add your code here
    }
    
    // Add your getter and setter methods here
    
    // Add 'move' method here
    
    // Add 'attack' method here
    
    // Add 'shield' method here
    
    // Add 'interact' method here
    
    // Add 'printInfo' method here
}

```

### 🎯 Use TDD 
Apply the Test-Driven Development approach. Create the test cases before implementing the functionalities. When the test cases have been created, implement the functionalities to pass the test cases.

### Have fun 💻🌈🚀!