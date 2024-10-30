import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        int n, i, sum1 = 0, sum2 = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int ar[] = new int[n];
        for (i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        sum1 = n * (n + 1) / 2;
        for (i = 0; i < n; i++) {
            sum2 = sum2 + ar[i];
        }

        if (sum1 == sum2) {
            System.out.println("present");
        } else {
            System.out.println("not present");
        }
    }
}
