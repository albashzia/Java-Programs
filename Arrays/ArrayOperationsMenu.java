import java.util.Scanner;
public class Question9 
{
    public static void count(int array[],int x)
    {
        int occurences = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i]==x)
            {
                occurences++;
            }
        }
        System.out.println("The occurences of required element in array is "+occurences);
    }
    public static void partition(int array[]) 
    {
        int pivot = array[0];  
        int j = 0;             

        for (int i = 1; i < array.length; i++) 
        {
            if (array[i] < pivot) 
            {
                j++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    
        int temp = array[0];
        array[0] = array[j];
        array[j] = temp;
        System.out.println("Array after partition:");
        for (int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    } 
    public static void duplicates(int array[])
    {
        System.out.println("Frequencies of all elements:");
        for (int i = 0; i < array.length; i++) 
        {
        int count = 0;
            for (int j = 0; j < array.length; j++) 
            {
                if (array[i] == array[j]) 
                {
                    count++;
                }
            }
            System.out.println(array[i] + " appears " + count + " time");
        }
    }
    public static void circular(int arr[]) 
    {
        int n = arr.length;
        int result[] = new int[n];

        for (int i = 0; i < n; i++)  
        {
            if (i <= n - 3) 
            {
                result[i] = arr[i + 1] + arr[i + 2];
            } 
            else if (i == n - 2) 
            {
                result[i] = arr[n - 1] + arr[0];
            } 
            else 
            {
                result[i] = arr[0] + arr[1];
            }
        }
        for (int i = 0; i < n; i++) 
        {
            arr[i] = result[i];
        }
        for (int i = 0; i < n; i++)
        {
            System.out.println(result[i]+" ");
        }
    }
    public static void shiftCircular(int array[]) 
    {
        int n = array.length;
        int first = array[0];
        int second = array[1];
        for (int i = 0; i < n - 2; i++) 
        {
            array[i] = array[i + 2];
        }
        array[n - 2] = first;
        array[n - 1] = second;
        for (int i = 0; i < n; i++)
        {
            System.out.println(array[i]+" ");
        }
}

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < n; i++)
        {
            array[i] = input.nextInt();
        }
        System.out.println("1. Count a certain element");
        System.out.println("2. Partition the array");
        System.out.println("3. Count duplicates");
        System.out.println("4. Circular Movement");
        System.out.println("5. Shift Circular");
        System.out.print("\nEnter the action to perform : ");
        int choice = input. nextInt();
        if(choice == 1)
        {
            System.out.print("Enter the element to count in array : ");
            int x = input.nextInt();
            count(array,x);
        }
        if(choice == 2)
        {
            partition(array);
        }
        if(choice == 3)
        {
            duplicates(array);
        }
        if(choice == 4)
        {
            circular(array);
        }
        if(choice == 5)
        {
            shiftCircular(array);
        }
    }
}

