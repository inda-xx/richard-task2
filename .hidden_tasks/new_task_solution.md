Please note, the generated solution is not exhaustive and is a simplified representation of what your game interface might look like.

```java
import java.util.Random;

class Player {
    
  private int position;

  public Player() {
    this.position = 5;
  }

  public int getPosition() {
    return this.position;
  }

  public void setPosition(int position) {
    if(position < 0 || position > 9) {
      throw new IllegalArgumentException("Position must be between 0 and 9");
    }
    
    this.position = position;
  }

}

class Enemy {
  
  private int position;

  public Enemy() {
    this.position = new Random().nextInt(10);
  }

  public int getPosition() {
    return this.position;
  }
}

class Game {
    
  private Player player;
  private Enemy enemy;
  private int score;

  public Game() {
    this.player = new Player();
    this.enemy = new Enemy();
    this.score = 0;
  }

  public void movePlayer(int newPosition) {
    this.player.setPosition(newPosition);
  }

  public void generateEnemy() {
    this.enemy = new Enemy();
  }

  public void playTurn(int newPosition) {
    this.movePlayer(newPosition);
    if(this.player.getPosition() == this.enemy.getPosition()) {
      this.score++;
      this.generateEnemy();
    }
  }
}
```