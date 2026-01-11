
public class ArrayManipulation {

    // function to fill a 2D array with random integers from 0 to 9
    public static int[][] fillArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        return arr;
    }

    // function to swap the columns with the maximum and minimum sums
    public static int[][] swapColumns(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            sum = sum + arr[i][0];
        }
        int maxSum = sum;
        int minSum = sum;
        int maxCol = 0;
        int minCol = 0;
        for (int j = 1; j < cols; j++) {
            sum = 0;
            for (int i = 0; i < rows; i++) {
                sum = sum + arr[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxCol = j;
            }
            if (sum < minSum) {
                minSum = sum;
                minCol = j;
            }
        }
        for (int i = 0; i < rows; i++) {
            int temp = arr[i][maxCol];
            arr[i][maxCol] = arr[i][minCol];
            arr[i][minCol] = temp;
        }
        return arr;
    }

    // function to print the 2D array
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // main method to test the functions
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        fillArray(array);
        System.out.println("Array before swapping: ");
        printArray(array);
        swapColumns(array);
        System.out.println("Array before swapping: ");
        printArray(array);
    }
}
