import java.util.Scanner;
public class FoodQualityPoll 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.println("            Food Quality Poll");
        System.out.println("-------------------------------------------");
        int[] foodRating = new int[10];
        System.out.println("Please rate on the scale of 1 - 10 \n");
        for(int i = 0; i<10; i++)
        {
            
            System.out.print("Enter the food rating by student no "+(i+1)+" : ");
            foodRating[i] = input.nextInt();
        }
        System.out.println(" ");
        System.out.println("-------------------------------------------");
        System.out.println("            Poll Results ");
        System.out.println("-------------------------------------------");
        for(int j = 1; j <= 10; j++)
        {
            int count = 0;
            for(int i = 0; i < foodRating.length; i++)
            {
               if(foodRating[i] == j)
               {
                   count++;
               }   
            }
             System.out.println("The number of students who rated "+j+ " is "+count);
        }
        input.close();
    }
}
