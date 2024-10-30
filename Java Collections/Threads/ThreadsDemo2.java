// Runnable vs Threads

class A implements Runnable
{
    public void run()
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println("A thread");

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable
{
    public void run()
    {
       for(int i=1; i<=10; i++)
       {
             System.out.println("B thread");

             try {
                Thread.sleep(5);
             } catch (InterruptedException e) {
                e.printStackTrace();
                // TODO: handle exception
             }
       }
    }
}


public class ThreadsDemo2 {

    public static void main(String[] args) {

       // Runnable obj1 = new A();
//by anonymous object
        Runnable obj1 = new Runnable() {
            public void run()
            {
                for (int i = 1; i <=10; i++) {
                    System.out.println("AB THread");

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        // TODO: handle exception
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
       // Thread t3 = new Thread(obj3);

        t1.start();
        t2.start();
       // t3.start();
    }
}