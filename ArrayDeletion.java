import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
        int n, pos, i;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int ar[] = new int[n];
        for (i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        System.out.println("Enter position to delete the element");
        pos = in.nextInt();
        if (pos >= n + 1) {
            System.out.println("Deletion is not possible");
        } else {
            for (i = pos - 1; i < n - 1; i++) {
                ar[i] = ar[i + 1];
            }
        }
        for (i = 0; i < n - 1; i++) {
            System.out.println(ar[i]);
        }
    }
}
