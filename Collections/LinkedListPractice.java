package Collections;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main() {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.add(3);
        integerLinkedList.addFirst(0);
        integerLinkedList.addLast(4);

        System.out.println(integerLinkedList);

        System.out.println(integerLinkedList.get(3));
        System.out.println(integerLinkedList.getLast());
        integerLinkedList.removeIf(x -> x%2==0);
        System.out.println(integerLinkedList);

    }
}
