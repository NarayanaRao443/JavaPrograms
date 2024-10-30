// import java.util.Scanner;

// public class Gcd {
//     public static void main(String[] args) {
//         int n1,n2,i,gcd=1;
//         Scanner in = new Scanner(System.in);
//         n1 = in.nextInt();
//         n2 = in.nextInt();

//         for(i=1;i<=n1 && i<=n2;i++){
//             if(n1%i==0 && n2%i==0){
//                 gcd = i;
//             }
//         }
//         System.out.println(gcd);
//         int lcm;
//         lcm = (n1*n2)/gcd;
//         System.out.println(lcm);
//     }
// }


import java.util.*;
/**
 * Gcd
 */
public class Gcd {

    public static void main(String[] args) {
        int n1,n2,i,gcd=1;
        Scanner in = new Scanner(System.in);
        n1 = in.nextInt();
        n2 = in.nextInt();
       
        for(i=1;i<=n1 && i<=n2; i++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
        int lcm = (n1*n2)/gcd;
        System.out.println(lcm);
    }
}