import java.util.Scanner;

public class Prime {
    
public static void main(String[] args) {
    int n,i,flag=0;
    Scanner in = new Scanner(System.in);
    n=in.nextInt();

    if(n==0 || n==1)
        flag=1;
    else{
        for(i=2;i<=n/2;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
    }
    if(flag==0)
    {
        System.out.println("prime");
    }
    else{System.out.println("not prime");}

}}

