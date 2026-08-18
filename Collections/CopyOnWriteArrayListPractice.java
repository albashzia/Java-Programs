package Collections;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListPractice {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> integers = new CopyOnWriteArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);

        System.out.println("Initial List: "+integers);
        for (int integer: integers){
            System.out.println(integer);
            if (integer == 3){
                integers.add(4);
                System.out.println("Added 4 while reading");
            }
        }

        System.out.println("Updated List: "+integers);
    }
}
