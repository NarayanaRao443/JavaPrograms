import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        char ch;
        Scanner in = new Scanner(System.in);
        ch = in.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }
}
