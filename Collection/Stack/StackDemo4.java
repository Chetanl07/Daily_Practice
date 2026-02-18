// search method of the stack take object as a parameter
import java.util.Stack;

public class StackDemo4 {
    public static void main(String[] args) {
        Stack<String> stk= new Stack<>();

        stk.push("Apple");
        stk.push("Mango");
        stk.push("Banana");

        System.out.println("Offset Position is : " + stk.search("Banana")); //1
        System.out.println("Offset position is : "+stk.search("Grapes"));// -1
        System.out.println("Is stack empty ? "+ stk.empty()); // false
        System.out.println("Index position is : "+stk.indexOf("Mango")); //1

    }
}
