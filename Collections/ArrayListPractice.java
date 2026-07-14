package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(10);
        list.add(100);

        System.out.println(list.get(1));

        System.out.println(list.contains(10));
        System.out.println(list.contains(50));

        list.add(2,50);

        list.set(3,500);

        List<Integer> list1 = List.of(100, 200, 300, 500);

        list.addAll(list1);

        Collections.sort(list);

        for(int x : list){
            System.out.println(x);
        }

    }
}
