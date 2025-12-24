
import java.util.function.Supplier;

public class SupplierDemo2 {
    public static void main(String[] args) {
        Supplier <Player> s2= () -> new Player(18,"virat");
        Player player = s2.get();

        System.out.println("Player");

    }
    
}
record Player(Integer id,String name) {}
