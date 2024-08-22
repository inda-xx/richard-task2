```java
public class JavaKnight {
    private String name;
    private int healthPoints;
    private int attackPower;
    private int defensePower;
    private boolean isAlive;

    public JavaKnight(String name, int healthPoints, int attackPower, int defensePower, boolean isAlive){
        this.name = name;
        this.healthPoints = healthPoints;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.isAlive = isAlive;
    }
    public String getName() {
        return this.name;
    }
    public int getHealthPoints() {
        return this.healthPoints;
    }
    public int getAttackPower() {
        return this.attackPower;
    }
    public int getDefensePower() {
        return this.defensePower;
    }
    public boolean getIsAlive() {
        return this.isAlive;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }
    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
  
    public static void main(String[] args) {
        JavaKnight knight1 = new JavaKnight("Sir Code-a-lot", 20, 10, 5, true);
        System.out.println("Name: " + knight1.getName());
        System.out.println("Health Points: " + knight1.getHealthPoints());
        System.out.println("Attack Power: " + knight1.getAttackPower());
        System.out.println("Defense Power: " + knight1.getDefensePower());
        System.out.println("Is Alive: " + knight1.getIsAlive());
    }
}
```