// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        System.out.println("------------------- Calculation class ---------------------");
        var cal = new Calculations();
        cal.add(5,5);
        cal.sub(5,4);
        cal.multi(5,5);
        cal.div(5,5);
        cal.mod(5,3);

        System.out.println("------------------- Journey class ---------------------");

        var journey1 = new JourneyCalculator();
        journey1.calculateDistance(20,30);

        System.out.println("------------------- Decoder class ---------------------");

         var unicode1 = new DecodeCharacter();
         unicode1.decodeChar('A');

        System.out.println("------------------- NaturalNumbers class ---------------------");

         var number = new PrintNaturalNumbers(10);
         number.printNaturalNumbers();

        System.out.println("\n------------------- Factorial class ---------------------");

        Factorial.factorialOf(5);

        System.out.println("\n------------------- Fabonaci class ---------------------");

        var fab = new FabonacciSeries();
        fab.fabSeries(10);

        System.out.println("\n------------------- GCD class ---------------------");
        var gcd = new GCD();
        System.out.println(gcd.greatestCommonFactor(36,48));

        System.out.println("\n------------------- PrimeNumber class ---------------------");

        PrimeNumbers.firstNPrimeNumbers(10);

        System.out.println("\n------------------- Palindrome class ---------------------");
        var pal = new Palindrome();
        System.out.println(pal.palindromeChecker(123425));

        System.out.println("\n------------------- Palindrome class ---------------------");
        System.out.println(SumOfNumbers.sumOfDigits(12345));

        System.out.println("\n------------------- ArmstrongNumber class ---------------------");
        ArmStrongNumber.armStrongNumber(371);

        System.out.println("\n------------------- AverageOfNumber class ---------------------");
        System.out.println(AvergeOfNumbers.averageOf(5));

        System.out.println("\n-------------------SumOfSeries class ---------------------");
        System.out.println(SumOfNumbers.sumOfDigits(3));

    }
}