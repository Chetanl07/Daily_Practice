
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleTryCatch {
    public static void main(String[] args) {
        try{
            String str = "java";
            Integer val= Integer.valueOf(str);
            System.out.println(val);
        }
        catch(NumberFormatException e)
         {
        System.out.println("Number is not in a proper format...");

        }   

        try 
        {
            Object obj[]= new Integer[3];
            obj[0]=100;
            obj[1]= 200;
            obj[2] = true;
            

        }
        catch(ArrayStoreException e)
        {
            System.out.println("Inserting illegal data in the array");
        }

        try 
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter your age");
            int age=sc.nextInt();
            System.out.println("Your Age is : "+age);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Input data is not in a valid format : ");
        }





    }
    


}
