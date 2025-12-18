// verify whether my name starts with character 'P' or not
import java.util.function.Predicate;
import java.util.Scanner;
public class PredicateDemo2 {
    public static void main(String []args)
    {
        Predicate<String> Char= name -> name.toLowerCase().startsWith("p"); 
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();

        System.out.println(name+" starting with Character p :"+Char.test(name));
    }
    
}
