package Collections;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args){

        //Creating a stack
        Stack<Integer> integerStack = new Stack<>();

        //Pushing items to the stack
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        //Testing methods on the stack

        //Print complete stack
        System.out.println("Stack before operations :"+integerStack);

        //Pop the last element
        integerStack.pop();
        System.out.println("Stack after pop operation :"+integerStack);

        //View the last element
        System.out.println("Last item of the stack :"+integerStack.peek());

        //Check if the stack is empty
        System.out.println("Is stack empty :"+integerStack.isEmpty());

        //Print the size of the stack
        System.out.println("Size of the stack :"+integerStack.size());
    }
}
