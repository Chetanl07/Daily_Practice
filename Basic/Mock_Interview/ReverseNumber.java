import java.util.Scanner;
public class ReverseNumber
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int reversed=0;

        for(int i=no;i!=0;i/=10)
        {
            int digit=i%10;
            reversed=reversed*10+digit;
        }
        System.out.println(reversed);
        sc.close();

    }
}