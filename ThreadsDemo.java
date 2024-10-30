/*
class  A extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("A Thread "+i);
            try{
                Thread.sleep(1);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(" B Thread "+i);
            try{
                Thread.sleep(5);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class ThreadsDemo {
    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = new B();

        ob1.start();
        ob2.start();
    }
}
*/
/* 
class A implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("A Thread "+i);
            try{
                Thread.sleep(4);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("B Thread "+i);
            try{
                Thread.sleep(7);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class ThreadsDemo {

    public static void main(String[] args) {
        Runnable ob1 = new A();
        Runnable ob2 = new B();
        
        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);

        t1.start();
        t2.start();
    }
}
*/
class Counter{
    int count;
    public void increment(){
        count++;
    }
}

/**
 * ThreadsDemo
 */
public class ThreadsDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Runnable ob1 = () ->{
            for(int i=1;i<=10000;i++){
                c.increment();
            }
        };
        Runnable ob2 = () ->{
            for(int i=1;i<=5000;i++){
                c.increment();
            }
        };
        
        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);
        
    }

    
}