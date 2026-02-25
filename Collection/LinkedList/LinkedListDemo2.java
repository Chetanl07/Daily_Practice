// all the linked list methods
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Ravi");
        list.add("Rahul");
        list.addLast("Anand");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println(list);

        System.out.println("-----------------------");

        List<String> listofName= Arrays.asList("Ravi","Rahul", " ankit", " rahul");
        LinkedList<String> names= new LinkedList<>(listofName);

        UnaryOperator<String> convertToUpper = str -> str.toUpperCase();
        names.replaceAll(convertToUpper);
        names.forEach(System.out::println);


    }
    
}
