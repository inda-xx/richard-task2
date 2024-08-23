`GameCharacter.java` code and its corresponding tests in `GameCharacterTest.java`:

GameCharacter.java

```java
public class GameCharacter {
    // Instance fields
    private String name;
    private int health;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor to initialize the GameCharacter
    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
        this.score = 0;
        this.positionX = 0;
        this.positionY = 0;
    }

    // Getters and setters for encapsulation
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }
    public int getPositionX() { return positionX; }
    public void setPositionX(int positionX) { this.positionX = positionX; }
    public int getPositionY() { return positionY; }
    public void setPositionY(int positionY) { this.positionY = positionY; }

    // Method to move the player up
    public void moveUp() {
        positionY += 1;
        System.out.println(name + " moves up to (" + positionX + ", " + positionY + ")");
    }

    // Method to move the player down
    public void moveDown() {
        positionY -= 1;
        System.out.println(name + " moves down to (" + positionX + ", " + positionY + ")");
    }

    // Method to move the player left
    public void moveLeft() {
        positionX -= 1;
        System.out.println(name + " moves left to (" + positionX + ", " + positionY + ")");
    }

    // Method to move the player right
    public void moveRight() {
        positionX += 1;
        System.out.println(name + " moves right to (" + positionX + ", " + positionY + ")");
    }

    // Method to update the score with given points
    public void updateScore(int points) {
        score += points;
        System.out.println("Score updated! Current score: " + score);
    }

    // Method for interacting with an enemy
    public void interactWithEnemy(GameCharacter enemy) {
        if (this.health > 0 && enemy.health > 0) {
            System.out.println(name + " attacks " + enemy.name + "!");
            enemy.health -= 10;
            if (enemy.health < 0) enemy.health = 0;
            System.out.println(enemy.name + " health is now " + enemy.health);

            if (enemy.health <= 0) {
                System.out.println(enemy.name + " is defeated!");
                updateScore(10);
            }
        }
    }

    // Main method to run the game simulation
    public static void main(String[] args) {
        GameCharacter hero = new GameCharacter("Hero", 100);
        GameCharacter enemy = new GameCharacter("Enemy", 50);

        hero.moveUp();
        hero.moveRight();
        hero.interactWithEnemy(enemy);
        hero.updateScore(5);
    }
}
```

GameCharacterTest.java

```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameCharacterTest {
    private GameCharacter hero;
    private GameCharacter enemy;

    @Before
    public void setUp() {
        hero = new GameCharacter("Hero", 100);
        enemy = new GameCharacter("Enemy", 50);
    }

    @Test
    public void testCharacterInitialization() {
        assertEquals("Hero", hero.getName());
        assertEquals(100, hero.getHealth());
        assertEquals(0, hero.getScore());
        assertEquals(0, hero.getPositionX());
        assertEquals(0, hero.getPositionY());
    }

    @Test
    public void testMovement() {
        hero.moveUp();
        assertEquals(1, hero.getPositionY());
        hero.moveDown();
        assertEquals(0, hero.getPositionY());
        hero.moveLeft();
        assertEquals(-1, hero.getPositionX());
        hero.moveRight();
        assertEquals(0, hero.getPositionX());
    }

    @Test
    public void testScoreUpdate() {
        hero.updateScore(10);
        assertEquals(10, hero.getScore());
        hero.updateScore(5);
        assertEquals(15, hero.getScore());
    }

    @Test
    public void testEnemyInteraction() {
        hero.interactWithEnemy(enemy);
        assertEquals(40, enemy.getHealth());
        hero.interactWithEnemy(enemy);
        hero.interactWithEnemy(enemy);
        hero.interactWithEnemy(enemy);
        hero.interactWithEnemy(enemy);
        assertEquals(0, enemy.getHealth());
        assertEquals(10, hero.getScore());
    }

    @Test
    public void testEnemyDefeatScoreUpdate() {
        hero.interactWithEnemy(enemy);
        hero.interactWithEnemy(enemy);
        hero.interactWithEnemy(enemy);
        hero.interactWithEnemy(enemy);
        hero.interactWithEnemy(enemy);
        assertEquals(0, enemy.getHealth());
        assertEquals(10, hero.getScore());
    }
}
```

These files implement the game character with movement and interactions as well as corresponding unit tests to ensure proper functionality and coverage of different cases, including boundary conditions.