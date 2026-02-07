
import java.util.ArrayList;

public class ArrayListDemo10 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("Java");
        list.add("World");

        // public void trim to Size()
        list.trimToSize();
        System.out.println("Trimmed list Size : "+list.size());

        System.out.println("--------------------------");

        ArrayList<Integer> listOfNumber = new ArrayList<>();

        // public void ensure Capacity (int minCapacity)
        // Increase the capacity of the Array list to avoid frequent resizing.

        listOfNumber.add(999);
        listOfNumber.ensureCapacity(100);
        for(int i=0; i< 50 ;i++)
        {
            listOfNumber.add(i);
        }

        System.out.println("List size : "+listOfNumber.size());
    }
    
}
