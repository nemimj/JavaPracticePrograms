public class PrintNaturalNumbers {

    private int number;
    public PrintNaturalNumbers(int n){
        this.number = n;
    }

    public void printNaturalNumbers(){
        System.out.println("Natural Numbers are as follows");
        for(int i = 1; i <= number; i++)
            System.out.print(i+" ");
    }
}
