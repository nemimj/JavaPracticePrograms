public class ArmStrongNumber {

    public static void armStrongNumber(int n){
        System.out.println(1);
        if(n>10){
            for(int i = 11; i < n ; i++)
                ASN(i);
        }
    }
    private static void ASN(int n){
        int sum = 0;
        int temp = n;
        while(n!=0){
            int rem = n%10;
            sum += (rem*rem*rem);
            n/=10;
        }
        if(temp == sum)
            System.out.println(temp);
    }
}
