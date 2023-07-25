public class FabonacciSeries {
    private int n1 = 0;
    private int n2 = 1;
    private int n3;

    public void fabSeries(int count){
        System.out.println(n1+"\n"+n2);
        for(int i = 2; i <= count; ++i){
            n3 = n1+n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
