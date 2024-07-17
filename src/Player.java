
import java.util.List;
import java.util.ArrayList;

public class Player {
    private String name;
    private int healthPoints;
    private int score;

    public Player(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void printStatus() {
        System.out.println("Player: " + name + ", Health Points: " + healthPoints + ", Score: " + score);
    }
}

public abstract class Enemy {
    private String name;
    private int damage;

    public Enemy(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void attack(Player player) {
        player.setHealthPoints(player.getHealthPoints() - this.damage);
    }
}

public class Zombie extends Enemy {
    public Zombie(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attack(Player player) {
        super.attack(player);
    }
}

public class Robot extends Enemy {
    public Robot(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attack(Player player) {
        super.attack(player);
    }
}

public class GameSimulator {
    private Player player;
    private List<Enemy> enemies;

    public GameSimulator(Player player) {
        this.player = player;
        this.enemies = new ArrayList<>();
    }

    public void addEnemy(Enemy enemy) {
        this.enemies.add(enemy);
    }

    public void runTurn() {
        for(Enemy enemy: enemies) {
            enemy.attack(player);
            player.setScore(player.getScore() + 1);  // gain 1 score point for surviving each attack
        }
    }
}
