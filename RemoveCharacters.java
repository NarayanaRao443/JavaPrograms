//remove charcters from given string and prints the numbers

//Input: S = "AA1d23cBB4"
//Output: 1234

import java.util.Scanner;

class RemoveCharacters {
    public static String removeCharacters(String s) {
        // code here
        String st = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                st += ch;
            }
        }
        return st;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String res;
        System.out.println(removeCharacters(s));

    }
}

/*
 * import java.util.*;
 * 
 * 
 * public class RemoveCharacters {
 * 
 * public static void main(String[] args) {
 * 
 * String st;
 * String s = "";
 * Scanner in = new Scanner(System.in);
 * st = in.next();
 * 
 * for (int i = 0; i < st.length(); i++) {
 * char ch = st.charAt(i);
 * if (ch >= '0' && ch <= '9') {
 * s += ch;
 * }
 * }
 * System.out.println(s);
 * 
 * }
 * 
 * }
 */