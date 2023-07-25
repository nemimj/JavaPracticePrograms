import java.util.Scanner;

public class LargestDigitInNumber {
    public static void digitInNumber(int number){
        while(number!=0){
            int count = 0;
            int a = number%10;
            int temp = number;
            while(temp!=0){
                int b = temp%10;

                if(a == b) count++;
                temp /=10;
            }
            System.out.println("Number : "+a+"->Occurence :  "+count);
            number /=10;
        }
    }
    public static void main(String[] args){
        var scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scan.nextInt();
        digitInNumber(number);
    }
}
