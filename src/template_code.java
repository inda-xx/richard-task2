class Hunter {
    // Fields
    private String hunterName;
    private int xLocation;
    private int yLocation;
    private int score;

    // Constructor
    public Hunter(String name, int x, int y) {
        this.hunterName = name;
        this.xLocation = x;
        this.yLocation = y;
        this.score = 0;  // all Hunters start with a score of 0
    }

    // Getters
    public String getName() {
        return this.hunterName;
    }

    public int getXLocation() {
        return this.xLocation;
    }

    public int getYLocation() {
        return this.yLocation;
    }

    public int getScore() {
        return this.score;
    }

    // Setters
    public void setXLocation(int x) {
        this.xLocation = x;
    }

    public void setYLocation(int y) {
        this.yLocation = y;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Method for scoring
    public void tallyScore() {
        // Assuming 1 point for avoiding an enemy
        this.score += 1;
    }

    // Method for moving the hunter
    public void move(int x, int y, Enemy enemy) {
        this.xLocation = x;
        this.yLocation = y;
        if (this.xLocation == enemy.getXLocation() && this.yLocation == enemy.getYLocation()) {
            this.score -= enemy.getStrength();
        }
    }

    // Method to print info
    public void printInfo() {
        System.out.println("Hunter Name: " + this.hunterName + ", Location: " + this.xLocation + ", " + this.yLocation + ", Score: " + this.score);
    }
}

class Enemy {
    // Fields
    private String enemyType;
    private int strength;
    private int xLocation;
    private int yLocation;

    // Constructor
    public Enemy(String type, int strength, int x, int y) {
        this.enemyType = type;
        this.strength = strength;
        this.xLocation = x;
        this.yLocation = y;
    }

    // Getters
    public String getType() {
        return this.enemyType;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getXLocation() {
        return this.xLocation;
    }

    public int getYLocation() {
        return this.yLocation;
    }

    // Setters
    public void setStrength(int strength) {
        this.strength = strength;
    }

    // Method to print info
    public void printInfo() {
        System.out.println("Enemy Type: " + this.enemyType + ", Location: " + this.xLocation + ", " + this.yLocation + ", Strength: " + this.strength);
    }
}

// Main method
public static void main(String[] args) {
    // Create an instance of the Hunter class
    Hunter hunter = new Hunter("Role", 0, 0);

    // Create an instance of the Enemy class
    Enemy enemy = new Enemy("Orc", 10, 2, 2);

    // Game loop
    Boolean gameOver = false;
    while (!gameOver) {
        // Imaginary input received from user to move to a location
        int x = 5;
        int y = 5;
        hunter.move(x, y, enemy);
        
        if (hunter.getScore() < -50) { // End game if hunter's score is less than -50
            gameOver = true;
        }
    }
}