```java
class Cavemon {
    private String name;
    private int hp;
    private int attack;
    private int defense;
    private int score;
    private boolean isEnemy;

    // Setters
    public void setName(String name) { 
        // your code
    }
    public void setHp(int hp) { 
        // your code
    }
    public void setAttack(int attack) { 
        // your code
    }
    public void setDefense(int defense) { 
        // your code
    }
    public void setScore(int score) { 
        // your code
    }
    public void setIsEnemy(boolean isEnemy) { 
        // your code
    } 

    // Getters
    public String getName() { 
        // your code 
    }
    public int getHp() { 
        // your code 
    }
    public int getAttack() { 
        // your code 
    }
    public int getDefense() { 
        // your code 
    }
    public int getScore() { 
        // your code 
    }
    public boolean getIsEnemy() { 
        // your code 
    }
    
    // Constructor
    public Cavemon(String name, int hp, int attack, int defense, boolean isEnemy) {
        // your code
    }

    // Add a move function for player movement
    public static void move(String direction) {
        // your code
    }

    // Attack function to do attack damage to the opponent
    public void doAttack(Cavemon opponent) {
        // your code
    }

    // Scoring system based on enemy interactions
    public void updateScore(int newScore) {
        // your code
    }

    // Display player info
    public void printInfo() {
        // your code
    }

    public static void main(String[] args) {
        // your code
    } // end main method
}
```

### Instructions
* Start by modeling a Cavemon class that includes the following attributes: String name, int hp (hit points), int attack, int defense, int score, boolean isEnemy.
* Add getters and setters for each attribute. 
* Next, create a Cavemon constructor for instantiating new Cavemons. 
* Implement a method called move() for character movement. The method should take an argument indicating the direction the player's Cavemon is moved.
* Create a method called doAttack() to signify interactions with enemy Cavemons. The method receives an opponent Cavemon object.
* Implement a scoring system based on the interactions between the player's Cavemon and enemy Cavemons.
* When implementing the scoring and attack system, make sure the enemy Cavemons have higher scores.
* Use the printInfo() method to display relevant information about the player's Cavemon such as name, hitpoints, attack value, defense value, score, and whether the Cavemon is an enemy.
* Lastly, implement the main method to play your CaveMon game. Initialize the attributes of at least two Cavemons. One will be the player's Cavemon, and the other one will be the enemy Cavemon.

Completed correctly, your program should simulate a basic video game, representing the player's character and their interaction with an enemy character. This adventure will give you practice designing JAVA classes, adding instance fields, using the `main` method, and creating *getters*, *setters*, variable shadowing, and a constructor method - all while printing your epic stone-age saga to the terminal. Good luck!