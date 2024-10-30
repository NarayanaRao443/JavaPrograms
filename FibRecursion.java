import java.util.Scanner;

/**
 * FibRecursion
 */
public class FibRecursion {

    public static void main(String[] args) {
        int n,i;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for(i=0;i<n;i++){
            System.out.println(fib(i));
        }
    }
    public static int fib(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else 
            return fib(n-1)+fib(n-2);
    }
}

