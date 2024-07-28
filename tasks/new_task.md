In this task, you are tasked to create a simple interactive game application that combines player movements, a scoring system, and enemy interaction. The sky is the limit as far as functionality and design - but remember to stick to the basics and make sure to implement the following fundamental components:

- Create a `Player` class which models the player character.
	- This class should include methods for changing player's position (`moveLeft()`, `moveRight()`, `moveUp()`, `moveDown()`) which adjusts the player's position by 1 in the intended direction.
- Implement an `Enemy` class that holds the constraints for enemy characters.
- Create a `Game` class to tie everything together. This should include:
	- `manageScore()` method for the scoring system
	- `encounterEnemy()` method for player and enemy interaction.