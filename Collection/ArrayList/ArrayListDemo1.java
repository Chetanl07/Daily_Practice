// sort a array list based on the Name 
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Customer> listOfCustomers=new ArrayList<>();
         listOfCustomers.add(new Customer(333, "Chetan", 72000D));
        listOfCustomers.add(new Customer(111, "Akash", 50000D));
        listOfCustomers.add(new Customer(555, "Vinod", 60000D));   
        listOfCustomers.add(new Customer(444, "Sumit", 80000D));
        listOfCustomers.add(new Customer(888, "Datta", 45000D));

        System.out.println("Original Customer Object");
        listOfCustomers.forEach(System.out::println);

        Collections.sort(listOfCustomers);
        System.out.println("\nSorted based on the name: ");
           listOfCustomers.forEach(System.out::println);
    }
    
}

record Customer(Integer custID,String custName, Double custSal) implements Comparable<Customer>
{
    public int compareTo(Customer c2)
    {
        return this.custName.compareTo(c2.custName);
    }
}
