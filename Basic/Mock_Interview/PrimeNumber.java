import java.util.Scanner;
public class PrimeNumber {

    public static void main(String []aStrings)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number to check if it is prime or not:");
        int x=sc.nextInt();
        boolean isPrime=true;

        for(int a=2;a<=x/2;a++)
        {
            if(x%a==0)
            {
                isPrime=false;
                break;
            }
        }

        if(isPrime)
        {
            System.out.println(x+" is a Prime Number");
        }
        else
        {
            System.out.println(x+" is not a Prime Number");
        }

    }
    
}
