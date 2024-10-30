//Task5: Write a Java program to add all the digits of a given positive integer

import java.util.Scanner;

/**
 * Task5
 */
public class Task5 {

    public static void main(String[] args) {
        int num, sum=0,rem;

        System.out.println("Enter a num:");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        while(num!=0)
        {
            rem = num % 10;
            sum = sum+ rem;
            num = num/10;
        }

        System.out.println("Sum of digits: "+sum);
    }
}