```java
public class IndamonGame {
   private int playerScore;
   private String lastMove;
   private Indamon lastEncounteredEnemy;

   public IndamonGame() {
       this.playerScore = 0;
       this.lastMove = null;
       this.lastEncounteredEnemy = null;
   }

   public void movePlayer(String direction) {
       switch (direction) {
           case "up":
           case "down":
           case "left":
           case "right":
               this.lastMove = "You moved " + direction;
               break;
           default:
               throw new IllegalArgumentException("Invalid direction. Valid inputs are 'up', 'down', 'left', or 'right'.");
       }
   }

   public void scorePoint() {
       this.playerScore++;
   }

   public void encounterEnemy(Indamon enemy) {
       if (enemy == null) {
           throw new NullPointerException("Provided Indamon enemy should not be null");
       }
       this.lastEncounteredEnemy = enemy;
       // Battle logic here
   }

   public String gameStatus() {
       return "Score: " + this.playerScore + "\nLast encountered enemy: " + (lastEncounteredEnemy != null ? lastEncounteredEnemy.getName() : "None");
   }

   public int getPlayerScore() {
       return this.playerScore;
   }

   public String lastMove() {
       return this.lastMove;
   }

   public Indamon getLastEncounteredEnemy() {
       return this.lastEncounteredEnemy;
   }

   public static void main(String[] args) {
       IndamonGame game = new IndamonGame();
       game.movePlayer("up");
       game.scorePoint();
       game.encounterEnemy(new Indamon("Enemy", 10, 5, 5));
       System.out.println(game.gameStatus());
   }
}
```

Here, I'm assuming a basic Indamon class similar to the one you provided in the existing tests. The defined tests cover a range of situations including valid/invalid movements, score pointing, enemy encounters, and game status reporting. The solution provides corresponding functionality for these situations based on your specifications. Exception handling has been employed where necessary.