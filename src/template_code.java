```java
// Your goal is to model these warriors!
public class Warrior {
  //Exercise 3.0 -- Instance fields
  private String name; // Name of Warrior
  private double health; // Health level of Warrior
  private double attackPower; // Attack power of Warrior
  private double defensePower; // Defense power of Warrior
  private boolean isAlive; // Warrior survival status

  // Exercise 3.2 -- Constructor
  public Warrior(String name, double health, double attackPower, double defensePower) {
    // Assign values to the warrior's characteristics
  }

  // Exercise 3.1 -- Getters and Setters
  // Getters
  public String getName() {
    // return the warrior's name  
  }

  public double getHealth() {
    //return the warrior's health
  }
  
  // Other getter methods go here
  
  // Setters
  public void setName(String name) {
    // Set the warrior's name
  }

  public void setHealth(double health) {
    // Set the warrior's health level
  }
    
  // Other setter methods go here

  // Exercise 3.3 -- displayInfo()
  public void displayInfo() {
    // print all the info about the warrior
  }

  // Exercise 3.4 -- strike
  public void strike(Warrior opponent) {
    // calculate damage
    // if warrior's attackPower > opponent's defensePower, set opponent's isAlive to false
    // else, reduce the opponent's health by damage amount
  }
  
  // main method
  public static void main(String[] args) {
    // create your warrior objects
    // print out their info
    // simulate the strikes
  } // end main method
}

// Exercise 3.5 -- Variable Shadowing
// Write your explanations of the following examples

// Example 1:
// public class Shadow1

// Example 2:
// public class Student

```
In this template, remember to replace the comments in the methods with implementations according to the task descriptions above. The comments simply guide on what each method or variable does.