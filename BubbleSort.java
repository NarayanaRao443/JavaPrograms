import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int n,i,j,temp;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int ar[] = new int[n];
        for(i=0;i<n;i++)
        {
            ar[i] = in.nextInt();
        }

       for(i=0;i<n-1;i++){
        for(j=0;j<n-i-1;j++){
            if(ar[j]>ar[j+1]){
                temp = ar[j];
                ar[j] = ar[j+1];
                ar[j+1] = temp;
            }
        }


        
       }
        for(i=0;i<n;i++){
            System.out.println(ar[i]);
        }

    }
}
