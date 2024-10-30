import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int n, i;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int ar[] = new int[n];
        for (i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        System.out.println("Array is");
        for (i = 0; i < n; i++) {
            System.out.println(ar[i]);
        }
        System.out.println("Reverse of array is");
        for (i = n - 1; i >= 0; i--) {
            System.out.println(ar[i]);
        }
    }
}
