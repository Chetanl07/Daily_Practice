
import java.util.function.BiPredicate;

public class BiPredicateDemo1 {
    public static void main(String[] args) {
        BiPredicate<String,Integer> filter =(x,y) -> x.length()==y;
        boolean result=filter.test("Ravi",4);
        System.out.println(result);

        result = filter.test("HYD",5);
        System.out.println(result);
    }
    
}
// true 
// false

