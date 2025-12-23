package Recursion;

public class StringReverser {
    public static String StringReverser(String str)
    {
        if(str.length() <= 1)
            return str;
        return StringReverser(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args) {
        String str = "Java";
        String result = StringReverser(str);
        System.out.println("Reversed string of \"" + str + "\" is: \"" + result + "\"");
    }
}
