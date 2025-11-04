import java.util.Scanner;
public class RankingNumbers 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the three integers : ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        int smallest = 0, middlest = 0, largest = 0 ;
        
        if (a<b && a<c)
        {
           smallest = a;
            if(b<c)
            {
                middlest = b;
                largest = c;
            }
            else
            {
                middlest = c;
                largest = b;
            }              
        }
        
        if (b<c && b<a)
        {
            smallest = b;
            if(c<a)
            {
                middlest = c;
                largest = a;
            }
            else
            {
                middlest = a;
                largest = c;
            }              
        }
        
        if (c<a && c<b)
        {
           smallest = c;
            if(a<b)
            {
                middlest = a;
                largest = b;
            }
            else
            {
                middlest = b;
                largest = a;
            }              
        }
        System.out.println("Smallest Number is : "+smallest);
        System.out.println("Middlest Number is : "+middlest);
        System.out.println("Largest Number is : "+largest);
        input.close();
    }   
}