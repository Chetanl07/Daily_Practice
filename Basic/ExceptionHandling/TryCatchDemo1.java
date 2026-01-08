
import java.util.Scanner;

public class TryCatchDemo1
{
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("Welcome client, Welcome to this application..");
            int x = sc.nextInt();
            int y = sc.nextInt();

            int result = x/y;

            System.out.println("Result is : "+result);

        }
        catch (Exception e)
        {

            System.out.println("Don't put Zero here");
        }

        System.out.println("Thank you 4 visiting , please visit again ");
    }
}