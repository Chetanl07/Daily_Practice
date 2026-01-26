import java.util.Scanner;
public class StrongNumber {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int sum=0;
        int temp=n;

        for(int i=temp;i!=0;i/=10)
        {
            int fact=1;
            for(int j=1;j<=i%10;j++)
            {
                fact=fact*j;
            }
            sum=sum+fact;
            
        }

        System.out.println(sum);
        if(sum==n)
        {
            System.out.println("Strong Number");
        }
        else
        {
            System.out.println("Not a Strong Number");
        }


    }
    
}
