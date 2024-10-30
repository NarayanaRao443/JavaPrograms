// Single Level Inheritance
/*
class Animal{
    void displayA(){
        System.out.println("Animal class");
    }
}
class Dog extends Animal{
    void displayD(){
        System.out.println("Dog class");
    }
}


public class SI {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.displayA();
        d.displayD();
    }
}
*/

// Multi Level Inheritance
/*
class Animal{
    void displayA(){
        System.out.println("Aimal class");
    }    
}
class Dog extends Animal{
    void displayD(){
        System.out.println("Dog class");
    }
}

class Labrodar extends Dog{
    void displayL(){
        System.out.println("Labrador class");
    }
}
I

public class SI {

    public static void main(String[] args) {
        Labrodar l = new Labrodar();
        l.displayA();
        l.displayD();
        l.displayL();
    }
}
*/
// Heirarchical Inheritance
/* 
class Animal{
    void displayA(){
        System.out.println("Animal class");
    }
}
class Dog extends Animal{
    void displayD(){
        System.out.println("Dog class");
    }
}
class Cat extends Animal{
    void displayC(){
        System.out.println("Cat class");
    }
}

public class SI {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.displayA();
        d.displayD();

        Cat c = new Cat();
        c.displayA();
        c.displayC();
    }
}
*/
// Hybrid Inheritance
class Animal {
    void displayA() {
        System.out.println("Animal class");
    }
}

class Dog extends Animal {
    void displayD() {
        System.out.println("Dog class");
    }
}

class Husky extends Dog {
    void displayH() {
        System.out.println("Cat class");
    }
}

class Labrador extends Dog {
    void displayL() {
        System.out.println("Labrodar dog class");
    }
}

/**
 * SI
 */
public class SI {

    public static void main(String[] args) {
        Labdrodar l = new Labdrodar();
        l.displayA();
        l.displayD();
        l.displayL();

        Husky c = new Husky();
        c.displayA();
        c.displayD();
        c.displayH();
    }
}