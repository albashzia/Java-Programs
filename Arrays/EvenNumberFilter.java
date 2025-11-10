package Arrays;

public class EvenNumberFilter 
{
    public static void main(String[] args) 
    {
        int numbers[] = {10, 23, 45, 66, 78, 89, 90, 12, 34, 57};
        int evenNumbers[] = new int[ numbers.length ];
        for(int i = 0; i<numbers.length; i++)
        {
            if(numbers[i]%2==0)
            {
                evenNumbers[i] = numbers[i];
                System.out.println(evenNumbers[i]);
            }
        }
    }
}
