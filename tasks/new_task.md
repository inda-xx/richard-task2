# Calling All Coders: Unleash the Power of Pixels! 🎮

For this week's assignment, we are venturing into the world of gaming development. Prepare to unleash and manipulate pixels to your command. You are going to dive deeper into creating and managing classes in Java.

### 💀 Deadline
Complete this task before **Thursday 23rd September**.

### 👩‍🏫 Instructions
For details on how to do and submit the assignment, check out the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation
Before you start, make sure you go through and answer the questions in the OLI material for Module 3.

- Read [Linking Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f7e4a808ac2f0099012f2a90c0bac61b)
- If you haven't done so yet, go to https://kth.oli.cmu.edu/, sign up and register with the course key `dd1337-ht23`

### ✅ Learning Goals

This week, we aim for you to learn:
* Designing Java classes 
* Adding instance fields 
* Adding a constructor method 
* Creating *getters* and *setters* 
* Printing to the terminal 
* Using the `main` method
* Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide
If you have trouble with anything, follow this step-by-step guide:

1. Consult this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Is your issue the same as that of another student?
2. If not, go ahead and post your question by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Give it a descriptive title, beginning with "Task 3: summary of problem here."
3. Consult a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule to see when the next lab will take place.

Keep in mind that discussions with your coursemates are encouraged but **do not share answers**!

### 🏛 Assignment

Your task is to create a basic game application named "PixelWars". In your PixelWar world, there will be moving objects (pixels), a scoring system, and interactions with enemy pixels.

#### Exercise 3.1 – Creating the Pixel class
In the [`src`](src) folder, create a new class called `Pixel.java`. The Pixel class should hold basic information about each pixel in the game, and handle simple behaviors. This class should have the following instance fields:
- `String` color
- `int` speed
- `int` positionX
- `int` positionY

Start by implementing `getter` and `setter` methods for each of these fields.

#### Exercise 3.2 - Adding a Constructor

Instead of manually assigning values to each field for every new object, you should use constructors. Create a constructor in your Pixel class that assigns specific initial values to color, speed, and position of the Pixel. 

#### Exercise 3.3 - Moving the Pixel Around
Add a `move` method to your Pixel class. This method should take a direction (left, right, up, down) as input, and adjust the Pixel's `positionX` or `positionY` according to the input.  The distance moved should be equal to the Pixel's speed.

#### Exercise 3.4 - Creating the Game class
In the [`src`](src) folder, create another class called `Game.java`. This class will handle the main game logic. It should contain the following methods:
- `start()`: This will run the main game loop.
- `spawnPixel()`: This will create a new Pixel and add it to a list of active Pixels.
- `removePixel(Pixel pixel)`: This will remove a given Pixel from the list of active Pixels.
- `checkCollision(Pixel pixel1, Pixel pixel2)`: This will take two Pixels as arguments and return true if they are at the same coordinates.
- `update()`: This will call the move method on each active Pixel and check for collisions.

You should also add a main() method to the Game class that creates a new instance of the game and starts it.

#### Exercise 3.5 - Adding Scoring and Enemy Interactions
Now, update the `Pixel` class to contain an `isEnemy` field. This field will be a boolean value indicating whether the pixel is an enemy pixel or not. Also, add an `int` score field to the `Game` class. 

Update the `update()` function in the `Game` class to increase the `score` whenever a non-enemy Pixel collides with an enemy Pixel. Also, when this happens, the non-enemy Pixel should be removed. 

#### Exercise 3.6 - Variable Shadowing 
Check out the following code snippet:

```Java
public class Example {
    private int number = 0;

    public void printNumber() {
        int number = 5;
        System.out.println(number); 
    }

    public static void main(String[] args){
        new Example().printNumber();
    }
}
```
Can you explain what is happening here and how to correct it? You may be asked about this in class. 

### 🐞 Bugs and errors?
If you find anything unusual or get stuck with an error in this task, open a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task 3 Error: summary of error here". Acknowledgments will be given to those who spot any bugs.