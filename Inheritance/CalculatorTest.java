class Calculator{
    static int powerInt(int num1, int num2){
        return(int) Math.pow(num1,num2);
    }
    static double powerDouble(double num1, double num2){
        return(double) Math.pow(num1,num2);
    }
}
public class CalculatorTest{
    public static void main(String[] args){
      
        System.out.println(Calculator.powerInt(3,6));
        System.out.println(Calculator.powerDouble(2.0,5.0));
    }
}