// while overloading a method we can change the return type.

public class ReturnType {
    public static void main(String []args)
    {
        Addition addition = new Addition();
        System.out.println("Sum of Two integer is : "+addition.doSum(12, 24));
        System.out.println("Sum of Two double is : "+addition.doSum(12.5,2.4));
        System.out.println("concatenation of Two String is : "+addition.doSum("Data", "base"));
    }
    
}
class Addition
{
    public int doSum(int x, int y)
    {
        return (x+y);
    }

    protected double doSum(double x,double y)
    {
        return (x+y);
    }

    public String doSum(String x,String y )
    {
        return (x+y);
    }

}
