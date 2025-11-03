import java.util.Scanner;
public class AppleDistribution
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int N,K;
        System.out.print("Please Enter the Number of Students : ");
        N = input.nextInt();
        System.out.print("Enter the number of apples : ");
        K = input.nextInt();
        System.out.println("Each student gets "+K/N+" apples");
        System.out.println("The remaining apples in basket are "+K%N);  
        input.close();
    }
}