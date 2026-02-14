
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo8 {
    public static void main(String[] args) {

        Vector<Product> listofProducts=new Vector<>();
        listofProducts.add(new Product(111, "Laptop"));
        listofProducts.add(new Product(222, "Mobile"));
        listofProducts.add(new Product(333, "Camera"));
        listofProducts.add(new Product(444, "Bag"));
        listofProducts.add(new Product(555, "Watch"));

        listofProducts.addElement(new Product(666, "Phone"));

        System.out.println("Element at 0 index :"+listofProducts.elementAt(0));

        // Backward Compatibility 
        Enumeration<Product> element = listofProducts.elements();
        Iterator<Product> itr=element.asIterator();

        itr.forEachRemaining(System.out::println);


        
    }    
}

record Product(Integer id,String name)
{

}
