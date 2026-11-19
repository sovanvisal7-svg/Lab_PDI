abstract class Payment {
    abstract void processPayment(double amount);
}

class CreditCardPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

class PayPalPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Paid $" + amount + " using PayPal account.");
    }
}

class BankTransferPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Paid $" + amount + " via Bank Transfer.");
    }
}

public class Ex7_Payment {
    public static void main(String[] args) {
        Payment[] payments = {
            new CreditCardPayment(),
            new PayPalPayment(),
            new BankTransferPayment()
        };

        for (Payment p : payments) {
            p.processPayment(150.0);
        }
    }
}
