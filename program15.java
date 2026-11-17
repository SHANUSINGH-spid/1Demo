
import java.util.Scanner;

public class program15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        System.out.print("Enter the Size of Array: ");
        n = sc.nextInt();

        int[] numbers = new int[n];

        // Input Array Elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            sum = sum + numbers[i];
        }

        // Calculate Average
        double average = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.printf("Average = %.2f%n", average);

        sc.close();
    }
}

