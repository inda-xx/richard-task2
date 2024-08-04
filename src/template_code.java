Here's your code template for the assignment. I decided to also include placeholders and comments for guidance:

```java
// Begin class definition
public class Warrior {
  
  // Declare private field variables of the Warrior class
  private String name; // TODO: declare other attributes here as per Exercise 3.0 (healthPoints, attackPoints, defensePoints, isAlive)
  
  // TODO: Implement getters and setters for each field as per Exercise 3.1
  
  // Constructor method 
  // TODO: Implement the constructor for the Warrior class as per Exercise 3.2
  public Warrior(String name, int healthPoints, int attackPoints, int defensePoints, boolean isAlive) {
    // TODO: Set the variables appropriately in the constructor method
  }

  // TODO: Implement the printDetails() method as per Exercise 3.3
  public void printDetails() {
    // TODO: Write the code that prints out the warrior's details
  }
  
  // TODO: Implement the attack method as per Exercise 3.4
  public void attack(Warrior opponent) {
    // TODO: Fill in the code for the attack method here
  }
  
  // main method for testing your code
  public static void main(String[] args) {
    // Create a warrior object using the constructor, then test the methods you've just implemented.
    Warrior braveWarrior = new Warrior("Brave Warrior", 100, 25, 15, true);
    
    // Use the getters to print out the details of the created warrior
    System.out.println("Name: " + braveWarrior.getName());
    System.out.println("HP: " + braveWarrior.getHealthPoints());
    System.out.println("Attack: " + braveWarrior.getAttackPoints());
    System.out.println("Defense: " + braveWarrior.getDefensePoints());
    System.out.println("Is Alive: " + braveWarrior.getIsAlive());
  
    // TODO: Add more demo code to test all the methods.
  } 
}
```
Remember to refer to the task description or ask for help if you get stuck. Make sure to fix the variable shadowing issues as per Exercise 3.5. Happy coding!