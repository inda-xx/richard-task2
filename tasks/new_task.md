You have been tasked with creating a simple game in Java. The game consists of a player, enemies and scoring system. 

The game will operate as follows:

1. **Player Movement**: The player can move left or right on a single axis. They can only occupy integer positions from 0 to 9 inclusive. At the start of each game, the player begins at position 5.

2. **Enemies**: An enemy randomly appears at a certain position 0 to 9 inclusive on each turn. 

3. **Scoring System**: If the player chooses to move to a position occupied by an enemy, they get a point. Otherwise, the enemy disappears and the player gets no points.

4. **Enemy Interaction**: After interacting with an enemy, the enemy disappears from its current location, and a new enemy appears at a randomly generated position.

Create a `Game` class with the following methods:

- `movePlayer(int newPosition)`: This method moves the player to the position provided in the arguments if the position is valid (it's an integer between 0 and 9 inclusive). 

- `generateEnemy()`: This method generates an enemy at a random position between 0 and 9 inclusive. 

- `playTurn(int newPosition)`: This method represents a turn in the game. It first moves the player to the given position, then checks if the player is at the same position as the enemy. If they are, it increments the player's score and generates a new enemy at a random position. 

You should also create `Player`, `Enemy` and `Score` classes as you see fit. Ensure that you leverage principles of encapsulation, and make sure to handle any potential exceptions.