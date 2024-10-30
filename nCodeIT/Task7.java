//Task7: Write a Java program to find the duplicate values of an array of integer values

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int ar[] = new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i] = in.nextInt();
        }
        System.out.println("Duplicate values are:");
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(ar[i] == ar[j])
                {
                    System.out.println(ar[i]);
                }
            }
        }
    }

}