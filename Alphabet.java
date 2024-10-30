import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        char ch;
        Scanner in = new Scanner(System.in);
        ch = in.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("alphabet");
        } else {
            System.out.println("not alphabet");
        }

    }
}
