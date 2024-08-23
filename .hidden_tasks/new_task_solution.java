import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class SecureBankingSystem {

    // Fields for database connection
    private static final String DB_URL = "jdbc:yourdatabaseurl";
    private static final String USER = "yourusername";
    private static final String PASS = "yourpassword";
    private Connection conn;

    // Constructor
    public SecureBankingSystem() {
        try {
            // Establish connection to the database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to create a new account
    public void createAccount(String accountName, double initialDeposit) {
        String sql = "INSERT INTO accounts (name, balance) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, accountName);
            pstmt.setDouble(2, initialDeposit);
            pstmt.executeUpdate();
            System.out.println("Account created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Method to deposit money into an account
    public void deposit(String accountName, double amount) {
        String sql = "UPDATE accounts SET balance = balance + ? WHERE name = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setDouble(1, amount);
            pstmt.setString(2, accountName);
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Deposit completed successfully.");
            } else {
                System.out.println("Account not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to withdraw money from an account
    public void withdraw(String accountName, double amount) {
        String checkBalanceSql = "SELECT balance FROM accounts WHERE name = ?";
        String withdrawSql = "UPDATE accounts SET balance = balance - ? WHERE name = ?";
        
        try (PreparedStatement checkStmt = conn.prepareStatement(checkBalanceSql);
             PreparedStatement withdrawStmt = conn.prepareStatement(withdrawSql)) {
            checkStmt.setString(1, accountName);
            ResultSet rs = checkStmt.executeQuery();
            
            if (rs.next()) {
                double currentBalance = rs.getDouble("balance");
                if (currentBalance >= amount) {
                    withdrawStmt.setDouble(1, amount);
                    withdrawStmt.setString(2, accountName);
                    withdrawStmt.executeUpdate();
                    System.out.println("Withdrawal completed successfully.");
                } else {
                    System.out.println("Insufficient funds.");
                }
            } else {
                System.out.println("Account not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to check account balance
    public double checkBalance(String accountName) {
        String sql = "SELECT balance FROM accounts WHERE name = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, accountName);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getDouble("balance");
                } else {
                    System.out.println("Account not found.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0.0;
    }

    // Method to close the database connection
    public void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SecureBankingSystem bankingSystem = new SecureBankingSystem();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Welcome to the Secure Banking System!");
            System.out.println("1. Create account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter account name: ");
                    String accountName = scanner.nextLine();
                    System.out.print("Enter initial deposit: ");
                    double initialDeposit = scanner.nextDouble();
                    bankingSystem.createAccount(accountName, initialDeposit);
                    break;
                case 2:
                    System.out.print("Enter account name: ");
                    accountName = scanner.nextLine();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bankingSystem.deposit(accountName, depositAmount);
                    break;
                case 3:
                    System.out.print("Enter account name: ");
                    accountName = scanner.nextLine();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    bankingSystem.withdraw(accountName, withdrawalAmount);
                    break;
                case 4:
                    System.out.print("Enter account name: ");
                    accountName = scanner.nextLine();
                    double balance = bankingSystem.checkBalance(accountName);
                    System.out.println("Balance: " + balance);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        bankingSystem.closeConnection();
        scanner.close();
    }
}