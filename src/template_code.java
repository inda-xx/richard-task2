### Template

Here's your starter code to inspire your work! Be sure to fill out the <...> placeholders with your own code.

```java
    class Spaceship {
        private String spaceshipID;
        private int health;
        private int attackDamage;
        private boolean isDestroyed;

        public Spaceship(String spaceshipID, int health, int attackDamage) {
            this.spaceshipID = spaceshipID;
            this.health = health;
            this.attackDamage = attackDamage;
            this.isDestroyed = false;
        }

        // getters
        public String getSpaceshipID() { <...> }
        public int getHealth() { <...> }
        public int getAttackDamage() { <...> }
        public boolean getIsDestroyed() { <...> }

        // setters
        public void setSpaceshipID(String spaceshipID) { <...> }
        public void setHealth(int health) { <...> }
        public void setAttackDamage(int attackDamage) { <...> }
        public void setIsDestroyed(boolean isDestroyed) { <...> }
        
        // attack method
        public void attack(Alien target) {
            <...>
            if (target.getHealth() <= 0) {
                target.setIsDestroyed(true);
            }
        }
    }

    class Alien {
        private String alienID;
        private int health;
        private boolean isDestroyed;
        
        public Alien(String alienID, int health) {
             this.alienID = alienID;
             this.health = health;
             this.isDestroyed = false;
        }
        
        // getters
        public String getAlienID() { <...> }
        public int getHealth() { <...> }
        public boolean getIsDestroyed() { <...> }
        
        // setters
        public void setAlienID(String alienID) { <...> }
        public void setHealth(int health) { <...> }
        public void setIsDestroyed(boolean isDestroyed) { <...> }
    }
        
    class Score {
        private int spaceshipScore;
        private int alienScore;

        // getters
        public int getSpaceshipScore() { <...> }
        public int getAlienScore() { <...> }

        // setters
        public void setSpaceshipScore(int spaceshipScore) { <...> }
        public void setAlienScore(int alienScore) { <...> }
    }
    
    public static void main(String[] args) {
        // create a spaceship and alien instances
        <...>
        // attack
        <...>
        // update score
        <...>
        // print status
        <...>
    } //end main method
```
Remember to replace the "<...>" placeholders with your own code.