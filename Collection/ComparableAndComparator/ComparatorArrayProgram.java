import java.util.Arrays;
import java.util.Comparator;
public class ComparatorArrayProgram {
    public static void main(String[] args) {
        Manager managers[]=         {
            new Manager(222,"Scott"),
            new Manager(111, "Chetan"),
            new Manager(333, "Aryan")
        };
        // Anonymous inner class
        Comparator<Manager> cmpId = new Comparator<Manager>()         {
            @Override
            public int compare(Manager m1,Manager m2)
            {
             return Integer.compare(m1.id(), m2.id());
            }
        };
        Arrays.sort(managers,cmpId);
        System.out.println("Sorting the manager data based on the ID");

        for(Manager manager: managers)        {
            System.out.println(manager);        }
        // By using Lambda
        Comparator<Manager> cmpName =(m1,m2) -> m1.name().compareTo(m2.name());
       Arrays.sort(managers, cmpName);
        System.out.println("\nSorting the manager data based on the Name");

        for(Manager manager : managers)
        {            System.out.println(manager);        }
    }
}
record Manager(Integer id,String name){}
