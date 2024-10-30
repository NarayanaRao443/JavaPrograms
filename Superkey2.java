class Person{
    int id;
    String name;

    Person(int id, String name){
        this.id = id;
        this.name = name;
    }
}

class Employee extends Person{
    float salary;

    Employee(int id, String name, float salary){
        super(id,name);
        this.salary = salary;
    }

    void display(){
        System.out.println("Id " + id + " " + "Name: "+ name +" " + " Salary: "+ salary);
    }
}

public class Superkey2 {

    public static void main(String[] args) {
        Employee e = new Employee(101, "Nani", 19989.98f);
        e.display();
    }
}

