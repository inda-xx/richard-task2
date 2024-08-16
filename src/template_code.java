
class Player {
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
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void moveUp() {
        yPosition += 1;
    }

    public void moveDown() {
        yPosition -= 1;
    }

    public void moveRight() {
        xPosition += 1;
    }

    public void moveLeft() {
        xPosition -= 1;
    }

    public void increaseScore(int increment) {
        score += increment;
    }

    public void attackEnemy(Enemy enemy) {
        enemy.setDamage(enemy.getDamage() - 10);
    }
}

class Enemy {
    private String type;
    private int xPosition;
    private int yPosition;
    private int damage;

    public Enemy(String type, int xPosition, int yPosition, int damage) {
        this.type = type;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.damage = damage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void attackPlayer(Player player) {
        player.setScore(player.getScore() - this.damage);
    }
}

class Game {
    private Player player;
    private Enemy enemy;

    public Game(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public void startGame() {
        // Example of game start
        player.moveUp();
        player.increaseScore(10);
        player.attackEnemy(enemy);
        enemy.attackPlayer(player);
    }
}
