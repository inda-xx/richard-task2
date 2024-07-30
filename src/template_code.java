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
    private String name;
    private int hp;
    private int strength;
    private int defense;
    private int score;
    private boolean stopped;

    // Constructor
    public TIMBot(String name, int hp, int strength, int defense, int score, boolean stopped) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.defense = defense;
        this.score = score;
        this.stopped = stopped;
    }

    // Getter methods
    public String getName() { return this.name; }
    public int getHp() { return this.hp; }
    public int getStrength() { return this.strength; }
    public int getDefense() { return this.defense; }
    public int getScore() { return this.score; }
    public boolean getStopped() { return this.stopped; }

    // Setter methods
    public void setName(String name) { this.name = name; }
    public void setHp(int hp) { this.hp = hp; }
    public void setStrength(int strength) { this.strength = strength; }
    public void setDefense(int defense) { this.defense = defense; }
    public void setScore(int score) { this.score = score; }
    public void setStopped(boolean stopped) { this.stopped = stopped; }

    public void move() {
        this.stopped = false;
    }

    public void attack(TIMBot enemy) {
        int damage = this.strength - enemy.getDefense();
        if(damage > 0) {
            enemy.setHp(enemy.getHp() - damage);
            if (enemy.getHp() <= 0) {
                this.score += 10;
            }
        }
    }

    public void shield(int enemyStrength) {
        int damage = enemyStrength - this.defense;
        if(damage > 0) {
            this.setHp(this.getHp() - damage);
        }
    }

    public void interact(String action) {
        if (action.equals("attack")) {
            attack(this);
        } else if (action.equals("shield")) {
            shield(this.getStrength());
        }
    }

    public void printInfo() {
        System.out.println("Name: " + this.getName() + ", HP: " + this.getHp() 
            + ", Strength: " + this.getStrength() + ", Defense: " + this.getDefense() 
            + ", Score: " + this.getScore() + ", Status: " + (this.getStopped() ? "Stopped" : "Moving"));
    }
}

```

### 🎯 Use TDD 
Apply the Test-Driven Development approach. Create the test cases before implementing the functionalities. When the test cases have been created, implement the functionalities to pass the test cases.

### Have fun 💻🌈🚀!