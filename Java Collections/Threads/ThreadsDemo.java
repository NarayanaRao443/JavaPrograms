
class A extends Thread
{
    public void run()
    {
        for(int i=1; i<=8; i++)
        {
            System.out.println("A Thread ");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i=1; i<=8; i++)
        {
            System.out.println("B Thread ");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}
public class ThreadsDemo {

    public static void main(String[] args) {
        
        A obj1 = new A();
        B obj2 = new B();

//        System.out.println(obj1.getPriority());
//        System.out.println(obj2.getPriority());
  
   //     System.out.println(Thread.MAX_PRIORITY);
    //    System.out.println(Thread.MIN_PRIORITY);

      //  obj1.setPriority(Thread.MAX_PRIORITY);
       // obj1.setPriority(Thread.MIN_PRIORITY);
       // obj2.setPriority(Thread.NORM_PRIORITY);

        obj1.start();
        obj2.start();
    }
}
