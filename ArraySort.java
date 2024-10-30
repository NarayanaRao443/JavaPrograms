import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        int n,i,j,temp;
         Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int ar[] = new int[n];
        for(i=0;i<n;i++){
            ar[i]  = in.nextInt();
        }

        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(ar[i]>ar[j]){
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }

        for(i=0;i<n;i++){
            System.out.println(ar[i]);
        }
    }
}
