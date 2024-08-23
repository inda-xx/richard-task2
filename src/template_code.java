import org.junit.Before;
    import org.junit.Test;
    import static org.junit.Assert.*;
    import java.util.Arrays;
    import java.util.List;

class Player {
        private String name;
        private int score;
        private int lives;
        
        //Constructor that initializes the Player object with provided name, score and lives values.
        public Player(String name, int score, int lives) {
            this.name = name;
            this.score = score;
            this.lives = lives;
        }
        
        // getter methods
        public String getName() { return name; }
        public int getScore() { return score; }
        public int getLives() { return lives; }
        
        // setter methods
        public void setName(String name) { this.name = name; }
        public void setScore(int score) { this.score = score; }
        public void setLives(int lives) { this.lives = lives; }
        
        // Method to print the player's score
        public void printScore(){
            System.out.println("Player's Score: " + score);
        }
    }
    
    class Enemy {
        private String name;
        private int score;
        
        //Constructor that initializes the Enemy object with provided name and score values.
        public Enemy(String name, int score) {
            this.name = name;
            this.score = score;
        }
        
        // getter methods
        public String getName() { return name; }
        public int getScore() { return score; }
        
        // setter methods
        public void setName(String name) { this.name = name; }
        public void setScore(int score) { this.score = score; }
        
        // Method to print the enemy's score
        public void printScore(){
            System.out.println("Enemy's Score: " + score);
        }
    }

    class Game {
        
        public static void main(String[] args) {
            // Creating instances of Player and Enemy classes.
            Player player1 = new Player("SuperCoder", 0, 3);
            Enemy enemy1 = new Enemy("BugMonster", 0);

            player1.printScore();
            enemy1.printScore();
        } 
        
        public void startGame(Player player, Enemy enemy){
            while(player.getLives() > 0) {
                player.setScore(player.getScore() * 2);
                enemy.setScore(enemy.getScore() + 15);
                player.setLives(player.getLives() - 1);
            }

            if(player.getScore() > enemy.getScore()) 
                System.out.println("Player wins with score: " + player.getScore());
            else
                System.out.println("Enemy wins with score: " + enemy.getScore());
        }
    }