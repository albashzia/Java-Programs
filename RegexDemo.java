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

        Pattern pattern = Pattern.compile(reg2);
        Matcher matcher = pattern.matcher(text2);

        boolean result = matcher.matches();
        System.out.println(result);
    }
}
