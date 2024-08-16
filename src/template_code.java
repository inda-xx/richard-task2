```java
// Player class
class Player {

    // Attributes according to the task description
    private String name;
    private int score;
    private int healthPOINTS;
    private boolean isAlive;

    // Constructor
    public Player (/*set the parameters required*/) {
        // Set the fields here
    }

    // Getters
    public String getName() { //implement this }
    public int getScore() { //implement this }
    public int getHealthPOINTS() { //implement this }
    public boolean getIsAlive() { //implement this }

    // Setters
    public void setName(String name) { //implement this }
    public void setScore(int score) { //implement this }
    public void setHealthPOINTS(int healthPOINTS) { //implement this }
    public void setIsAlive(boolean isAlive) { //implement this }

    // Action methods
    public void move() { //implement this }
    public void jump() { //implement this }
    public void attack() { //implement this }

    public static void main(String[] args) {
        // initialize a Player instance here using constructor and setters
        // display the fields of the instance using getters
        // exercise the action methods
    }
}

// Enemy class
class Enemy {

    // Attributes according to the task description
    private String name;
    private int healthPOINTS;
    private String type;
    private boolean isDefeated;

    // Constructor
    public Enemy (/*set the parameters required*/) {
        // Set the fields here
    }

    // Getters
    public String getName() { //implement this }
    public int getHealthPOINTS() { //implement this }
    public String getType() { //implement this }
    public boolean getIsDefeated() { //implement this }

    // Setters
    public void setName(String name) { //implement this }
    public void setHealthPOINTS(int healthPOINTS) { //implement this }
    public void setType(String type) { //implement this }
    public void setIsDefeated(boolean isDefeated) { //implement this }

    // Action methods
    public void move() { //implement this }
    public void jump() { //implement this }
    public void attack() { //implement this }

    public static void main(String[] args) {
        // initialize an Enemy instance here using constructor and setters
        // display the fields of the instance using getters
        // exercise the action methods
    }
}
```