public class Player {
    private String name;
    private int xPosition;
    private int yPosition;
    private int score;

    public Player(String name, int xPosition, int yPosition, int score) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXPosition() {
        return this.xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getYPosition() {
        return this.yPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getScore() {
        return this.score;
    }

    public void increaseScore() {
        this.score++;
    }

    public void move(int x, int y) {
        this.xPosition = x;
        this.yPosition = y;
    }

    public void hitEnemy(Enemy enemy) {
        increaseScore();
        enemy.hitByPlayer();
    }
}

public class Enemy {
    private String name;
    private int xPosition;
    private int yPosition;
    private int health;

    public Enemy(String name, int xPosition, int yPosition, int health) {
        if (health < 0)
            throw new IllegalArgumentException("Health cannot be less than 0.");
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXPosition() {
        return this.xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getYPosition() {
        return this.yPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        if (health < 0)
            throw new IllegalArgumentException("Health cannot be less than 0.");
        this.health = health;
    }

    public void hitByPlayer() {
        if (this.health > 0)
            this.health--;
        if (this.health <= 0)
            System.out.println("Enemy defeated!");
    }
}

public class Game {
    public static void main(String[] args) {
        Player player = new Player("John", 1, 1, 0);
        Enemy enemy = new Enemy("Monster", 2, 2, 3);
        player.hitEnemy(enemy);
        System.out.println("Player's score: " + player.getScore());
        System.out.println("Enemy's Health: " + enemy.getHealth());
        player.move(2, 3);
        System.out.println("Player's new position: (" + player.getXPosition() + "," + player.getYPosition() + ")");
    }
}