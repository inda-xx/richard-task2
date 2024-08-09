### Player.java

```java
public class Player {
    // Instance fields
    private String name;
    private int score;
    private int playerPosX;
    private int playerPosY;

    // Player class constructor
    public Player(String name, int score, int playerPosX, int playerPosY) {
        // Add constructor implementation
    }

    // Getters and setters for instance fields
    // Add getters and setters for each instance field

    public void move(String direction) {
        // Add method that adjusts the player's position based on the argument
    }

    public void openChest(Chest chest) {
        // Add method that increases the player's score if the chest is not yet opened and they're in the same position as the chest.
    }

    public void avoidMonster(Monster monster) {
        // Add method that decreases the player's score by Monster's damage if both are in the same position.
    }

    public void printScore() {
        // Add method that prints the player's score to the terminal.
    }
}
```

### Chest.java

```java
public class Chest {
    // Instance fields
    private int value;
    private boolean isOpened;
    private int chestPosX;
    private int chestPosY;

    // Chest class constructor
    public Chest(int value, boolean isOpened, int chestPosX, int chestPosY) {
        // Add constructor implementation
    }

    // Getters and setters for instance fields
    // Add getters and setters for each instance field
}
```

### Monster.java

```java
public class Monster {
    // Instance fields
    private int damage;
    private boolean isAlive;
    private int monsterPosX;
    private int monsterPosY;

    // Monster class constructor
    public Monster(int damage, boolean isAlive, int monsterPosX, int monsterPosY) {
        // Add constructor implementation
    }

    // Getters and setters for instance fields
    // Add getters and setters for each instance field
}
```

### Game.java

```java
public class Game {
    public static void main(String[] args) {
        // Create new Player, Chests, Monsters
        // Loop for continuous gameplay until players walks into a Monster
    }
}
```