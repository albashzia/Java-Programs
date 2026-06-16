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

        Pattern pattern = Pattern.compile(reg4);
        Matcher matcher = pattern.matcher(text4);

        boolean result = matcher.matches();
        System.out.println(result);
    }
}
