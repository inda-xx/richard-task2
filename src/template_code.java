// Player.java
public class Player {
    private String playerName;
    private int playerHealth;
    private int playerAttack;
    private int playerDefense;
    private boolean playerAlive;

    // Constructor for player
    public Player(String playerName, int playerHealth, int playerAttack, int playerDefense) {
        this.playerName = playerName;
        this.playerHealth = playerHealth;
        this.playerAttack = playerAttack;
        this.playerDefense = playerDefense;
        this.playerAlive = true; // Default the player to being alive
    }

    // Getter and setter methods for all instance variables
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public int getPlayerAttack() {
        return playerAttack;
    }

    public void setPlayerAttack(int playerAttack) {
        this.playerAttack = playerAttack;
    }

    public int getPlayerDefense() {
        return playerDefense;
    }

    public void setPlayerDefense(int playerDefense) {
        this.playerDefense = playerDefense;
    }

    public boolean isPlayerAlive() {
        return playerAlive;
    }

    public void setPlayerAlive(boolean playerAlive) {
        this.playerAlive = playerAlive;
    }

    // battle method as per exercise 3.4
    public void battle(Enemy enemy) {
        int damage = playerAttack - enemy.getEnemyDefense();
        if (damage < 0) {
            damage = 0;
        }
        enemy.setEnemyHealth(enemy.getEnemyHealth() - damage);

        if (enemy.getEnemyHealth() <= 0) {
            enemy.setEnemyAlive(false);
        }

        // Print the battle summary
        System.out.println("Battle Summary:");
        System.out.println("Enemy ID: " + enemy.getEnemyId());
        System.out.println("Damage dealt: " + damage);
        System.out.println("Remaining enemy health: " + enemy.getEnemyHealth());
        System.out.println("Enemy alive: " + enemy.isEnemyAlive());
    }

    public static void main(String[] args) {
        // Instantiate a Player object and test the getter methods by printing to console.
        Player player = new Player("Hero", 100, 20, 10);
        System.out.println("Player Name: " + player.getPlayerName());
        System.out.println("Player Health: " + player.getPlayerHealth());
        System.out.println("Player Attack: " + player.getPlayerAttack());
        System.out.println("Player Defense: " + player.getPlayerDefense());
        System.out.println("Player Alive: " + player.isPlayerAlive());
    }
}

// Enemy.java
public class Enemy {
    private int enemyId;
    private int enemyHealth;
    private int enemyAttack;
    private int enemyDefense;
    private boolean enemyAlive;

    // Constructor for enemy
    public Enemy(int enemyId, int enemyHealth, int enemyAttack, int enemyDefense) {
        this.enemyId = enemyId;
        this.enemyHealth = enemyHealth;
        this.enemyAttack = enemyAttack;
        this.enemyDefense = enemyDefense;
        this.enemyAlive = true; // Default the enemy to being alive
    }

    // Getter and setter methods for all instance variables
    public int getEnemyId() {
        return enemyId;
    }

    public void setEnemyId(int enemyId) {
        this.enemyId = enemyId;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public void setEnemyHealth(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    public int getEnemyAttack() {
        return enemyAttack;
    }

    public void setEnemyAttack(int enemyAttack) {
        this.enemyAttack = enemyAttack;
    }

    public int getEnemyDefense() {
        return enemyDefense;
    }

    public void setEnemyDefense(int enemyDefense) {
        this.enemyDefense = enemyDefense;
    }

    public boolean isEnemyAlive() {
        return enemyAlive;
    }

    public void setEnemyAlive(boolean enemyAlive) {
        this.enemyAlive = enemyAlive;
    }

    public static void main(String[] args) {
        // Instantiate an Enemy object and test the getter methods by printing to console.
        Enemy enemy = new Enemy(1, 50, 15, 5);
        System.out.println("Enemy ID: " + enemy.getEnemyId());
        System.out.println("Enemy Health: " + enemy.getEnemyHealth());
        System.out.println("Enemy Attack: " + enemy.getEnemyAttack());
        System.out.println("Enemy Defense: " + enemy.getEnemyDefense());
        System.out.println("Enemy Alive: " + enemy.isEnemyAlive());
    }
}


// Score.java
public class Score {
    private int playerId;
    private int enemiesDefeated;
    private int totalScore;

    // Constructor for Score
    public Score(int playerId) {
        this.playerId = playerId;
        this.enemiesDefeated = 0;
        this.totalScore = 0;
    }

    // Getter and Setter for instance variables
    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getEnemiesDefeated() {
        return enemiesDefeated;
    }

    public void setEnemiesDefeated(int enemiesDefeated) {
        this.enemiesDefeated = enemiesDefeated;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public void updateScore(Player player, Enemy enemy) {
        // Local variable with the same name as an instance variable (variable shadowing)
        int totalScore = 0;

        if (!enemy.isEnemyAlive()) {
            enemiesDefeated++;
            this.totalScore += enemy.getEnemyId() * 10;
        }

        // Print the score details
        System.out.println("Score Update:");
        System.out.println("Enemies Defeated: " + enemiesDefeated);
        System.out.println("Total Score: " + this.totalScore);
        System.out.println("Local variable totalScore (shadowing): " + totalScore);
    }

    public static void main(String[] args) {
        // Instantiate a Player, multiple Enemy objects, and a Score object
        Player player = new Player("Hero", 100, 20, 10);
        Enemy enemy1 = new Enemy(1, 50, 15, 5);
        Enemy enemy2 = new Enemy(2, 60, 20, 10);
        Score score = new Score(player.getPlayerName().hashCode());

        // Simulate battles
        player.battle(enemy1);
        score.updateScore(player, enemy1);

        player.battle(enemy2);
        score.updateScore(player, enemy2);
    }
}

