class BankAccount {
    protected String accountNumber;
    protected double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);   
        this.interestRate = interestRate;
    }

    void showInfo() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : $" + balance);
        System.out.println("Interest Rate  : " + interestRate + "%");
    }
}

public class Ex4_BankAccount {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount("ACC-1001", 2500.0, 3.5);
        acc.showInfo();
    }
}
