package Strings;
import java.lang.StringBuilder;
public class StringBuilderPractice {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("StringBuilder Practice");

        //printing character at a specific index
        System.out.println(sb.charAt(0));
        System.out.println(sb.charAt(8));

        //changing character at a specific index
        sb.setCharAt(0,'s');
        System.out.println(sb);

        //inserting at an index shifting already present character forward by 1
        sb.insert(6,' ');
        System.out.println(sb);

        //deleting characters present at any index in the string
        sb.delete(6,7);
        System.out.println(sb);
    }
}
