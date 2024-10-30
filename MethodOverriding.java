/* 
class Bank{
    int getInterest(){
        return 0;
    }
}
class SBI extends Bank{
    int getInterest(){
        return 9;
    }
}
class ICCI extends Bank{
    int getInterest(){
        return 8;
    }
}
class Axis extends Bank{
    int getInterest(){
        return 6;
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICCI i = new ICCI();
        Axis a = new Axis();

        System.out.println(s.getInterest());
        System.out.println(i.getInterest());
        System.out.println(a.getInterest());
    }
}
*/
class Animal{
    public static void run1(){
        System.out.println("Animal is running");
    }
    public void run2(){
        System.out.println("Animal is running fast");
    }
}
class Cheetah extends Animal{
    public static void run1(){
        System.out.println("Cheetah is running");
    }
    public void run2(){
        System.out.println("Cheetah is running fast");
    }
}
/**
 * MethodOverriding
 */
public class MethodOverriding {

    public static void main(String[] args) {
        // Animal a = new Cheetah();
        // a.run1();
        // a.run2();

        Animal obj = new Animal();
        obj.run2();

        obj = new Cheetah();
        obj.run2();
    }
}