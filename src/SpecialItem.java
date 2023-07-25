import java.util.Scanner;

public class SpecialItem {

    public static void isSpeicalItemAvailable(int coins, int level, boolean special_message){
        if(coins >= 10 && level >= 5 && special_message == true)
            System.out.println("Special Item Found it will be credited to your account soon");
        else
            System.out.println("Special Item Not Found");
    }

    public static void userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of coins you have in your game : ");
        int coins = scanner.nextInt();
        System.out.print("Enter the current level of your game : ");
        int level = scanner.nextInt();
        System.out.print("Do you have a special key ? : ");
        String special_message = scanner.next();
        boolean value = Boolean.parseBoolean(special_message);
        isSpeicalItemAvailable(coins,level,value);
    }
    public static void main(String[] args){
      userInput();
    }
}
