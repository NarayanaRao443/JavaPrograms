import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner in = new Scanner(System.in);
        year = in.nextInt();

        if(year%100==0){
            if(year%400==0){
                System.out.println("Leap year");
            }
            else{
                System.out.println("Not leap year");
            }
        }
        else if(year%4==0){
            System.out.println("leap year");
        }
        else
        {
            System.out.println("Not leap year");
        }
    }
}
