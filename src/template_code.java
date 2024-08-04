Here is a template to get you started:

```java

class Alium {
  private String name;
  private int hp;
  private int attack;
  private int defense;
  private boolean defeated;
  private static int score = 0;

  // Your task is to implement the constructor, getters, setters, printInfo(), move(), and attack() methods here.

  
  public static void main(String[] args) {
    // Testing your implementation
    Alium alien1 = new Alium("Xyzel", 50, 20, 10, false);
    Alium alien2 = new Alium("Qopel", 40, 15, 5, false);

    alien1.printInfo();
    alien2.printInfo();

    alien1.move();
    alien2.move();

    alien1.attack(alien2);

    alien1.printInfo();
    alien2.printInfo();
  }
}
```

Make sure your implementation matches with the Existing Tests provided below to verify its correctness.

### Existing Tests

```java

// Implement separate Unit Tests for each functionality e.g.

@Test
public void testAliumInitialization() {
  Alium alium = new Alium("Zorg", 100, 25, 15, false);
  assertEquals("Zorg", alium.getName());
  assertEquals(100, alium.getHp());
}

// Similarly implement the tests for move(), attack() and other functionalities.

```

Enjoy crafting your own Alium duel and learning object-oriented concepts along the way!