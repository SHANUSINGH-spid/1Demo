
import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double celsius;

        System.out.print("Enter Temperature in Celsius: ");
        celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("Temperature in Fahrenheit = %.2f°F%n", fahrenheit);

        sc.close();
    }
}

