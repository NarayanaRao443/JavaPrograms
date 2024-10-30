import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {
        int n,i,sum=0;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        for(i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
