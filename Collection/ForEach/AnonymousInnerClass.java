import java.util.Vector;
import java.util.function.Consumer;
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Vector <String> listOfCity=new Vector<>();
        listOfCity.add("Hyderabad");
        listOfCity.add("Kolkate");
        listOfCity.add("Pune");
        listOfCity.add("Mumbai");
        //anonymous inner class for consumer
        Consumer<String> consumer = new Consumer <String>()        {
            public void accept(String city)
            {
                System.out.println(city.toUpperCase());
            }
        };
        listOfCity.forEach(consumer);
    }
    
}

