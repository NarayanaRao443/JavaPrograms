import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        
       LinkedHashMap lhm = new LinkedHashMap();

       lhm.put("Name", "kumar");
       lhm.put("college", "RGUKT");
       lhm.put("year", "2023");

       Set s = lhm.keySet();
       Iterator it = s.iterator();

       while(it.hasNext())
       {
            Object obj = it.next();
            String str = (String)obj;
        System.out.println(str + " : "+lhm.get(str));
       }
    }    
}
