// it is possible that constructor will be executed before static block execution

public class StaticBlockDemo9 {
    public static void main(String []args)
    {
        new test(); // class loading + Object creation
    }
    
}

class test
{
    public static final test t1=new test();

    static 
    {
        System.out.println("static block");
    }

    {
        System.out.println("non static block");
    }

    test()
    {
        System.out.println("No argument constructor");
    }
}
