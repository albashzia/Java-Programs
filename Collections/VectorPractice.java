package Collections;

import java.util.LinkedList;
import java.util.Vector;

public class VectorPractice {
    public static void main() {
        //Create a Vector
        Vector<Integer> vector = new Vector<>(5,3);

        //Add elements to vector
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);

        //Printing the initial capacity
        System.out.println("Initial Capacity: "+vector.capacity());
        vector.add(1);

        //Printing the incremented capacity
        System.out.println("Incremented Capacity: "+vector.capacity());

        //Creating a linked list
        LinkedList<Integer>  integers = new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        //Passing the linked list as a collection to new vector
        Vector<Integer> vector1 = new Vector<>(integers);
        System.out.println("Elements in vector1: "+vector1);

        //Running a loop to print all the elements of the vector
        System.out.println("Elements in vector: ");
        for (int i = 0; i < vector.size(); i++){
            System.out.println(vector.get(i));
        }
    }
}
