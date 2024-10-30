//Task10: Write a Java program to print all the LEADERS in the array
//Note: An element is leader if it is greater than all the elements to its right side.
//An element is a leader, if it is greater than all the elements to its right side. And the rightmost element is always a leader

// TC : O(n^2)
/* 
public class Task10 {


    static int leaderArray(int ar[])
    {
        for (int i = 0; i < ar.length; i++) {
            boolean isLeader = true;
            for (int j = i+1; j < ar.length; j++) {
                if(ar[j] >= ar[i])
                {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader == true) {
                System.out.println(ar[i]);
            }
        }
        return 0;
        
    }
    public static void main(String[] args) {
        int ar[] = {8,11,5,11,7,6,3};
        leaderArray(ar);
    }
}
*/


  // TC: O(n)
 // Leader
 /* */
public class Task10 {
    public static int leaderArray(int ar[])
    {
       int cur = ar[ar.length-1];
       System.out.println(cur);       
       for(int i = ar.length-2;i>=0;i--)
       {
            if(ar[i] > cur)
            {
                cur = ar[i];
                System.out.println(cur);
            }    
       }
    return 0;
    }
    public static void main(String[] args) {
        int ar[] = {8,11,5,11,7,6,3};
        leaderArray(ar);
    }
}