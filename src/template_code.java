// Import any necessary libraries
import java.util.*;

// Class definition for the Pixel class
class Pixel{
    // Instance variables
    private String color;
    private int speed;
    private int positionX;
    private int positionY;
    private boolean isEnemy;

    // The Pixel constructor
    public Pixel(String color, int speed, int positionX, int positionY, boolean isEnemy){
        this.color = color;
        this.speed = speed;
        this.positionX = positionX;
        this.positionY = positionY;
        this.isEnemy = isEnemy;
    }

    // Getters
    public String getColor() { return color; }
    public int getSpeed() { return speed; }
    public int getPositionX() { return positionX; }
    public int getPositionY() { return positionY; }
    public boolean getIsEnemy() { return isEnemy; }

    // Setters
    public void setColor(String color) { this.color = color; }
    public void setSpeed(int speed) { this.speed = speed; }
    public void setPositionX(int positionX) { this.positionX = positionX; }
    public void setPositionY(int positionY) { this.positionY = positionY; }
    public void setIsEnemy(boolean isEnemy) { this.isEnemy = isEnemy; }
  
    // Implement the move method here

} // end of Pixel class

// Class definition for the Game class
class Game{

    private int score;
    private List<Pixel> pixels; // Use an appropriate List type

    public Game(){
        score = 0;
        pixels = new ArrayList<>(); // Instantiate your List here
    }

    // Implement the start method here

    // Implement the spawnPixel method here

    // Implement the removePixel method here

    // Implement the checkCollision method here

    // Implement the update method here
  

    public static void main(String[] args){
        // Create a new instance of the Game class and start it.
    } // end main method

} // end of Game class