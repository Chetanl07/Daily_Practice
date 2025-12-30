public class HideLogic {
    public static void main(String [] args)
    {
        Printable p1=new Print();
        System.out.println(p1.toString());
        p1.print();
        p1.m1();
        Printable.m2();

    }
    
}

interface Printable {
    int SPEED=80;
    void print();

    default void m1()
    {
        m3();
        m4();
    }

    static void m2()
    {
        System.out.println("Public m2 static static method...");
        m4();
    }
    private void m3()
    {
        System.out.println("Private non static method");
    }

    private static void m4()
    {
        System.out.println("Private static method");
    }
    
}
class Print implements  Printable
{
    public String toString()
    {
        return "Java";
    }

    public void print()
    {
        System.out.println("Printing Something");
    }


}