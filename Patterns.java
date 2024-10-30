// import java.util.Scanner;

// public class Patterns {
//     public static void main(String[] args) {
//         int n,i,j;
//         Scanner in = new Scanner(System.in);
//         n = in.nextInt();
//         for(i=0;i<n;i++){
//             for(j=0;j<=i;j++){
//                 System.out.print(j +" ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;
// public class Patterns {
//     public static void main(String[] args) {
//         int n,i,j;
//         Scanner in = new Scanner(System.in);
//         n = in.nextInt();
//         for(i=1;i<=n;i++){
//             for(j=1;j<=i;j++){
//                 System.out.print(i +" ");
//                 //System.out.print(j +" ");
//             }
//             System.out.println();
//         }
//     }
// }
/* 
import java.util.Scanner;

public class Patterns {

    public static void main(String[] args) {
        //int n,i,j,k=1;
        int n,i,j,k=97;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                //System.out.print(k++ +" ");
                System.out.print((char)(k+j) +" ");
            }
            System.out.println();
        }
    }
}
*/

import java.util.Scanner;

public class Patterns {

    public static void main(String[] args) {
        // int n,i,j,k=1;
        int n = 6, i, j, k = 97;
        Scanner in = new Scanner(System.in);
        // n = in.nextInt();

        for (i = 0; i < n; i++) {
            for (j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}