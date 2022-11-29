package test1.src;
// Java code to illustrate pop()
import java.util.*;
public class game {
    public static void main(String args[])
    {
        // Creating an empty Stack
        Stack<String> stack = new Stack<String>();
        // Use add() method to add elements
        if(stack.isEmpty()==true)
        System.out.println("Empty stack");
        else
            System.out.println("Not Empty stack");
        stack.push("Eashan");
        stack.push("Ajinkya");
        stack.push("Vaishu");
        stack.push("Ravi");
        stack.push("Sam");
        // Displaying the Stack
        System.out.println("Initial Stack: " + stack);
        // Removing elements using pop() method
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation " + stack);
    }
}