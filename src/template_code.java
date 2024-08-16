```java
// Before you start, remember to name you java file as Soldier.java

// Begin by creating the Soldier class
class Soldier {
  // Exercise 1: Declare instance variables according to the specifications
  private String name; // Name of the soldier
  private int health; // The health of the soldier
  private int strength; // The strength of the soldier
  private int defense; // The defense of the soldier
  private boolean alive; // Whether the soldier is alive or not

  // Exercise 3: Define a constructor for the Soldier class
  public Soldier(String name, int health, int strength, int defense, boolean alive) {
    // Fill in the constructor to initialize instance variables
    // Use the 'this' keyword to reference instance variables
  }

  // Exercise 2: Implement encapsulation with setters and getters

  // Getters
  public String getName() { // Fill in the method body }
  public int getHealth() { // Fill in the method body }
  public int getStrength() { // Fill in the method body }
  public int getDefense() { // Fill in the method body }
  public boolean getAlive() { // Fill in the method body }

  // Setters
  public void setName(String name) { // Fill in the method body }
  public void setHealth(int health) { // Fill in the method body }
  public void setStrength(int strength) { // Fill in the method body }
  public void setDefense(int defense) { // Fill in the method body }
  public void setAlive(boolean alive) { // Fill in the method body }

  // Exercise 4: Implement the displayInfo method
  public void displayInfo() {
    // Print out the attributes of the soldier
  }

  // Exercise 5: Implement the fight method
  public void fight(Soldier other) {
    // Implement how a soldier fights another soldier,
    // how the damage is calculated, and
    // how a soldier is determined to be no longer alive
  }

  // The main method to test your code
  public static void main(String[] args) {
    // Exercise 1: Instantiate a Soldier object and set its attributes

    // Exercise 2: Use setters and getters after encapsulation

    // Exercise 3: Use the constructor to create Soldier objects

    // Exercise 4: Display information about soldiers

    // Exercise 5: Make soldiers fight
  }
}
```