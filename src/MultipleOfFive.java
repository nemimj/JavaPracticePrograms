import java.net.HttpURLConnection;
import java.util.Scanner;

public class MultipleOfFive {
    public static void multiOfFive(int number){
        if(number % 5 == 0)
            System.out.println(number + "Number is multiple of 5");
        else
            System.out.println(number + "Number is not multiple of 5");
    }

    public static void main(String [] args){
        Scanner  scan = new Scanner(System.in);
        int num = scan.nextInt();
        multiOfFive(num);
    }
}
