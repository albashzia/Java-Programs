package DataStructures;
import java.util.ArrayList;
public class ArrayListPractice {

    public static void main() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Apple");
        stringArrayList.add(1,"Bag");


        for (String e : stringArrayList){
            System.out.println(e);
        }
    }
}
