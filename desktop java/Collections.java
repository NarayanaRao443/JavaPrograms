/*
import java.util.*;
public class Collections {

    public static void main(String[] args) {
        
       List<String> li = new ArrayList<>();

       li.add("hi");
       li.add("hello");
       li.add("kumar");
       li.add("more");

    //    for(String s:li)
    //    {
    //     System.out.println(s);
    //    }

    
        ListIterator<String> l = li.listIterator();
        while(l.hasNext())
        {
            System.out.println(l.next());
        }

         while(l.hasPrevious())
        {
            System.out.println(l.previous());
        }
    

    // Iterator i = li.iterator();
    // while(i.hasNext())
    // {
    //     System.out.println(i.next());
    // }

        li.forEach(a->{
            System.out.println(a);
        });
    }
}
*/
/* 
import java.util.*;

public class Collections {

    class Student{
    int rollno;

    public Student(int rollno)
    {
        this.rollno = rollno;
    }

    
    public String toString() {
        return "" + rollno;
    }
    
}


    public static void main(String[] args) {
        
    LinkedList<Student> li = new LinkedList<>();

    li.add(new Student(30));
    li.add(new Student(40));

    for(Student s:li)
    {
        System.out.println(s);
    }

    }

}
*/
/* 
import java.util.*;
public class Collections {

    public static void main(String[] args) {
        
        Stack s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.empty());
    }
}
*/
/* 
import java.util.*;

public class Collections {

    public static void main(String[] args) {
        
        Vector v = new Vector(5,2);
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(50);
        System.out.println(v.capacity());
    }
}
*/

import java.util.*;
/**
 * Collections
 */
public class Collections {

    public static void main(String[] args) {
        
        ArrayList al = new ArrayList<>();
        al.add(10);
        al.add(300);
        al.add(10);
        al.add(40);

        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);
        
    }
}