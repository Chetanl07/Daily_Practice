
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Hyderabad");
        cities.add("Delhi");
        cities.add("Banglore");
        cities.add("Chennai");

        // converting the non Synchronized list into synchronized list
        List<String> synchronizedList = Collections.synchronizedList(cities);
        synchronizedList.forEach(System.out::println);
    }
    
}
