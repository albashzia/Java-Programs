import java.util.Scanner;
public class ReversedArrayCopier 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.println("            Reversed Array Copier");
        System.out.println("-------------------------------------------");
        System.out.println("");
        int array[] = new int[10];
        int copiedArray[] = new int[10];
        for(int i = 0; i < array.length; i++)
        {
            System.out.print("Enter the element no "+(i+1)+" : ");
            array[i] = input.nextInt();
        }
        int j = 0;
        for(int i = array.length-1; i>=0; i--)
        {
                copiedArray[j] = array[i];
                j++;
        }
        System.out.println("    ");
        System.out.println("The copied array is as follow :\n");
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("The elements at index "+i+" is : " +copiedArray[i]);
        }
        input.close();
    }
}
