
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    String name;
    int accountNumber;
    double balance;

    BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully");
        System.out.println("Available Balance: Rs. " + balance);
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        balance -= amount;
        System.out.println("Amount Withdrawn Successfully");
        System.out.println("Available Balance: Rs. " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Account Number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(name, accountNumber, balance);

        System.out.print("Operation (Deposit/Withdraw): ");
        String operation = sc.next();

        try {
            if (operation.equalsIgnoreCase("Deposit")) {
                System.out.print("Deposit Amount: ");
                double amount = sc.nextDouble();
                account.deposit(amount);
            } 
            else if (operation.equalsIgnoreCase("Withdraw")) {
                System.out.print("Withdraw Amount: ");
                double amount = sc.nextDouble();
                account.withdraw(amount);
            } 
            else {
                System.out.println("Invalid Operation");
            }
        } 
        catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Transaction Failed");
            System.out.println("Available Balance: Rs. " + account.balance);
        }

        sc.close();
    }
}

