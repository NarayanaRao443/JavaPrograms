import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        str=in.nextLine();
        String rev="";
        int length = str.length();
        for(int i=length-1;i>=0;i--){
            rev +=str.charAt(i); 
        }
        System.out.println(rev);
    
    if(str.toLowerCase().equals(rev.toLowerCase())){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not palindrome");
    }
}
}




