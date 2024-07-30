To keep things well structured, your class should have these attributes:

1. `AccountNumber`: An integer to represent the account number
2. `Name`: A string to represent the name of the account holder
3. `Balance`: A floating-point number to represent the current balance in the account

Next, define getter and setter methods for all the attributes. Also, the constructor should accept the account number and name as parameters and initially set the balance to zero.

In addition to these basic elements, add the following functionality to your class:

1. `Deposit`: Function to add funds to the account.
2. `Withdraw`: Function to withdraw funds from the account. Withdrawing more funds than currently available should not be allowed.
3. `PrintInfo`: Function to print the account number, name of holder, and current balance.

Finally, your application needs to accept and process a list of banking operations. Represent each operation as a string, where the first character is the operation ('D' for deposit, 'W' for withdrawal), followed by a space and then the amount involved in the operation.

### Existing Code

Your final class should be compatible with the following example:

```java
public class BankAccount {
    private int accountNumber;
    private String name;
    private double balance;
    
    // constructor, getters, setters, deposit, withdraw, and printInfo methods go here
    ...
    
    public static void main(String[] args) {
        // create a new BankAccount object
        BankAccount johnAccount = new BankAccount(123456, "John Doe");
        
        // print out the object's info
        johnAccount.printInfo();
        
        // Deposit $1000
        johnAccount.deposit(1000);
        johnAccount.printInfo();
        
        // Withdraw $200
        johnAccount.withdraw(200);
        johnAccount.printInfo();
        
        // Try to withdraw $1000 (shouldn't be allowed because balance is $800)
        johnAccount.withdraw(1000);
        johnAccount.printInfo();
    }
}
```

The existing code runs a series of operations and should print the following output:

```
Account number: 123456
Account holder: John Doe
Current balance: $0.0
Account number: 123456
Account holder: John Doe
Current balance: $1000.0
Account number: 123456
Account holder: John Doe
Current balance: $800.0
Insufficient balance!
Account number: 123456
Account holder: John Doe
Current balance: $800.0
```

Notice how the withdrawal of $1000 was not performed due to insufficient balance.

Finally, consider and incorporate variable shadowing and scope into your project just as in the examples given in previous tasks. Good luck, dear coder, and may the code be with you!