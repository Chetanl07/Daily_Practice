
import java.util.ArrayList;

public class ArrayListDemo8 {
    public static void main(String[] args) {
        ArrayList<String> original = new ArrayList<>();
        original.add("BCA");
        original.add("MCA");
        original.add("BBA");
        original.add("Btech");

        System.out.println("copy the original data by using clone & copy constructor ");

        ArrayList<String> cloned= (ArrayList<String>) original.clone();
        System.out.println(cloned);

        System.out.println("By using copy constructor ");
        ArrayList<String> copyCons = new ArrayList<>(original);
        System.out.println(copyCons);

    }
    
}
