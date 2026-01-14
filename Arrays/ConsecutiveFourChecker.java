import java.util.Scanner;

public class ConsecutiveFourChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter number of elements: ");
            int n = input.nextInt();
            int values[] = new int[n];
            System.out.println("Enter the " + n + " values for the array: ");
            for (int i = 0; i < n; i++) {
                values[i] = input.nextInt();
            }
            if (isConsecutiveFour(values) == true) {
                System.out.println("The list has consecutive fours");
            } else {
                System.out.println("The list has no consecutive fours");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        }

        input.close();
    }

    public static boolean isConsecutiveFour(int[] values) {
        int counter = 1;
        for (int i = 1; i < values.length; i++) {
            if (values[i] == values[i - 1]) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter == 4) {
                return true;
            }
        }
        return false;
    }
}
