package Collections;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args){
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        System.out.println("Stack before operations :"+integerStack);
        integerStack.pop();
        System.out.println("Stack after pop operation :"+integerStack);

        System.out.println("Last item of the stack :"+integerStack.peek());

        System.out.println("Is stack empty :"+integerStack.isEmpty());

        System.out.println("Size of the stack :"+integerStack.size());
    }
}
