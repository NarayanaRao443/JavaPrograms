// public class Exception1 {
//     public static void main(String[] args) {
//         int a=10;
//         int b=0;
//         int res;

//         try{
//             res = a/b;
//             System.out.println(res);
//         }
//         catch(ArithmeticException e){
//             System.out.println(e);
           
//         }
//         System.out.println("hello");
//     }
// }

// class Exception1{
//     public static void main(String args[]){
      

//         try{
//               int ar[] = {1,2,3,4,5};
//             System.out.println(ar[10]);
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println(e);
//         }
//         System.out.println("hello aib");
//     }
// }


// public class Exception1 {
//     public static void main(String args[]){
//         try{
//             String str = null;
//             System.out.println(str.length());
//         }
//         catch(NullPointerException e){
//             System.out.println(e);

//         }
//         System.out.println("Nullsss");
//     }
// }

class Exception1{
    public static void main(String args[]){
        try{
        String str = "abc";
        int i = Integer.parseInt(str);
        System.out.println(i);

        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        System.out.println("NUFE");
    }  
}



