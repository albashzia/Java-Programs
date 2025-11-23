import java.util.Scanner;
public class DistinctNumbersFinder 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers separated by exactly 1 space: ");
        String inputLine = input.nextLine();
        String[] numbers = inputLine.split(" ");
        int[] numberArray = new int[10];
        for(int i = 0; i < numbers.length; i++)
        {
            numberArray[i] = Integer.parseInt(numbers[i]);
        }
        int[] uniqueElements = new int[10];
        uniqueElements[0] = numberArray[0];
        for(int i = 1; i < numberArray.length; i++)
        {
              boolean isUnique = true;
              for(int j = 0; j < uniqueElements.length; j++)
            {
               if(numberArray[i] == uniqueElements[j])
                {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique)
               {
                   uniqueElements[i] = numberArray[i];
               }
        }      
        int noOfUniqueElements = 0;
        for(int k = 0; k < uniqueElements.length; k++)
        {
            if(uniqueElements[k]!=0)
            {
                noOfUniqueElements += 1;
            }
        }
        System.out.println("The unique elements found are "+noOfUniqueElements);
        for(int l = 0; l < uniqueElements.length; l++)
        {
            if(uniqueElements[l]!=0)
            {
                System.out.print(uniqueElements[l]+" ");
            }
        }
        System.out.println(" ");
        input.close();
    }
}
