package DataStructures;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Apple");
        stringArrayList.add(1,"Bag");

        String[] words = new String[3];
        words[0] = "Pen";
        words[1] = "Book";
        words[2] = "Laptop";

        stringArrayList.addAll(Arrays.asList(words));

        System.out.println(stringArrayList.get(2));
        stringArrayList.set(2,"Bottle");

        stringArrayList.remove(4);
        stringArrayList.remove("Book");

        System.out.println(stringArrayList.size());

        for (String e : stringArrayList){
            System.out.println(e);
        }
    }
}
