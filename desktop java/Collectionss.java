/*
import java.util.*;
public class Collectionss {

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

public class Collectionss {

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
public class Collectionss {

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

public class Collectionss {

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
/* 
import java.util.*;
import java.util.Collections;

public class Collectionss {

    public static void main(String[] args) {
        
        ArrayList al = new ArrayList<>();
        al.add(10);
        al.add(300);
        al.add(10);
        al.add(40);

        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);
        System.out.println(Collections.min(al));
        System.out.println(Collections.max(al));
        
    }
}
 */
/* 
import java.util.*;


public class Collectionss {

    public static void main(String[] args) {
        
        HashMap hm = new HashMap<>();
        hm.put("ok", "hi");
        hm.put("bye", "hello");
        hm.put("notok", "ok");

        System.out.println(hm.keySet());

       Set s = hm.keySet();
       Iterator it = s.iterator();

       while(it.hasNext()){
        Object ob = it.next();
        String st = (String)ob;
        System.out.println(st);
       }
    }
*/
/* 
class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
        System.out.println("A Thread");

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
        System.out.println("B Thread");
        try {
            Thread.sleep(3);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }}
}
class Collectionss
{
    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = new B();

        ob1.start();
        ob2.start();

    }
}
*/
/* 
class A implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
        System.out.println("A Thread");

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    }
}

class B implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
        System.out.println("B Thread");
        try {
            Thread.sleep(3);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }}
}
class Collectionss
{
    public static void main(String[] args) {
        Runnable ob1 = new A();
        Runnable ob2 = new B();

        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);

        t1.start();
        t2.start();

    }
}
*/
/* 
abstract class Car
{
    abstract void drive();

    void playMusic()
    {
        System.out.println("Playing Music");
    }
}

class Wagnor extends Car
{
    void drive()
    {
        System.out.println("Driving");
    }
}

class Collectionss
{
    public static void main(String[] args) {
        Car c = new Wagnor();
        c.drive();
        c.playMusic();
    }
}
*/
/* 

class Animal 
{
    public static void run1(){
        System.out.println("H--Animal is running");
    }

    public void run2()
    {
        System.out.println("O---Animal is running fast");
    }
}

class Cheetah extends Animal
{
    public static void run1()
    {
        System.out.println("H---cheetah is running");
    }
    public void run2()
    {
        System.out.println("O---Cheetah is runing fastly");
    }
}

class Collectionss
{
    public static void main(String[] args) {
        Animal a = new Cheetah();
        a.run1();
        a.run2();
    }
}
*/
/* 

class Animal 
{
    public void displayA()
    {
        System.out.println("Animal class");
    }
}

class Dog extends Animal
{
     public void displayD()
    {
        System.out.println("Dog class");
    }
}

class Labdrodar extends Dog
{
     public void displayL()
    {
        System.out.println("Labrodar class");
    }
}
class Husky extends Dog
{
     public void displayH()
    {
        System.out.println("Husky class");
    }
}
class Collectionss
{
    public static void main(String[] args) {
        Animal a  = new Animal();
        a.displayA();

        Dog d = new Dog();
        d.displayA();
        d.displayD();

        Labdrodar l = new Labdrodar();
        l.displayA();
       // l.displayD();
        l.displayL();

        Husky h = new Husky();
        h.displayA();
        h.displayD();
        h.displayH();
     //   h.displayL();
    }
}
*/
/* 
interface A
{
    void show();
    void config();
}

interface X
{
    void run();
}

interface Y extends X
{
    void play();
}
class B implements A,X,Y
{
    public void show()
    {
        System.out.println("Showing");
    }

    public void config()
    {
        System.out.println("Config");
    }

    public void run()
    {
        System.out.println("running");
    }
    public void play()
    {
        System.out.println("playing");
    }
}

class Collectionss
{
    public static void main(String[] args) {
        
        A b  = new B();
        b.show();
        b.config();

        Y b1 = new B();
        b1.run();
        b1.play();
    }
}
*/

/**
 * Collectionss
 */
 /* 
public class Collectionss {

    public static void main(String[] args) {
        
        String str = "Hello";
        char rev [] = str.toCharArray();

        for(int i=rev.length-1;i>=0;i--)
        {
            System.out.print(rev[i]);
        }
    }
}
*/

 
public class Collectionss {

    public static void main(String[] args) {
       String str = "Radaer";
       String rev = "";

       int stlen = str.length();

       for(int i=stlen-1;i>=0;i--)
       {
            rev = rev + str.charAt(i);
       }

       if(str.toLowerCase().equals(rev.toLowerCase()))
       {
            System.out.println("Palindrome");
       }
       else
       {
            System.out.println("Not palindrome");
       }
    }
}
