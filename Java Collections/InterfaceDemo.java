interface Printable
{
    void Print();
}
interface Showable extends Printable
{
    void show();
}
/**
 * InterfaceDemo
 */
public class InterfaceDemo implements Showable{
    public void Print()
    {
        System.out.println("Printed");
    }
    public void show()
    {
        System.out.println("Showable");
    }

    public static void main(String[] args) {
        InterfaceDemo io = new InterfaceDemo();
        io.Print();
        io.show();
    }
    
}