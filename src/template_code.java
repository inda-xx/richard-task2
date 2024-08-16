
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
