```java
public class Researcher {
    private String name;
    private int age;
    private String field;
    private boolean isPhd;

    public Researcher(String name, int age, String field, boolean isPhd) {
        this.name = name;
        this.age = age;
        this.field = field;
        this.isPhd = isPhd;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getField() {
        return this.field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public boolean getIsPhd() {
        return this.isPhd;
    }

    public void setIsPhd(boolean isPhd) {
        this.isPhd = isPhd;
    }

    public void printInfo() {
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Field: " + this.getField());
        System.out.println("Is PhD: " + this.getIsPhd());
    }

    public static void main(String[] args) {
        Researcher researcher = new Researcher("John Doe", 30, "Biology", true);
        researcher.printInfo();
    }
}
```