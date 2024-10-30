import java.util.ArrayList;
import java.util.List;

class Student
{
    int rollno;
    String name;
    String address;

    Student(int rollno, String name, String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
}


public class StudentDetails {

    public static void main(String[] args) {
        
        List<Student> list = new ArrayList<>();

        Student s1 = new Student(101, "Raju", "Nellore");
        Student s2 = new Student(102, "Nani", "Vizag");
        Student s3 = new Student(103, "Kumar", "Hyderabad");
        Student s4 = new Student(104, "Suresh", "Godavari");

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        for(Student s : list)
        {
            System.out.println(s.rollno +" "+ s.name +" "+s.address);
        }
    }
}