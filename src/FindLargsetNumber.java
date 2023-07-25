import java.util.Scanner;

public class FindLargsetNumber {
    private static int findLargestValue(int enteredNumber) {
        int value = 0;
        String numberStr = String.valueOf(enteredNumber);
        int length = numberStr.length();

        while (length != 0) {
            int rem = enteredNumber%10;

            if(rem > value)
                value = rem;

            enteredNumber /=10;
            length--;
        }

        return value;
    }
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int enteredNumber = scan.nextInt();
        int largestValue = findLargestValue(enteredNumber);

        System.out.println("Biggest Digit in the number is "+largestValue);
    }


}