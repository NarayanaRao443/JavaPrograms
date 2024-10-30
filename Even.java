import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
       // if((n&1)==0)
       if(n%2==0)
       {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
