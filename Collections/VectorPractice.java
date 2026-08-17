package Collections;

import java.util.LinkedList;
import java.util.Vector;

public class VectorPractice {
    public static void main() {
        Vector<Integer> vector = new Vector<>(5,3);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1);
        System.out.println(vector.capacity());
        LinkedList<Integer>  integers = new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        Vector<Integer> vector1 = new Vector<>(integers);
        System.out.println(vector1);
    }
}
