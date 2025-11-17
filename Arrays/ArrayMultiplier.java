package Arrays;
import java.util.Scanner;
public class ArrayMultiplier 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.println("            Array Multiplier");
        System.out.println("-------------------------------------------");
        System.out.println("");
        int array[] = new int[10];
        for(int i = 0; i < array.length; i++)
        {
            System.out.print("Enter the element no "+(i+1)+" : ");
            array[i] = input.nextInt();
        }
        modify(array);
        System.out.println("");
        System.out.println("The array elements after multiplication are :\n");
        for(int i = 0; i < array.length; i++)
        {
            System.out.println("The elements at index "+i+" is : "+array[i]);
        }
        input.close();
    }
    public static int[] modify(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            a[i] = a[i]*3;
        }
        return a;
    }
}
