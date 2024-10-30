//Task6: Write a Java program to reverse an array of integer values

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size of array");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        System.out.println("Enter the elements of array");

        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
                ar[i] = in.nextInt();
        }

        System.out.println("Reverse of array");

        for (int i= n-1; i>=0 ;i--) {
            System.out.println(ar[i]);
        }
    }
}