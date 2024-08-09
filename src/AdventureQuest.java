import java.util.Scanner;

public class AdventureQuest {

    // Player class
    public static class Player {
        // Instance fields
        private String name;
        private int score;
        private int playerPosX;
        private int playerPosY;

        // Player class constructor
        public Player(String name, int playerPosX, int playerPosY) {
            this.name = name;
            this.score = 0; // Default score is 0
            this.playerPosX = playerPosX;
            this.playerPosY = playerPosY;
        }

        // Getters and setters for instance fields
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

        public int getPlayerPosX() {
            return playerPosX;
        }

        public void setPlayerPosX(int playerPosX) {
            this.playerPosX = playerPosX;
        }

        public int getPlayerPosY() {
            return playerPosY;
        }

        public void setPlayerPosY(int playerPosY) {
            this.playerPosY = playerPosY;
        }

        public void move(String direction) {
            switch (direction.toLowerCase()) {
                case "up":
                    playerPosY--;
                    break;
                case "down":
                    playerPosY++;
                    break;
                case "left":
                    playerPosX--;
                    break;
                case "right":
                    playerPosX++;
                    break;
                default:
                    System.out.println("Invalid direction! Use 'up', 'down', 'left' or 'right'.");
            }
        }

        public void openChest(Chest chest) {
            if (!chest.isOpened() && playerPosX == chest.getChestPosX() && playerPosY == chest.getChestPosY()) {
                score += chest.getValue();
                chest.setOpened(true);
                System.out.println("Chest opened! Your score increased by " + chest.getValue() + ".");
            } else if (chest.isOpened()) {
                System.out.println("Chest already opened.");
            } else {
                System.out.println("You are not at the chest's position.");
            }
        }

        public void avoidMonster(Monster monster) {
            if (monster.isAlive() && playerPosX == monster.getMonsterPosX() && playerPosY == monster.getMonsterPosY()) {
                score -= monster.getDamage();
                System.out.println("You encountered a monster! Your score decreased by " + monster.getDamage() + ".");
            }
        }

        public void printScore() {
            System.out.println(name + "'s current score: " + score);
        }
    }

    // Chest class
    public static class Chest {
        // Instance fields
        private int value;
        private boolean isOpened;
        private int chestPosX;
        private int chestPosY;

        // Chest class constructor
        public Chest(int value, int chestPosX, int chestPosY) {
            this.value = value;
            this.isOpened = false; // Default state is unopened
            this.chestPosX = chestPosX;
            this.chestPosY = chestPosY;
        }

        // Getters and setters for instance fields
        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public boolean isOpened() {
            return isOpened;
        }

        public void setOpened(boolean opened) {
            isOpened = opened;
        }

        public int getChestPosX() {
            return chestPosX;
        }

        public void setChestPosX(int chestPosX) {
            this.chestPosX = chestPosX;
        }

        public int getChestPosY() {
            return chestPosY;
        }

        public void setChestPosY(int chestPosY) {
            this.chestPosY = chestPosY;
        }
    }

    // Monster class
    public static class Monster {
        // Instance fields
        private int damage;
        private boolean isAlive;
        private int monsterPosX;
        private int monsterPosY;

        // Monster class constructor
        public Monster(int damage, int monsterPosX, int monsterPosY) {
            this.damage = damage;
            this.isAlive = true; // Default state is alive
            this.monsterPosX = monsterPosX;
            this.monsterPosY = monsterPosY;
        }

        // Getters and setters for instance fields
        public int getDamage() {
            return damage;
        }

        public void setDamage(int damage) {
            this.damage = damage;
        }

        public boolean isAlive() {
            return isAlive;
        }

        public void setAlive(boolean alive) {
            isAlive = alive;
        }

        public int getMonsterPosX() {
            return monsterPosX;
        }

        public void setMonsterPosX(int monsterPosX) {
            this.monsterPosX = monsterPosX;
        }

        public int getMonsterPosY() {
            return monsterPosY;
        }

        public void setMonsterPosY(int monsterPosY) {
            this.monsterPosY = monsterPosY;
        }
    }

    // Game class with the main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new Player
        Player player = new Player("Hero", 0, 0);

        // Create Chests
        Chest chest1 = new Chest(100, 1, 1);
        Chest chest2 = new Chest(200, 2, 2);

        // Create Monsters
        Monster monster1 = new Monster(50, 3, 3);
        Monster monster2 = new Monster(75, 4, 4);

        // Game loop
        boolean gameRunning = true;

        while (gameRunning) {
            System.out.print("Enter direction (up, down, left, right): ");
            String direction = scanner.nextLine();
            player.move(direction);

            // Check interactions
            player.openChest(chest1);
            player.openChest(chest2);
            player.avoidMonster(monster1);
            player.avoidMonster(monster2);

            player.printScore();

            // End game if the player encounters a monster
            if ((player.getPlayerPosX() == monster1.getMonsterPosX() && player.getPlayerPosY() == monster1.getMonsterPosY()) ||
                (player.getPlayerPosX() == monster2.getMonsterPosX() && player.getPlayerPosY() == monster2.getMonsterPosY())) {
                gameRunning = false;
                System.out.println("Game Over! You encountered a monster.");
            }
        }

        scanner.close();
    }
}
