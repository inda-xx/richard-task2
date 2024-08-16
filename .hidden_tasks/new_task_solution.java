```java
import java.util.Random;

class Player {
    private String playerName;
    private int playerScore;
    private int playerHealth;
    private boolean isAlive;

    public Player(String playerName, int playerScore, int playerHealth, boolean isAlive) {
        this.playerName = playerName;
        this.playerScore = playerScore;
        this.playerHealth = playerHealth;
        this.isAlive = isAlive;
    }

    public String getPlayerName() { return playerName; }
    public int getPlayerScore() { return playerScore; }
    public int getPlayerHealth() { return playerHealth; }
    public boolean getIsAlive() { return isAlive; }

    public void setPlayerName(String playerName) { this.playerName = playerName; }
    public void setPlayerScore(int playerScore) { this.playerScore = playerScore; }
    public void setPlayerHealth(int playerHealth) { this.playerHealth = playerHealth; }
    public void setIsAlive(boolean isAlive) { this.isAlive = isAlive; }

    public void printStatus() {
        System.out.println("Player [ Name: " + playerName + ", Score: " + playerScore + ", Health: " + playerHealth + ", Alive: " + isAlive + " ]");
    }

    public void encounterEnemy(Enemy enemy) {
        Random random = new Random();
        if (random.nextBoolean()) { // true with 50% probability
            playerScore += enemy.getEnemyStrength();
        } else {
            isAlive = false;
        }
    }
}

class Enemy {
    private String enemyType;
    private int enemyStrength;

    public Enemy(String enemyType, int enemyStrength) {
        this.enemyType = enemyType;
        this.enemyStrength = enemyStrength;
    }

    public String getEnemyType() { return enemyType; }
    public int getEnemyStrength() { return enemyStrength; }

    public void setEnemyType(String enemyType) { this.enemyType = enemyType; }
    public void setEnemyStrength(int enemyStrength) { this.enemyStrength = enemyStrength; }
}
```

In the test file, I am testing the getters and setters of the Player class and Enemy class which check if the returned value is as expected and the values set correctly reflect when fetched with getter.

These tests also cover boundary conditions such as highest and lowest possible player health, player being dead or alive, gaining new score, setting and getting enemy type and strength.

We also test the encounterEnemy method of Player class, but only for the outcome since it randomly lets the player either win a point or lose and die. It is sufficient to test if one of these two outcomes happened.

In the solution, printStatus() method in Player class is created that prints out the player's status. encounterEnemy() method is also added to Player class that lets a player encounter an enemy with an equal chance of either gaining points equal to the enemy's strength or dying.