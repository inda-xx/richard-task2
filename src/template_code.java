class Player {
    private String name;
    private int health;
    private int score;
    private String weapon;

    public Player(int health, String weapon) {
        this.health = health;
        this.weapon = weapon;
    }

    public String getName() {
        return this.name;
    }
    public int getHealth() {
        return this.health;
    }
    public int getScore() {
        return this.score;
    }
    public String getWeapon() {
        return this.weapon;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void fight(Enemy enemy) {
        this.health = this.health - enemy.getWeaponDamage();
    }

    public void playerInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Score: " + this.score);
        System.out.println("Weapon: " + this.weapon);
    }
}

class Enemy {
    private String name;
    private int enemyHealth;
    private String weapon;
    private int weaponDamage;

    public Enemy(int enemyHealth, String weapon) {
        this.enemyHealth = enemyHealth;
        this.weapon = weapon;
    }

    public String getName() {
        return this.name;
    }
    public int getEnemyHealth() {
        return this.enemyHealth;
    }
    public String getWeapon() {
        return this.weapon;
    }
    public int getWeaponDamage() {
        return this.weaponDamage;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEnemyHealth(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }
}

public static void main(String[] args) {
    Player player = new Player(100, "Sword");
    player.setName("Hero");
    player.setScore(0);
  
    Enemy enemy = new Enemy(50, "Axe");
    enemy.setName("Goblin");
    enemy.setWeaponDamage(10);
  
    player.fight(enemy);
  
    System.out.println("Player Health after fight: " + player.getHealth());
}
