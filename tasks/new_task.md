Your task is to create a simple game application that models a duel between Galactic Beings known as Aliums in space! To do so, you will design various parts of the game like player movement, scoring system, and interactions with enemy Aliums in Java.

### Instructions

1. Create a new class, `Alium.java`. An Alium should have the following fields:

    - `String` name  
    - `int` hp (**hit points**)
    - `int` attack 
    - `int` defense
    - `boolean` defeated

2. Implement `getters` and `setters` methods for these fields.

3. Create a constructor method which accepts all five attributes as parameters.

4. Add a function, `printInfo()` in your class that prints the Alium's `name`, `hp`, `attack`, `defense` and `defeated status` to the terminal. 

5. Model player movement by implementing a `move()` function in the `Alium` class. The function should simulate a move in the space battlefield. You can keep it simple like moving forward, backward, left, or right in this 2D battlefield.

6. Implement a scoring system by keeping a static field `score` inside `Alium` class. Whenever an Alium successfully attacks another Alium, add the difference of `attack` and `defense` to its `score`.

7. Now, model enemy interaction by adding a method, `attack()`, in your `Alium` class. The `attack()` method should take in an `Alium` object representing the enemy. When `Alium A` attacks `Alium B`, the damage done is calculated by the following formula:

    ```
    Damage = A.attack - B.defense
    ```

    After dealing the damage, `B`'s `hp` should get reduced by the calculated `Damage`. If `B`'s `hp` reaches `0` or less, set `B.defeated = true` and `A.score = A.score + Damage`.

Each of these parts should be implemented as separate methods within the `Alium` class.