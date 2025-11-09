public class RandomUppercaseLetter 
{
    public static void main(String[] args) 
    {   
        int number = (65 + (int)(Math.random() * 26));
        char letter = (char)number;
        System.out.println("Random Uppercase Letter: " + letter);
    }
}
