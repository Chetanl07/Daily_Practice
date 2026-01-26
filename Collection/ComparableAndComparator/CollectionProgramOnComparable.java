import java.util.Collections;
import java.util.Vector;

public class CollectionProgramOnComparable {
    public static void main(String[] args) {
        Vector<Customer> listOfCustomers= new Vector<>();
        listOfCustomers.add(new Customer(333, "Scott"));
        listOfCustomers.add(new Customer(222, "Aryan"));
        listOfCustomers.add(new Customer(111, "Zuber"));

        Collections.sort(listOfCustomers);

        for(Customer cum: listOfCustomers)
        {
            System.out.println(cum);
        }   
    }
    
}

record Customer(Integer id, String name) implements Comparable <Customer>
{
    @Override
    public int compareTo(Customer c2)
    {
        return this.name.compareTo(c2.name);
    }
}
