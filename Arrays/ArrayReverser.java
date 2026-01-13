import java.util.Scanner;
public class ArrayReverser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter the number of elements in the array: ");
            int n = input.nextInt();
            int[] array = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                array[i] = input.nextInt();
            }
            System.out.println("Reversed array: ");
            for (int i = n - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        }
        input.close();
    }
}
