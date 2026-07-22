package Collections;


import java.util.ArrayList;
import java.util.Comparator;

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }
}

class IntegerComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

public class ComparatorPractice {

    public static void main(String args[]){

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(5);
        integers.add(1);
        integers.add(4);
        integers.add(2);

        integers.sort(new IntegerComparator());
        System.out.println(integers);


        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("pineapple");
        words.add("peach");
        words.add("guava");
        words.add("pomegranate");

        words.sort(new StringLengthComparator());
        System.out.println(words);
    }
}
