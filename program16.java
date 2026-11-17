
import java.util.Scanner;

public class program16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter the Size of Array: ");
        n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive size.");
            sc.close();
            return;
        }

        int[] numbers = new int[n];

        // Input Array Elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Initialize Largest and Smallest
        int largest = numbers[0];
        int smallest = numbers[0];

        // Find Largest and Smallest
        for (int i = 1; i < n; i++) {

            if (numbers[i] > largest) {
                largest = numbers[i];
            }

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Largest Number = " + largest);
        System.out.println("Smallest Number = " + smallest);

        sc.close();
    }
}

