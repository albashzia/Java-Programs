import java.util.Scanner;
public class AttendanceSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int courses = 5;
        char[][] attendance = new char[courses][];
        for (int i = 0; i < courses; i++) {
            System.out.print("Enter no of students enrolled in course # " + (i + 1) + " : ");
            int stds = input.nextInt();
            attendance[i] = new char[stds];
        }
        for (int i = 0; i < attendance.length; i++) {
            System.out.println("\nEnter attendance for course # " + (i + 1) + " : ");
            for (int j = 0; j < attendance[i].length; j++) {
                System.out.print("Enter attendance of student # " + (j + 1) + " (P/A) : ");
                attendance[i][j] = input.next().charAt(0);
            }
        }
        for (int i = 0; i < attendance.length; i++) {
            int present = 0;
            int absent = 0;
            for (int j = 0; j < attendance[i].length; j++) {
                if (attendance[i][j] == 'P' || attendance[i][j] == 'p') {
                    present++;
                } else if (attendance[i][j] == 'A' || attendance[i][j] == 'a') {
                    absent++;
                }
            }
            System.out.printf("%nCourse # %d %nPresent Students : %d %nAbsent Students : %d%n", (i + 1), present, absent);
        }
        input.close();
    }
}
