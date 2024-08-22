# CodeWars: Unleash The Warrior Within 🐺⚔️

For this exercise in INDA, you are going to expand your knowledge by creating a Warrior class in Java. This will help you understand the concepts of classes along with their components.

### ☠️ Deadline
You should have this task completed before the exercise on **Friday 9th April**.

### 👩‍🏫 Instructions
For instructions on how to do and submit the assignment, please look at the [assignments section of our instructions](https://gits-15.sys.kth.se/inda-21/instructions#assignments).

### 📘 Preparation
You should read the following materials in the Module 3 :

- Read [Object-Oriented Programming: Classes & Objects](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=d0b3e4b0a68101724dbe5d56e0a5781000160026)
- If you haven't done it yet, visit https://kth.oli.cmu.edu/, sign up and register for the course key `indaut21`

> **Assistant's Note:** The study material and tasks might be slightly off this year, so it's okay to read the upcoming sections if you can't find all the necessary material.

### ✅ Learning Goals
Your learning goals for this week should include:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding Scope (or *Variable Shadowing*)

### 🚨 Troubleshooting Guide
If you face any issues or difficulties, follow these steps:

1. Review the [posted issues](https://gits-15.sys.kth.se/inda-21/help/issues) for this week. Do you see other students discussing your problems there?
2. If not, feel free to ask your questions by creating a [New Issue](https://gits-15.sys.kth.se/inda-21/help/issues/new). Use a descriptive title, beginning with "Assignment *CodeWars*: *summary of the problem*"
3. You can also ask a TA in-person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). 

Feel free to discuss with your course fellows, but **make sure you do not share answers**!

### 🏁 Assignment

You have been caught in the middle of a war between mythical warriors. Your task is to model these warriors in Java! Here's your mission:

#### Exercise 3.0 -- Instance fields
In the [`src`](src) folder, simply create a new class, `Warrior.java`. In Java, you express the characteristics of real-world objects using [fields](https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html). The class `Warrior` should include:

- `String` name
- `double` health
- `double` attackPower
- `double` defensePower
- `boolean` isAlive

If you've implemented it correctly, Example 1 should compile, where `Warrior.java` includes the main method.

#### Exercise 3.1 -- Getters and Setters
A key concept in object-oriented programming is [encapsulation](https://en.wikipedia.org/wiki/Encapsulation_(computer_programming)). This means shielding direct access to the state of your Warrior. This can be achieved by setting the [access modifiers](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html) of the fields in the Warrior class to `private`. However, we need to still read from and write to the fields. So we need *getters* and *setters*. You should have *getters* and *setters* for all fields, adding up to a total of ten methods!

#### Exercise 3.2 -- Constructor
Constructors are useful to avoid the tedious task of assigning values to each object you create separately. Implement a constructor following the examples in the material provided (or the [Official Oracle tutorial](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)). 

#### Exercise 3.3 -- `displayInfo()`
Now create a method named `displayInfo()` such that it can print all the info about the warrior to the terminal. Its return type should be `void`.

#### Exercise 3.4 -- Warrior, Strike!
Warriors are known for their power and attack skills. Now we need to simulate a combat between two warriors. For this, you need to create a method named `strike` that will receive a Warrior object. This Warrior object will represent the opponent in the fight. When the warrior *A* strikes warrior *B*, the damage is calculated as follows:

`damage = A's attackPower - (0.5 * B's defensePower)`

If A's attackPower > B's defensePower, A wins and B's `isAlive` should be set to `false`. Otherwise, B survives the strike and loses `damage` amount of health.

#### Exercise 3.5 -- Variable Shadowing
The term *Variable Shadowing* refers to the scenario where a local variable in a code block or method has the same name as a variable defined in its enclosing scope, leading to confusion. Look into these examples and prepare an explanation of how to solve this problem which will be discussed later in class.

Example 1:
```Java
public class Shadow1 {
    private int number = 0; 

    public void printShadow() {
        int number = 5;
        System.out.println(number);  
    }

    public static void main(String[] args){
        new Shadow().printShadow();
    }
}
```
Example 2:
```Java
public class Student {
  private String name;

  public Student(String name) {
    name = name; 
  }

  public void printName(){
    String name = "Jack";
    System.out.println(name + " is a student of this class.");  
  }
}
```

### 🐞 Bugs and errors?
If you find any errors or inconsistencies in this task, please open a [New Issue](https://gits-15.sys.kth.se/inda-21/help/issues/new) with the title "Task *x* Error: *summary of error here*". The one who finds the bug will be acknowledged.