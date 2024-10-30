import java.util.HashSet;
import java.util.Iterator;;

public class HashSetDemo {
    public static void main(String[] args) {
        
        HashSet<String> hs = new HashSet<>();
        
        hs.add("lo");
        hs.add("king");
        hs.add("raj");
        hs.add("kumar");
        hs.add("qqq");
        hs.add("king");

        //System.out.println(hs.size());
        //System.out.println(hs);
        
        Iterator<String> i=hs.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }  

    }    
}
