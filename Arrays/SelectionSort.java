public class SelectionSort 
{
    public static void main(String[] args) 
    {
        int arr[] = {64, 25, 12, 22, 11};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) 
        {
            for (int j = i+1; j < n; j++) 
            {
                if (arr[j] > arr[i]) 
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }   
        }
        for(int m : arr)
            {
                System.out.print(m + " ");
            }
            System.out.println();
    }
}
