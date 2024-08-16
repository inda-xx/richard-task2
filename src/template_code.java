```java
    // Player Class
    class Player {
        private String name;
        private int xPosition;
        private int yPosition;
        private int score;

        // Constructor
        public Player(String name, int xPosition, int yPosition, int score) {
            this.name = name;
            this.xPosition = xPosition;
            this.yPosition = yPosition;
            this.score = score;
        }

        // Add Getter and Setter methods
        // ...
        
        // Add methods moveUP, moveDown, moveLeft, moveRight
        // ...
        
        // Add increaseScore method
        // ...
        
        // Add attackEnemy method
        // ...
         
        // Use the main method for testing
        public static void main(String[] args) {
            // Use this main method to create Player objects and test properties and methods
        } // end main method

    } // Player Class end
    
    
    // Enemy Class
    class Enemy {
        private String type;
        private int xPosition;
        private int yPosition;
        private int damage;

        // Constructor
        public Enemy(String type, int xPosition, int yPosition, int damage) {
            this.type = type;
            this.xPosition = xPosition;
            this.yPosition = yPosition;
            this.damage = damage;
        }

       // Add Getter and Setter methods
       // ...
       
       // Add attackPlayer method
       // ...

        public static void main(String[] args) {
            // Use this main method to create Enemy objects and test properties and methods
        } // end main method

    } // Enemy Class end
    
    
    // Game Class
    class Game {
        private Player player;
        private Enemy enemy;

        // Constructor
        public Game(Player player, Enemy enemy) {
            this.player = player;
            this.enemy = enemy;
        }

        // Add Getter and Setter methods
        // ...
        
        // Add startGame method
        // ...
        
        public static void main(String[] args) {
            // Use this main method to create Game objects and test properties and methods
        } // end main method

    } // Game Class end
```