import java.util.*;



public class LinkedHashSetDemo {
    public static void main(String[] args) {
        
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        
        ls.add(10);
        ls.add(5);
        ls.add(20);
        ls.add(40);
        ls.add(3);

        Iterator it = ls.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
