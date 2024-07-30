e: "WipeThemOut: The Mini Arcade Robot Invasion!"

## Theme: 
Design and build a 2D arcade game where your character moves around the screen, destroys enemy robots, and keeps score.

Your character is an 'AvengerBot', assigned to fight the wave of angry 'RoboRaider' bots invading the landscape, earning points for each 'RoboRaider' destroyed. 

### 🏛 Assignment
Create an application in Java that models this game. 

#### Exercise 1.0 - Fields
Create a new class called `AvengerBot.java`. This bot will be your game character.

The AvengerBot class should include the following fields:
- `String` name
- `int` speed
- `int` score
- `boolean` status

#### Exercise 1.1 - Getters and Setters
Implement getters and setters for all fields of the AvengerBot class to enable interacting with the character.

#### Exercise 1.2 - Constructor
Implement a constructor for the AvengerBot class for easier instantiation.

#### Exercise 1.3 - printStatus()
Implement a `printStatus()` method in the `AvengerBot` class to print out the current score and status of the 'AvengerBot'.

#### Exercise 1.4 - RoboRaider class
Create a new class `RoboRaider.java` to model the angry robots the 'AvengerBot' needs to destroy. 

The 'RoboRaider' class should include the following fields:
- `int` health
- `int` damagePotential

Implement appropriate getters, setters, and a constructor for the 'RoboRaider' class.

#### Exercise 1.5 - Destroy!
Implement a method `destroyRoboRaider(RoboRaider)` in the `AvengerBot` class that simulates the 'AvengerBot' destroying 'RoboRaiders'. The method should take a 'RoboRaider' object as the argument, reduce the 'RoboRaider' health by the 'AvengerBot' score, and increase the 'AvengerBot' score for each successful hit.

#### Exercise 1.6 - Shadowing 
Revisit your implementation and make sure there's no variable shadowing. Rename any shadowed variables appropriately and use the `this` keyword where necessary.

### ✅ Learning Goals

This task aims to help you understand how to:
* Design Java classes
* Add instance fields
* Add a constructor method
* Create *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### 📝 Template

The structure of your classes should follow this general structure:

```java
public class YourClassName {
  // Define your instance variables here
  
  // Create your constructor here
  
  // Create your getters and setters here
  
  // Create any other methods the task requires here
}
```

### 👩‍🏫 Instructions 
Once your classes are ready, test your game by:
- Creating an 'AvengerBot' object
- Creating multiple 'RoboRaider' objects
- Use the 'destroyRoboRaider()' method for the 'AvengerBot' to destroy the 'RoboRaider'
- Print out the status of the 'AvengerBot', and the health of the 'RoboRaiders'

### ⛔ Restrictions
- Do not create any additional classes besides `AvengerBot` and `RoboRaider`.
- Do not change the method signatures or the test cases provided.

### Tests
Your code should pass the following test cases:

```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    private AvengerBot avengerBot;
    private RoboRaider roboRaider;

    @Before
    public void setUp() {
        avengerBot = new AvengerBot("Avenger", 5);
        roboRaider = new RoboRaider(10, 2);
    }

    @Test
    public void testAvengerBotCreation() {
        assertEquals("Avenger", avengerBot.getName());
        assertEquals(5, avengerBot.getSpeed());
        assertEquals(0, avengerBot.getScore());
        assertEquals(true, avengerBot.getStatus());
    }

    @Test
    public void testRoboRaiderCreation() {
        assertEquals(10, roboRaider.getHealth());
        assertEquals(2, roboRaider.getDamagePotential());
    }

    @Test
    public void testDestroyRoboRaider() {
        avengerBot.destroyRoboRaider(roboRaider);
        assertEquals(0, roboRaider.getHealth());
        assertEquals(10, avengerBot.getScore());
    }
}
``` 

### Deadline  
This work should be completed before the exercise on **Friday 16th September**.

Good luck and have fun!