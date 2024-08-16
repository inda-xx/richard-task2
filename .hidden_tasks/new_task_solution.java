```java
public class Person {
    private String name;
    private String role;
    private int experience;
    private boolean isBandLeader;
  
    public Person(String name, String role, int experience, boolean isBandLeader) {
        this.name = name;
        this.role = role;
        this.experience = experience;
        this.isBandLeader = isBandLeader;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return this.role;
    }

    public int getExperience() {
        return this.experience;
    }

    public boolean isBandLeader() {
        return this.isBandLeader;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setIsBandLeader(boolean isBandLeader) {
        this.isBandLeader = isBandLeader;
    }

    public void printInfo() {
        System.out.println("INFO");
        System.out.println("Name: " + this.name);
        System.out.println("Role: " + this.role);
        System.out.println("Experience: " + this.experience + " years");
        System.out.println("BandLeader: " + this.isBandLeader);
    }

    public static void main(String[] args) {
        Person alice = new Person("Alice", "Guitarist", 10, true);
        alice.printInfo();
    }
}
```