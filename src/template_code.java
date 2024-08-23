### Template

```java
public class Planet {
    // declare fields
    private String name;
    private double mass;
    private double radius;
    private boolean inhabited;

    // create constructor
    public Planet(String name, double mass, double radius, boolean inhabited) {
        // initialize the fields with parameters
        // your code goes here
    }

    // create getters for each field
    public String getName() {
        // your code goes here
    }

    public double getMass() {
        // your code goes here
    }

    public double getRadius() {
        // your code goes here
    }

    public boolean isInhabited() {
        // your code goes here
    }

    // create setters for each field
    public void setName(String name) {
        // your code goes here
    }

    public void setMass(double mass) {
        // your code goes here
    }

    public void setRadius(double radius) {
        // your code goes here
    }

    public void setInhabited(boolean inhabited) {
        // your code goes here
    }

    // method to print details of a planet
    public void printPlanetDetails() {
        // your code goes here
    }

    // method to calculate gravity of the planet
    public double calculateGravity() {
        // your code goes here
    }

    // method to exhibit variable shadowing
    public void shadowedMethod() {
        // your code goes here
    }

    // main method to test the Planet class
    public static void main(String[] args) {
        // create some Planet objects and test the methods
        // your code goes here
    }
}
```

### Additional Exercises (Optional)

Define additional methods. 

```java
public class Planet {
    // ...

    public double compareGravity(Planet p) {
        // your code goes here
    }

    public boolean isHabitable() {
        // your code goes here
    }

    // redefine printPlanetDetails() method for scope practice
    public void printPlanetDetails() {
        // your code goes here
    }
}
```