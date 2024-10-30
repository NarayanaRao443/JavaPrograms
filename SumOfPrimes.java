public class SumOfPrimes {
    public static void main(String[] args) {

        int count, sum = 0;
        for (int n = 1; n <= 10; n++) {
            count = 0;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && n != 1) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
