/**
 * MethodOverLoading
 */
public class MethodOverLoading {

    static int addition(int a, int b){
        return a+b;
    }
    static int addition(int a, int b, int c){
        return a+b+c;
    }
    static double addition(double a,double b,double c){
        return a+b+c;
    }
    static double addition(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
            System.out.println(addition(10.5, 11.5));
            System.out.println(addition(10,20));
            System.out.println(addition(10, 20, 30));
            System.out.println(addition(10.5, 11.5, 12.5));
    }   
}
