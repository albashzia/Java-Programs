package Recursion;

public class ArrayReverser {
    public static void revArray(int[] arr, int index)
    {
        if(index<0)
            return;
        System.out.println(arr[index]);
        revArray(arr, index-1);
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("Reversed array elements:");
        revArray(array, array.length - 1);
    }
}
