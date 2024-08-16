# Java Zoo: The Animal Kingdom 🦁 

During this exercise, we will delve deeper into the essence of object-oriented programming. We will design and create a blueprint of the Animal Kingdom in Java!

### 💀 Deadline
This exercise should be completed before the deadline, on **Friday 23th September**.

### 👩‍🏫 Instructions
For instructions on how to do and submit the assignment, please see the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation
You must read and answer the questions in the OLI material for Module 2.

- Read [Looking Inside Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- If you have not done so, go to https://kth.oli.cmu.edu/, sign up and register for the course key `dd1337-ht22`

### ✅ Learning Goals

This week's learning goals include:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide
If you have any questions or problems, follow this procedure:

1. Look at this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Are other students asking about your problem?
2. If not, post a question yourself by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Add a descriptive title, beginning with "Task *x*: *summary of problem here*"
3. Ask a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule to see when the next lab is.

### 🏛 Assignment

For this exercise, we are going to model the creatures of an imaginary Java Zoo. Your task is to create different `Animal` classes in Java that imitate the attributes and behavior of various zoo animals. 

#### Exercise 2.0 -- Fields
In the [`src`](src) folder, create a new class called `Animal.java`. The `Animal` class should have attributes such as:

- `String` species
- `int` lifespan
- `String` origin
- `boolean` carnivore
- `String` diet

You should be able to see a similar output with the main method provided in Example 1 if added to `Animal.java`.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  class Animal {

    // Declare your fields here!

    public static void main(String[] args) {
      // create a new "Animal" object
      Animal lion = new Animal();

      // assign the instance variables to meaningful values
      lion.species = "Lion";
      lion.lifespan = 14;
      lion.origin = "Africa";
      lion.carnivore = true;
      lion.diet = "Meat";

      // print the information of the assigned values
      System.out.println("Animal: " + lion.species);
      System.out.println("Lifespan: " + lion.lifespan);
      System.out.println("Origin: " + lion.origin);
      System.out.println("Carnivore: " + lion.carnivore);
      System.out.println("Diet: " + lion.diet);
    }
  }
  ```
</details>

#### Exercise 2.1 -- Getters and Setters
Make the fields of your `Animal` class `private` for proper encapsulation. To read or write to these fields, you will need to add *accessors* and *mutators* (i.e., *getters* and *setters*). Don't forget the naming convention for *getters* and *setters* of `boolean` fields.
The amended `main` function in Example 2 should compile if added to `Animal.java`.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  class Animal {

    // Declare your fields here!

    // Declare your getters and setters here!

    public static void main(String[] args) {
      // create a new "Animal" object
      Animal lion = new Animal();

      // use setters to assign values to the new "Animal" object
      lion.setSpecies("Lion");
      lion.setLifespan(14);
      lion.setOrigin("Africa");
      lion.setCarnivore(true);
      lion.setDiet("Meat");

      // use getters to retrieve and print the values
      System.out.println("Animal: " + lion.getSpecies());
      System.out.println("Lifespan: " + lion.getLifespan());
      System.out.println("Origin: " + lion.getOrigin());
      System.out.println("Carnivore: " + lion.isCarnivore());
      System.out.println("Diet: " + lion.getDiet());
    }
  }
  ```
</details>

#### Exercise 2.2 -- Constructor
Implement a constructor for the `Animal` class to initialize all fields simultaneously. Once this is done, creating an `Animal` object and setting its attributes will be a lot easier and compact.

#### Exercise 2.3 -- `printAnimalInfo()`
Print all the information about an animal to the terminal with the `printAnimalInfo()` method. After its implementation, the `main` method should look similar to Example 3.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public static void main(String[] args){
    // create a new "Animal" object
    Animal lion = new Animal("Lion", 14, "Africa", true, "Meat");

    // print all information about the animal
    lion.printAnimalInfo();
  }
  ```
  
  The output should be:
  
  ```
  > Animal: Lion
  > Lifespan: 14
  > Origin: Africa
  > Carnivore: true
  > Diet: Meat
  ```
</details>

#### Exercise 2.4 -- `attemptEat()`
Animals have different diets. In our imaginary Java Zoo, each animal attempts to eat a certain type of food. Implement a method called `attemptEat()` which takes as input the type of food an animal tries to eat. This function should check whether this type of food matches the animal's diet. If it does, the animal eats the food; if it doesn't, the animal refuses to eat.

#### Exercise 2.5 -- Variable Shadowing
Understand and analyze the provided examples of variable shadowing. You may be asked to explain a solution to these scenarios in class so be prepared. 

Please submit the link to your repo and with your Java files included before the deadline.

### 🐞 Bugs and Errors 
If you encounter any irregularities within the assignment, please let us know by opening an issue with the title "Task *x* Error: *summary of error here*". We appreciate your help in making the assignment as clear as possible for everybody!