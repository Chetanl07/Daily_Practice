// Concurrent modification exception
import java.util.Vector;

public class ConcurrentModification {
    public static void main(String[] args) {
        Vector<String> listofCity= new Vector<>();
        listofCity.add("Hyd");
        listofCity.add("Mumbai");
        listofCity.add("pune");
        
        for(String city : listofCity)
        {
            System.out.println(city);
            // generates Concurrent modification exception
            //listofCity.add("Goa");
        }
    }
}
