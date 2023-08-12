import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Transaction {
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}

class Account {
    private String userId;
    private String userPin;
    private double balance;
    private List<Transaction> transactionHistory;

    public Account(String userId, String userPin) {
        this.userId = userId;
        this.userPin = userPin;
        this.balance = 1000.0; 
        this.transactionHistory = new ArrayList<>();
    }

    public boolean authenticate(String inputUserId, String inputUserPin) {
        return userId.equals(inputUserId) && userPin.equals(inputUserPin);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add(new Transaction("Deposit", amount));
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactionHistory.add(new Transaction("Withdraw", amount));
            return true;
        }
        return false;
    }

    public boolean transfer(Account recipient, double amount) {
        if (amount <= balance) {
            balance -= amount;
            recipient.deposit(amount);
            transactionHistory.add(new Transaction("Transfer", amount));
            return true;
        }
        return false;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }
}

class ATM {
    private Scanner scanner;
    private Account account;

    public ATM(Account account) {
        this.scanner = new Scanner(System.in);
        this.account = account;
    }

    public void start() {
        System.out.println("Welcome to the ATM!");
        System.out.print("Enter User ID: ");
        String inputUserId = scanner.nextLine();

        System.out.print("Enter User PIN: ");
        String inputUserPin = scanner.nextLine();

        if (account.authenticate(inputUserId, inputUserPin)) {
            System.out.println("Login successful.");
            showMenu();
        } else {
            System.out.println("Login failed. Exiting...");
        }
    }

    private void showMenu() {
        int choice;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Transactions History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    displayTransactionHistory();
                    break;
                case 2:
                    performWithdrawal();
                    break;
                case 3:
                    performDeposit();
                    break;
                case 4:
                    performTransfer();
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private void displayTransactionHistory() {
        System.out.println("\nTransaction History:");
        List<Transaction> history = account.getTransactionHistory();
        for (Transaction transaction : history) {
            System.out.println(transaction.getType() + ": " + transaction.getAmount());
        }
    }

    private void performWithdrawal() {
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful. Remaining balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    private void performDeposit() {
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.println("Deposit successful. Updated balance: " + account.getBalance());
    }

    private void performTransfer() {
        System.out.print("Enter recipient's User ID: ");
        String recipientUserId = scanner.next();

        Account recipientAccount = new Account(recipientUserId, "1234");

        System.out.print("Enter transfer amount: ");
        double amount = scanner.nextDouble();

        if (account.transfer(recipientAccount, amount)) {
            System.out.println("Transfer successful. Remaining balance: " + account.getBalance());
        } else {
            System.out.println("Transfer failed. Insufficient balance.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Account account = new Account("123456", "7890"); 
        ATM atm = new ATM(account);
        atm.start();
    }
}
