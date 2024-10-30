// import java.util.Scanner;

// public class ArrayMax {
//     public static void main(String[] args) {
//         int n,i,max;
//         Scanner in = new Scanner(System.in);
//         n = in.nextInt();

//         int ar[] = new int[n];
//         for(i=0;i<n;i++){
//             ar[i]  = in.nextInt();
//         }
//         max=ar[0];
//         for(i=0;i<n;i++){
//             if(ar[i]>max){
//                 max = ar[i];
//             }
//         }
//         System.out.println(max);
//     }
// }

import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        int n, i, max;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int ar[] = new int[n];
        for (i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        max = ar[0];
        for (i = 0; i < n; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        System.out.println("max is " + max);
    }
}