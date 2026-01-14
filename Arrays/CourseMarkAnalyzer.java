import java.util.Scanner;

public class CourseMarkAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] marks = new int[3][4];
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Enter marks for student # " + (i + 1));
                for (int j = 0; j < 4; j++) {
                    marks[i][j] = input.nextInt();
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter integers only.");
            }

        }
        for (int i = 0; i < 4; i++) {
            int highMarks = 0;
            for (int j = 0; j < 3; j++) {
                if (marks[j][i] > highMarks) {
                    highMarks = marks[j][i];
                }
            }
            System.out.println("The highest marks in subject # " + (i + 1) + " : " + highMarks);
        }
        input.close();
    }
}
