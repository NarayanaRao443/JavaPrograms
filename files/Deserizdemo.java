import java.io.*;
import java.util.*;

    class Box implements Serializable
    {
        private double width;
        private double height;
        private double depth;

        Box()
        {
            width=0;
            height=0;
            depth=0;
        }

        Box(double w,double h,double d)
        {
            width=w;
            height=h;
            depth=d;
        }

        void display()
        {
            System.out.println("Width= "+width);
            System.out.println("Height= "+height);
            System.out.println("Depth= "+depth);
        }
    }
class Deserizdemo
{
    public static void main(String args[]) throws IOException
    {
       

        FileInputStream fis=new FileInputStream("ObjFile");

        ObjectInputStream ois=new ObjectInputStream(fis);

        Box b1;
        b1=(Box)ois.readObject();
        b1.display();
        ois.close();

    }
}