
import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sub1, sub2, sub3;

        System.out.print("Enter Subject 1 Marks: ");
        sub1 = sc.nextInt();

        System.out.print("Enter Subject 2 Marks: ");
        sub2 = sc.nextInt();

        System.out.print("Enter Subject 3 Marks: ");
        sub3 = sc.nextInt();

        int total = sub1 + sub2 + sub3;

        double average = total / 3.0;

        System.out.println("Total Marks = " + total);
        System.out.printf("Average Marks = %.2f%n", average);

        sc.close();
    }
}

