// Stack method peek() used in the program
import java.util.Stack;

public class StackDemo3 {
    public static void main(String[] args) {
        Stack<String> stk= new Stack<>();
        stk.push("Apple");
        stk.push ("Mango");
        stk.push("Grapes");
        stk.push("Orange");

        System.out.println("Stack: "+stk);

        String fruit = stk.peek();
        System.out.println("Element at top : "+fruit);
        System.out.println("Stack element are : "+stk);

    }
    
}
