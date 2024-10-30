import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int n,i,ele;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        int ar[] = new int[n];
        for(i=0;i<n;i++){
            ar[i] = in.nextInt();
        }
       
        System.out.println("Enter element to search: ");
        ele = in.nextInt();

        for(i=0;i<n;i++){
            if(ar[i]==ele){
                System.out.println(ar[i] +" is found");
                break;
            }
        }
        if(i==n){
            System.out.println("element is not found");
        }
    }
}
