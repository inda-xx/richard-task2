```Java
class Player {
    private String name;
    private int score;
    private int healthPOINTS;
    private boolean isAlive;

    public Player (String name, int score, int healthPOINTS, boolean isAlive) {
        this.name = name;
        this.score = score;
        this.healthPOINTS = healthPOINTS;
        this.isAlive = isAlive;
    }

    public String getName() { return name; }
    public int getScore() { return score; }
    public int getHealthPOINTS() { return healthPOINTS; }
    public boolean getIsAlive() { return isAlive; }

    public void setName(String name) { this.name = name; }
    public void setScore(int score) { this.score = score; }
    public void setHealthPOINTS(int healthPOINTS) { 
        this.healthPOINTS = healthPOINTS;
        if (healthPOINTS <= 0) {
            this.isAlive = false;
        }
    }
    public void setIsAlive(boolean isAlive) { this.isAlive = isAlive; }

    public void move() { System.out.println("Player is moving"); }
    public void jump() { System.out.println("Player is jumping"); }
    public void attack() { System.out.println("Player is attacking"); }

    public void playerAttack(Enemy enemy) { 
        enemy.setHealthPOINTS(enemy.getHealthPOINTS() - 50); 
    }
}

class Enemy {
    private String name;
    private int healthPOINTS;
    private String type;
    private boolean isDefeated;

    public Enemy (String name, int healthPOINTS, String type, boolean isDefeated) {
        this.name = name;
        this.healthPOINTS = healthPOINTS;
        this.type = type;
        this.isDefeated = isDefeated;
    }

    public String getName() { return name; }
    public int getHealthPOINTS() { return healthPOINTS; }
    public String getType() { return type; }
    public boolean getIsDefeated() { return isDefeated; }

    public void setName(String name) { this.name = name; }
    public void setHealthPOINTS(int healthPOINTS) { 
        this.healthPOINTS = healthPOINTS; 
        if (healthPOINTS <= 0) {
            this.isDefeated = true;
        }
    }
    public void setType(String type) { this.type = type; }
    public void setIsDefeated(boolean isDefeated) { this.isDefeated = isDefeated; }

    public void move() { System.out.println("Enemy is moving"); }
    public void jump() { System.out.println("Enemy is jumping"); }
    public void attack() { System.out.println("Enemy is attacking"); }

    public void enemyAttack(Player player) { 
        player.setHealthPOINTS(player.getHealthPOINTS() - 50); 
    }
}
```
In the solution above, the `setHealthPOINTS()` method for both Player and Enemy classes contains logic to change the 'isAlive' and 'isDefeated' status when their healthPOINTS reaches 0 or below. This fits the game logic better as a Player or Enemy should be considered not alive or defeated when their healthPOINTS are 0 or below.