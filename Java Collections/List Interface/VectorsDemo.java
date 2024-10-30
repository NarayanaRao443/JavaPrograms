//  By default vector capacity is 10;
// If we need to add more than 10 elements then size of vector will be doubled = 100% increased.
// So 10 becomes 20., after add 20 elements 20 becomes 40, 40 becomes 80...etc
// It is  synchronized.  Thread safe

import java.util.Vector;

public class VectorsDemo {
    public static void main(String[] args) {
        //Vector v = new Vector(); // capacity is 10
    /* 
        // Vector v = new Vector(5); // capacity is 5
        // v.add(1);
        // v.add(2);
        // v.add(3);
        // v.add(4);
        // v.add(5);
        // System.out.println(v.capacity());
    */
    /* 
        Vector v = new Vector(5); // capacity is 5. If we add more than 5 elements then capactity becomes 10
        
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        System.out.println(v.capacity());
    */

      Vector v = new Vector(5,2); 
      // capacity is 5. if we increment the capacity by a value then the value is added to the capacity.
      // Here capacity is 5+2 = 7
        
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        System.out.println(v.capacity());
        System.out.println(v.size());
        System.out.println(v);
        

    }
}
