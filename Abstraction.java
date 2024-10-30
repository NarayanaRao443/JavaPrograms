abstract class Car{
    abstract void drive();
    abstract void fly();
    public void playMusic(){
        System.out.println("Playing Music");
    }
}
abstract class Wagnor extends Car{
    public void drive(){
        System.out.println("drive safely");
    }
}
class UpdatedWagnor extends Wagnor{
    public void fly(){
        System.out.println("Fly safely");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Car c = new UpdatedWagnor();
        c.drive();
        c.playMusic();
        c.fly();
    }    
}

