Here's an example of how this might be implemented in Java:

```java
public class Game {

    private int[][] grid;
    private int score;
    private int playerX, playerY;
    
    public Game(int gridSize) {
        grid = new int[gridSize][gridSize];
        score = 0;
        playerX = 0; playerY = 0;
    }

    public void movePlayer(int dx, int dy) {
        int newPlayerX = Math.max(0, Math.min(grid.length - 1, playerX + dx));
        int newPlayerY = Math.max(0, Math.min(grid[0].length - 1, playerY + dy));
        playerX = newPlayerX;
        playerY = newPlayerY;

        // check if there is an item or enemy at the new location
        switch (grid[playerX][playerY]) {
            case 1:  // item
                score += 10;
                grid[playerX][playerY] = 0;  // remove the item
                break;
            case -1:  // enemy
                score -= 10;
                if (score <= 0) {
                    System.out.println("Game Over!");
                }
                break;
        }
    }

    public void addItem(int x, int y) {
        grid[x][y] = 1;
    }

    public void addEnemy(int x, int y) {
        grid[x][y] = -1;
    }

    public int getScore() {
        return score;
    }
}
```

This code defines a simple grid-based game. The Game class contains a 2D integer array to represent the game grid, and two integer variables for managing the player’s current position. `movePlayer(dx, dy)` is used to move the player around the grid, adjusting the game score when they move onto a cell containing either an item or enemy. If the player's score falls to zero or below, a "Game Over!" message is printed to the terminal. Items and enemies can be added to the grid by calling `addItem(x, y)` and `addEnemy(x, y)`, respectively. The player's current score is returned by the `getScore()` method.