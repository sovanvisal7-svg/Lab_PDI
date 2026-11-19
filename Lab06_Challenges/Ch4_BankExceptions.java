package Lab06_Challenges;
class BankError extends Exception {
    BankError(String message) {
        super(message);
    }
}

class InsufficientFundsError extends BankError {
    InsufficientFundsError(String message) {
        super(message);
    }
}

class AccountNotFoundError extends BankError {
    AccountNotFoundError(String message) {
        super(message);
    }
}

class CurrencyMismatchError extends BankError {
    CurrencyMismatchError(String message) {
        super(message);
    }
}

public class Ch4_BankExceptions {
    static double balance = 100.0;
    static String currency = "USD";

    static void withdraw(double amount) throws InsufficientFundsError {
        if (amount > balance) {
            throw new InsufficientFundsError("Cannot withdraw $" + amount + ", balance is only $" + balance);
        }
        balance -= amount;
    }

    static void findAccount(String accountNumber) throws AccountNotFoundError {
        if (!accountNumber.equals("ACC-1001")) {
            throw new AccountNotFoundError("Account " + accountNumber + " does not exist");
        }
    }

    static void deposit(double amount, String depositCurrency) throws CurrencyMismatchError {
        if (!depositCurrency.equals(currency)) {
            throw new CurrencyMismatchError("Account uses " + currency + " but deposit is in " + depositCurrency);
        }
        balance += amount;
    }

    public static void main(String[] args) {
        try {
            withdraw(500);
        } catch (InsufficientFundsError e) {
            System.out.println("InsufficientFundsError: " + e.getMessage());
        }

        try {
            findAccount("ACC-9999");
        } catch (AccountNotFoundError e) {
            System.out.println("AccountNotFoundError: " + e.getMessage());
        }

        try {
            deposit(50, "KHR");
        } catch (CurrencyMismatchError e) {
            System.out.println("CurrencyMismatchError: " + e.getMessage());
        }

        
        try {
            withdraw(1000);
        } catch (BankError e) {
            System.out.println("Caught as BankError: " + e.getMessage());
        }
    }
}
