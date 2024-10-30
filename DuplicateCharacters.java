// public class DuplicateCharacters {
//     public static void main(String args[]){
//         String str = "Great tinder";
//         int i,j,count;
//         char ar[] = str.toCharArray();

//         for(i=0;i<ar.length;i++){
//             count=1;
//             for(j=i+1;j<ar.length;j++){
//                     if(ar[i]==ar[j] && ar[i] !=' '){
//                         count++;
//                         ar[j]='0';
//                     }
//             }
        
//         if(count>1 && ar[i]!= '0'){
//             System.out.print(ar[i]);
//         } 
//     }
//     }

// }


/**
 * DuplicateCharacters
 */
public class DuplicateCharacters {

    public static void main(String[] args) {
       String str = "hello world";
       char ar[] = str.toCharArray();
       int count;
       for(int i=0;i<ar.length;i++){
        count=1;
        for(int j=i+1;j<ar.length;j++){
            if(ar[i]==ar[j] && ar[i]!=' '){
                count++;
                ar[j]='0';
            }
        }
        if(count>1 && ar[i]!='0'){
            System.out.println(ar[i]);
        }
       }

    }
}