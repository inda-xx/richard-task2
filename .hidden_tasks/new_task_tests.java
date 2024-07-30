```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {
    private BankAccount bankAccount1;

    @Before
    public void setUp() {
        bankAccount1 = new BankAccount(123456, "John Doe");
    }

    @Test
    public void testGetAccountNumber() {
        assertEquals(123456, bankAccount1.getAccountNumber());
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", bankAccount1.getName());
    }

    @Test
    public void testGetBalance() {
        assertEquals(0.0, bankAccount1.getBalance(), 0.0);
    }

    @Test
    public void testDeposit() {
        bankAccount1.deposit(1000);
        assertEquals(1000.0, bankAccount1.getBalance(), 0.0);
    }

    @Test
    public void testWithdraw() {
        bankAccount1.deposit(1000);
        bankAccount1.withdraw(200);
        assertEquals(800.0, bankAccount1.getBalance(), 0.0);
    }

    @Test
    public void testWithdrawMoreThanBalance() {
        bankAccount1.deposit(500);
        bankAccount1.withdraw(600);
        assertEquals(500.0, bankAccount1.getBalance(), 0.0);
    }

    @Test
    public void testNegativeDeposit() {
        bankAccount1.deposit(-500); // Should not change balance
        assertEquals(0.0, bankAccount1.getBalance(), 0.0);
    }

    @Test
    public void testNegativeWithdraw() {
        bankAccount1.withdraw(-500); // Should not change balance
        assertEquals(0.0, bankAccount1.getBalance(), 0.0);
    }
}

```