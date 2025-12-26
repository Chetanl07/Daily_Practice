
import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String []args)
    {
        // BiFunction to concatenate Two Strings
        BiFunction<String,String,String> concatinateString= (str1,str2) -> str1+str2;

        String result= concatinateString.apply("Hello", "Java");
        System.out.println(result);

        // BiFunction to find the length two strings

        BiFunction <String, String, Integer> calculateLength = (str1,str2) -> str1.length()+str2.length();
        Integer result1= calculateLength.apply("Hello","java");
        System.out.println(result1);
    }
    
}
