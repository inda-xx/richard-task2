# BattleRealm: Journey to the Code Throne 👑

In this assignment for Introduction to Computer Science, we're going to step away from the real world and dive into the magic world of BattleRealm. You are going to build helpful classes and subroutines for the game.

### 💀 Deadline
This assignment should be completed before the exercise on **Saturday, 1st October**.

### 👓 Instructions
Please refer to the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments) for detailed guidance on how to submit and do the assignment.

### 🎓 Preparation
You should review and address the following requirements in the OLI materials for Module 3:

- Read [Classes and Objects in Java](https://kth.oli.cmu.edu/)
- If you haven't done so yet, sign up at https://kth.oli.cmu.edu/ and enter the course key: `dd1337-ht23`

> **Assistant's Note:** It is alright if the OLI tasks and instructions don't align perfectly this year, as you can always continue with your readings where necessary.

### 🏆 Learning Goals

For this task, you will learn about:

* Adding instance fields
* Designing Java classes
* Creating getters and setters
* Adding a constructor method
* Using the `main` method
* Printing to the terminal
* Variable shadowing, also called Scope

### 🏁 Assignment

In the mystical world of BattleRealm, there exist powerful creatures known as "Warriors". Your mission is to define these mighty warriors in Java! Here's a sample image of a warrior to spark your imagination:

<img src="images/dallemini-warrior.png" width="800">

#### Exercise 3.0 -- Defining the model
Create a new class called `Warrior.java` in the `src` folder. In this class, define the following attributes as fields:

- `String` name
- `int` healthPoints
- `int` attackPoints
- `int` defensePoints
- `boolean` isAlive

Complete Exercise 3.0 correctly, and the main method provided in Example 1 should compile if added to `Warrior.java`.

<details>
  <summary> 🛠 Example 1 </summary>

```java
class Warrior {
  
  // Place your fields here!

  public static void main(String[] args) {
    // create a new "Warrior" object
    Warrior braveWarrior = new Warrior();

    braveWarrior.name = "Brave Warrior";
    braveWarrior.healthPoints = 100;
    braveWarrior.attackPoints = 25;
    braveWarrior.defensePoints = 15;

    // print out the assigned values
    System.out.println("Name: " + braveWarrior.name);
    System.out.println("HP: " + braveWarrior.healthPoints);
    System.out.println("Attack: " + braveWarrior.attackPoints);
    System.out.println("Defense: " + braveWarrior.defensePoints);
  }

} // end class
```
</details>

#### Exercise 3.1 -- Encapsulation
The objects of the BattleRealm world should be protected from unauthorized direct manipulation. One way to achieve this is by setting the fields of the `Warrior` class to `private`. However, we still need to have access to these fields. To do this, create *getters* and *setters* for each field. With a successfully completed Exercise 3.1, Example 2 should compile when added to `Warrior.java`.

<details>
  <summary> 🛠 Example 2 </summary>

```java
class Warrior {

  // Put your fields here!

  // Put your getters and setters here!

  public static void main(String[] args) {
    // create a new "Warrior" object
    Warrior braveWarrior = new Warrior();

    braveWarrior.setName("Brave Warrior");
    braveWarrior.setHealthPoints(100);
    braveWarrior.setAttackPoints(25);
    braveWarrior.setDefensePoints(15);

    // print out the assigned values
    System.out.println("Name: " + braveWarrior.getName());
    System.out.println("HP: " + braveWarrior.getHealthPoints());
    System.out.println("Attack: " + braveWarrior.getAttackPoints());
    System.out.println("Defense: " + braveWarrior.getDefensePoints());
    System.out.println("Is Alive: " + braveWarrior.getIsAlive());
  } // end main method

} // end class
```
</details>

#### Exercice 3.2 -- Constructors
Now that we have our *getters* and *setters*, we can see that the code of Example 2 is rather tedious, as we're setting each field individually for our `Warrior` object. A more convenient way to achieve this is to use a *Constructor*. Implement a constructor following the tutorials provided in the OLI material, and repeat Example 2 with this constructor.

#### Exercise 3.3 -- `printDetails()`
We need an easy way to output the details about a `Warrior` to the console. To achieve this, implement a method called `printDetails()`. The return type should be `void`.

#### Exercise 3.4 -- Clash of the Warriors!
Warriors are mighty fighters. Implement a method called `attack` that accepts a `Warrior` object representing the opponent. When warrior *A* attacks warrior *B*, the damage inflicted is equivalent to A's attack power minus B's defense power. If the result is less than 0, set it to zero. Subtract the damage from the opponent's health, and if the health is less than or equal to zero, set the opponent's `isAlive` status to `false`.

#### Exercise 3.5 -- Variable Shadowing
Variable shadowing may cause misunderstandings and programming mistakes. Look at the examples provided in the instructions and explain how you would fix the shadowing issue for each one. Be prepared to discuss your solutions in class.

### 🦟 Bugs and Errors?
If you find any errors or inconsistencies in this assignment, please create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task *x* Error: *summary of error here*". Found bugs will be acknowledged in the acknowledgment section in later assignments.