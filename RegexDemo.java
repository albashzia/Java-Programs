import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo {
    public static void main(String[] args) {
        String reg = "";
        String text = "";

        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(text);

        boolean result = matcher.matches();
        System.out.println(result);
    }
}
