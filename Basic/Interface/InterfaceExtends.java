public class InterfaceExtends {
    public static void main(String[] args) {
    
        Implementer myIm=new Implementer();
        myIm.m1();
        myIm.m2();
    }
    
}

interface Alpha
{
    void m1();
}
interface  Beta extends Alpha
{
    void m2();
}
class Implementer implements  Beta
{
    @Override
    public void m1()
    {
        System.out.println("M1 method overridden");
    }

    @Override
    public void m2()
    {
        System.out.println("M2 method overridden");
    }
}