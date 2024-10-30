import java.util.Scanner;

/**
 * Armstrong1123
 */
public class Armstrong {

    public static void main(String[] args) {
       int n,x,rem,sum=0;
       Scanner in = new Scanner(System.in);
       n  = in.nextInt();
       x=n;
       while (n!=0) {
            rem = n%10;
            sum = sum+(rem*rem*rem);
            n=n/10;
       }
       if(sum == x){
        System.out.println("Armstrong number");
       }
       else{
        System.out.println("Not armstrong number");
       }
    }
}