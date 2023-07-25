public class Factorial {

    public static void factorialOf(int n){
        int fact = 1;
        for(; n >=1; n--)
            fact*=n;
        System.out.println(fact);
    }
}
