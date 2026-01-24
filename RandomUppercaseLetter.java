public class RandomUppercaseLetter 
{
    public static void main(String[] args) 
    {   
        int number = (65 + (int)(Math.random() * 26)); // generating a random number as ASCII
        char letter = (char)number; // Converting the number to character
        System.out.println("Random Uppercase Letter: " + letter); // printing the random letter
    }
}
