For this assignment, you will create a simple Java game application that includes the functionalities of player movement, scoring system, and enemy interactions. This is a fun and practical way to practice advanced Java programming concepts.

### Instructions

#### Player Class

Create a `Player` class that defines a Player object. A Player should have the following attributes (also known as fields):

- `int` position
- `int` score

The Player class should also have the following methods:

- `move(int steps)`: This method should update the player's position based on the steps passed in the argument. If the new position calculated is less than 0, the player's position should be set to 0. (Players can't go back beyond the start point, which is 0).
- `increaseScore(int points)`: This method should increase the player's score by the points provided in the argument.
- `getPosition()`: This should return the current position of the player.
- `getScore()`: This should return the current score of the player.

#### Enemy Class

Next, create an `Enemy` class that defines an Enemy object. An Enemy should have `int` position as a field and `getPosition()` method which return the current position of an enemy.

#### Game Class

The `Game` class will tie everything together. It should have the following attributes:

- `Player` player
- `Enemy` enemy

The Game class should have the following methods:

- `checkForEnemy()`: This method should compare the player's position with the enemy's position. If they are the same, the player's score should decrease by 5 points.
- `printGameStatus()`: This method should print out the current status of the game, including the player's position, the player's score, and the enemy's position.

### Coding Quest Junior Tests

There is a junior test class provided known as `CodingQuestJuniorTest.java`. This class includes the needed tests for each function your implementation must pass. The functions that will be tested are as follows: 

- `Player.move(int steps)`
- `Player.increaseScore(int points)`
- `Player.getPosition()`
- `Player.getScore()`
- `Enemy.getPosition()`
- `Game.checkForEnemy()`
- `Game.printGameStatus()` 

Make sure to implement each class and method as described above in order to pass these tests! Have fun while coding and good luck