// static method of an interface is by default public 

import java.util.Scanner;
public class StaticMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num1=sc.nextInt();
        int num2=sc.nextInt();

        double sum=Calculate.doSum(num2, num2);
        System.out.println("Sum is : "+sum);

        double cube=Calculate.getCube(5);
        System.out.println("Cube is : "+cube);
            }
    
}
interface Calculate
{
    static double doSum(int x,int y)
    {
        return (x+y);
    }

    static double getCube(int num)
    {
        return (num*num*num);
    }
}
