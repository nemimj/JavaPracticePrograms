public class SumOfNumbers {
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n!=0){
            int res = n % 10;
            sum+=res;
            n/=10;
        }
        return sum;
    }
}
