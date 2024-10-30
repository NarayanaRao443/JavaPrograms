import java.util.*;

public class ArraySecondMin {
    public static void main(String[] args) {

        int n, i, fmin, smin;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int ar[] = new int[n];
        for (i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }

        fmin = ar[0];
        smin = ar[0];

        for (i = 0; i < n; i++) {
            if (ar[i] < fmin) {
                smin = fmin;
                fmin = ar[i];
            } else if (ar[i] < smin) {
                smin = ar[i];
            }
        }
        System.out.println("fmin is: " + fmin);
        System.out.println("smin is: " + smin);

    }
}
