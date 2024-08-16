// Player Class
class Player {
    private String name;
    private int points;
    private double xPosition;
    private double yPosition;

    public Player(String name, int points, double xPosition, double yPosition) {
        this.name = name;
        this.points = points;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public String getName() {
        return this.name;
    }

    public int getPoints() {
        return this.points;
    }

    public double getXPosition() {
        return this.xPosition;
    }

    public double getYPosition() {
        return this.yPosition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setXPosition(double x) {
        this.xPosition = x;
    }

    public void setYPosition(double y) {
        this.yPosition = y;
    }

    public void move(double x, double y) {
        this.xPosition += x;
        this.yPosition += y;
    }

    public String attack(Enemy enemy) {
        points++; // increase point each time player attacks an enemy
        return "Player " + this.name + " attacked enemy " + enemy.getId() + ", type " + enemy.getType() + ".";
    }
}

// Enemy Class
class Enemy {
    private String id;
    private String type;
    private double xPosition;
    private double yPosition;

    public Enemy(String id, String type, double xPosition, double yPosition) {
        this.id = id;
        this.type = type;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public String getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public double getXPosition() {
        return this.xPosition;
    }

    public double getYPosition() {
        return this.yPosition;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setXPosition(double x) {
        this.xPosition = x;
    }

    public void setYPosition(double y) {
        this.yPosition = y;
    }
}