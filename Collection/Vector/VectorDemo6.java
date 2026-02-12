// remove the single object from the vector class 
// break statement will work, if we want to delete only single object based on primary key
import java.util.Vector;

public class VectorDemo6 {
    public static void main(String[] args) {
        Vector<Manager> listManagers=new Vector<>();
        listManagers.add(new Manager(333, "Chetan", 72000D));
        listManagers.add(new Manager(111, "Akash", 50000D));
        listManagers.add(new Manager(555, "Vinod", 60000D));   
        listManagers.add(new Manager(444, "Sumit", 80000D));
        listManagers.add(new Manager(888, "Datta", 45000D));

        // delete the employee object whose id is 444

        for(Manager manager:listManagers)
        {
            if(manager.id() == 444)
            {
                listManagers.remove(manager);
                break;
            }
        }
        listManagers.forEach(System.out::println);
    }
}

record Manager(Integer id, String name, Double sal)
{

}