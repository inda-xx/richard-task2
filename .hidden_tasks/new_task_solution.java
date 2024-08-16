```java
class Soldier {
    private String name; // Name of the soldier
    private int health; // The health of the soldier
    private int strength; // The strength of the soldier
    private int defense; // The defense of the soldier
    private boolean alive; // Whether the soldier is alive or not

    // Constructor for the Soldier class
    public Soldier(String name, int health, int strength, int defense, boolean alive) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        this.alive = alive;
    }

    // Getters
    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getStrength() { return strength; }
    public int getDefense() { return defense; }
    public boolean getAlive() { return alive; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setHealth(int health) { this.health = health; }
    public void setStrength(int strength) { this.strength = strength; }
    public void setDefense(int defense) { this.defense = defense; }
    public void setAlive(boolean alive) { this.alive = alive; }

    // Display soldier information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Strength: " + strength);
        System.out.println("Defense: " + defense);
        System.out.println("Alive: " + (alive ? "Yes" : "No"));
    }

    // Fight another soldier
    public void fight(Soldier other) {
        int damage = strength - other.defense; // Compute the damage
        if (damage > 0) {
            other.health -= damage; // Inflict the damage 
            if (other.health <= 0) { // Mark the soldier dead if health drops below or equals to 0
                other.health = 0; 
                other.alive = false;
            }
        }
    }

    public static void main(String[] args) {
        // Exercise 1: Instantiate a Soldier object and set its attributes
        // Done in Test

        // Exercise 2: Use setters and getters after encapsulation
        // Done in Test

        // Exercise 3: Use the constructor to create Soldier objects
        // Done in Test

        // Exercise 4: Display information about soldiers
        // Done in Test

        // Exercise 5: Make soldiers fight
        // Done in Test
    }
}
```