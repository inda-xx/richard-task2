```java
class Player {
    // Define private instance fields Player's attributes
    private String playerName;
    private int playerScore;
    private int playerHealth;
    private boolean isAlive;

    // Create constructor method to initialize Player's attributes
    public Player(String playerName, int playerScore, int playerHealth, boolean isAlive) {
        this.playerName = playerName;
        this.playerScore = playerScore;
        this.playerHealth = playerHealth;
        this.isAlive = isAlive;
    }

    // Getter methods
    public String getPlayerName() { return playerName; }
    public int getPlayerScore() { return playerScore; }
    public int getPlayerHealth() { return playerHealth; }
    public boolean getIsAlive() { return isAlive; }

    // Setter methods
    public void setPlayerName(String playerName) { this.playerName = playerName; }
    public void setPlayerScore(int playerScore) { this.playerScore = playerScore; }
    public void setPlayerHealth(int playerHealth) { this.playerHealth = playerHealth; }
    public void setIsAlive(boolean isAlive) { this.isAlive = isAlive; }

    // Create printStatus() method to print player's information
    public void printStatus() {
        // write your code here
    }

    public void encounterEnemy(Enemy enemy) {
        // write your logic of encountering with enemy
    }

    // TBD: main method
    // Create some player and enemy objects, call encounterEnemy method and printStatus method
}

class Enemy {
    // Define private instance fields of enemy's attributes
    private String enemyType;
    private int enemyStrength;

    // Create constructor method to initialize Enemy's attributes
    public Enemy(String enemyType, int enemyStrength) {
        this.enemyType = enemyType;
        this.enemyStrength = enemyStrength;
    }

    // Getter methods
    public String getEnemyType() { return enemyType; }
    public int getEnemyStrength() { return enemyStrength; }

    // Setter methods
    public void setEnemyType(String enemyType) { this.enemyType = enemyType; }
    public void setEnemyStrength(int enemyStrength) { this.enemyStrength = enemyStrength; }
}
```
This template outlines the structure of `Player` and `Enemy` classes according to the task description. Note the identical structure within the getters and setters methods. Fields that need to be modified are marked using placeholder comments. Also, it's important to note the use of `this` keyword to avoid variable shadowing. Make sure to customize the methods `printStatus` and `encounterEnemy()` according to your requirement.