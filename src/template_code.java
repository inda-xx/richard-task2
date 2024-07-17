Here is a basic template to get you started:

```java
public class Game {
    // Game class will manage the game status and mechanics
}

public class Player {
    // Player class will handle the player character and its functionalities, such as movement
}

public class Enemy {
    // Enemy class will handle the enemies and their functionalities
}
```

You will need to implement the following details for each class:

- **Game:** The Game class should set up the game board, initialize a Player, initialize some enemies and manage the game progression over time. This includes updating the player's score, and ending the game if the player collides with an enemy.

- **Player:** The Player should have attributes for its position (`int` x, `int` y), score (`int` score), and status (`boolean` isAlive). A 'move' method should update the position of the player. 

- **Enemy:** The Enemy class should have attributes for its position (`int` x, `int` y), and a method to move around the game board.

Start by identifying what other attributes and methods each class should have. After you have planned out your classes, start implementing the functionality for each class one by one. Start small and test as you go along to make sure each part works before progressing to the next.