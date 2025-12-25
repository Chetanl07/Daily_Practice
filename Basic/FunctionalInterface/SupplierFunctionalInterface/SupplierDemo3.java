
import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierDemo3 {
    public static void main(String[] args) {
        Supplier <product> s3= () -> 
        {
            Scanner sc=new Scanner(System.in);
            int id=Integer.parseInt(sc.nextLine());
            String name= sc.nextLine();
            double price = Double.parseDouble(sc.nextLine());

            return new product(id, name, price);
        } ;

        product product1=s3.get();
        System.out.println(product1);
        
    }
    
}
record product (Integer id,String name , Double price){}
