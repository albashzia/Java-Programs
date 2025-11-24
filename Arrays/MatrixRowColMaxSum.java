import java.util.Scanner;
public class MatrixRowColMaxSum
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int matrix[][] = new int[3][4];
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Enter elements for row # "+(i+1)+" : ");
            for(int j = 0; j < 4; j++)
            {
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("The original matrix is : ");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println("");
        }
        int maxSum = 0;
        int maxSumRow = 0;
        for(int i = 0; i < 3; i++)
        {
            int sumRow = 0;
            for(int j = 0; j < 4; j++)
            {
                sumRow = sumRow + matrix[i][j];
                if(sumRow>maxSum)
                {
                    maxSum = sumRow;
                    maxSumRow = i;
                }
            }
        }
        System.out.println("\nThe row having maximum sum is "+(maxSumRow+1));
        
        int maxSumC = 0;
        int maxSumColumn = 0;
        for(int j = 0; j < 4; j++)
        {
            int sumCol = 0;
            for(int i = 0; i < 3; i++)
            {
                sumCol = sumCol + matrix[i][j];
                if(sumCol>maxSumC)
                {
                    maxSumC = sumCol;
                    maxSumColumn = j;
                }
            }
        }
        System.out.println("\nThe column having maximum sum is "+(maxSumColumn+1));
    }
}
