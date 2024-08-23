import java.util.Scanner;

class Player {
    private String name;
    private int score;
    private int positionX;
    private int positionY;

    public Player(String name, int positionX, int positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void move(int deltaX, int deltaY) {
        this.positionX += deltaX;
        this.positionY += deltaY;
        System.out.println("Player moved to position: (" + positionX + ", " + positionY + ")");
    }

    public void addScore(int points) {
        this.score += points;
        System.out.println("Score updated: " + score);
    }

    public void attack(Enemy enemy, int attackDamage) {
        enemy.setHealth(enemy.getHealth() - attackDamage);
        System.out.println("Attacked " + enemy.getType() + " for " + attackDamage + " damage!");
        if (enemy.getHealth() <= 0) {
            System.out.println(enemy.getType() + " defeated!");
            this.addScore(100);
        }
    }
}

class Enemy {
    private String type;
    private int health;
    private int positionX;
    private int positionY;

    public Enemy(String type, int health, int positionX, int positionY){
        this.type = type;
        this.health = health;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
}

public class Game {
    public static void main(String[] args){
        Player hero = new Player("Hero", 0, 0);
        Enemy goblin = new Enemy("Goblin", 30, 5, 5);
        
        hero.move(1,1);
        hero.attack(goblin, 10);
        hero.attack(goblin, 20);

        Example example = new Example();
        example.demonstrateShadowing();
    }
}

class Example {
    private int value = 42;

    public void demonstrateShadowing() {
        int value = 100;
        System.out.println(this.value);
    }
}