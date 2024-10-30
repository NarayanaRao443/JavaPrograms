import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        
        HashMap hm  = new HashMap();

        hm.put("name", "Raju");
        hm.put("dob", "20-10-1998");
        hm.put("address", "hyd");
        hm.put("area", "srnager");
        hm.put("name", "kumar");
        hm.put("student", "kumar");
        
      /*   
        System.out.println(hm);
        System.out.println(hm.get("dob"));
        System.out.println(hm.size());
       // hm.clear();
        System.out.println(hm);
        System.out.println(hm.isEmpty());
        System.out.println(hm.keySet());
    */

       // System.out.println(hm.capacity());
        Set s = hm.keySet(); // all keys are stores in a Set interface

        Iterator it = s.iterator();
        while(it.hasNext())
        {
            Object obj = it.next(); // stores in a object
            String str = (String)obj; // type conversion
            System.out.println(str + " : "+hm.get(str));
        }
    }
}
