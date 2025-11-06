import java.util.Scanner;
public class CountNonZeroInputs
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers (0 to stop):");
        int count = 0;
        while (true) 
        {
            int num = input.nextInt(); 
            if (num == 0) 
            {           
                break;
            }
            count++;  
        }
        System.out.println("The entered numbers are "+count); 
        input.close();
    }
}