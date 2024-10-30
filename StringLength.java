import java.util.*;
public class StringLength {

    public static void main(String[] args) {
       String str = "hello world";
       int length=0;
       char ar[] = str.toCharArray();
       for(int i=0;i<ar.length;i++){
        length++;
       }
        System.out.println(length);

   
    }
}

