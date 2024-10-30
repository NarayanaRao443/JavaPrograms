// public class BinToDecimal {
//     public static void main(String[] args) {

//         long num = 110110111;
//         int decimal = checkBinary(num);
//         System.out.println(decimal);
//     }
//     public static int checkBinary(long num){

//         long decimalVal = 0, i=0;
//         long remainder;

//         while(num!=0){
//             remainder = num%10;
//             num = num/10;
//             decimalVal += remainder * Math.pow(2,i);
//             ++i;
//         }
//         return (int) decimalVal;
//     }
// }

public class BinToDecimal {
    public static void main(String[] args) {

        long num = 111;
        long decimal = 0, i = 0;
        long rem;
        while (num != 0) {
            rem = num % 10;
            decimal += rem * Math.pow(2, i);
            num = num / 10;
            ++i;
        }
        System.out.println(decimal);
    }
}
