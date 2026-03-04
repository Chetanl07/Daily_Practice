
import java.util.LinkedList;

public class LinkedListDemo6 {
    public static void main(String[] args) {
        
        LinkedList<product> listOfProduct= new LinkedList<>();
        listOfProduct.add(new product(2, "Apple"));
        listOfProduct.add(new product(1, "Mi phone"));
        listOfProduct.add(new product(3, "Vivo"));

        // Retrieve the object based on the index
        product pro= listOfProduct.get(1);
        System.out.println(pro);

        System.out.println("Sorting based on the ID");
        // sort the product based on the ID
        listOfProduct.sort((p1,p2)-> Integer.compare(p1.id(), p2.id()));
        listOfProduct.forEach(System.out::println);

    }
    
}

record  product(Integer id,String name)
{

}
