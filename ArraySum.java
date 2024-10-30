import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int n,i,sum=0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int ar[] = new int[n];
        for(i=0;i<n;i++)
        {
            ar[i] = in.nextInt();
        }

        for(i=0;i<n;i++){
            sum = sum+ar[i];
        }
        System.out.println(sum);
    }
}
