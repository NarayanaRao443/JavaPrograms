import java.io.*;
import java.util.*;

public class Stringss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= -100 && n <= 100) {
            String str = Integer.toString(n);
            System.out.print("Good job");
        } else {
            System.out.print("Wrong Answer");
        }
    }
}