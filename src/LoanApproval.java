import java.util.Scanner;

public class LoanApproval {
    public static void LoanVerification(int age,float income){
        if(age >= 18 && income >= 50000)
            System.out.println("You are eligible for collecting loan");
        else
            System.out.println("Sorry at this time, You are not eligible for collecting loan ");
    }


    public static void userData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.next();
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        System.out.print("Enter your income : ");
        float income = scanner.nextFloat();

        LoanVerification(age,income);
    }

    public static void main(String[] args){
       userData();
    }
}
