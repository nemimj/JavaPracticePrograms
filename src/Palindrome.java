public class Palindrome {

    public boolean palindromeChecker(int n){

        String number = Integer.toString(n);
        int length = number.length();

        for(int i = 0; i < length/2; i++){
            if(number.charAt(i)!=number.charAt(length-1-i))
                return false;
        }
        return true;
    }

}
