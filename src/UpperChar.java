import java.util.Scanner;

public class UpperChar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String result = convertFirstLetterToUpperCase(text);
        System.out.println(result);
       
    }

    private static String convertFirstLetterToUpperCase(String text) {
        if(text == null || text.isEmpty()) return "";
        String[] words = text.split("\\s+");
        StringBuilder resultBuilder = new StringBuilder();

     for(int i = 0; i < words.length; i++) {
         String word = words[i];

         if (!word.isEmpty()) {
             resultBuilder.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));

             if (i < words.length - 1) resultBuilder.append(" ");
         }

     }
        return resultBuilder.toString();

    }
}
