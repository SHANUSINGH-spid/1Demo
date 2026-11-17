
import java.util.Scanner;

public class program13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str;
        int count = 0;

        System.out.print("Enter a Sentence: ");
        str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                count++;
            }
        }

        System.out.println("Total Number of Vowels = " + count);

        sc.close();
    }
}

