/* 
import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        
        TreeSet<Integer> ts = new TreeSet<>();
          
        ts.add(10);
        ts.add(5);
        ts.add(40);
        ts.add(20);
        ts.add(10);
        ts.add(3);
        ts.add(30);
        ts.add(1);

        System.out.println(ts);
     //   System.out.println(ts.first());
     //   System.out.println(ts.last());
     //   System.out.println(ts.headSet(10)); // used to prints the less values than the given value like 10
     //   System.out.println(ts.tailSet(10)); // used to prints the values >= the given value... include 10 
      //  System.out.println(ts.subSet(5,40)); // prints the values between the range including 5

//        Iterator it = ts.iterator();
        // Iterator it = ts.descendingIterator(); // for descending order

        // while(it.hasNext())
        // {
        //     System.out.println(it.next());
        // }
    }
}
*/

import java.util.*;

/**
 * TreeSetDemo
 */
public class TreeSetDemo {

    public static void main(String[] args) {
        
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Raj");
        ts.add("Kumar");
        ts.add("yess");
        ts.add("lemon");
        ts.add("Bro");
        ts.add("Aaaa");
        ts.add("quiz");
        ts.add("lemon");
        ts.add("kumar");
        ts.add("Kumar");

        Iterator  it = ts.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}