import java.util.*;

public class Anagram {
public static void main(String[] args) {
    
    String a = "Anagrams";
    String b = "anagRams";
    String a1 = a.replaceAll("\\s","");
    String b1 = b.replaceAll("\\s", "");
    boolean flag = true;
    
    
    if(a1.length()!=b1.length()){
        System.out.println("Anagram not possible");
    }          
    else{
        char ar1[] = a1.toLowerCase().toCharArray();
        char br1[] = b1.toLowerCase().toCharArray();
        
        Arrays.sort(ar1);
        Arrays.sort(br1);
       flag =  Arrays.equals(s1,s2);
        if(flag){
           System.out.println("Anagram"); 
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
            
}
