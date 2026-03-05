
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo9 {
    public static void main(String[] args) {
        Customer customer=getCustomerObject().get(1);
        System.out.println(customer);
    }
// method retrun type is safe type
    public static List<Customer> getCustomerObject()
    {
        Customer c1= new Customer(111, "Scott");
        Customer c2= new Customer(222, "Alen");
        Customer c3=new Customer(333, "Smith");

        List<Customer> list = new LinkedList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        return list;
    }
    
}
record Customer(Integer id, String name) {}