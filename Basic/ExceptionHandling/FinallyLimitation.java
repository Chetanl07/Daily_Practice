
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyLimitation {
    public static void main(String[] args) 
    {   Scanner sc=null;
        try
        {
         sc=new Scanner (System.in);
         System.out.println("Enter your salary :");
         double sal=sc.nextDouble();
         System.out.println("Your salary is : "+sal);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Input is not in a proper format");

        }
        finally 
        {
            System.out.println("Finally block");
            sc.close();
        }
        
    }
    
}
