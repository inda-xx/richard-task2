```java
public class Player {
    private String name;
    private int x;
    private int y;
    private boolean lifeStatus;

    // constructor
    public Player(String name, int score, int x, int y) {
        this.name = name;
        this.score = score;
        this.x = x;
        this.y = y;
        this.lifeStatus = true;
    }

    // getter and setter methods
    // ...

    // Moves player in the specified direction
    public void move(String direction) {
        switch (direction) {
            case "up":
                this.y += 1;
                break;
            case "down":
                this.y -= 1;
                break;
            case "left":
                this.x -= 1;
                break;
            case "right":
                this.x += 1;
                break;
        }
    }
}

public class Game {
    private int score;

    // setter and getter methods
    // ...

    public static void main(String[] args) {
      Player player = new Player("Player1", 0, 0, 0);
      Enemy enemy = new Enemy("Enemy1", 10, 5, 5);
      
      String direction = getUserInput();
      
      while (player.getLifeStatus()) {
        player.move(direction);
        
        // check if player and enemy are at the same coordinates
        if (player.getX() == enemy.getX() && player.getY() == enemy.getY()) {
          player.setScore(player.getScore() - enemy.getStrength());
          
          // if player score is less than 0, player dies
          if (player.getScore() < 0) {
            player.setLifeStatus(false);
          }
        }
        
        direction = getUserInput();
      }
   }

   private static String getUserInput() {
       // Implement the code to get user input
       return "";
   }
}

public class Enemy {
    private String name;
    private int x;
    private int y;
    private int strength;

    // Constructor and getter/setter methods
    //...
}

public class Shadow {
    private int number = 10;

    public void printShadow() {
        int localNumber = 5;
        System.out.println(localNumber); 
        System.out.println(this.number); 
    }

    public static void main(String[] args) {
        new Shadow().printShadow();
        // To fix the variable shadowing problem, we can either fully qualify the class member 
        // with this or use different variable names for the local variable and the class member.
    }
}
```
These classes provide a simple implementation of the player, game, and enemy classes, which are easy to test.