import java.util.Scanner;

public class MatrixMulti {
    public static void main(String[] args) {
        int i, j, k, m, n, p, q, mul;
        // int cr[][] = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rows");
        m = in.nextInt();
        System.out.println("Enter columns");
        n = in.nextInt();

        System.out.println("Enter second matrix rows and columns");
        p = in.nextInt();
        q = in.nextInt();

        if (n == p) {

            int ar[][] = new int[m][n];
            int br[][] = new int[p][q];
            int cr[][] = new int[m][q];
            System.out.println("First matrix values");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    ar[i][j] = in.nextInt();
                }
            }
            System.out.println("Enter second matrix values");

            for (i = 0; i < p; i++) {
                for (j = 0; j < q; j++) {
                    br[i][j] = in.nextInt();
                }
            }
            System.out.println("Product of two matrices is");
            for (i = 0; i < m; i++) {
                for (j = 0; j < q; j++) {
                    mul = 0;
                    for (k = 0; k < p; k++) {
                        mul += ar[i][k] * br[k][j];

                    }
                    cr[i][j] = mul;
                }
            }

            for (i = 0; i < m; i++) {
                for (j = 0; j < q; j++) {
                    System.out.print(cr[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication is not possbile");
        }
    }
}
