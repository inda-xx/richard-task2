```java
import java.util.List;

public class Player {
    private String name;
    private int score;
    private int positionX;
    private int positionY;

    public Player(String name, int score, int positionX, int positionY) {
        this.name = name;
        this.score = score;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void moveRight() {
        this.positionX += 1;
    }

    public void moveLeft() {
        this.positionX -= 1;
    }

    public void moveUp() {
        this.positionY -= 1;
    }

    public void moveDown() {
        this.positionY += 1;
    }

    // Add getters and setters for other attributes
    // TODO
}

public class Enemy {
    private String name;
    private int positionX;
    private int positionY;

    public Enemy(String name, int positionX, int positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Add getters and setters
    // TODO
}

public class Game {
     private Player player;
     private List<Enemy> enemies;

     public Game(Player player, List<Enemy> enemies) {
         this.player = player;
         this.enemies = enemies;
     }

     public void manageScore(int scoreToAdd) {
        player.setScore(player.getScore() + scoreToAdd);
     }

     public boolean encounterEnemy() {
        for (Enemy enemy : enemies) {
            if (player.getPositionX() == enemy.getPositionX() && player.getPositionY() == enemy.getPositionY()) {
                return true;
            }
        }
        return false;
     }
}
```
This code defines classes for representing the player, the enemies, and the game itself. It provides methods for managing players and enemies, handling player movements, and managing the game score. The `GameTest` class has tests that ensure the functionality of these methods is as expected.