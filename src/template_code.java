// Class Definition for CharacterX
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
    // Add here...
    
    // Method for moving the character
    public void move(String direction) {
        // Add code here...
    }
    
    // Method for gaining a point
    public void gainPoint() {
        // Add code here...
    }
    
    // Method for confrontation
    public void confront(VillainY opponent) {
        // Add code here...
    }
    
    // Method for checking if game is over
    public boolean isGameOver() {
        // Add code here...
    }
    
    // Method for demonstrating Variable Shadowing
    public void demonstrateShadowing() {
        // Add code here...
    }

    // Gameplay and Testing inside the main method
    public static void main(String[] args) {
        // Add code here...
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
    // Add here...
    
    // Method for moving the character
    public void move(String direction) {
        // Add code here...
    }
    
    // Method for gaining a point
    public void gainPoint() {
        // Add code here...
    }
    
    // Method for checking if game is over
    public boolean isGameOver() {
        // Add code here...
    }
}