Player.java
```java
public class Player {
    private String name;
    private int posX;
    private int posY;
    private int score;

    public Player(String name, int posX, int posY, int score){
        this.name = name;
        this.posX = posX;
        this.posY = posY;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        if (posX >= 0){
            this.posX = posX;
        }
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        if (posY >= 0){
            this.posY = posY;
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score >= 0){
            this.score = score;
        }
    }

    public void printPlayerStatus() {
        System.out.println("Current Player Status:");
        System.out.println("Name: " + name);
        System.out.println("Position: (" + posX + ", " + posY + ")");
        System.out.println("Score: " + score);
    } 
}
```

Enemy.java
```java
public class Enemy {
    private int posX;
    private int posY;

    public Enemy(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        if (posX >= 0){
            this.posX = posX;
        }
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        if (posY >= 0){
            this.posY = posY;
        }
    }
}
```

Item.java
```java
public class Item {
    private int posX;
    private int posY;

    public Item(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        if (posX >= 0){
            this.posX = posX;
        }
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        if (posY >= 0){
            this.posY = posY;
        }
    }
}
```

Game.java
```java
import java.util.Random;

public class Game {
    private static Player player;
    private static Enemy enemy;
    private static Item item;

    public static void main(String[] args) {
        player = new Player("John Doe", 1, 1, 0);
        spawnEnemy();
        spawnItem();

        // Control the flow of the game here

        player.printPlayerStatus();
    }

    public static void spawnEnemy() {
        Random rand = new Random();
        enemy = new Enemy(rand.nextInt(10), rand.nextInt(10));
    }

    public static void spawnItem() {
        Random rand = new Random();
        item = new Item(rand.nextInt(10), rand.nextInt(10));
    }
}
```

PlayerTest.java, EnemyTest.java, and ItemTest.java should be in a separate test directory following the Maven directory structure convention. And you should also include test cases for the Game.java but it is not included here due to it being specifically related to the game logic and IO streams which would vary greatly from project to project.