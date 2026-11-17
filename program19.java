
abstract class Payment {

    // Abstract Method
    abstract void makePayment();

    // Common Method
    void printReceipt() {
        System.out.println("Payment Receipt Generated Successfully.");
    }
}

// First Child Class
class UpiPayment extends Payment {

    @Override
    void makePayment() {
        System.out.println("Payment through UPI.");
    }
}

// Second Child Class
class CardPayment extends Payment {

    @Override
    void makePayment() {
        System.out.println("Payment through Debit/Credit Card.");
    }
}

// Third Child Class
class CashPayment extends Payment {

    @Override
    void makePayment() {
        System.out.println("Payment through Cash.");
    }
}

public class program19 {
    public static void main(String[] args) {

        // Parent Type Array
        Payment[] payments = {
            new UpiPayment(),
            new CardPayment(),
            new CashPayment()
        };

        // Calling methods using Loop
        for (int i = 0; i < payments.length; i++) {

            System.out.println("\nPayment " + (i + 1) + ":");

            payments[i].makePayment();
            payments[i].printReceipt();
        }
    }
}

