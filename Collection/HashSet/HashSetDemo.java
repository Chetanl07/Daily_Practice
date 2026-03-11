
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs1= new HashSet<>();
        hs1.add("java");
        hs1.add(new String("java"));

        System.out.println(hs1.size());
        System.out.println("----------------------");

        HashSet<StringBuilder> hs2 = new HashSet<>();
        hs2.add(new StringBuilder("Java"));
        hs2.add(new StringBuilder("Java"));
        System.out.println(hs2.size());


    }
    
}
