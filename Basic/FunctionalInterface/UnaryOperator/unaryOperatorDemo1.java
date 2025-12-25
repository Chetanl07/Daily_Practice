import java.util.function.UnaryOperator;
public class unaryOperatorDemo1 {
    public static void main(String [] args)
    {
        UnaryOperator<Integer> square = x -> x*x;
        System.out.println(square.apply(5));

        UnaryOperator <String> concat=str -> str.concat("Base");
        System.out.println(concat.apply("Data"));
    }
    
}
