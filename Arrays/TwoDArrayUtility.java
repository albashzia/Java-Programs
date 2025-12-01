import java.util.Scanner;
public class TwoDArrayUtility 
{
    public static void inputArray(int[][] arr) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                arr[i][j] = input.nextInt();
            }
        }
    }

    public static void randomArray(int[][] arr) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                arr[i][j] = (int)(Math.random() * 100); 
            }
        }
    }

    public static void printArray(int[][] arr) 
    {
        System.out.println("Array contents:");
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void shuffleArray(int[][] arr) 
    {
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                int r = (int)(Math.random() * rows);
                int c = (int)(Math.random() * cols);
                int temp = arr[i][j];
                arr[i][j] = arr[r][c];
                arr[r][c] = temp;
            }
        }
    }

    public static void largestElement(int[][] arr) {
        int max = arr[0][0];
        int rowIndex = 0, colIndex = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                if (arr[i][j] > max) 
                {
                    max = arr[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }

        System.out.println("Largest element: " + max);
        System.out.println("Index: (" + rowIndex + ", " + colIndex + ")");
    }


    public static int sumAll(int[][] arr) 
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void largestRowSum(int[][] arr) 
    {
        int maxSum = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++) 
            {
                rowSum += arr[i][j];
            }

            if (rowSum > maxSum) 
            {
                maxSum = rowSum;
                index = i;
            }
        }

        System.out.println("Row with largest sum: " + index);
        System.out.println("Largest row sum: " + maxSum);
    }

    public static void sumByColumns(int[][] arr)
    {
        System.out.println("Column-wise sums:");
        for (int col = 0; col < arr[0].length; col++) 
        {
            int colSum = 0;
            for (int row = 0; row < arr.length; row++) 
            {
                colSum += arr[row][col];
            }
            System.out.println("Column " + col + ": " + colSum);
        }
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = input.nextInt();
        System.out.print("Enter number of columns: ");
        int c = input.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("\n1. User Input Initialization");
        inputArray(arr);
        printArray(arr);
        System.out.println("\n2. Random Initialization");
        randomArray(arr);
        printArray(arr);
        System.out.println("\n3. Shuffle Array");
        shuffleArray(arr);
        printArray(arr);
        System.out.println("\n4. Largest Element");
        largestElement(arr);
        System.out.println("\n5. Sum of All Elements");
        System.out.println("Total Sum = " + sumAll(arr));
        System.out.println("\n6. Row with Largest Sum");
        largestRowSum(arr);
        System.out.println("\n7. Column-wise Sum");
        sumByColumns(arr);
        input.close();
    }
}
