
import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;

        System.out.print("Enter a String: ");
        name = sc.nextLine();

        System.out.println("First Character = " + name.charAt(0));

        System.out.println("Last Character = " + name.charAt(name.length() - 1));

        System.out.println("Character at Position 3 = " + name.charAt(2));

        sc.close();
    }
}

