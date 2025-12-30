package Recursion;

public class CompoundInterestCalculator {
    public static double compCalc(double m, int t)
    {
        if(t==0) // base case
            return m;
        return 1.005 * compCalc(m,t-1);
    }
    public static void main(String[] args) 
    {
        double result = compCalc(1000,3); // call to recursive function
        System.out.printf("Result : %.2f%n",result);
    }
}
