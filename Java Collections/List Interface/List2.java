import java.util.ArrayList;
import java.util.List;

public class List2 {
    public static void main(String[] args) {
        
        List<String> al = new ArrayList<>();
        al.add("Srinu");
        al.add("Raju");
        al.add("Kumar");
        al.add("ten");
        al.add("eight");
        al.add("eight");
        al.add("ten");

        List<String> al2 = new ArrayList<>();
        al2.add("Srinu");
        al2.add("Raju");
        al2.add("Kumar");
        al2.add("ten");
        al2.add("eight");
        
        System.out.println(al);
        System.out.println(al2);
       // al2.add(2,"ZZ");
        
       
    //     List<String> al2 = new ArrayList<>();
    //     al2.add("tenty");
    //     al2.add("thirty");
    //     //al2.clear();
    //     al2.add("eighty");
    //     al2.add("twenty");
    //     al2.add("one");
    //    // al2.addAll(al);
    //     al2.addAll(1,al);
    //     al.clear();
        
        // for(String s:al)
        // {
        //     System.out.println(s);
        // }

        // System.out.println();
        // for(String i : al2)
        // {
        //     System.out.println(i);
        // }


         // List<String> al3 = new ArrayList<>();
        //System.out.println(al3.isEmpty()); // returns true if list is empty otherwise returns false

        // System.out.println(al.indexOf("ten")); // returns the index from the front
        // System.out.println(al.lastIndexOf("ten")); // returns the index value of last element
        // System.out.println(al.contains("ten")); // if element present in list returns true otherwise returns false

        // System.out.println(al.equals(al2)); // returns true if both al and al2 are equals



        // System.out.println(al.subList(1,5)); // it prints from 1 to 4th element
        // al.sort(Comparator.naturalOrder()); // prints first uppercase letters then lowercase letters 
        // al.sort(String.CASE_INSENSITIVE_ORDER); // prints the elements in alphabetical order
        // al.add(2,"ZZ");
        
        // al.set(2, "AAA"); // set(index, element) is used to replace the current value
        // al.remove(3); // it removes the element from the list
        //al.remove("eight"); // it removes first eight from the list
          
    }
}
