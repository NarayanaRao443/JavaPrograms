/**
 * ThisKeyword
 */
/* 
public class ThisKeyword {

    int id;
    String name;
    float salary;

    ThisKeyword(int id, String name, float salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println(id +" "+name +" "+salary);
    }
    public static void main(String[] args) {
        ThisKeyword d = new ThisKeyword(10,"hii",8.7f);
        d.display();
    }
 
}
*/


// class A {
//     void m(){
//         System.out.println("M method");
//     }
//     void n(){
//         System.out.println("N method");
//         this.m();
//     }
// }
// public class ThisKeyword {

//     public static void main(String[] args) {
//         A a  = new A();
//         a.n();
//     }
// }


/* 
class A{
    A(){
        System.out.println("Default constructor");
    }
    A(int x){
        this();
        System.out.println(x);
        
    }
}
public class ThisKeyword {

    public static void main(String[] args) {
        A a  = new A(10);
    }
}
*/

class A{
    A(){
        this(100);
        System.out.println("this class");
    }
    A(int x){
        System.out.println(x);
    }
}

public class ThisKeyword {

    public static void main(String[] args) {
        A a = new A();
    }
}