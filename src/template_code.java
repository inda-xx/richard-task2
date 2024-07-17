```java
// Main Game class
public class Game{
  Player player;
  List<Enemy> enemies;
  int score;

  public Game(){
    // Initialize the player, enemies and score
  }

  // Main game loop
  public void startGame(){
    // implement the game logic
  }

  public static void main(String[] args){
    // Start a new game.
    Game game = new Game();
    game.startGame();
  }
}

// Player class
class Player{
  int posX, posY; // Player's current position
  
  public Player(){
    // Initialize the player's position
  }

  // Moves the player to a new position
  public void move(String direction){
    // Implement the logic to move the player
  }
}

// Enemy class
class Enemy{
  int posX, posY; // Enemy's current position
  boolean isAlive;

  public Enemy(){
    // Initialize the enemy's position and the isAlive variable
  }

  // Moves the enemy to a new position
  public void move(){
    // Implement the logic to move the enemy
  }

  public void interact(Player player){
    // Implement the logic for interaction between the enemy and the player
  }
}
```

Please note that you will need to complete the logic in the provided template according to the task requirements. This includes the details of how the player and the enemy are initialized, how they move and how they interact.