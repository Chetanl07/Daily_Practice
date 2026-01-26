
import java.util.Scanner;
import java.util.function.Function;

// find out the length of my city
public class FunctionDemo1 {
    
    public static void main(String[] args) {
        Function<String, Integer> fn1=str -> str.length();

        Scanner sc=new Scanner(System.in);
        String city=sc.nextLine();

        System.out.println(city+" city length is :"+fn1.apply(city));
        
    }
}
