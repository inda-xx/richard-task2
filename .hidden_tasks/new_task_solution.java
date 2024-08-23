```java
public class Planet {
    private String name;
    private double mass;
    private double radius;
    private boolean inhabited;

    public Planet(String name, double mass, double radius, boolean inhabited) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.inhabited = inhabited;
    }

    public String getName() {
        return this.name;
    }

    public double getMass() {
        return this.mass;
    }

    public double getRadius() {
        return this.radius;
    }

    public boolean isInhabited() {
        return this.inhabited;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setInhabited(boolean inhabited) {
        this.inhabited = inhabited;
    }

    public void printPlanetDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Mass: " + this.mass + " kg");
        System.out.println("Radius: " + this.radius + " km");
        System.out.println("Is Inhabited: " + this.inhabited);
    }

    public double calculateGravity() {
        final double G = 6.674 * Math.pow(10, -11);
        return (G * this.mass) / Math.pow(this.radius * 1000, 2); // Gravity calculated in m/s^2
    }

    public void shadowedMethod() {
        String name = "Jupiter";
        System.out.println("Instance Variable: " + this.name);
        System.out.println("Local Variable: " + name);
    }

    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 5.972 * Math.pow(10, 24), 6371, true);
        earth.printPlanetDetails();
        System.out.println("Gravity: " + earth.calculateGravity() + " m/s^2");
        earth.shadowedMethod();
    }
}
```