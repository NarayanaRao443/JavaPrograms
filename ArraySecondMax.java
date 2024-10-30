import java.util.Scanner;

public class ArraySecondMax {
    public static void main(String[] args) {
        int n,i,fmax,smax;
         Scanner in = new Scanner(System.in);
        n = in.nextInt();   

        int ar[] = new int[n];
        for(i=0;i<n;i++){
            ar[i]  = in.nextInt();
        }
        
        fmax = ar[0];
        smax = ar[0];

        for(i=0;i<n;i++){
            if(ar[i]>fmax){
                smax = fmax;
                fmax = ar[i];
            }
            else if(ar[i]>smax){
                smax = ar[i];
            }
        }
        System.out.println("fmax is: "+fmax);
        System.out.println("smax is: "+smax);
    }
}
