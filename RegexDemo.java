import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo {
    public static void main(String[] args) {

        // Using (.), matches any character
        String reg1 = "..";
        String text1 = "SU";

        Pattern pattern = Pattern.compile(reg1);
        Matcher matcher = pattern.matcher(text1);

        boolean result = matcher.matches();
        System.out.println(result);
    }
}
