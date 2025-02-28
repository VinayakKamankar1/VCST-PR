import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleBankingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;

        boolean Runing = true;
        while (Runing) {
            System.out.println("\nBanking Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transactions");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount; 
                    transactions.add("Deposited: $" + depositAmount);
                    System.out.println("Deposit successful!");
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    if (withdrawalAmount <= balance) {
                        balance -= withdrawalAmount;
                        transactions.add("Withdrawn: $" + withdrawalAmount);
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Insufficient funds!");
                    }
                    break;
                case 3:
                    System.out.println("Current Balance: $" + balance);
                    break;
                case 4:
                    System.out.println("Transaction History:");
                    for (String transaction : transactions) {
                        System.out.println(transaction);
                    }
                    break;
                case 5:
                    Runing = false; // Exit the loop
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("\nFinal Account Balance: $" + balance);
        System.out.println("Transaction History:");
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }
}