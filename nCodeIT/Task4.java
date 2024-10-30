//Task4: Write a Java program to count the number of even and odd elements in a given array

import java.util.Scanner;
public class Task4 {

    public static void main(String[] args) {
        int n,evenCount=0, oddCount=0;

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int ar[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            ar[i]= in.nextInt();
        }

        for (int i = 0; i < ar.length; i++) {
            
            if(ar[i]%2==0)
                evenCount++;
            else    
                oddCount++;
        }
        System.out.println("EvenCount:  "+ evenCount);
        System.out.println("OddCount:  "+ oddCount);
    }
}