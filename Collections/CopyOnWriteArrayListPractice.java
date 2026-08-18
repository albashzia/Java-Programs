package Collections;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListPractice {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> integers = new CopyOnWriteArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
    }
}
