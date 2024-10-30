import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int n, rem, sum = 0, count = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        while (n != 0) {
            rem = n % 10;
            sum = sum + rem;
            count++;
            n = n / 10;
        }
        System.out.println(sum);
        System.out.println(count);
    }
}
