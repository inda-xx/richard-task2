In order to conserve space, only the methods to be implemented per task instructions are shown below for `Player.java`, `Enemy.java`, and `Score.java`. Assuming these are added to each respective class in your template.

```java
// Player.java 
public Player(String playerName, int playerHealth, int playerAttack, int playerDefense, boolean playerAlive) {
    this.playerName = playerName;
    this.playerHealth = playerHealth;
    this.playerAttack = playerAttack;
    this.playerDefense = playerDefense;
    this.playerAlive = playerAlive;
}

void battle(Enemy enemy) {
    int damage = this.playerAttack - enemy.getEnemyDefense(); 
    damage = Math.max(damage, 0);
    
    int enemyHealth = enemy.getEnemyHealth() - damage;
    enemy.setEnemyHealth(enemyHealth);
    
    boolean enemyAlive = enemyHealth > 0;
    enemy.setEnemyAlive(enemyAlive);
}


// Enemy.java
public Enemy(int enemyId, int enemyHealth, int enemyAttack, int enemyDefense, boolean enemyAlive) {
    this.enemyId = enemyId;
    this.enemyHealth = enemyHealth;
    this.enemyAttack = enemyAttack;
    this.enemyDefense = enemyDefense;
    this.enemyAlive = enemyAlive;
}


// Score.java
public Score(int playerId, int enemiesDefeated, int totalScore) {
    this.playerId = playerId;
    this.enemiesDefeated = enemiesDefeated;
    this.totalScore = totalScore;
}
    
public void updateScore(Player player, Enemy enemy) {
    // Create local variable with same name as instance variable
    int enemiesDefeated = this.enemiesDefeated;

    if (!enemy.isEnemyAlive()) {
        enemiesDefeated++; // this is increasing local variable not instance variable
        this.totalScore += enemy.getEnemyId() * 10;
    }

    // However, if we want to increase the instance variable, we need to use 'this' keyword
    this.enemiesDefeated = enemiesDefeated; // now, instance variable is updated in either case
}

```