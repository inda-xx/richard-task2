
class CharacterX {
    // Instance Variables
    private String characterName;
    private int xPos;
    private int yPos;
    private int health;
    private int strength;
    private int score;

    // Constructor
    public CharacterX(String characterName, int xPos, int yPos, int health, int strength) {
        this.characterName = characterName;
        this.xPos = xPos;
        this.yPos = yPos;
        this.health = health;
        this.strength = strength;
        this.score = 0;
    }
    
    // Getters and Setters
    public String getCharacterName() {
        return characterName;
    }
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
    public int getXPos() {
        return xPos;
    }
    public void setXPos(int xPos) {
        this.xPos = xPos;
    }
    public int getYPos() {
        return yPos;
    }
    public void setYPos(int yPos) {
        this.yPos = yPos;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    
    // Method for moving the character
    public void move(String direction) {
        switch(direction.toUpperCase()) {
            case "UP":
                yPos++;
                gainPoint();
                break;
            case "DOWN":
                yPos--;
                gainPoint();
                break;
            case "LEFT":
                xPos--;
                gainPoint();
                break;
            case "RIGHT":
                xPos++;
                gainPoint();
                break;
            case "STAY":
                break;
            default:
                System.out.println("Invalid direction provided");
        }
    }
    
    // Method for gaining a point
    public void gainPoint() {
        score += 1;
    }
    
    // Method for confrontation
    public void confront(VillainY opponent) {
        if(strength > opponent.getStrength()) {
            int damage = strength - opponent.getStrength();
            opponent.setHealth(opponent.getHealth() - damage);
        } else {
            int damage = opponent.getStrength() - strength;
            health -= damage;
        }
    }
    
    // Method for checking if game is over
    public boolean isGameOver() {
        return health <= 0;
    }
    
    // Method for demonstrating Variable Shadowing
    public void demonstrateShadowing() {
        int health = 10;
        System.out.println("Instance health: " + this.health);
        System.out.println("Local health: " + health);
    }
}

// Class Definition for VillainY
class VillainY {

    // Instance Variables
    private String characterName;
    private int xPos;
    private int yPos;
    private int health;
    private int strength;
    private int score;
    
    // Constructor
    public VillainY(String characterName, int xPos, int yPos, int health, int strength) {
        this.characterName = characterName;
        this.xPos = xPos;
        this.yPos = yPos;
        this.health = health;
        this.strength = strength;
        this.score = 0;
    }
    
    // Getters and Setters
    public String getCharacterName() {
        return characterName;
    }
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
    public int getXPos() {
        return xPos;
    }
    public void setXPos(int xPos) {
        this.xPos = xPos;
    }
    public int getYPos() {
        return yPos;
    }
    public void setYPos(int yPos) {
        this.yPos = yPos;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    
    // Method for moving the character
    public void move(String direction) {
        switch(direction.toUpperCase()) {
            case "UP":
                yPos++;
                gainPoint();
                break;
            case "DOWN":
                yPos--;
                gainPoint();
                break;
            case "LEFT":
                xPos--;
                gainPoint();
                break;
            case "RIGHT":
                xPos++;
                gainPoint();
                break;
            case "STAY":
                break;
            default:
                System.out.println("Invalid direction provided");
        }
    }
    
    // Method for gaining a point
    public void gainPoint() {
        score += 1;
    }
    
    // Method for checking if game is over
    public boolean isGameOver() {
        return health <= 0;
    }
}
