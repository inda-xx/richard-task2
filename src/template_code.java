```java
class Person {
    // Fields
    private String name;
    private String role;
    private int experience;
    private boolean isBandLeader;
    
    // TODO: Add constructor
    public Person(/*insert parameters here*/) {
        //Set the instance variables using the parameters provided
        /*TODO*/
    }

    // accessors
    public String getName() { /*insert code to return name*/ }
    public String getRole() { /*insert code to return role*/ }
    public int getExperience() { /*insert code to return experience*/ }
    public boolean isBandLeader() { /*insert code to return isBandLeader*/ }

    // mutators
    public void setName(String name) { /*insert code to set name*/ }
    public void setRole(String role) { /*insert code to set role*/ }
    public void setExperience(int experience) { /*insert code to set experience*/ }
    public void setIsBandLeader(boolean isBandLeader) { /*insert code to set isBandLeader*/ }

    // printInfo method
    public void printInfo() {
        /*insert code to print details about Person object*/
    }

    public static void main(String[] args) {
        // create a new "Person" object
        // Use the constructor to assign meaningful values
        Person alice = new Person(/*insert constructor arguments here*/);
        // print out the object's details
        alice.printInfo();
    } // end main method
} // end class
```