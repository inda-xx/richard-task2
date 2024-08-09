```java
public class Player {
    // Instance fields
    private String name;
    private int score;
    private int playerPosX;
    private int playerPosY;

    // Player class constructor
    public Player(String name, int score, int playerPosX, int playerPosY) {
        this.name = name;
        this.score = score;
        this.playerPosX = playerPosX;
        this.playerPosY = playerPosY;
    }

    // Getters and setters for instance fields
    // getters
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getPlayerPosX() {
        return playerPosX;
    }

    public int getPlayerPosY() {
        return playerPosY;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setPlayerPosX(int playerPosX) {
        this.playerPosX = playerPosX;
    }

    public void setPlayerPosY(int playerPosY) {
        this.playerPosY = playerPosY;
    }

    public void move(String direction) {
        switch (direction) {
            case "up":
                this.playerPosY -= 1;
                break;
            case "down":
                this.playerPosY += 1;
                break;
            case "left":
                this.playerPosX -= 1;
                break;
            case "right":
                this.playerPosX += 1;
                break;
        }
    }

    public void openChest(Chest chest) {
        if (!chest.getIsOpened() && this.playerPosX == chest.getChestPosX() && this.playerPosY == chest.getChestPosY()) {
            this.score += chest.getValue();
            chest.setIsOpened(true);
        }
    }

    public void avoidMonster(Monster monster) {
        if (monster.getIsAlive() && this.playerPosX == monster.getMonsterPosX() && this.playerPosY == monster.getMonsterPosY()) {
            this.score -= monster.getDamage();
        }
    }

    public void printScore() {
        System.out.println("Score: " + this.score);
    }
}
```

```java
public class Chest {
    // Instance fields
    private int value;
    private boolean isOpened;
    private int chestPosX;
    private int chestPosY;

    // Chest class constructor
    public Chest(int value, boolean isOpened, int chestPosX, int chestPosY) {
        this.value = value;
        this.isOpened = isOpened;
        this.chestPosX = chestPosX;
        this.chestPosY = chestPosY;
    }

    // Getters and setters for instance fields
    // getters
    public int getValue() {
        return value;
    }

    public boolean getIsOpened() {
        return isOpened;
    }

    public int getChestPosX() {
        return chestPosX;
    }

    public int getChestPosY() {
        return chestPosY;
    }

    // setters
    public void setValue(int value) {
        this.value = value;
    }

    public void setIsOpened(boolean isOpened) {
        this.isOpened = isOpened;
    }

    public void setChestPosX(int chestPosX) {
        this.chestPosX = chestPosX;
    }

    public void setChestPosY(int chestPosY) {
        this.chestPosY = chestPosY;
    }
}
```

```java
public class Monster {
    // Instance fields
    private int damage;
    private boolean isAlive;
    private int monsterPosX;
    private int monsterPosY;

    // Monster class constructor
    public Monster(int damage, boolean isAlive, int monsterPosX, int monsterPosY) {
        this.damage = damage;
        this.isAlive = isAlive;
        this.monsterPosX = monsterPosX;
        this.monsterPosY = monsterPosY;
    }

    // Getters and setters for instance fields
    // getters
    public int getDamage() {
        return damage;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public int getMonsterPosX() {
        return monsterPosX;
    }

    public int getMonsterPosY() {
        return monsterPosY;
    }

    // setters
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void setMonsterPosX(int monsterPosX) {
        this.monsterPosX = monsterPosX;
    }

    public void setMonsterPosY(int monsterPosY) {
        this.monsterPosY = monsterPosY;
    }
}
```

For the main game code in `Game.java`, you need to manually test it as Unit Testing the `main` method is not recommended and is often complex and unnecessary. The main method is expected to have integration code where all the processing codes are being called and executed. So the better approach is to have all the processing/logic code tested through unit tests to ensure that they are working as expected.