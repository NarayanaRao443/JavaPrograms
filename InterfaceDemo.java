interface Printable{
    void print();
}
interface Showable extends Printable{
    void show();
}
class InterfaceDemo implements Showable{
    public void show(){
        System.out.println("showbale");
    }
    public void print(){
        System.out.println("printable");
    }
    public static void main(String[] args) {
        InterfaceDemo io = new InterfaceDemo();
        io.show();
        io.print();
    }
}


