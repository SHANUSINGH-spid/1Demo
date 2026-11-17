// Interface
interface Notifier {
    void sendNotification();
}

// Outer Class
class BankAccount {

    private double balance = 5000;

    // 1. Inner Class
    class AccountManager {

        void deposit(double amount) {
            balance = balance + amount;
            System.out.println("Updated Balance: " + balance);
        }

        void showBalance() {
            System.out.println("Current Balance: " + balance);
        }
    }

    // 2. Static Nested Class
    static class Receipt {

        void printReceipt() {
            System.out.println("Bank Receipt Generated Successfully.");
        }
    }

    // 3. Method accepting interface object
    void notifyUser(Notifier notifier) {
        notifier.sendNotification();
    }
}

// Main Class
public class program22 {

    public static void main(String[] args) {

        // Creating Outer Class Object
        BankAccount account = new BankAccount();

        // Creating Inner Class Object using Outer Class Object
        BankAccount.AccountManager manager =
                account.new AccountManager();

        System.out.println("----- Inner Class -----");

        manager.showBalance();
        manager.deposit(2000);

        // Creating Static Nested Class Object
        System.out.println("\n----- Static Nested Class -----");

        BankAccount.Receipt receipt =
                new BankAccount.Receipt();

        receipt.printReceipt();

        // Creating Anonymous Inner Class using Interface
        System.out.println("\n----- Anonymous Inner Class -----");

        account.notifyUser(new Notifier() {

            @Override
            public void sendNotification() {
                System.out.println("Notification: Money deposited successfully!");
            }
        });
    }
}
