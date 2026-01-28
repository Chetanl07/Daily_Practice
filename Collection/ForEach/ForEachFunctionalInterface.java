
import java.util.Vector;

public class ForEachFunctionalInterface {
    public static void main(String[] args) {
        
        Vector <String> listOfCity = new Vector<>();

       listOfCity.add("Hyderabad");
        listOfCity.add("Kolkata");
        listOfCity.add("Pune");
        listOfCity.add("mumbai");

        listOfCity.forEach(city -> System.out.println(city.toUpperCase()));
    }
    
}


