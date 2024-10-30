// Task9: Write a Java program to get the majority element from a given array of integers containing duplicates.
/* 
import java.util.Scanner;


public class Task9 {

    public static void main(String[] args) {
        int n, res;

        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int ar[] = new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i] = in.nextInt();
        }
        res = maximumElement(ar,n);
        System.out.println(res);
    }

    private static int maximumElement(int[] ar, int n) {

        for(int i=0;i<n;i++)
        {
            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(ar[i] == ar[j]){
                    count++;
                }
            }
            if(count>n/2){
                return ar[i];
            }
        }
         return -1;
    }
}
*/

// Tc: O(n2)
/* 
public class Task9 {

    public static void main(String[] args) {
        
        int ar[] = {2,2,1,1,1,2,2};
        int res;
        res = majorityElement(ar);
        System.out.println(res);
    }

    public static int majorityElement(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            int count = 1;
            for(int j=i+1; j<ar.length;j++)
            {
                if(ar[i] == ar[j])
                {
                    count++;
                }
            }
            if(count > ar.length/2)
            {
                return ar[i];
            }
        }
        return -1;
    }
}
*/

// TC: O(n)
public class Task9 {
    public static void main(String[] args) {
        // int ar[] = { 3, 1, 3, 3, 2 };
        // int ar[] = { 2, 2, 1, 1, 1, 2, 2 };
        int ar[] = { 5, 5, 8, 8, 8, 8, 1 };
        int max = majorityElement(ar);
        System.out.println(max);
    }

    public static int majorityElement(int ar[]) {
        int maj = ar[0];
        int count = 1;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == maj) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                maj = ar[i];
                count = 1;
            }
        }
        return maj;

    }
}
