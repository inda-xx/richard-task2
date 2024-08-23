import org.junit.Before;
    import org.junit.Test;
    import static org.junit.Assert.*;
    import java.util.Arrays;
    import java.util.List;

public class Bicycle {
    // Declare the instance fields
    private String modelName;
    private int gearCount;
    private double currentSpeed;
    private String color;

    // Constructor to initialize the fields
    // Make sure to use the 'this' keyword to resolve variable shadowing
    public Bicycle(String modelName, int gearCount, double currentSpeed, String color) {
        this.modelName = modelName;
        this.gearCount = gearCount;
        this.currentSpeed = currentSpeed;
        this.color = color;
    }

    // Getter for modelName
    public String getModelName() {
        return modelName;
    }

    // Setter for modelName
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    // Getter for gearCount
    public int getGearCount() {
        return gearCount;
    }

    // Setter for gearCount
    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    // Getter for currentSpeed
    public double getCurrentSpeed() {
        return currentSpeed;
    }

    // Setter for currentSpeed
    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Method to print all information about the bicycle
    public void printInfo() {
        System.out.println("Bicycle Model: " + modelName);
        System.out.println("Number of Gears: " + gearCount);
        System.out.println("Current Speed: " + currentSpeed + " km/h");
        System.out.println("Color: " + color);
    }

    // Method to increase the current speed
    public void accelerate(double increment) {
        currentSpeed += increment;
    }

    // Method to decrease the current speed, ensuring it doesn't go below zero
    public void decelerate(double decrement) {
        currentSpeed -= decrement;
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
    }

    // Main method to test the Bicycle class
    public static void main(String[] args) {
        // Creating a new Bicycle object using the constructor
        Bicycle cityCruiser = new Bicycle("CityCruiser", 8, 15.5, "Green");

        // Printing initial information
        cityCruiser.printInfo();

        // Testing accelerate method
        cityCruiser.accelerate(5.0);
        System.out.println("Accelerated Speed: " + cityCruiser.getCurrentSpeed() + " km/h");

        // Testing decelerate method
        cityCruiser.decelerate(10.0);
        System.out.println("Decelerated Speed: " + cityCruiser.getCurrentSpeed() + " km/h");

        // Further testing deceleration to ensure speed doesn't go below zero
        cityCruiser.decelerate(15.0);
        System.out.println("Decelerated Speed: " + cityCruiser.getCurrentSpeed() + " km/h");
    }
}