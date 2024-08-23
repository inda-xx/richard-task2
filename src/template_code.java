```java
// You will need to import List and ArrayList for this assignment
import java.util.List;
import java.util.ArrayList;


class Game {
  
  private String playerName;
  private int playerScore;
  private boolean gameStatus;
  private List<String> enemies;   // adjust the datatype of enemies as per requirement

  // Constructor
  public Game(String playerName, int playerScore, boolean gameStatus) {
    this.playerName = playerName;
    this.playerScore = playerScore;
    this.gameStatus = gameStatus;
    this.enemies = new ArrayList<>();
  }

  // Getters
  public String getPlayerName() {
    return playerName;
  }

  public int getPlayerScore() {
    return playerScore;
  }

  public boolean isGameStatus() {
    return gameStatus;
  }

  public List<String> getEnemies() {
    return enemies;
  }

  // Setters
  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }

  public void setPlayerScore(int playerScore) {
    this.playerScore = playerScore;
  }

  public void setGameStatus(boolean gameStatus) {
    this.gameStatus = gameStatus;
  }

  public void setEnemies(List<String> enemies) {
    this.enemies = enemies;
  }

  // Implement printGameInfo() method here
  

  // Implement player movement methods such as moveLeft() and moveRight() here
    

  // Implement scoring system with a method named updateScore() here
  

  // Implement the Enemy class here
    

  public static void main(String[] args) {
    // Create a new "Game" object
    Game newGame = new Game("Player1", 0, true);

    // Modify this section according to your needs
  } 
}
```