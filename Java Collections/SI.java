/* 
class Animal
{
    public void displayA()
    {
        System.out.println("Animal class");
    }
}

class Dog extends Animal
{
    public void displayD()
    {
        System.out.println(" Dog Class");
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
// Multilevel Inheritance

/*
class Animal 
{
    public void displayA()
    {
        System.out.println(" Animal class");
    }
}

class Dog extends Animal
{
    public void displayD()
    {
        System.out.println("Dog class");
    }
}

class Labrodar extends Dog
{
    public void displayL()
    {
        System.out.println(" Labdrodar class");
    }
}


public class SI {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.displayA();
        d.displayD();

        Labrodar l = new Labrodar();
        l.displayA();
        l.displayD();
        l.displayL();
    }
}
*/

// Heirarchical Inheritance
/* 
class Animal
{
    public void displayA()
    {
        System.out.println("Animal class");
    }
}

class Dog extends Animal
{
    public void displayD()
    {
        System.out.println(" Dog class");
    }
}

class Labrodar extends Animal
{
    public void displayL()
    {
        System.out.println(" Labrodar class");
    }
}


public class SI {

    public static void main(String[] args) {
        
        Animal a = new Animal();
        a.displayA();
       // a.displayD();

       Dog d = new Dog();
       d.displayA();
       d.displayD();

       Labrodar l = new Labrodar();
       l.displayA();
       l.displayL();
    }
}
*/
// Hybrid Inheritance
class Animal
{
    public void displayA()
    {
        System.out.println("Animal class");
    }
}
class Dog extends Animal
{
    public void displayD()
    {
        System.out.println("Dog class");
    }
}

class Labdrodar extends Dog
{
    public void displayL()
    {
        System.out.println("Labrador class");
    }
}

class Husky extends Dog
{
    public void displayH()
    {
        System.out.println("Husky class");
    }
}

/**
 * SI
 */
public class SI {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.displayA();
       
        System.out.println();
        Dog d = new Dog();
        d.displayA();
        d.displayD();
      
        System.out.println();
      
        Labdrodar l = new Labdrodar();
        l.displayA();
        l.displayD();
        l.displayL();
       
        System.out.println();
       
        Husky h = new Husky();
        h.displayA();
        h.displayD();
       // h.displayL();
        h.displayH();
    }
}