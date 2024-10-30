import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int n, i, j, min, temp;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int ar[] = new int[n];
        for (i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }

        for (i = 0; i < n - 1; i++) {
            min = i;
            for (j = i + 1; j < n; j++) {
                if (ar[j] < ar[min]) {
                    min = j;
                }
            }
            temp = ar[min];
            ar[min] = ar[i];
            ar[i] = temp;
        }
        for (i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
