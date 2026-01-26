
import java.util.Collections;
import java.util.Vector;

public class ComparatorUsingCollection {
    public static void main(String[] args) {
        Vector<product> listOFProduct = new Vector<>();
        listOFProduct.add(new product(222, "Mobile", 30000d));
        listOFProduct.add(new product(111, "camera", 20000d));
        listOFProduct.add(new product(333, "laptop", 50000d));

        System.out.println("Sorting based on the Product ID : ");
        Collections.sort(listOFProduct, (p1,p2) -> Integer.compare(p1.id(),p2.id()));
        
        for(product product:listOFProduct)
        {
            System.out.println(product);

        }
// sorting based on the product name

        System.out.println("\nsorting based on the Product name:");
        Collections.sort(listOFProduct,(p1,p2)-> p1.name().compareTo(p2.name()));
        for(product product:listOFProduct)
        {
            System.out.println(product);

        }

// sorting based on the Price
        System.out.println("\nSorting based on the Product price");
        Collections.sort(listOFProduct,(p1,p2) -> Double.compare(p1.price(), p2.price()));
        for(product product:listOFProduct)
        {
            System.out.println(product);

        }

    }
}

record product(Integer id, String name, Double price)
{

}
