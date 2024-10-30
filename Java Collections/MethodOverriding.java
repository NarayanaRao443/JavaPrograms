/*

class Animal
{
    public static void run1()
    {
        System.out.println("H--Animal is running--");
    }
    public void run2()
    {
        System.out.println("O--Animal is running fast");
    }
}

class Cheetah extends Animal
{
    public static void run1()
    {
        System.out.println("H--Cheetah is running--");
    }
    public void run2()
    {
        System.out.println("O--- cheetah is running fast---");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Cheetah();
        a.run1();
        a.run2();
    }
}

*/


class A 
{
    public void show()
    {
        System.out.println(" A class");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println(" B class");
    }
}
class C extends A
{
    public void show()
    {
        System.out.println("C class");
    }
}

/**
 * MethodOverriding
 */
public class MethodOverriding {

    public static void main(String[] args) {

     //  A obj = new C(); // overriding
      //  obj.show();
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}