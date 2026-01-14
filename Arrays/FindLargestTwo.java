import java.util.Scanner;

public class FindLargestTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        try {
            System.out.println("Enter array elements: ");
            for (int i = 0; i < 10; i++) {
                array[i] = input.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        }
        
        int largest = array[0];
        for (int i = 0; i < 10; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        int largest2;
        if (array[0] == largest)
            largest2 = array[1];
        else
            largest2 = array[0];
        for (int i = 0; i < 10; i++) {
            if (array[i] != largest)
                if (array[i] > largest2)
                    largest2 = array[i];
        }

        System.out.println("The largest number is " + largest);
        System.out.println("The second largest number is " + largest2);
        input.close();
    }
}
