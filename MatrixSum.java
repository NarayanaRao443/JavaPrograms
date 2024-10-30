import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        int i, j, m, n;
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();

        System.out.println("first matrix values");
        int ar[][] = new int[m][n];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                ar[i][j] = in.nextInt();
            }
        }

        int br[][] = new int[m][n];
        System.out.println("second matrix values");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                br[i][j] = in.nextInt();
            }
        }
        int sum[][] = new int[m][n];

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                sum[i][j] = ar[i][j] + br[i][j];
            }
        }
        System.out.println("matrix sum is:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose of matrix
        // for(i=0;i<m;i++)
        // {
        // for(j=0;j<n;j++)
        // {
        // System.out.print(ar[j][i]+" ");
        // }
        // System.out.println();
        // }
    }
}
