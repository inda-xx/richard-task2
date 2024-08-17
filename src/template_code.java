```java
    // Let's start with the Player class
    class Player {
        private String name;
        private int health;
        private int score;
        private String weapon;

        // Constructor Method
        public Player(int health, String weapon) {
            // Implementation here
        }

        // getters
        public String getName() {
            // Implementation here
            return null;
        }
        public int getHealth() {
            // Implementation here
            return 0;
        }
        public int getScore() {
            // Implementation here
            return 0;
        }
        public String getWeapon() {
            // Implementation here
            return null;
        }

        // setters
        public void setName(String name) {
            // Implementation here
        }
        public void setHealth(int health) {
            // Implementation here
        }
        public void setScore(int score) {
            // Implementation here
        }
        public void setWeapon(String weapon) {
            // Implementation here
        }

        // Fight method in the Player class
        public void fight(Enemy enemy) {
            // Implementation here
        }

        // Player info method
        public void playerInfo() {
            // Implementation here
        }
    }

    // Let's design the Enemy class
    class Enemy {
        private String name;
        private int enemyHealth;
        private String weapon;
        private int weaponDamage; // Additional field for weapon damage

        // Constructor Method
        public Enemy(int enemyHealth, String weapon) {
            // Implementation here
        }

        // getters
        public String getName() {
            // Implementation here
            return null;
        }
        public int getEnemyHealth() {
            // Implementation here
            return 0;
        }
        public String getWeapon() {
            // Implementation here
            return null;
        }
        public int getWeaponDamage() {
            // Implementation here
            return 0;
        }

        // setters
        public void setName(String name) {
            // Implementation here
        }
        public void setEnemyHealth(int enemyHealth) {
            // Implementation here
        }
        public void setWeapon(String weapon) {
            // Implementation here
        }
        public void setWeaponDamage(int weaponDamage) {
            // Implementation here
        }
    }
    
    // This will be your driver code.
    public static void main(String[] args) {
        // Appropriate code here based on the samples given in the description
    }
    
```