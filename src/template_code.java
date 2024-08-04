STEP 1: **Creating Player, Enemy, and Score Classes**

In the `src` folder of your project, create three new classes:

- `Player.java`
- `Score.java`
- `Enemy.java`

These classes will represent different elements within your game. They should have following fields:

| Class | Fields |
| ----- | ------ |
| Player | Int xPosition, yPosition |
| Score | Int points |
| Enemy | Int xPosition, yPosition |

Note: The `xPosition` and `yPosition` fields represent the coordinates of the player and enemy objects in a 2D game board.

STEP 2: **Creating Getters and Setters (Accessors and Mutators)**

Provide each field in each class with appropriate getters and setters. `Player` and `Enemy` classes will have `getXPosition()`, `getYPosition()`, `setXPosition()`, and `setYPosition()` methods, while the `Score` class will have `getPoints()` and `setPoints()` methods.

STEP 3: **Creating Constructors**

For each class, provide a constructor that takes all fields as arguments and sets them to the provided values. 

STEP 4: **Creating Movement and Scoring Methods**

In `Player.java`, create a method called `movePlayer` which moves the player to a new position (updates the `xPosition` and `yPosition` fields).

In `Score.java`, create a method called `increaseScore` which increases the player's points.

STEP 5: **Creating a Game Flow in Main Method**

In your `main` method, you should instantiate a `Player`, `Score`, and `Enemy`. The flow of your game should revolve around the player moving, avoiding touching enemy, and score incrementing each time the player successfully evades enemy. 

Please make sure to test all your methods.

Use the following existing code as inspiration to get started.

### Existing Code

```java
class Player {
    
    private int xPosition;
    private int yPosition;
  
    public Player(int xPosition, int yPosition){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    } 
  
    public int getXPosition(){
      return this.xPosition;
    }
  
    public void setXPosition(int xPosition){
      this.xPosition = xPosition;
    }
  
    public int getYPosition(){
      return this.yPosition;
    }
  
    public void setYPosition(int yPosition){
      this.yPosition = yPosition;
    } 
    
    public void movePlayer(int newXPosition, int newYPosition){
      setXPosition(newXPosition);
      setYPosition(newYPosition);
    }
}
```
```java
class Score {
    
    private int points;
    
    public Score(int points){
        this.points = points;
    } 
   
   public int getPoints(){
     return this.points;
   }
   
   public void setPoints(int newPoints){
     this.points = newPoints;
   }
   
   public void increaseScore(int increment){
      setPoints(getPoints()+increment);
   }
}
```
```java
class Enemy {
    
    private int xPosition;
    private int yPosition;
    
    public Enemy(int xPosition, int yPosition){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    } 
  
    public int getXPosition(){
      return this.xPosition;
    }
  
    public void setXPosition(int xPosition){
      this.xPosition = xPosition;
    }
  
    public int getYPosition(){
      return this.yPosition;
    }
  
    public void setYPosition(int yPosition){
      this.yPosition = yPosition;
    } 
}
```
```java
public class Main {
    public static void main(String[] args) {
        Player player = new Player(0,0);
        Score score = new Score(0);
        Enemy enemy = new Enemy(5,5);
        
        // game runs until player collides with the enemy
        while(player.getXPosition() != enemy.getXPosition() || player.getYPosition() != enemy.getYPosition()){
          
          // player successfully evades enemy
          score.increaseScore(1);
          
          // player and enemy move
          player.movePlayer(player.getXPosition() + 1, player.getYPosition() + 1);
          enemy.setXPosition(enemy.getXPosition() - 1);
          enemy.setYPosition(enemy.getYPosition() - 1);
        }
        
        System.out.println("Game Over! Your Score: "+ score.getPoints());

    } // end main method
}
```