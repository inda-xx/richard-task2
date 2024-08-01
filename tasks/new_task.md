Description
Welcome to the Java Space Force, Rookie! Your mission, should you choose to accept it, is to develop a simplified game application to train space rookies on Mars colonization. This exciting little game application specifically involves player movement, scoring system, and alien interactions.

This mission will have you practice and master OOP concepts, designing Java classes, adding instance fields, constructors, creating getters and setters, printing to the terminal, using the `main` method and mastering scope(or variable shadowing).

Sounds like an adventure, right? Let's dive in.

### Instructions
1. Create a new java class named `SpaceRookie.java`. This class will represent a player in your game application that moves, scores and interacts with aliens on Mars. It should have the following instance fields with their respective getters and setters:
```java
class SpaceRookie {
    private String playerName;
    private int playerScore;
    private String playerPosition;
}
```
2. Create a `SpaceRookie` constructor that instantiates a new SpaceRookie when the player's name and starting position are provided. 

3. Implement a method `move(String newPosition)` that updates the player's current position.

4. Implement a method `score(int points)` that increments the player's score.

5. Implement a method `interactWithAlien(Alien alien)` that decrements the player's score by the strength of the alien. The strength of the alien is an attribute of the Alien object passed as an argument.

6. Implement a method `printStatus()` that prints the current status of the player (name, score, position).

7. Repeat steps 1-6 to model the Alien class the player will be interacting with.