// import java.util.*;

//List can prints the duplicate(same) values also.
// It can prints the values in a sequence order
// It prints the index values also

// public class CollectionsDemo {
//     public static void main(String[] args) {
        
//         List al = new ArrayList();
//         al.add(10);
//         al.add("Raju");
//         al.add("Naveen");
//         al.add(30);
       
//         for (Object o : al) {
//             System.out.println(o);
//         }
//         al.remove(3);
//         System.out.println(al);
//     }
    
// }

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        
       List<String> al = new ArrayList<>();
        al.add("Srinu");
        al.add("Raju");
        al.add("Kumar");
        al.add("ten");
        al.add("eight");
        al.add("eight");
        al.add("ten");

        
      //  System.out.println(al);

      // for loop

        // for(int i=0; i<al.size();i++)
        // {
        //     System.out.println(al.get(i));
        // }

        // forEach loop
        // for(String s: al)
        // {
        //     System.out.println(s);
        // }

        // while loop
        //     // Forward direction
        // System.out.println("In Forward direction: ");
        // ListIterator<String> itr = al.listIterator();
        // while(itr.hasNext())
        // {
        //     System.out.println(itr.next());
        // }

        // System.out.println("In Reverse direction: ");
        // while(itr.hasPrevious())
        // {
        //     System.out.println(itr.previous());
        // }

        // by using iterator

        // Iterator itr = al.iterator();
        // while(itr.hasNext())
        // {
        //     System.out.println(itr.next());
        // }

        // by using forEach with Lambda expression
        // al.forEach(a ->{
        //     System.out.println(a);
        // });

        // by using forEachRemaining with lambda expression

        // Iterator itr = al.iterator();
        // itr.forEachRemaining(a -> {
        //     System.out.println(a);
        // });
     
    }
}

