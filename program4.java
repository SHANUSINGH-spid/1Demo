
import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Enter your Name: ");
        name = sc.nextLine();

        System.out.print("Enter your Age: ");
        age = sc.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        sc.close();
    }
}

