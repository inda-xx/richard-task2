```java

    // Each template should be saved in its own .java file with the same name

    // Player.java

    public class Player {
        private String name;
        private int health;
        private int positionX;
        private int positionY;

        // Player constructor
        public Player(String name, int health, int positionX, int positionY) {
            // implement constructor here and don't forget to handle negative health.
        }

        // Define getters
        // Implement all the necessary getters for the variables above

        // Define setters
        // Implement all the necessary setters for the variables above


        // Implement method to print status
        public void printStatus() {
            // implementation here
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
            // implement constructor here and mind the game boundaries when setting position
        }

        // Define getters
        // Implement all the necessary getters for the variables above

        // Define setters
        // Implement all the necessary setters for the variables above

        // print status method
        public void printStatus() {
            // implementation here
        }   
    }

    // Score.java

    public class Score {
        private int points;
        private Player player;

        // Score constructor
        public Score(int points, Player player) {
            // implement constructor here
        }

        // Define getters
        // Implement all the necessary getters for the variables above

        // Define setters
        // Implement all the necessary setters for the variables above

        // Score incrementing method
        public void increment(int points) {
            // update the score when an enemy is defeated
        }

        // print status method
        public void printStatus() {
            // implementation here
        }   
    }

    // Main.java

    public class Main {
        public static void main(String[] args) {
            // Create a new Player object
            Player player = new Player(/*Params*/);
            // Create new Enemy objects
            Enemy enemy1 = new Enemy(/*Params*/);
            Enemy enemy2 = new Enemy(/*Params*/);
            // Create a new Score object
            Score score = new Score(/*Params*/);
            // Invoke the printStatus methods
            player.printStatus();
            enemy1.printStatus();
            enemy2.printStatus();
            score.printStatus();
        } // end main method
    }
```