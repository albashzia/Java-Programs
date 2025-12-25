package Recursion;

public class CompoundInterestCalculator {
    public static double compCalc(double m, int t)
    {
        if(t==0)
            return m;
        return 1.005 * compCalc(m,t-1);
    }
    public static void main(String[] args) 
    {
        double result = compCalc(1000,3);
        System.out.printf("Result : %.2f%n",result);
    }
}
