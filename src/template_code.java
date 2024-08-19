class Spaceship {
    private String spaceshipID;
    private int health;
    private int attackDamage;
    private boolean isDestroyed;

    public Spaceship(String spaceshipID, int health, int attackDamage) {
        this.spaceshipID = spaceshipID;
        this.health = health;
        this.attackDamage = attackDamage;
        this.isDestroyed = false;
    }

    // getters
    public String getSpaceshipID() { return spaceshipID; }
    public int getHealth() { return health; }
    public int getAttackDamage() { return attackDamage; }
    public boolean getIsDestroyed() { return isDestroyed; }

    // setters
    public void setSpaceshipID(String spaceshipID) { this.spaceshipID = spaceshipID; }
    public void setHealth(int health) { this.health = health; }
    public void setAttackDamage(int attackDamage) { this.attackDamage = attackDamage; }
    public void setIsDestroyed(boolean isDestroyed) { this.isDestroyed = isDestroyed; }
    
    // attack method
    public void attack(Alien target) {
        target.setHealth(target.getHealth() - this.attackDamage);
        if (target.getHealth() <= 0) {
            target.setIsDestroyed(true);
        }
    }
}

class Alien {
    private String alienID;
    private int health;
    private boolean isDestroyed;

    public Alien(String alienID, int health) {
        this.alienID = alienID;
        this.health = health;
        this.isDestroyed = false;
    }

    // getters
    public String getAlienID() { return alienID; }
    public int getHealth() { return health; }
    public boolean getIsDestroyed() { return isDestroyed; }

    // setters
    public void setAlienID(String alienID) { this.alienID = alienID; }
    public void setHealth(int health) { this.health = health; }
    public void setIsDestroyed(boolean isDestroyed) { this.isDestroyed = isDestroyed; }
}

class Score {
    private int spaceshipScore;
    private int alienScore;

    // getters
    public int getSpaceshipScore() { return spaceshipScore; }
    public int getAlienScore() { return alienScore; }

    // setters
    public void setSpaceshipScore(int spaceshipScore) { this.spaceshipScore = spaceshipScore; }
    public void setAlienScore(int alienScore) { this.alienScore = alienScore; }
}

public class Main {
    public static void main(String[] args) {
        Spaceship spaceship1 = new Spaceship("S1", 100, 50);
        Alien alien1 = new Alien("A1", 50);
        Score score = new Score();
        
        spaceship1.attack(alien1);
        if(alien1.getIsDestroyed()) {
            score.setSpaceshipScore(score.getSpaceshipScore() + 1);
        }
         
        System.out.println("Spaceship ID: " + spaceship1.getSpaceshipID());
        System.out.println("Spaceship Health: " + spaceship1.getHealth());
        System.out.println("Spaceship Attack Damage: " + spaceship1.getAttackDamage());
        System.out.println("Spaceship Score: " + score.getSpaceshipScore());
        System.out.println("Alien ID: " + alien1.getAlienID());
        System.out.println("Alien Health: " + alien1.getHealth());
        System.out.println("Alien destroyed: " + alien1.getIsDestroyed());
    }
}
