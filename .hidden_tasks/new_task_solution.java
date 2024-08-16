```java
package com.example;

public class Car {

    // Defining instance variables
    private String brand;
    private String model;
    private int year;
    private int speed;
    private boolean engineStatus;

    // Defining constructors
    public Car() {
        this.brand = "";
        this.model = "";
        this.year = 0;
        this.speed = 0;
        this.engineStatus = false;
    }

    public Car(String brand, String model, int year, int speed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.engineStatus = false;
    }

    // Getter and setter methods
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isEngineStatus() {
        return this.engineStatus;
    }

    public void setEngineStatus(boolean engineStatus) {
        this.engineStatus = engineStatus;
    }

    // Method to print details of car
    public void printDetails() {
        System.out.println("DETAILS OF THE CAR:");
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Year of manufacturing: " + this.year);
        System.out.println("Speed: " + this.speed);
        System.out.println("Engine Status: " + this.engineStatus);
    }

    // Method to speed up
    public void speedUp(int increasedSpeed) {
        this.speed += increasedSpeed;
        System.out.println("The " + this.brand + " " + this.model + " is now running at " + this.speed + " km/h speed!");
    }

    // Main method
    public static void main(String[] args) {
        Car mycar = new Car("Tesla", "Model S", 2022, 0);
        mycar.printDetails();
        mycar.speedUp(60);
    }
}
```

### Tests
```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {
    private Car car;

    @Before
    public void setUp() {
        car = new Car("Tesla", "Model S", 2022, 0);
    }

    @Test
    public void testGetBrand() {
        assertEquals("Tesla", car.getBrand());
    }

    @Test
    public void testGetModel() {
        assertEquals("Model S", car.getModel());
    }

    @Test
    public void testGetYear() {
        assertEquals(2022, car.getYear());
    }

    @Test
    public void testSetBrand() {
        car.setBrand("BMW");
        assertEquals("BMW", car.getBrand());
    }

    @Test
    public void testSetModel() {
        car.setModel("i3");
        assertEquals("i3", car.getModel());
    }

    @Test
    public void testSetYear() {
        car.setYear(2020);
        assertEquals(2020, car.getYear());
    }

    @Test
    public void testGetSpeed() {
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testSetSpeed() {
        car.setSpeed(90);
        assertEquals(90, car.getSpeed());
    }

    @Test
    public void testSpeedUp() {
        car.speedUp(60);
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void testEngineStatus() {
        assertFalse(car.isEngineStatus());
    }

    @Test
    public void testSetEngineStatus() {
        car.setEngineStatus(true);
        assertTrue(car.isEngineStatus());
    }
}
``` 

The provided tests are aiming to cover all getter and setter methods, the constructor, as well as the `speedUp` method. It's a good practice to have a unit test for each method in order to verify that they all behave as expected for a variety of inputs. Edge cases and invalid inputs were not considered here as all inputs are controlled in the test environment. Appropriate exception handling in the methods themselves is necessary to cater for edge cases and invalid inputs.