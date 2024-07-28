Please use the following template to guide your development:

```java
public class Player {
    private String name;
    private int score;
    private int positionX;
    private int positionY;

    // Implement getters and setters for the class attributes.
    // TODO

    // Implement the methods for player movements.
    // TODO
}

public class Enemy {
    private String name;
    private int positionX;
    private int positionY;

    // Implement getters and setters for the class attributes.
    // TODO
}

public class Game {
     private Player player;
     private List<Enemy> enemies;

     // Implement the manageScore() method.
     // TODO

     // Implement the encounterEnemy() method.
     // TODO
}
```

To test this game, you will create a `GameTest` class to test all the methods in the `Game` class along with the movements of the `Player` class and the attributes of the `Enemy` class.

```java
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    public void testPlayerMovement(){
        // TODO
    }

    @Test
    public void testManageScore(){
        // TODO
    }

    @Test
    public void testEncounterEnemy(){
        // TODO
    }
}```

Your task is to implement this system while passing all the tests in the `GameTest` class. Happy coding!