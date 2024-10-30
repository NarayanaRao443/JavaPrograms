// When we use the ArrayList and LinkedList

// For retrieving the values we can use the ArrayList
// For insertion and deletion we can use the LinkedList
// It is not synchronized. Not Thread safe

// LinkedList methods
// add()
// add(index, element)
// addFirst()
// addLast()
// clear()

// get()
// getFirst()
// getLast()

// remove()
// removeFirst()
// removeLast()
// size


import java.util.LinkedList;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

class Student
{
    int rollno;

    public Student(int rollno)
    {
        this.rollno = rollno;
    }

    
    public String toString() {
        return "" + rollno;
    }
    
}

public class LinkedListDemo {
    public static void main(String[] args) {
        
    LinkedList<Student> li = new LinkedList<>();

    li.add(new Student(30));
    //li.add(new Student(40));

    for(Student s:li)
    {
        System.out.println(s);
    }

    }
}
