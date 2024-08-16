```java

// Player.java

public class Player {
    private String name;
    private int health;
    private int positionX;
    private int positionY;

    // Player constructor
    public Player(String name, int health, int positionX, int positionY) {
        if (health < 0) throw new IllegalArgumentException("Health cannot be negative.");
        this.name = name;
        this.health = health;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Define getters
    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getPositionX() { return positionX; }
    public int getPositionY() { return positionY; }

    // Define setters
    public void setName(String name) { this.name = name; }
    public void setHealth(int health) {
        if (health < 0)
            throw new IllegalArgumentException("Health cannot be negative.");
        this.health = health;
    }
    public void setPositionX(int positionX) { this.positionX = positionX; }
    public void setPositionY(int positionY) { this.positionY = positionY; }

    public void printStatus() {
        System.out.println("Player Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Position: (" + positionX + ", " + positionY + ")");
    } 
}

// Enemy.java

public class Enemy {
    private String type;
    private int positionX;
    private int positionY;
    private boolean isAlive;

    // Enemy constructor
    public Enemy(String type, int positionX, int positionY, boolean isAlive) {
        if (positionX < 0 || positionX > 100 || positionY < 0 || positionY > 100)
            throw new IllegalArgumentException("Position out of bounds");
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
        this.isAlive = isAlive;
    }

    // Define getters
    public String getType() { return type; }
    public int getPositionX() { return positionX; }
    public int getPositionY() { return positionY; }
    public boolean isAlive() { return isAlive; }

    // Define setters
    public void setType(String type) { this.type = type; }
    public void setPositionX(int positionX) {
        if (positionX < 0 || positionX > 100)
            throw new IllegalArgumentException("positionX out of bounds");
        this.positionX = positionX;
    }
    public void setPositionY(int positionY) {
        if (positionY < 0 || positionY > 100)
            throw new IllegalArgumentException("positionY out of bounds");
        this.positionY = positionY;
    }
    public void setAlive(boolean isAlive) { this.isAlive = isAlive; }

    public void printStatus() {
        System.out.println("Enemy type: " + type);
        System.out.println("Position: (" + positionX + ", " + positionY + ")");
        System.out.println("Is Alive?: " + isAlive);
    }   
}

// Score.java

public class Score {
    private int points;
    private Player player;

    public Score(int points, Player player) {
        if (points < 0)
            throw new IllegalArgumentException("Points cannot be negative.");
        this.points = points;
        this.player = player;
    }

    // Define getters
    public int getPoints() { return points; }
    public Player getPlayer() { return player; }

    // Define setters
    public void setPoints(int points) {
        if (points < 0)
            throw new IllegalArgumentException("Points cannot be negative.");
        this.points = points;
    }

    public void increment(int points) {
        if (points < 0)
            throw new IllegalArgumentException("Points cannot be negative.");
        this.points += points;
    }

    public void printStatus() {
        System.out.println("Player: " + player.getName());
        System.out.println("Score: " + points);
    }   
}
```

Finally, the `main()` method is the same as provided in the given template. Here, enemies and players are created, followed by printing the status of each object via the `printStatus()` method. This serves as a basic interaction routine, and more features can be implemented later as per requirements.