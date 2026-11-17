
import java.util.Scanner;

public class program14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String firstName, lastName;

        System.out.print("Enter First Name: ");
        firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        lastName = sc.nextLine();

        System.out.println("Full Name = " + firstName + " " + lastName);

        System.out.println("Initials = " +
                firstName.charAt(0) + "." +
                lastName.charAt(0) + ".");

        sc.close();
    }
}

