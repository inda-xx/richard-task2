#### Class `Player.java`
```java
public class Player {
    private int xPos;
    private int yPos;
    // score to track the point
    private int score;

  // Add necessary methods for the Player class, which includes getting and setting position and scoring
}
```

#### Class `Enemy.java`
```java
public class Enemy {
    private int xPos;
    private int yPos;

  // Add necessary methods for the Enemy class which includes getting and setting position
}

```

#### Class `Game.java`
```java
public class Game {
    // Instantiate Player and Enemy
    Player player;
    Enemy enemy;

    // Add necessary methods that implement the rules of the game, player movement, enemy interaction and scoring system
}
```

#### Class `Main.java`
```java
public class Main {
    public static void main(String[] args) {
        // Instantiate Game
        Game game = new Game();

        // Call methods from the Game instance to start and run the game
    }
}
```

### Instructions
1. **Player movement:** Implement methods in class `Player` to control the position (`xPos`, `yPos`) of the player in the game. You can use the methods `get` and `set` to achieve this.

2. **Enemy interaction:** Implement methods in the class `Enemy` to control the position (`xPos`, `yPos`) of the enemy in the game. It should move towards the player's direction in each move. 

3. **Scoring system:** Implement a scoring system where the score increases by one point for every successful movement of the player and decreases by one point when the player is caught by the enemy. Maintain a `score` variable in class `Player`.

4. Implement the game logic in class `Game`. It should use the methods from `Player` and `Enemy` classes to control the play. 

5. In `Main`, create an instance of `Game` and start the game. You may need to implement additional methods or command-line inputs to interact with the game. 

Have fun coding the game!