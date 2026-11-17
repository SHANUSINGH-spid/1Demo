
import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);

        if (num2 != 0) {
            double quotient = (double) num1 / num2;
            System.out.println("Quotient = " + quotient);
        } else {
            System.out.println("Quotient is not possible (division by zero).");
        }

        sc.close();
    }
}
