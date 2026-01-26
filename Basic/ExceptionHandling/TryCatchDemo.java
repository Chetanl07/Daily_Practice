
import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try 
        {
        int x = sc.nextInt();
        int y = sc.nextInt();

        int result = x/y;

        System.out.println("The result is :"+result);
        System.out.println("End of try Block");
        }
        catch(Exception e)
        {
            System.out.println("Inside catch block");
            System.out.println(e);

        }
        System.out.println("main method completed");
    }
    
}
