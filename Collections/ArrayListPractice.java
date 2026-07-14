package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(10);
        list.add(100);

        list.get(1);

        for(int x : list){
            System.out.println(x);
        }
    }
}
