
import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double price;
        int quantity;

        System.out.print("Enter Item Price: ");
        price = sc.nextDouble();

        System.out.print("Enter Item Quantity: ");
        quantity = sc.nextInt();

        double totalBill = price * quantity;

        System.out.printf("Total Bill = %.2f%n", totalBill);

        sc.close();
    }
}

