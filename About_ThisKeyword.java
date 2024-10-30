/**
 * About_ThisKeyword
 */
/*
 * 
 
public class About_ThisKeyword {

    int id;
    String name;
    float salary;

    About_ThisKeyword(int id, String name, float salary )
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    void display()
    {
        System.out.println(id + " "+ name +" "+salary);
    }

    public static void main(String[] args) {
        About_ThisKeyword a = new About_ThisKeyword(101, "Raju", 5000f);
        a.display();
    }
}
*/

//2) this: to invoke current class method
/* 
class A{
    void m(){
        System.out.println("Print m");
    }
    void n()
    {
        System.out.println("Print n");
        // m(); // works as same as this.m();
        this.m();
    }
}
    public class About_ThisKeyword {
    
        public static void main(String[] args) {
            A a = new A();
            a.n();
        }
    }
*/
// 3) this() : to invoke current class constructor
// Calling default constructor from parameterized constructor:
/* 
class A{
    A(){
        System.out.println("Hello A");
    }
    A(int x){
        this(); // it calls the above A() method
        System.out.println(x);
    }
}

public class About_ThisKeyword {

    public static void main(String[] args) {
        A a = new A(5);
    }
}
*/
// Calling parameterized constructor from default constructor:

class A{
    A(){
        this(5);
        System.out.println("Hello A");
    }

    A(int x){
        System.out.println(x);
    }
}
/**
 * About_ThisKeyword
 */
public class About_ThisKeyword {

    public static void main(String[] args) {
        A a = new A();
    }
}