import java.util.Scanner;
import java.util.function.Function;
public class FunctionDemo2 {
    public static void main(String[] args) {
        Function <String, Boolean> char1=str -> str.toLowerCase().startsWith("r");

        Scanner sc= new Scanner(System.in);
        String name= sc.nextLine();

        System.out.println("Is "+name+" Starts with Character 'R' "+char1.apply(name));

    }
    
}
