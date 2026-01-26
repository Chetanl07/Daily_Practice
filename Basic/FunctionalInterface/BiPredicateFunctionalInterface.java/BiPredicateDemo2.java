
import java.util.function.BiPredicate;

// Bi Predicate to check if the sum of two integers is even 
public class BiPredicateDemo2 {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> sumEven= (x,y) -> (x+y)%2==0; 

        System.out.println(sumEven.test(2,5));
        System.out.println(sumEven.test(10,2));
    }
    
}
