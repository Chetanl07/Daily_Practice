
public class StaticBlockDemo11 {

    public static void main(String []args)
    {
        demo.print();
    }
}
class demo
{
    public static void print()
    {
        x=120;
        System.out.println("x value is :"+x);
    }
    static int x;
}
