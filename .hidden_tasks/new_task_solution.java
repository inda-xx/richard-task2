```java
import java.awt.Point;

public class Indamon {
    private String name;
    private int hp;
    private int attack;
    private int defense;
    private boolean fainted;
    private Point position;

    public Indamon(String name, int hp, int attack, int defense, Point position) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.fainted = false;
        this.position = position;
    }

    // Existing getter and setter methods...

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public void move(Direction direction) {
        switch (direction) {
            case UP:
                position.translate(0, -1);
                break;
            case DOWN:
                position.translate(0, 1);
                break;
            case LEFT:
                position.translate(-1, 0);
                break;
            case RIGHT:
                position.translate(1, 0);
                break;
        }
    }

    public void collectItem(Item item) {
        hp += item.getHpPoints();
    }
}

class Player {
    private String username;
    private Indamon indamon;
    private int score;

    public Player(String username, Indamon indamon) {
        this.username = username;
        this.indamon = indamon;
        this.score = 0;
    }

    // Getter and setter methods...

    public void addScore(int additionalScore) {
        score += additionalScore;
    }
}

class Item {
    private String name;
    private int hpPoints;

    public Item(String name, int hpPoints) {
        this.name = name;
        this.hpPoints = hpPoints;
    }

    // Getter and setter methods...
}

enum Direction {
    UP, DOWN, LEFT, RIGHT
}
```

Note: You'll need to handle the edge cases (like moving off the game board) according to the specific requirements of your game. This simplified solution doesn't include them for brevity. Also, the actual Game class and the interactive command-line interface are not included because they involve more complex considerations beyond the scope of this task.