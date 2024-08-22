```java
public class JavaKnight {
    // Fields or instance variables
    private String name;
    private int healthPoints;
    private int attackPower;
    private int defensePower;
    private boolean isAlive;
  
    // TODO: Replace "default" with your own values or create parameters to initialize fields in constructor
    public JavaKnight(){
        // Constructor to initialize fields
        this.name = "default";
        this.healthPoints = 20;
        this.attackPower = 10;
        this.defensePower = 5;
        this.isAlive = true;
    }
  
    // Getters
    public String getName() {
        // TODO: Return the name of the JavaKnight
        return this.name;
    }
  
    public int getHealthPoints() {
        // TODO: Return the health points of the JavaKnight
        return this.healthPoints;
    }
  
    public int getAttackPower() {
        // TODO: Return the attack power of the JavaKnight
        return this.attackPower;
    }
  
    public int getDefensePower() {
        // TODO: Return the defense power of the JavaKnight
        return this.defensePower;
    }
  
    public boolean getIsAlive() {
        // TODO: Return the 'isAlive' status of the JavaKnight
        return this.isAlive;
    }
  
    // Setters
    public void setName(String name) {
        // TODO: Set the name of the JavaKnight
        this.name = name;
    }
  
    public void setHealthPoints(int healthPoints) {
        // TODO: Set the health points of the JavaKnight
        this.healthPoints = healthPoints;
    }
  
    public void setAttackPower(int attackPower) {
        // TODO: Set the attack power of the JavaKnight
        this.attackPower = attackPower;
    }
  
    public void setDefensePower(int defensePower) {
        // TODO: Set the defense power of the JavaKnight
        this.defensePower = defensePower;
    }
  
    public void setIsAlive(boolean isAlive) {
        // TODO: Set the 'isAlive' status of the JavaKnight
        this.isAlive = isAlive;
    }
  
    public static void main(String[] args) {
        // TODO: Create a new JavaKnight object and use getter/setter methods to manipulate and print its data
        // Example of creating and using JavaKnight object
        JavaKnight knight1 = new JavaKnight();
        knight1.setName("Sir Code-a-lot");
        knight1.setHealthPoints(20);
        knight1.setAttackPower(10);
        knight1.setDefensePower(5);
        knight1.setIsAlive(true);
        
        System.out.println("Name: " + knight1.getName());
        System.out.println("Health Points: " + knight1.getHealthPoints());
        System.out.println("Attack Power: " + knight1.getAttackPower());
        System.out.println("Defense Power: " + knight1.getDefensePower());
        System.out.println("Is Alive: " + knight1.getIsAlive());
    }
}
```