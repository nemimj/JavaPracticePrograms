import java.util.Scanner;

public class LeapYear {

    public static void leapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is no a leap year");
    }
    public static void main(String[] args){
        System.out.print("Enter a year to check whether it is a leap or not : ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        leapYear(year);
    }
}
