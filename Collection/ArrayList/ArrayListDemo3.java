// Fetch data in forward and backward direction 

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        List<String> listofname = Arrays.asList("Rohit","Dhoni","Kohli");

        listofname.sort((s1,s2) -> s1.compareTo(s2));

        // fetching the data in both the direction 
        ListIterator<String > list = listofname.listIterator();
        System.out.println("In forward direction");
        while(list.hasNext())
        {
            System.out.println(list.next());
        }

        System.out.println("\nIn backward Direction");
        while(list.hasPrevious())
        {
            System.out.println(list.previous());
        }
        
    }
    
}
