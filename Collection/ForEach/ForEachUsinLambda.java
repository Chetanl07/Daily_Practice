import java.util.Vector;
import java.util.function.Consumer;

public class ForEachUsinLambda {
    public static void main(String[] args) {
        Vector <String> listOfCity=new Vector<>();
        listOfCity.add("Hyderabad");
        listOfCity.add("Kolkata");
        listOfCity.add("Pune");
        listOfCity.add("mumbai");
        Consumer<String> consumer= city -> System.out.println(city.toUpperCase());
        listOfCity.forEach(consumer);
    }
  }

