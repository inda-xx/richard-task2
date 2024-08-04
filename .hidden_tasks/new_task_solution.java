```java
class Cavemon {
    private String name;
    private int hp;
    private int attack;
    private int defense;
    private int score;
    private boolean isEnemy;

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setHp(int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("HP cannot be negative");
        }
        this.hp = hp;
    }
    
    public void setAttack(int attack) {
        this.attack = attack;
    }
    
    public void setDefense(int defense) {
        this.defense = defense;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public void setIsEnemy(boolean isEnemy) {
        this.isEnemy = isEnemy;
    }

    // Getters
    public String getName() {
        return this.name;
    }
    
    public int getHp() {
        return this.hp;
    }
    
    public int getAttack() {
        return this.attack;
    }
    
    public int getDefense() {
        return this.defense;
    }
    
    public int getScore() {
        return this.score;
    }
    
    public boolean getIsEnemy() {
        return this.isEnemy;
    }

    // Constructor
    public Cavemon(String name, int hp, int attack, int defense, boolean isEnemy) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.isEnemy = isEnemy;
        this.score = 0; 
    }
    
    public boolean isDead() {
        return this.hp <= 0;
    }
    
    // Add a move function for player movement
    public static void move(String direction) {
        // Code to move player in the given direction
    }
    
    // Attack function to do attack damage to the opponent
    public void doAttack(Cavemon opponent) {
        int attackDamage = this.attack - opponent.getDefense();
        if (attackDamage > 0) {
            opponent.setHp(opponent.getHp() - attackDamage);
        }
    }

    // Scoring system based on enemy interactions
    public void updateScore(int newScore) {
        if (newScore > 0) {
            this.score += newScore;
        }
    }

    // Display player info
    public void printInfo() {
        System.out.println("Name: " + this.name + "\n" +
                            "HP: " + this.hp + "\n" +
                            "Attack: " + this.attack + "\n" +
                            "Defense: " + this.defense + "\n" +
                            "Score: " + this.score + "\n" +
                            "Is Enemy: " + this.isEnemy);
    }
    
    public static void main(String[] args) {
        Cavemon player = new Cavemon("Geo", 100, 20, 15, false);
        Cavemon enemy = new Cavemon("Terra", 110, 21, 20, true);
        
        // In a real game this loop would repeat until the game is over
        player.doAttack(enemy);
        enemy.doAttack(player);
        if (enemy.isDead()) {
            player.updateScore(10);
        }
        if (player.isDead()) {
            enemy.updateScore(10);
        }
        player.printInfo();
        enemy.printInfo();
    }
}
```