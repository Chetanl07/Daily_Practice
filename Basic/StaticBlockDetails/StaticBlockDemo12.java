// error we cannot access non -static field into the static method
public class StaticBlockDemo12 {

    public static void main(String []args)
    {
        test t1=new test(100);
        test.print();
    }
    
}
class test
{
    private int x;
    public test(int x)
    {
        this.x=x;
    }

    // puclic static void print()
    {
        System.out.println("x value is :"+x);
    }

}
