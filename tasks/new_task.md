# Journey to the Enchanted Forest! 🌲🦄

In this third exercise of the Java Programming course, we are going to develop a simple console game called "Enchanted Forest". We will be practicing designing Java classes and using their components like fields, methods, and constructor.

### ⏳ Deadline
This work should be accomplished before **Monday, 20th February**.

### 👩‍💻 Instructions
For instructions on how to do and submit the assignment, please see the [course instruction](https://example.edu/courses/java-instruction#assignments).

### 📚 Preparation
Before starting the assignment, read and answer the questions in the material specified below.

- Read [Classes](https://example.edu/courses/java/classes)
- Read [Constructors](https://example.edu/courses/java/constructors)

After reading, sign up at https://example.edu/ with the course key `jp101-ht24` and answer the quizzes in the material.

### 🎯 Learning Goals
After this assignment, you should be able to:

* Design Java classes
* Add instance fields
* Add a constructor method
* Create getters and setters
* Print to the terminal
* Use the main method
* Understand Scope (or variable shadowing)

### 🚦 Troubles?
If you get stuck or have any questions, follow these steps:

1. Check the [forum](https://example.edu/forum/java). Maybe your classmates have the same query.
2. If not, ask your question in the forum by creating a [New Topic](https://example.edu/forum/java/new).
3. You can also ask your Teaching Assistant during the weekly lab.

Always discuss with your classmates but remember, sharing answers is not tolerated!

### 🏁 Assignment

The Enchanted Forest of Okabrook, an enchanted world full of magical creatures and enchanted objects, has a notorious legend. Your mission is to design a simplified version of that legend in a Java game!

#### Exercise 3.0 -- Design `Player` Class
To begin with, design a `Player` class which should have the following fields:

- `String` name
- `int` health
- `int` score
- `String` weapon

Create getters and setters for these fields. 

>If Adding correct fields and getter and setter methods, your `Player` class should be able to work with the [Example 1 main method](#example-1).

#### Exercise 3.1 -- Constructor Method 
Add a *constructor* to your `Player` class with that will accept initial values for health and weapon.

>If your constructor method is implemented correctly, you should be able to use it with the [Example 2 main method](#example-2)

#### Exercise 3.2 -- Design `Enemy` Class
Now, design an `Enemy` class which should have the following fields:

- `String` name
- `int` enemyHealth
- `String` weapon

Add getters and setters including a *constructor* to initialize health and weapon for the enemy.

#### Exercise 3.3 -- Player's Interaction with Enemy
In the `Player` class, add a 'fight' method which will accept an `Enemy` object as an argument. This method should reduce the player's health based on the given formula:

```
health = health - enemy.weapon damage
```

Add a `weaponDamage` field to the `Enemy` class for this purpose.

>If correctly implemented, the [Example 3 main method](#example-3) should work with your `player.fight(enemy)` method.

#### Exercise 3.4 -- Player info
Create a `playerInfo` method in the `Player` class which would print all the details about the player.

#### Exercise 3.5 -- Understanding Scope and Variable Shadowing
Take a look at this example:

```Java
public class ScopeUnderstanding {
  private int number = 0;

  public void printNumber() {
    int number = 5;
    System.out.println(number);
  }

  public static void main(String[] args) {
    new ScopeUnderstanding().printNumber();
  }
}
```

Explain why it prints `5` and not `0`. Note that the answer to this problem is the concept of 'variable shadowing'. Do some research on variable shadowing and summarize your findings. Be prepared to explain it in the class.

### 💣 Bugs
Should you find any error, please open a [New Issue](https://example.edu/forum/issue) with the title "Task 3.0 Error: *summary of error here*". We appreciate your effort!


#### Example 1
```java
public static void main(String[] args) {
  Player player = new Player();
  player.setName("Hero");
  player.setHealth(100);
  player.setScore(0);
  player.setWeapon("Sword");

  System.out.println("Player: " + player.getName());
  System.out.println("Health: " + player.getHealth());
  System.out.println("Score: " + player.getScore());
  System.out.println("Weapon: " + player.getWeapon());
}
```

#### Example 2
```java
public static void main(String[] args) {
  Player player = new Player(100, "Sword");
  player.setName("Hero");
  player.setScore(0);

  System.out.println("Player: " + player.getName());
  System.out.println("Health: " + player.getHealth());
  System.out.println("Score: " + player.getScore());
  System.out.println("Weapon: " + player.getWeapon());
}
```

#### Example 3
```java
public static void main(String[] args) {
  Player player = new Player(100, "Sword");
  player.setName("Hero");
  player.setScore(0);
  
  Enemy enemy = new Enemy(50, "Axe");
  enemy.setName("Goblin");
  enemy.setWeaponDamage(10);
  
  player.fight(enemy);
  
  System.out.println("Player Health after fight: " + player.getHealth());
}
```