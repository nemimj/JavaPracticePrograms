import java.util.Scanner;

public class NegOrPos {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your financial balance");
        int balance = scan.nextInt();

        if(balance < 0)
            System.out.println("Your balance is in negative value " + balance);
        else
            System.out.println("Your balance is in positive value " + balance);


    }
}
