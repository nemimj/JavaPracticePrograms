import java.util.Scanner;

public class IfElse {
    public static void marks(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the marks : ");
        int marks = scan.nextInt();

        if(marks >= 75)
            System.out.println("Passed");
        else
            System.out.println("Failed");
    }
    public static void main(String[] args){
       marks();
    }
}
