package Collections;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args){
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        System.out.println(integerStack);
        integerStack.pop();
        System.out.println(integerStack);
    }
}
