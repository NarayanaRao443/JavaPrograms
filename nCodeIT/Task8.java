//Task8: Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
/* 
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
     
        int n,sum=10;
        Scanner in = new Scanner(System.in);
       // n = in.nextInt();

        int[] arr = new int[] {2, 7, 5, 4, 3, 9, 15};
        
        // int ar[] = new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     ar[i] = in.nextInt();
        // }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] == sum)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                  //  return new int[] {i,j};
                }

            }
        }
    }
}
*/

import java.util.Arrays;

/**
 * Task8
 */
public class Task8 {

    public static void main(String[] args) {
        int ar[]={1,3,4,5,7,11};
       
        System.out.println(Arrays.toString(twoSum(ar)));
    //    System.out.println(res);
    }
    public static  int[] twoSum(int ar[])
    {
    
    int l=0, r=ar.length-1;
     int sum = 9;
        while (l<r)
        {
             if(l+r>sum)
                r--;
            else if(l+r<sum)
                l++;
            else
                return  new int[]{l,r};       
        }
        return new int[]{-1,-1};
    }
}


