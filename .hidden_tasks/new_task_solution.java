```java
public class Knight {
    private String name;
    private int position;
    private int score;

    public Knight(String name, int position){
        this.name = name;
        this.position = position;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public int getScore() {
        return score;
    }

    public void moveForward(int steps) {
        if(position + steps <= 100) {
            position += steps;
        } else {
            position = 100;
        }
    }

    public void moveBackward(int steps) {
        if(position - steps >= 1) {
            position -= steps;
        } else {
            position = 1;
        }
    }

    public boolean fightDragon(Dragon dragon) {
        if(dragon.getPosition() == position) {
            if(position >= dragon.getStrength()) {
                score += 10;
                return true;
            }
        }
        return false;
    }

    public void collectTreasure(Treasure treasure) {
        if(treasure.getPosition() == position) {
            score += treasure.getValue();
        }   
    }
}


public class Dragon {
    private String name;
    private int strength;
    private int position;

    public Dragon(String name, int strength, int position){
        this.name = name;
        this.strength = strength;
        this.position = position;
    }

    public String getName(){return name;}

    public int getStrength(){return strength;}

    public int getPosition(){return position;}

    public void setPosition(int newPosition) {
        if(newPosition >= 1 && newPosition <= 100){
            position = newPosition;
        }
    }
}


public class Treasure {
    private int value;
    private int position;

    public Treasure(int value, int position) {
        this.value = value;
        this.position = position;
    }

    public int getValue(){return value;}

    public int getPosition(){ return position;}

    public void setPosition(int newPosition) {
        if(newPosition >= 1 && newPosition <= 100){
            position = newPosition;
        }
    }
}
```