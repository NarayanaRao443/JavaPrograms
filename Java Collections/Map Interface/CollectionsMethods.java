import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMethods {
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList<>();
        
        al.add(34);
        al.add(20);
        al.add(54);
        al.add(10);

        System.out.println(al);
       // Collections.sort(al); // prints in ascending order
       // System.out.println(al);
        
       // Collections.reverse(al);
       // System.out.println(al); // prints in reverse order
    
       // Collections.swap(al, 1, 3); // swap the two elements
       // System.out.println(al);

       System.out.println(Collections.min(al)); // prints the min value
       System.out.println(Collections.max(al)); // prints the max value
    }
}
