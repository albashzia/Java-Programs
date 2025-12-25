public class SpamFilter {
    public static String removeSpam(String input, String[] spamWords) {
        String[] words = input.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            boolean isSpam = false;
            for (int j = 0; j < spamWords.length; j++) {
                if (words[i].equalsIgnoreCase(spamWords[j])) {
                    isSpam = true;
                    break;
                }
            }
            if (!isSpam) 
            {
                result = result + words[i] + " ";
            }
        }
        return result.trim();
    }
    
    public static void main(String[] args) {
        String input = "This is a test string with some spam words like spam and junk";
        String[] spamWords = {"spam", "junk"};
        String filtered = removeSpam(input, spamWords);
        System.out.println(filtered);
    }
}