public class EvenCounts {
    public static void main(String[] args) {
        int ar[]={2,3,4,5,6,7,8,9,10};
        int evenCount = 0, oddCount=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]%2==0){
                evenCount++;
            }
            else
                oddCount++;
        }
        System.out.println("evencount "+evenCount);
        System.out.println("oddcount "+oddCount);
    }
}
