import java.util.function.Consumer;
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> c1= num -> System.out.println("Integer object : "+num);
        c1.accept(12);

        Consumer<Double> c2= dbl -> System.out.println("Double object :"+dbl);
        c2.accept(12.90);

        Consumer<String> c3= str -> System.out.println("String object : "+str);
        c3.accept("Chetan");

        Consumer<Product> c4 = p1 -> System.out.println(p1);
        c4.accept(new Product(101, "Laptop", 95000d));

    }
    
}

record Product(Integer id, String name, Double price)
{

}
