# 🎨 Art Exhibition Simulator

Welcome to an exciting programming task where you'll create a simple simulation of an art exhibition using Java classes. Through this task, you'll develop a deeper understanding of object-oriented programming concepts such as designing classes, constructors, encapsulation, and more.

### 📅 Deadline
Complete this task by **Monday, 20th March**.

### 👨‍🎓 Instructions
For assignment details and submission guidelines, please refer to the [course instructions](https://example.com/course-instructions#assignments).

### 📚 Preparation
Make sure you have a solid understanding of Java basics and have read the following resources:

- Review [Java Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
- Understanding [Encapsulation](https://docs.oracle.com/javase/tutorial/java/javaOO/encapsulation.html)

### 🎯 Learning Goals

The goals for this week's task include:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding scope (or *variable shadowing*)

### 🆘 Troubleshooting
If you encounter any issues, follow this method:

1. Check existing [issues on the forum](https://example.com/forum/issues) to see if someone else has already raised your query.
2. Post a new question in the discussion forum if your issue is new.
3. Consult a teaching assistant (TA) during the [scheduled lab sessions](https://example.com/labs).

### 🖼️ Assignment: Art Exhibition

In this task, you will create classes that represent an art exhibition. The exhibition consists of various artworks, each with specific attributes. You will model these classes, practice encapsulation, and familiarize yourself with Java methods and scope.

#### Exercise 1 -- Fields
Create a class called `Artwork.java`. Each artwork object should have the following fields:

- `String title`
- `String artist`
- `int year`
- `boolean isOnDisplay`

To check if everything is implemented correctly, you can use the `main` method provided below.

<details>
  <summary> 🛠 Main Method Sample </summary>

  ```java
  public class Artwork {

    // Define your fields here

    public static void main(String[] args) {
      Artwork artwork = new Artwork();

      // Assign values to fields
      artwork.title = "Starry Night";
      artwork.artist = "Vincent van Gogh";
      artwork.year = 1889;
      artwork.isOnDisplay = true;

      // Print the artwork information
      System.out.println("Title: " + artwork.title);
      System.out.println("Artist: " + artwork.artist);
      System.out.println("Year: " + artwork.year);
      System.out.println("Is on display: " + artwork.isOnDisplay);
    }
  }
  ```
</details>

#### Exercise 2 -- Encapsulation: Getters and Setters
Implement encapsulation by making the fields in `Artwork` private, and then add public getters and setters for each field.

<details>
  <summary> 🛠 Encapsulation Example </summary>

  ```java
  private String title;
  private String artist;
  private int year;
  private boolean isOnDisplay;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  // Repeat for other fields...
  ```
</details>

#### Exercise 3 -- Constructors
Add a constructor to `Artwork.java` that takes parameters for all fields, and initializes them accordingly. Refactor the `main` method to utilize this constructor.

<details>
  <summary> 🛠 Constructor Example </summary>

  ```java
  public Artwork(String title, String artist, int year, boolean isOnDisplay) {
    this.title = title;
    this.artist = artist;
    this.year = year;
    this.isOnDisplay = isOnDisplay;
  }
  
  // Main method should now use the constructor to create 'artwork' objects
  Artwork artwork = new Artwork("Starry Night", "Vincent van Gogh", 1889, true);
  ```
</details>

#### Exercise 4 -- Printable Info
Create a method named `printInfo()` in the `Artwork` class that outputs all information about the artwork to the terminal in a readable format.

<details>
  <summary> 🛠 Print Info Method </summary>

  ```java
  public void printInfo() {
    System.out.println("Artwork Details:");
    System.out.println("Title: " + title);
    System.out.println("Artist: " + artist);
    System.out.println("Year: " + year);
    System.out.println("Is on display: " + isOnDisplay);
  }
  ```
</details>

#### Exercise 5 -- Exhibition
Create a new class `Exhibition.java` that holds multiple `Artwork`. Add methods to add art pieces to the exhibition and list all of them.

<details>
  <summary> 🛠 Exhibition Example </summary>

  ```java
  import java.util.ArrayList;

  public class Exhibition {
    private ArrayList<Artwork> artworks;

    public Exhibition() {
      this.artworks = new ArrayList<>();
    }

    public void addArtwork(Artwork art) {
      artworks.add(art);
    }

    public void listArtworks() {
      for (Artwork art : artworks) {
        art.printInfo();
      }
    }
  }
  ```
</details>

#### Exercise 6 -- Variable Shadowing
Understand variable shadowing by fixing the code below. You should use the `this` keyword to resolve conflicts.

```java
public class Gallery {
  private String galleryName = "National Gallery";

  public void displayGalleryName(String galleryName) {
    System.out.println(galleryName); // It prints the parameter 'galleryName', but I want the instance variable
  }

  public static void main(String[] args) {
    Gallery gallery = new Gallery();
    gallery.displayGalleryName("Local Gallery");
  }
}
```

> **Note:** Pay attention to where local variables might overshadow instance variables, and how `this` can resolve it.

### 🔍 Found Bugs?
If you spot any issues with this task, report them via [New Task Error Report](https://example.com/support/new). Your feedback is valued and will be acknowledged.

Happy Coding! 💻