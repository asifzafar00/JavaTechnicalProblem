package dsa;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Creating an empty Stack
        Stack<String> stack = new Stack<>();

        // Use push() to add elements into the Stack
        stack.push("Welcome");
        stack.push("To");
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");

        // Displaying the Stack
        System.out.println("Initial Stack: " + stack);

        // Fetching the element at the head of the Stack
        System.out.println("The element at the top of the"
                + " stack is: " + stack.peek());
        // Removing elements using pop() method
        System.out.println("Popped element: "
                + stack.pop());
        System.out.println("Popped element: "
                + stack.pop());

        // Pop elements from the stack
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        // Displaying the Stack after the Operation
        System.out.println("Final Stack: " + stack);
        System.out.println(""
        +stack.isEmpty());
    }
}
