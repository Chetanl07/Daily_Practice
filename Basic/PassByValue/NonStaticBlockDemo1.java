public class NonStaticBlockDemo1 {
    public static void main(String []args)
    {
        Demo d1=new Demo();
        Demo d2=new Demo();

    }
}
class Demo
{
    public Demo()
    {
        System.out.println("No Argument Constructor");
    }
    public Demo(int x)
    {
        System.out.println("Parameterized Constructor");

    }
    {
        System.out.println("Non Static Block");
    }
}
