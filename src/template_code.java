// Import statements
import java.lang.String;


class Robot {
    // Define the fields for the Robot class according to the task description
    private String name;  // The name of the Robot
    private int health;  // The health of the Robot
    private int attackPower;  // The attack power of the Robot
    private int defense;  // The defense of the Robot
    private boolean isDisabled;  // The status of the Robot - if it is Disabled or not

    // The constructor for the Robot class
    public Robot(String name, int health, int attackPower, int defense) {
        // Assign the arguments to the fields
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
        this.isDisabled = false;
    }

    // Add the getters
    public String getName() { return this.name; } 
    public int getHealth() { return this.health; }
    public int getAttackPower() { return this.attackPower; }
    public int getDefense() { return this.defense; }
    public boolean getIsDisabled() { return this.isDisabled; }

    // Add the setters
    public void setName(String name) { this.name = name; } 
    public void setHealth(int health) { this.health = health; } 
    public void setAttackPower(int attackPower) { this.attackPower = attackPower; } 
    public void setDefense(int defense) { this.defense = defense; } 
    public void setIsDisabled(boolean isDisabled) { this.isDisabled = isDisabled; }

    // The printStatus method
    public void printStatus() {
        // Print the name, health, attackPower, defense and status of the Robot
        System.out.println("Name: " + this.getName());
        System.out.println("Health: " + this.getHealth());
        System.out.println("Attack Power: " + this.getAttackPower());
        System.out.println("Defense: " + this.getDefense());
        System.out.println("Is Disabled: " + this.getIsDisabled());
    }

    // The attack method
    public void attack(Robot opponent) {
        // Write the logic for the attack method
        int damage = this.getAttackPower() / opponent.getDefense();
        opponent.setHealth(opponent.getHealth() - damage);
        if (opponent.getHealth() <= 0) {
            opponent.setIsDisabled(true);
        }
        // Print status of the Robots after the attack
        this.printStatus();
        opponent.printStatus();
    }

    // The main method
    public static void main(String[] args) {
        // Instantiate two Robot objects
        Robot robot1 = new Robot("Robot1", 100, 20, 10);
        Robot robot2 = new Robot("Robot2", 100, 15, 8);
        // Print out the status of the Robots
        robot1.printStatus();
        robot2.printStatus();
        // Make the Robots attack
        robot1.attack(robot2);
    }
}