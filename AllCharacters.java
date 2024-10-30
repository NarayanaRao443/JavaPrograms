/*
Given a string, check if all its characters are the same or not.

Example 1:

Input:
s = "geeks"
Output: False
Explanation: The string contains different
character 'g', 'e', 'k' and 's'.

Example 2:

Input: 
s = "gggg"
Output: True
Explanation: The string contains only one
character 'g'.
*/
/* 
import java.util.Scanner;

class AllCharacters
{
   public static Boolean check (String s)
    {
        // your code here  
       char ch = s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(ch!=s.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        boolean res;
        System.out.println(check(s));

    }
}
*/

/**
 * AllCharacters
 */
/*
 Given string s that is appended with a number at last. The task is to check whether the length of string excluding that number is equal to that number.
Example 1:

Input:  s = "geeks5"
Output: 1
Explanation: Length of geeks is 5
and the last number is also 5.
Example 2:

Input:  s = "geek5"
Output: 0
Explanation: Length of geek is 4
and the last number is 5.
 */


public class AllCharacters {

    public static void main(String[] args) {
        
            String s = "geeks4f7";
                // code here
                int len = s.length()-1;
                System.out.println(len);
                    if(s.charAt(len) == s.charAt(s.length()-1)){
                        System.out.println("true");
                    }
                    else{
                        System.out.println("false");
                    }

    }
}