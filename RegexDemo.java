import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo {
    public static void main(String[] args) {

        // Using (.), matches any character
        String reg1 = "..";
        String text1 = "SU";

        // Using (\w), matches any alphabet or number
        String reg2 = "\\w";
        String text2 = "@";

        // Using (\W), matches any character that isn't a word
        String reg3 = "\\W";
        String text3 = "@";

        // Using (\s), matches a whitespace character
        String reg4 = "\\s";
        String text4 = " ";

        // Using (\S), matches a non-whitespace character
        String reg5 = "\\S";
        String text5 = "A";

        Pattern pattern = Pattern.compile(reg5);
        Matcher matcher = pattern.matcher(text5);

        boolean result = matcher.matches();
        System.out.println(result);
    }
}
