
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Chetan");
        lhs.add("Vijay");
        lhs.add("Chetan");
        lhs.add("Datta");
        lhs.add("Vinod");
        lhs.add(null);
        lhs.add("Akash");
        lhs.forEach(System.out::println);
    }
    
}
