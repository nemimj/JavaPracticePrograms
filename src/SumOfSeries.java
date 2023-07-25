public class SumOfSeries {
    public static float findSumOfSeries(int range){
        float sum = 1;
        for(int i = 2; i <= range; i++){
            sum += 1.0/i;
        }
        return sum;
    }
}
