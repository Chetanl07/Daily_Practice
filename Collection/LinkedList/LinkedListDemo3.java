// list iterator methods (Add () , set() , remove())
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo3 {
    public static void main(String[] args) {
        
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Hyderabad");
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Delhi");

        System.out.println(cities);

        ListIterator<String> list = cities.listIterator();
        while (list.hasNext())
         {
            String cityName= list.next();

            if(cityName.equals("pune"))
            {
                list.remove();
            }
            else if (cityName.equals("Hyderabad"))
             {
                list.add("Ameerpet");  
            }
            else if(cityName.equals("Delhi"))
            {
                list.set("Kolkata");
            }
        }

        cities.forEach(System.out::println);
    }
    
}
