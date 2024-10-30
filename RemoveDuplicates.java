import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int ar[]={50,20,30,40,70,20,50,30,100};

        Arrays.sort(ar);
        int length = ar.length;
        length = removeDupli(ar,length);
        System.out.println(length);
        
        for(int i=0;i<length;i++){
            System.out.println(ar[i]);
        
        }}
        public static int removeDupli(int ar[],int n){
        if(n==0 || n==1){
            return n;
        }
        int j=0;
        int temp[] = new int[n];

        for(int i=0;i<n-1;i++){
            if(ar[i]!=ar[i+1]){
                temp[j++] = ar[i];
            }
        }
        temp[j++]=ar[n-1];

        for(int i=0;i<j;i++){
            ar[i]=temp[i];
        }
       return j;
    }
    

}


