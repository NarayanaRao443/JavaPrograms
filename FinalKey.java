// 1) Java final variable
// If you make any variable as final, you cannot change the value of final variable(It will be constant).

/*
class Bike{
    final int speed = 400;
    void run(){
        speed = 800;
    }
}

public class FinalKey {

    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
    }
}
*/
// 2) Java final method
// If you make any method as final, you cannot override it.
/* 

class Bike {
    final void run(){
        System.out.println("Running...");
    }
}

class Honda extends Bike{
    void run(){
        System.out.println("HOnd running");
    }
}

public class FinalKey {

    public static void main(String[] args) {
        Honda h = new Honda();
        h.run();
    }
}
*/

// 3) Java final class
// If you make any class as final, you cannot extend it.

final class Bike{}

class Honda extends Bike{
    void run(){
        System.out.println("Honda Running....");
    }
}

public class FinalKey {

    public static void main(String[] args) {
        Honda h = new Honda();
        h.run();
    }
}