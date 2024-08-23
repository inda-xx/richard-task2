import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SecureBankingSystemTest {

    private SecureBankingSystem bankingSystem;

    @Before
    public void setUp() throws Exception {
        bankingSystem = new SecureBankingSystem();
        // Set up the database for testing
        try (Connection conn = DriverManager.getConnection(SecureBankingSystem.DB_URL, SecureBankingSystem.USER, SecureBankingSystem.PASS);
             Statement stmt = conn.createStatement()) {
            // Create a test accounts table
            String createTableSql = "CREATE TABLE IF NOT EXISTS accounts (name VARCHAR(255), balance DOUBLE)";
            stmt.executeUpdate(createTableSql);
            
            // Clear any existing data
            String clearDataSql = "DELETE FROM accounts";
            stmt.executeUpdate(clearDataSql);
        } catch (SQLException e) {
            e.printStackTrace();
            fail("Failed to set up database for testing");
        }
    }

    @After
    public void tearDown() throws Exception {
        // Clean up the database after testing
        bankingSystem.closeConnection();
    }

    @Test
    public void testCreateAccount_ValidInputs() {
        bankingSystem.createAccount("John Doe", 1000.0);
        assertEquals(1000.0, bankingSystem.checkBalance("John Doe"), 0.01);
    }

    @Test
    public void testCreateAccount_ZeroInitialDeposit() {
        bankingSystem.createAccount("Jane Doe", 0.0);
        assertEquals(0.0, bankingSystem.checkBalance("Jane Doe"), 0.01);
    }

    @Test
    public void testCreateAccount_NegativeInitialDeposit() {
        bankingSystem.createAccount("NegativeBalance", -100.0);
        assertEquals("Account should not be created with negative initial deposit", 
                     0.0, bankingSystem.checkBalance("NegativeBalance"), 0.01);
    }

    @Test
    public void testDeposit_ValidAmount() {
        bankingSystem.createAccount("John Doe", 500.0);
        bankingSystem.deposit("John Doe", 200.0);
        assertEquals(700.0, bankingSystem.checkBalance("John Doe"), 0.01);
    }

    @Test
    public void testDeposit_NegativeAmount() {
        bankingSystem.createAccount("John Doe", 500.0);
        bankingSystem.deposit("John Doe", -100.0);
        assertEquals("Balance should not change with a negative deposit", 
                     500.0, bankingSystem.checkBalance("John Doe"), 0.01);
    }

    @Test
    public void testDeposit_AccountNotFound() {
        bankingSystem.deposit("NonExistent", 100.0);
        assertEquals("Account should not exist", 
                     0.0, bankingSystem.checkBalance("NonExistent"), 0.01);
    }

    @Test
    public void testWithdraw_ValidAmount() {
        bankingSystem.createAccount("Jane Doe", 800.0);
        bankingSystem.withdraw("Jane Doe", 200.0);
        assertEquals(600.0, bankingSystem.checkBalance("Jane Doe"), 0.01);
    }

    @Test
    public void testWithdraw_InsufficientFunds() {
        bankingSystem.createAccount("Jane Doe", 800.0);
        bankingSystem.withdraw("Jane Doe", 900.0);
        assertEquals("Balance should not change with insufficient funds for withdrawal", 
                     800.0, bankingSystem.checkBalance("Jane Doe"), 0.01);
    }

    @Test
    public void testWithdraw_AccountNotFound() {
        bankingSystem.withdraw("NonExistent", 100.0);
        assertEquals("Account should not exist", 
                     0.0, bankingSystem.checkBalance("NonExistent"), 0.01);
    }

    @Test
    public void testCheckBalance_ValidAccount() {
        bankingSystem.createAccount("John Doe", 1000.0);
        assertEquals(1000.0, bankingSystem.checkBalance("John Doe"), 0.01);
    }

    @Test
    public void testCheckBalance_AccountNotFound() {
        assertEquals("Balance should be 0 for non-existent account", 
                     0.0, bankingSystem.checkBalance("NonExistent"), 0.01);
    }
}