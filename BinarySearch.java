import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int n, i, low, high, mid, key;

        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int ar[] = new int[n];
        for (i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }

        System.out.println("Enter the key element to search: ");
        key = in.nextInt();

        low = 0;
        high = n - 1;

        while (low <= high) {
            mid = (low + high) / 2;

            if (key < ar[mid]) {
                high = mid - 1;
            } else if (key > ar[mid]) {
                low = mid + 1;
            } else if (key == ar[mid]) {
                System.out.println("Element is found");
                break;
            }
        }
        if (low > high) {
            System.out.println("Element is not found");
        }

    }
}
