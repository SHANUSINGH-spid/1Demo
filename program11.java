
import java.util.Scanner;

public class program11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1, str2;

        System.out.print("Enter First String: ");
        str1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        str2 = sc.nextLine();

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Both Strings are Equal.");
        } 
        else {
            System.out.println("Both Strings are Not Equal.");
        }

        sc.close();
    }
}

