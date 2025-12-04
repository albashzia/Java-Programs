package Loops;
public class ArithmeticSequenceSum 
{
    public static void main(String[] args) 
    {
        int sum = 0;
        for(int i = 20; i<=60;i=i+5)
        {
            sum = sum+i;
        }
        System.out.println("The sum of the sequence \"20 + 25 + 30 + 35 + 40 + 45 + 50 + 55 + 60\" is "+sum);
    }
}