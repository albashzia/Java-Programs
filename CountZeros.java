import java.util.Scanner;
public class CountZeros
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of integers to be entered : ");
        int N = input.nextInt();
        int count = 0;
        System.out.println("Please enter "+N+" integers");
        for(int i = 1; i<=N; i++)
        {
            int inp = input.nextInt();
            if(inp == 0)
            {
                count = count+1;
            }
        }
         System.out.println("The number of zero elements in given integers is "+count);
        
        input.close();
    }
}
