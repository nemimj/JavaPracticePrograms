public class Calculations {
    public void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    public void sub(int num1,int num2){
        if(num1 > num2){
            System.out.println(num1 - num2);
            return;
        }
        System.out.println(num2-num1);
    }
    public void multi(int num1,int num2){
        System.out.println(num1*num2);
    }
    public void div(double num1,double num2){
        System.out.println(num1/num2);
    }
    public void mod(int num1,int num2){
        System.out.println(num1%num2);
    }
}
