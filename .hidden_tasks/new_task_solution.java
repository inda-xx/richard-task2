Below is a simple implementation for the classes and functionalities mentioned above:

```java
import java.util.ArrayList;
import java.util.List;

public class Game {
    private Player player;
    private List<Enemy> enemies;
    private boolean isGameRunning;
    
    public Game() {
        player = new Player(0, 0);
        enemies = new ArrayList<>();
        
        // initializing enemies for the sake of example
        for(int i = 1; i <= 5; i++) {
            enemies.add(new Enemy(i, i));
        }
        
        isGameRunning = true;
    }
    
    public void runGame() {
        // Run the game in loop till player is alive
        while(isGameRunning) {
            updateGame();
        }
        
        System.out.println("Game has ended with score: " + player.getScore());
    }
    
    public void updateGame() {
        // move player
        // move enemies
        // check collisions 
        // update score for player
    }
    
    // Method to check collisions and end game if a collision occured
    public void checkCollisions() {
        for(Enemy enemy : enemies) {
            if(player.getX() == enemy.getX() && player.getY() == enemy.getY()) {
                player.setIsAlive(false);
                isGameRunning = false;
            }
        }
    }
    
    // Further methods to handle game mechanics
}
```

The player class:

```java
public class Player {
    private int x;
    private int y;
    private int score;
    private boolean isAlive;
    
    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        this.score = 0;
        this.isAlive = true;
    }
    
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
        // handle going off-map if necessary
    }
    
    // Additional methods for accessing and manipulating attributes (getter and setter methods)
}
```

The enemy class:

```java
public class Enemy {
    private int x;
    private int y;
    
    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void move() {
        // move in some random direction for simplicity
        x += (Math.random() > 0.5) ? 1 : -1;
        y += (Math.random() > 0.5) ? 1 : -1;
        // handle going off-map if necessary
    }
    
    // Additional methods for accessing and manipulating attributes (getter and setter methods)
}
```

This implementation is very basic and should be built out with additional functionality and error handling for a fully-fledged game.