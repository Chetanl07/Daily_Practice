import java.util.function.Supplier;

public class SupplierDemo1 {
    public static void main(String[] args) {
        Supplier <String> s1= ()-> 12+12+" Java "+40+40;
        System.out.println(s1.get());  

    }
    
}
