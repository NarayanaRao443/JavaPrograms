/**
 * ThreadsDemo3
 */
public class ThreadsDemo3 {

    public static void main(String[] args) {
        
        Runnable obj1 = () ->{
            for (int i = 1; i <=7; i++) {
                System.out.println("A thread");

                try{
                    Thread.sleep(30);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2 = () -> {

            for (int i = 0; i <=7;  i++) {
                System.out.println(" B thread");

                try{
                    Thread.sleep(10);
                }
                catch(InterruptedException e )
                {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}