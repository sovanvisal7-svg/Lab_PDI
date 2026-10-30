package Lab03;
import java.util.Scanner;
class Account {
    String accNo;
    String name;
    double balance;
    Account(String accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
    }
    boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
    void display() {
        System.out.printf("Account: %s | Name: %s | Balance: $%.2f%n", accNo, name, balance);
    }
}
public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine();
        Account[] accounts = new Account[n];
        for (int i = 0; i < n; i++) {
            String accNo;
            do {
                System.out.print("Account number (14 digits): ");
                accNo = sc.nextLine();
            } while (accNo.length() != 14);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine();
            accounts[i] = new Account(accNo, name, balance);
        }
        int choice = 0;
        while (choice != 4) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show all accounts");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 3) {
                for (int i = 0; i < n; i++) {
                    accounts[i].display();
                }
            } else if (choice == 1 || choice == 2) {
                System.out.print("Account number: ");
                String find = sc.nextLine();
                Account acc = null;
                for (int i = 0; i < n; i++) {
                    if (accounts[i].accNo.equals(find)) {
                        acc = accounts[i];
                    }
                }
                if (acc == null) {
                    System.out.println("Account not found");
                } else if (choice == 1) {
                    System.out.print("Amount to deposit: ");
                    double amount = sc.nextDouble();
                    acc.deposit(amount);
                    acc.display();
                } else {
                    System.out.print("Amount to withdraw: ");
                    double amount = sc.nextDouble();
                    if (acc.withdraw(amount)) {
                        acc.display();
                    } else {
                        System.out.println("Not enough balance");
                    }
                }
            } else if (choice != 4) {
                System.out.println("Invalid choice");
            }
        }
    }
}