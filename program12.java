
import java.util.Scanner;

public class program12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str;

        System.out.print("Enter a String: ");
        str = sc.nextLine();

        System.out.print("Reverse String = ");

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        sc.close();
    }
}
