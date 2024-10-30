import java.util.Scanner;

public class FactRecursion {
    public static void main(String[] args) {
        int n,fact;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        fact = factorial(n);
        System.out.println(fact);
    }
    public static int factorial(int n){
        if(n==0 || n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
}


/**
 * FactRecursion
 */
// public class FactRecursion {

//     public static void main(String[] args) {
//         int n=5;
//         int fact = factorial(n);
//         System.out.println(fact);
//     }
//     public static int factorial(int n){
//         if (n==0 || n==1) {
//             return 1;
//         }
//         else{
//             return n*factorial(n-1);
//         }
//     }
//     }
