# Space Invaders - Battle for Survival!

In this programming task, your mission is to create a simplified version of the classic arcade game "Space Invaders". The game should include player movement, a scoring system, and enemy interactions. Are you up for the challenge?

### 🕐 Deadline
This project should be completed by **Friday, 3rd March**.

### 👩‍🏫 Instructions
For instructions on how to carry out and submit the assignment, please refer to the [assignments section of your course instructions](https://gameProgrammingCourse/course_instructions#assignments).

### 📝 Preparation
Make sure you have followed and completed the learning materials for Module 2.

- Review [Creating and Using Classes in Java](https://gameProgrammingCourse.com/module/creating-using-classes)
- Sign up and register for the course key `gd100-ht22` if you haven't done so at https://gameProgrammingCourse.com/

> **Assistant's Note:** It's important to review the material. Remember, it's always okay to read ahead if you haven't found all the material yet.

### ✅ Learning Goals

Your learning goals for this week include:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide
If you encounter any issues, follow this procedure:

1. Look at this week's [posted issues](https://gameProgrammingCourse.com/issues). Are there similar issues posted by other students?
2. If not, post your own question by starting a [New Issue](https://gameProgrammingCourse.com/issues/new). Add a descriptive title, starting with "Task *x*: *summary of problem here*"
3. Consult a TA during the [weekly lab](https://gameProgrammingCourse.com/Queue/COURSE). Check your schedule for the next lab.

Keep in mind that conversing with your course friends is strongly encouraged, but **do not share answers**!

### 🕹 Assignment

For this assignment, you will create and model classes to form a simple game application. Here's an overview of the classes:

- **Player**: This represents the player's in-game avatar. It should be able to move and shoot, and keep track of the current score.
- **Enemy**: This represents an enemy that the player must face. It should have the ability to move (possibly in a pre-programmed pattern) and shoot.
- **Projectile**: This represents a projectile that can be shot by either the player or an enemy.

#### Exercise 2.0 -- Classes and Attributes
Create a new Java class for `Player`, `Enemy`, and `Projectile` in the [`src`](src) folder. All of these classes should contain:

- `int` xPosition
- `int` yPosition
- `String` sprite (a string representation of your object)

The `Player` class should also have:

- `int` score

The `Enemy` class should also have:

- `int` hp (Hit Points)

After implementing these fields, use the following `main` method to test if your classes compile and can be instantiated correctly:

```java
public static void main(String[] args) {
  Player player = new Player();
  player.xPosition = 50;
  player.yPosition = 30;
  player.sprite = "🚀";
  player.score = 0;

  System.out.println("Position: " + player.xPosition + ", " + player.yPosition);
  System.out.println("Sprite: " + player.sprite);
  System.out.println("Score: " + player.score);
}
```

#### Exercise 2.1 -- Getters and Setters
Once you have the fields created, apply encapsulation principles. Change the access modifiers of the fields in your classes to `private` and add *getters* and *setters* to every field in each class.

#### Exercise 2.2 -- Constructor
Now create a constructor for each class that sets every field when an object is instantiated. Test instantiation with your constructors in your `main` method.

#### Exercise 2.3 -- Methods For Actions
Implement methods in your `Player` and `Enemy` classes to represent actions. For example, `player` might have a `move()` method that changes its position, and `shoot()` that creates a new `Projectile` instance. `Enemy` might also have `move()` and `shoot()`, but it should also have a `getHit()` method that decreases its HP.

#### Exercise 2.4 -- Scope and Variable Shadowing
Now, write some methods or modify your current methods in a way that would result in variable shadowing. After doing this, use the `this` keyword to correct the shadowing issue.

> **Assistant's Note:** To understand more about variable shadowing and the `this` keyword, refer back to the [course material](https://gameProgrammingCourse.com/module/shadowing-this).

### 🐞 Bugs and errors?
In case you encounter any issues or errors in this course, please feel free to open a [New Issue](https://gameProgrammingCourse/issues/new) with the title "Task *x* Error: *Summary of Error*". All efforts in finding and reporting bugs will be appreciated and acknowledged!