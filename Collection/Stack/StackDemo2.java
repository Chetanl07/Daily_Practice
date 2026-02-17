// vector Add() method are also used in the Stack
import java.util.Stack;

public class StackDemo2 {
    public static void main(String[] args) {
        
        Stack<Integer> st1= new Stack<>();
        st1.add(10);
        st1.add(20);
        st1.forEach(System.out::println);

        Stack<String> st2= new Stack<>();
        st2.add("\nJava");
        st2.add("is");
        st2.add("Programming ");
        st2.add("language\n");
        st2.forEach(System.out::println);

        Stack<Character> st3=new Stack<>();
        st3.add('c');
        st3.add('e');
        st3.forEach(System.out::println);

        Stack<Double> st4= new Stack<>();
        st4.add(10D);
        st4.add(20D);
        st4.forEach(System.out::println);
    }
    
}
