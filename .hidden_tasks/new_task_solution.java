```java
public class Player {
    private String name;
    private int health;
    private int score;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.score = 0;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void moveUp() {
        System.out.println("Player moved up");
    }

    public void moveDown() {
        System.out.println("Player moved down");
    }

    public void moveLeft() {
        System.out.println("Player moved left");
    }

    public void moveRight() {
        System.out.println("Player moved right");
    }

    public void attack(Enemy enemy) {
        if(enemy.getHealth() > 0) {
            enemy.setHealth(enemy.getHealth() - 10);
        }
        System.out.println("Enemy's remaining health: " + enemy.getHealth());
    }
}

public class Enemy {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = Math.max(0, health);
    }
}

public class Scoreboard {
    public void printScore(Player player) {
        System.out.println("Player's current score: " + player.getScore());
    }
}

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Gamer");
        Enemy enemy = new Enemy(100);
        Scoreboard scoreboard = new Scoreboard();

        player.attack(enemy);
        scoreboard.printScore(player);
    }
}
```

- I'd like to note that the printScore method in the Scoreboard class does not affect any class properties or return any value. As such, I've implemented a unit test for it, but the only meaningful way to evaluate its functionality is visually, in an actual running application.
- I also added a test case for an invalid attack, i.e., when the player tries to attack an enemy with zero or less health. To prevent the enemy's health from going into negative values, I created a check in the attack method to see if the enemy's health was greater than zero before deducting health. In the enemy's class, I also ensure that the health value does not go below zero in the setter method.
- While this code fits the current requirements, additional error handling and validation may be necessary as the game's complexity increases. For example, you could add checks to prevent setting negative player scores or health, or add additional tests for the player movement methods.