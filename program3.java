
import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double radius;

        System.out.print("Enter the Radius of Circle: ");
        radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area of Circle = " + area);
        System.out.println("Circumference of Circle = " + circumference);

        sc.close();
    }
}
