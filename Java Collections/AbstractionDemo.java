/*
abstract class Car
{
    abstract void drive();
    abstract void fly();
    
    public void playMusic()
    {
        System.out.println("Play music");
    }
}
abstract class Wagnor extends Car
{
    public void drive()
    {
        System.out.println("Drive safely");
    }
}
class UpdatedWagnor extends Wagnor
{
    public void fly()
    {
        System.out.println("Fly safely");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {
        Car c = new UpdatedWagnor();
        c.drive();
        c.fly();
        c.playMusic();
    }
}
*/

abstract class Car
{
    abstract void drive();

    void playMusic()
    {
        System.out.println("play music");
    }
}

class Wagnor extends Car 
{
    void drive()
    {
        System.out.println("drive safely");
    }
}

/**
 * AbstractionDemo  
 */
public class AbstractionDemo {

    public static void main(String[] args) {
        Car c = new Wagnor();
        c.drive();
        c.playMusic();
    }
}