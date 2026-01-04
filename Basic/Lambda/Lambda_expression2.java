import java.util.Scanner;
// return a string length using lambda function
public class Lambda_expression2 {
    public static void main(String [] args)
    {
        Length length =str -> str.length();
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();

        System.out.println(length.getLength(name));


    }
    
}
interface Length
{
    int getLength(String str);
}
