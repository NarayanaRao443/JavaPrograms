// Stack follows the LIFO(Last In First Out) or FILO(First In Last Out)
// It is synchronized. Thread safe
// Operations are performs on top element
// Push()
// Pop()
// Peek()
// empty()
// Search()

import java.util.Stack;

public class StacksDemo {
    public static void main(String[] args) {
        
        Stack s = new Stack<>();
        
        s.push(5);
        s.push(3);
        s.push(2);
        s.push(""); // we can add null values also
        s.push(4);
        s.push(1);
        

        System.out.println(s);
        System.out.println(s.peek()); //returns the top of the stack
        //System.out.println(s.pop()); // remove the top element from the stack
        System.out.println(s.empty()); // returns true of stack is empty otherwise false
        System.out.println(s.search(3)); // returns the index value
    }
}
