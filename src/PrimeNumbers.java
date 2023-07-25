public class PrimeNumbers {

  private static boolean primeNumber(int n){
     if(n == 1 || n == 0) return false;

     for(int i=2; i < n; i++)
         if(n%i == 0) return false;

     return true;
  }
    public static void firstNPrimeNumbers(int n){
        int count = 1;
        for(int i = 1; i<=n; i++){
           if(primeNumber(i)){
               System.out.println(i);
           }
        }
    }
}
