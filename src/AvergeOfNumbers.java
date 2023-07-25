import java.util.Scanner;

public class AvergeOfNumbers {
    public static float averageOf(int numberOfAverage){
        var scan = new Scanner(System.in);
        int sum = 0;
        for(int i = 1; i <= numberOfAverage; i++){
            System.out.print("Enter the marks of "+i+": ");
            int avg = scan.nextInt();
            sum+=avg;
        }
        return sum/numberOfAverage;
    }
}
