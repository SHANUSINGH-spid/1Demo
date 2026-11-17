
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

public class program18 {
    public static void main(String[] args) {

        Payment p1 = new UpiPayment();
        Payment p2 = new CardPayment();
        Payment p3 = new CashPayment();

        System.out.println("UPI Payment:");
        p1.makePayment();
        p1.printReceipt();

        System.out.println("\nCard Payment:");
        p2.makePayment();
        p2.printReceipt();

        System.out.println("\nCash Payment:");
        p3.makePayment();
        p3.printReceipt();
    }
}

