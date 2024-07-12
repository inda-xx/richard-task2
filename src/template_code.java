The template below shows how to set things up. You will have to create new files for each class (`Main`, `Player`, `Collectable`, `Enemy` etc.):

```java
public class Main {

    public static void main(String[] args) {
        // Starting the game action here
    }
}

public class Player {
    int x;
    int y;
    int score;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        this.score = 0;
    }

    // Create methods to move the player up, down, left, right
    // Create method to modify the score
}

public class Collectable {
    int x;
    int y;

    public Collectable(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Create method to spawn collectable at a random position
}

public class Enemy {
    int x;
    int y;

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Create method to move the enemy in a random direction
}
```

You have to expand upon the template and add necessary game logic to fulfill the task requirements. You may add additional classes, methods or variables as you see fit. Happy coding!