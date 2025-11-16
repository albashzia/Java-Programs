package Arrays;

import java.util.Scanner;
public class NumberOfOccurences 
{
    public static void main(String[] args) 
    {
        int counter = 0;
        char[] characters = new char[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) 
        {
            System.out.print("A[" + i + "]" + " = ");
            characters[i] = input.next().charAt(0);
        }

        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {

                if (characters[i] == characters[j]) 
                {
                    counter = counter + 1;
                }
            }
            System.out.println(characters[i] + " occurs " + counter + " times");
            counter = 0;
        }
        input.close();
    }
}