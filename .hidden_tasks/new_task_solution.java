```java
class SpaceRookie {
    private String playerName;
    private int playerScore;
    private String playerPosition;
    
    public SpaceRookie(String name, String position) {
        this.playerName = name;
        this.playerPosition = position;
        this.playerScore = 0;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public int getPlayerScore() {
        return this.playerScore;
    }

    public String getPlayerPosition() {
        return this.playerPosition;
    }

    public void move(String newPosition) {
        this.playerPosition = newPosition;
    }

    public void score(int points) {
        this.playerScore += points;
    }

    public void interactWithAlien(Alien alien) {
        this.playerScore -= alien.getAlienStrength();
    }

    public void printStatus() {
        System.out.println("Player Name: " + this.playerName);
        System.out.println("Player Score: " + this.playerScore);
        System.out.println("Player Position: " + this.playerPosition);
    }
}

class Alien {
    private String alienName;
    private int alienStrength;
    
    public Alien(String name, int strength) {
        this.alienName = name;
        this.alienStrength = strength;
    }

    public String getAlienName() {
        return this.alienName;
    }

    public int getAlienStrength() {
        return this.alienStrength;
    }
}
```
The above SpaceRookie and Alien classes handled all the instructions given in the task. Additionally, unit tests have been written to cover all the edge cases, including the basic getters, move(), score(), and interactWithAlien() methods. The interaction between SpaceRookie and Alien entities was tested to ensure the correct behavior of the classes.