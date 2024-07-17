- Simple Java Game Application

Build a simple JAVA game application which includes movement of player, scoring system and enemy interactions. This will help build your understanding of Java programming constructs, general object-oriented programming principles, and use of multi-threading.

### Task Description

Your task is to create a simple, text-based game, in which a player moves around a board, attempts to avoid enemy characters and collects points as they navigate through the game.

**Details:**

**Main Game Class** - A 'Game' class will act as the driver for your game. It should have a main method to start the game.

**Player Class** - Class 'Player' for player character creation. It should have attributes such as 'position' (Consider it as a 2-dimensional coordinate) and 'score'. It should also have methods for moving position and updating score.

**Enemy Class** - Class 'Enemy' for enemy creation. It should have attributes such as 'position'. It should also have methods for moving position.

**Game Logic** - If player's position collides with any of the enemy's position, the player should lose score, else they should gain score. All movements of characters should occur in threads with ‘player' in one thread and each 'enemy' in separate threads.

**Note:** You can decide on the specifics of the scoring system, the board size (10x10 grid, for example), and the details of player and enemy interaction.