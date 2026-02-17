
import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo1 {
    public static void main(String[] args) {
        
        Stack<Integer> s= new Stack<>();

        try
        {
            s.push(12);
            s.push(22);
            s.push(15);
            s.push(33);
            s.push(49);

            System.out.println("After insertion elements are :"+s.toString());
            System.out.println("Fetching the elements using pop methods ");

            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
           // System.out.println(s.pop());      //Empty stack Exception 
            

            System.out.println("After deletion elements are : "+s); // []
            System.out.println("is the stack empty ? :"+s.empty());

        }
        catch(EmptyStackException ESE)
        {
            ESE.printStackTrace();  
        }
    }
}
