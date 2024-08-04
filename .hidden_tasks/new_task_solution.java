```java
package com.mydomain.indamon;

public class IndamonGame {
    private String playerName;
    private Indamon playerIndamon;
    private int score;
    private Indamon enemyIndamon;
    private boolean gameEnded;

    public IndamonGame(String playerName) {
        this.playerName = playerName;
        this.score = 0;
        this.gameEnded = false;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Indamon getPlayerIndamon() {
        return playerIndamon;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Indamon getEnemyIndamon() {
        return enemyIndamon;
    }

    public void setEnemyIndamon(Indamon enemyIndamon) {
        this.enemyIndamon = enemyIndamon;
    }

    public boolean getGameEnded() {
        return gameEnded;
    }

    public void initializeGame(Indamon playerIndamon) {
        this.playerIndamon = playerIndamon;
    }

    public void attackEnemy() {
        playerIndamon.attack(enemyIndamon);
        if (enemyIndamon.getHp() <= 0) {
            enemyIndamon.setFainted(true);
        }
        score++;
    }

    public void endGame() {
        gameEnded = true;
    }

    public static void main(String[] args) {
        IndamonGame game = new IndamonGame("Player1");
        
        Indamon playerIndamon = new Indamon("Glassey", 10, 5, 5);
        game.initializeGame(playerIndamon);

        Indamon enemyIndamon = new Indamon("Siberov", 10, 5, 5);
        game.setEnemyIndamon(enemyIndamon);

        while (!game.getGameEnded()) {
            game.attackEnemy();
            if (enemyIndamon.getFainted()) {
                game.endGame();
            }
        }

        System.out.println("Game over. Final score: " + game.getScore());
    }
}
```
This solution covers only the base concept and functionalities like attacking an enemy Indamon and scoring system. More features like player movement and interactive enemy interactions can be added using similar approaches.