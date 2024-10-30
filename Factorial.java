import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n,fact=1,i;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();

        for(i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
