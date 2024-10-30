// import java.util.Scanner;

// public class Lcm {
//     public static void main(String[] args) {
//         int n1,n2,max;
//         Scanner in = new Scanner(System.in);
//         n1 = in.nextInt();
//         n2 = in.nextInt();

//         max = n1>n2 ? n1:n2;
//         while(true){
//             if(max%n1 ==0 && max%n2==0){
//                 System.out.println(max);
//                 break;
//             }
//             ++max;
//         }
//     }
// }


import java.util.*;
/**
 * Lcm
 */
public class Lcm {

    public static void main(String[] args) {
        int n1,n2,max;
        Scanner in = new Scanner(System.in);
        n1 = in.nextInt();
        n2 = in.nextInt();

        max = n1>n2?n1:n2;
        while (true) {
            if(max%n1 ==0 && max%n2==0){
                System.out.println(max);
                break;
            }
            ++max;
        }
    }
}