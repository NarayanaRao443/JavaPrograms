/*
class MethodOverloading
{
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
    public void add(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }

    public void add(int a, int b, int c, int d)
    {
        System.out.println(a+b+c+d);
    }
    public void add(double a, double b, double c)
    {
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        m.add(10,20,30,40);
        m.add(10,20,30); 
        m.add(10,20);
        m.add(10.5, 20.5, 5.5);
    }
}
*/

class MethodOverloading
{
    static int addition(int a, int b)
    {
        return a+b;
    }
    static int addition(int a, int b, int c)
    {
        return a+b+c;
    }
    static double addition(double a, double b, double c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {
      //  MethodOverloading m = new MethodOverloading();
        System.out.println(addition(10.5, 10.5, 11.5));
        System.out.println(addition(10, 20));
        System.out.println(addition(10,20,30));
    }
}