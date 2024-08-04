```java
class Player {
    private int xPosition;
    private int yPosition;

    public Player(int xPosition, int yPosition){
        if(xPosition < 0 || yPosition < 0) {
            throw new IllegalArgumentException("Position must be positive.");
        }
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    } 

    public int getXPosition() { return this.xPosition; }

    public void setXPosition(int xPosition){
        if(xPosition < 0) {
            throw new IllegalArgumentException("Position must be positive.");
        }
        this.xPosition = xPosition;
    }

    public int getYPosition() { return this.yPosition; }

    public void setYPosition(int yPosition){
        if(yPosition < 0) {
            throw new IllegalArgumentException("Position must be positive.");
        }
        this.yPosition = yPosition;
    } 
    
    public void movePlayer(int newXPosition, int newYPosition) {
        setXPosition(newXPosition);
        setYPosition(newYPosition);
    }
}


class Score {
    private int points;

    public Score(int points) {
        if(points < 0){
            throw new IllegalArgumentException("Points must be positive.");
        }
        this.points = points;
    } 

    public int getPoints() { return this.points; }

    public void setPoints(int newPoints){
        if(newPoints < 0){
            throw new IllegalArgumentException("Points must be positive.");
        }
        this.points = newPoints;
    }

    public void increaseScore(int increment){
        if(increment < 0){
            throw new IllegalArgumentException("Increment must be positive.");
        }
        setPoints(getPoints()+increment);
    }
}


class Enemy {
    private int xPosition;
    private int yPosition;

    public Enemy(int xPosition, int yPosition) {
        if(xPosition < 0 || yPosition < 0){
            throw new IllegalArgumentException("Position must be positive.");
        }
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    } 
 
    public int getXPosition() { return this.xPosition; }

    public void setXPosition(int xPosition){
        if(xPosition < 0){
            throw new IllegalArgumentException("Position must be positive.");
        }
        this.xPosition = xPosition;
    }

    public int getYPosition(){ return this.yPosition; }

    public void setYPosition(int yPosition){
        if(yPosition < 0){
            throw new IllegalArgumentException("Position must be positive.");
        }
        this.yPosition = yPosition;
    } 
}


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