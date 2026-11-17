import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double length, breadth;

        System.out.print("Enter Length: ");
        length = sc.nextDouble();

        System.out.print("Enter Breadth: ");
        breadth = sc.nextDouble();

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);

        sc.close();
    }
}
