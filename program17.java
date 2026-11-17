
abstract class Payment {

    // Abstract Method
    abstract void makePayment();

    // Common Method for all child classes
    void printReceipt() {
        System.out.println("Payment Receipt Generated Successfully.");
    }
}

class UpiPayment extends Payment {

    @Override
    void makePayment() {
        System.out.println("Payment through UPI.");
    }
}

class CardPayment extends Payment {

    @Override
    void makePayment() {
        System.out.println("Payment through Debit/Credit Card.");
    }
}

public class program17 {
    public static void main(String[] args) {

        Payment p1 = new UpiPayment();

        System.out.println("UPI Payment:");
        p1.makePayment();
        p1.printReceipt();

        System.out.println();

        Payment p2 = new CardPayment();

        System.out.println("Card Payment:");
        p2.makePayment();
        p2.printReceipt();
    }
}

