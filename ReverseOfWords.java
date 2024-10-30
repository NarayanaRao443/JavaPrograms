// import java.util.Scanner;

// public class ReverseOfWords {
// 	public static void main(String[] args) {
// 		Scanner in = new Scanner(System.in);
// 		System.out.print("Original string : ");

// 		String str = in.nextLine();
// 		in.close();

// 		String ar[] = str.split("\\s");
// 		String reversedString = "";

// 		for (int i = 0; i < ar.length; i++) 
// 		{
// 			String word = ar[i];
// 			String reverseWord = "";
// 			for (int j = word.length() - 1; j >= 0; j--) {
// 				reverseWord = reverseWord + word.charAt(j);
// 			}
// 			reversedString = reversedString + reverseWord + " ";
// 		}

// 		// Displaying the string after reverse
// 		System.out.print("Reversed string : " + reversedString);
// 	}
// }

import java.util.*;

/**
 * ReverseOfWords
 */
public class ReverseOfWords {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        String ar[] = st.split("\\s");
        String rev = "";
        for (int i = 0; i < ar.length; i++) {
            String word = ar[i];
            String revString = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                revString = revString + word.charAt(j);
            }
            rev = rev + revString + " ";
        }
        System.out.println(rev);
    }
}