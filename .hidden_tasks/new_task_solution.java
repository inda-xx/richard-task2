```java
public class BankAccount {
    private int accountNumber;
    private String name;
    private double balance;
    
    // constructor
    public BankAccount(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = 0.0;
    }
    
    // getter methods
    public int getAccountNumber() {
        return this.accountNumber;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    // setter methods
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
        }
    }

    // printInfo method
    public void printInfo() {
        System.out.println("Account number: " + this.accountNumber);
        System.out.println("Account holder: " + this.name);
        System.out.println("Current balance: $" + this.balance);
    }
}
```