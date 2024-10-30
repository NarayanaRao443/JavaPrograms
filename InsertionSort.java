import java.util.*;

public class InsertionSort {

    public static void main(String[] args) {
        int n, i, j, key;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int ar[] = new int[n];
        for (i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }

        for (i = 1; i < n; i++) {
            key = ar[i];
            j = i - 1;
            while (j >= 0 && ar[j] > key) {
                ar[j + 1] = ar[j];
                j = j - 1;
            }
            ar[j + 1] = key;
        }

        for (i = 0; i < n; i++) {
            System.out.println(ar[i]);
        }
    }
}
