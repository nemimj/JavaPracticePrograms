import java.util.Scanner;

public class DifferentCharacters {

    public static void typeOfCharacter(char character){
        int value = (int) character;
        if( value >= 48 && value <= 57)
            System.out.println("Entered character is digit");
        else if (value >= 65 && value <= 90)
            System.out.println("Entered character is UpperCase Alphabet");
        else if(value >= 97 && value <= 122)
            System.out.println("Entered character is LowerCase Alphabet");
        else
            System.out.println("Entered character is special character");
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        typeOfCharacter(ch);
    }
}
