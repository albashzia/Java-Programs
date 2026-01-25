import java.util.Scanner;
public class TimeConverter 
{
    public static void main(String[] args) 
    {
        int N,H,M;
        Scanner input = new Scanner(System.in); // creating scanner object
        System.out.println("Enter the minutes passed till midnight : ");
        N = input.nextInt(); // taking input from user
        //System.out.println(N);
        H = N/60;
        M = N%60;
        System.out.println(H+" "+M); // displaying output
        input.close();
    }
}