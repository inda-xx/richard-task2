```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class WarriorTest {
    private Warrior warrior1;
    private Warrior warrior2;

    @Before
    public void setUp() {
        warrior1 = new Warrior("Thrall", 100, 50, 70);
        warrior2 = new Warrior("Arthas", 120, 55, 60);
    }

    /* Test Getters */
    @Test
    public void testGetName() {
        assertEquals("Thrall", warrior1.getName());
        assertEquals("Arthas", warrior2.getName());
    }

    @Test
    public void testGetHealth() {
        assertEquals(100, warrior1.getHealth(), 0.0);
        assertEquals(120, warrior2.getHealth(), 0.0);
    }

    @Test
    public void testGetAttackPower() {
        assertEquals(50, warrior1.getAttackPower(), 0.0);
        assertEquals(55, warrior2.getAttackPower(), 0.0);
    }

    @Test
    public void testGetDefensePower() {
        assertEquals(70, warrior1.getDefensePower(), 0.0);
        assertEquals(60, warrior2.getDefensePower(), 0.0);
    }

    @Test
    public void testIsAlive() {
        assertTrue(warrior1.isAlive());
        assertTrue(warrior2.isAlive());
    }

    /* Test Setters */
    @Test
    public void testSetName() {
        warrior1.setName("Varian");
        assertEquals("Varian", warrior1.getName());
    }

    @Test
    public void testSetHealth() {
        warrior1.setHealth(200);
        assertEquals(200, warrior1.getHealth(), 0.0);
    }

    @Test
    public void testSetAttackPower() {
        warrior1.setAttackPower(90);
        assertEquals(90, warrior1.getAttackPower(), 0.0);
    }

    @Test
    public void testSetDefensePower() {
        warrior1.setDefensePower(100);
        assertEquals(100, warrior1.getDefensePower(), 0.0);
    }

    @Test
    public void testSetAlive() {
        warrior1.setAlive(false);
        assertFalse(warrior1.isAlive());
    }

    /* Test strike functionality */
    @Test
    public void testStrike() {
        Warrior warrior3 = new Warrior("Grom", 100, 70, 30);
        Warrior warrior4 = new Warrior("Uther", 100, 60, 60);
        warrior3.strike(warrior4);
        assertEquals(60, warrior4.getHealth(), 0.0); // As Grom's attack power(70) > Uther's defense power(60), damage should be 70 - 0.5 * 60 = 40, and thus HP should reduce by 40 from 100 to 60
        assertTrue(warrior4.isAlive());
    }

    @Test
    public void testStrikeDeath() {
        Warrior warrior5 = new Warrior("Garrosh", 100, 200, 30);
        Warrior warrior6 = new Warrior("Anduin", 100, 30, 30);
        warrior5.strike(warrior6);
        assertEquals(0, warrior6.getHealth(), 0.0); // As Garrosh's attack power(200) > Anduin's defense power(30), Anduin should die in the strike
        assertFalse(warrior6.isAlive());
    }

    // More tests can be written for null inputs, invalid inputs etc. but given the context of usage, they might be unnecessary.
}
```

### Suggested Solution

```java
public class Warrior {
  // Exercise 3.0 -- Instance fields
  private String name; // Name of Warrior
  private double health; // Health level of Warrior
  private double attackPower; // Attack power of Warrior
  private double defensePower; // Defense power of Warrior
  private boolean isAlive; // Warrior survival status

  // Exercise 3.2 -- Constructor
  public Warrior(String name, double health, double attackPower, double defensePower) {
    this.name = name;
    this.health = health;
    this.attackPower = attackPower;
    this.defensePower = defensePower;
    this.isAlive = true;
  }

  // Exercise 3.1 -- Getters and Setters
  // Getters
  public String getName() {
    return this.name;
  }

  public double getHealth() {
    return this.health;
  }

  public double getAttackPower() {
    return this.attackPower;
  }

  public double getDefensePower() {
    return this.defensePower;
  }

  public boolean isAlive() {
    return this.isAlive;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setHealth(double health) {
    this.health = health;
  }

  public void setAttackPower(double attackPower) {
    this.attackPower = attackPower;
  }

  public void setDefensePower(double defensePower) {
    this.defensePower = defensePower;
  }

  public void setAlive(boolean isAlive) {
    this.isAlive = isAlive;
  }

  // Exercise 3.3 -- displayInfo()
  public void displayInfo() {
    System.out.println("Name: " + this.name);
    System.out.println("Health: " + this.health);
    System.out.println("Attack Power: " + this.attackPower);
    System.out.println("Defense Power: " + this.defensePower);
    System.out.println("Is Alive: " + this.isAlive);
  }

  // Exercise 3.4 -- strike
  public void strike(Warrior opponent) {
    double damage = this.attackPower - (0.5 * opponent.getDefensePower());
    if (this.attackPower > opponent.getDefensePower()) {
        opponent.setAlive(false);
        opponent.setHealth(0);
    } else {
        opponent.setHealth(opponent.getHealth() - damage);
    }
  }

  // main method
  public static void main(String[] args) {
    Warrior warrior1 = new Warrior("Thrall", 100, 50, 40);
    Warrior warrior2 = new Warrior("Arthas", 120, 60, 30);

    // Display information
    warrior1.displayInfo();
    warrior2.displayInfo();

    // Strike simulation
    warrior1.strike(warrior2);
    warrior2.strike(warrior1);
  }
}
```

For Exercise 3.5 -- Variable Shadowing, this scenario occurs when a local variable in a code block or method has the same name as a variable in its enclosing scope. This can be solved by using the `this` keyword in Java to refer explicitly to the member variable. 

For example, in the `Student` class, the constructor can be fixed from `name = name;` to `this.name = name;`. This will correctly assign the passed argument to the instance `name` variable, not to the local `name` variable itself.
In the method `printShadow` of `Shadow1` class, `System.out.println(number);` can be replaced with `System.out.println(this.number);` to print the member variable `number` instead of the local one