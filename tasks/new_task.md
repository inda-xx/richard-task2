# 🦁 Jungle Adventure!

In this exercise, you will embark on a programming journey to explore the depths of object-oriented programming by modeling wild animals in the jungle using Java. You will gain hands-on experience in constructing Java classes, defining instance variables, and implementing essential class functionalities. 

### 📅 Deadline
Please complete this assignment by **Friday, April 12th**.

### 📚 Instructions
Follow the submission guidelines outlined in the [course's assignment instructions](https://gits-15.sys.kth.se/inda-23/course-instructions#assignments).
 
### 📖 Preparation
Before you start, ensure you have grasped the fundamental concepts by reviewing the relevant material:

- Read [Classes and Objects in Java](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
- Access additional resources using the course key `dd1337-ht23` at [KTH OLI](https://kth.oli.cmu.edu/).

> **Note:** The resources could be updated annually, so it's recommended to check for revisions and additional readings.

### 🎯 Learning Goals

By the end of this task, you will achieve the following skills:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Utilizing the `main` method
* Understanding Scope and *Variable Shadowing*

### 🛠 Troubleshooting Guide
If you run into issues, take the following steps:

1. Review the [current issues](https://gits-15.sys.kth.se/inda-23/help/issues) to see if others have encountered similar problems.
2. If your issue is unique, submit a [New Issue](https://gits-15.sys.kth.se/inda-23/help/issues/new). Title it as "Task *x*: *brief problem description*".
3. Reach out to a Teaching Assistant during the scheduled [weekly lab](https://queue.csc.kth.se/Queue/INDA).

We encourage collaborative discussions, but remember not to share direct answers!

### 🌿 Assignment

Deep within the jungles of Java, lies the mythical **JungleBeast**! Your goal is to create a digital model of these majestic creatures. Below is a sample illustration to inspire your design:

<img src="images/junglebeasts.png" width="800">

#### Exercise 1.0 -- Fields
Create a new file, `JungleBeast.java`, in the `src` directory. Begin by defining the primary attributes (fields) of a JungleBeast:

- `String` species
- `int` energyLevel
- `int` strength
- `int` agility
- `boolean` asleep

With these fields, your initial setup should allow the sample main method in Example 1 to execute successfully.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  class JungleBeast {

    // Declare your fields here!

    public static void main(String[] args) {
      // Initialize a JungleBeast object
      JungleBeast leopard = new JungleBeast();

      // Assign properties directly
      leopard.species = "Leopard";
      leopard.energyLevel = 100;
      leopard.strength = 80;
      leopard.agility = 90;

      // Display the JungleBeast's properties
      System.out.println("Species: " + leopard.species);
      System.out.println("Energy Level: " + leopard.energyLevel);
      System.out.println("Strength: " + leopard.strength);
      System.out.println("Agility: " + leopard.agility);
    }
  }
  ```
</details>

#### Exercise 1.1 -- Getters and Setters
Encapsulation is a core tenet of object-oriented programming. Ensure your fields are securely encapsulated by setting their access modifiers to `private`. Implement getters and setters for each field to manage access and modification. Successfully implement these methods so the Example 2 code executes without errors.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  class JungleBeast {

    // Declare your fields here!

    // Implement your getters and setters here!

    public static void main(String[] args) {
      JungleBeast tiger = new JungleBeast();

      // Use setters to assign values
      tiger.setSpecies("Tiger");
      tiger.setEnergyLevel(120);
      tiger.setStrength(85);
      tiger.setAgility(88);

      // Retrieve and print properties using getters
      System.out.println("Species: " + tiger.getSpecies());
      System.out.println("Energy Level: " + tiger.getEnergyLevel());
      System.out.println("Strength: " + tiger.getStrength());
      System.out.println("Agility: " + tiger.getAgility());
      System.out.println("Is asleep: " + tiger.isAsleep());
    }
  }
  ```
</details>

> **Note:** For boolean fields, the `isAsleep()` naming convention is used instead of `getAsleep()`.

#### Exercise 1.2 -- Constructor
Streamline your object creation process by developing a constructor based on the best practices found in [Java Constructors](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html). Make sure the Example 3 method integrates your constructor efficiently.

#### Exercise 1.3 -- displayInfo()
Create a method called `displayInfo()` that summarizes the JungleBeast's data in a formatted print statement. Implement functionality such that the following example works:

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public static void main(String[] args){
    JungleBeast elephant = new JungleBeast("Elephant", 150, 50, 30);

    elephant.displayInfo();
  }
  ```

  Expected Output:

  ```
  > Species: Elephant
  > Energy Level: 150
  > Strength: 50
  > Agility: 30
  > Asleep: false
  ```
</details>

#### Exercise 1.4 -- Jungle Tussle!
Incorporate a method called `tussle` that simulates a challenge between two JungleBeasts. Determine the tussle outcome based on strength and agility, printing status updates to the console. Implement Example 4 to illustrate this dynamic.

<details>
  <summary> 🛠 Example 4 </summary>

  ```java
  public static void main(String[] args){
    JungleBeast jaguar = new JungleBeast("Jaguar", 100, 70, 85);
    JungleBeast lion = new JungleBeast("Lion", 110, 75, 80);

    jaguar.tussle(lion);
  }
  ```

  Example Output:

  ```
  > Jaguar engages Lion in a tussle and deals damage!
  > Lion sustains 5 points of damage and now has a decreased energy level of 105!
  ```
</details>

#### Exercise 1.5 -- Variable Shadowing
Review the examples below to grasp how *variable shadowing* can cause conflicts. Be prepared to identify and explain solutions during the class discussion.

```Java
public class ShadowExample {
    private int depth = 0; // Attempting to print this variable

    public void revealDepth() {
        int depth = 20;
        System.out.println(depth); // Why does it print the wrong value?
    }

    public static void main(String[] args){
        new ShadowExample().revealDepth();
    }
}
```

Additional example:

```Java
public class Tiger {
  private String stripPattern = "Vertical";
  private String sound;

  public Tiger(String stripPattern, String sound) {
    stripPattern = stripPattern; // Potential issue here?
    sound = sound;
  }

  public void roar(){
    String sound = "Loud Roar";
    System.out.println("Tiger sound: " + sound); // Why could this be incorrect?  
  }

}
```

> **Tip:** Familiarize yourself with [variable scope](https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html).

### 🐛 Bug Reports
If you identify any discrepancies or errors in this exercise, please report them by creating a [New Issue](https://gits-15.sys.kth.se/inda-23/help/issues/new) with the subject "Task *x* Bug: *brief error description*". Detecting bugs will earn you accolades in the acknowledgments!