Here's a skeleton of what your main game classes could look like:

```java
public class Game {
    public static void main(String[] args) {
        // initialize game:
        // create player and enemies and start their threads.
    }
}

class Player implements Runnable {
    int score;
    Position position;

    public Player(Position position) {
        this.position = position;
    }
    
    // implement positioning logic move position and update score: 
    public void run() {
     // infinite loop with movement logic and sleep 
    }
}

class Enemy implements Runnable {
    Position position;

    public Enemy(Position position) {
        this.position = position;
    }

    // implement movement logic:
    public void run() {
     // infinite loop with movement logic and sleep 
    }
}

class Position {
    private int x, y;

    // constructor, getters, setters here
}
```

You're free to add or adjust anything you feel necessary.