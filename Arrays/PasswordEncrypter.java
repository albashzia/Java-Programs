import java.util.Scanner;

public class PasswordEncrypter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] passwords = new char[50][8];
        for (int i = 0; i < passwords.length; i++) {
            System.out.print("Enter the password of user " + (i + 1) + " (The length must be exactly 8 characters) : ");
            String pswd = input.next();
            for (int j = 0; j < 8; j++) {
                char ch = pswd.charAt(j);
                passwords[i][j] = (char) (ch + 1);
            }
        }
        input.close();
    }
}
