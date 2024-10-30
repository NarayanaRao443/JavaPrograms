// swapping of two numbers

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a,b,temp;

        Scanner in  = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();

        
        System.out.println("Before swapping");
        System.out.println(a);
        System.out.println(b);

        // temp = a;
        // a = b;
        // b = temp;

    
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping");
        System.out.println(a);
        System.out.println(b);
    }
}
