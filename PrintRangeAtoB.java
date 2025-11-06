import java.util.Scanner;
public class PrintRangeAtoB
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int a = input.nextInt();
        System.out.print("Enter 2nd number :");
        int b = input.nextInt();
        for(int i = a ; a<=b ; a++)
        {
            System.out.println(a);
        }
            
    }
}
