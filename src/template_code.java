### Template

```java
// Starting with Rocket Class
class Rocket {
    // Declaring private instance fields/attributes
    private String name;
    private float speed;
    private int score;
    private boolean crashed;
    
    // Add your constructor here
    public Rocket(String name, float speed, int score, boolean crashed) {
        // Initialize instance fields here
    }
    
    // Declare your getter methods here
    // Example: public String getName() { return name; }
    
    // Declare your setter methods here
    // Example: public void setName(String name) { this.name = name; }
    
    // Add a method collideWith here to handle the rocket collisions
    public void collideWith(Asteroid asteroid) {
        // Implement your code here
    }
    
    // Implement the printStats function here
    public void printStats() {
        // Implement your code here
    }
}

// Now continue with the Asteroid Class
class Asteroid {
    // Declare private instance fields for Asteroid here
    private String asteroidType;
    private float speed;
    
    // Add your constructor here
    public Asteroid(String asteroidType, float speed) {
        // Initialize instance fields here
    }
    
    // Declare your getter methods here
    
    // Declare your setter methods here
}

// Add the main method here
public static void main(String[] args) {
    // Create your Rocket and Asteroid objects here
    // Let them interact
    // Print the game results
}

// Create a separate Class for scope understanding
class ScopeExample {
    // Replicate the given examples of Variable shadowing here
    // Fix and observe outcomes
}
```

Remember, replace the comments with actual Java code that reflects the requirements of each exercise. For instance, in the Rocket constructor, you would replace `// Initialize instance fields here` with specific code that assigns the inputted parameters to the class's fields, such as `this.name = name; this.speed = speed;`, etc. Also, be sure to fully implement the `collideWith` and `printStats` methods as per the task description.