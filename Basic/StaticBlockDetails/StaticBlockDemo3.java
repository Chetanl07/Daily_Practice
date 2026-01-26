// As static blank final field also have default values

public class StaticBlockDemo3 {
    public static void main(String []args)
    {
      System.out.println("a value is:"+Demo.a);
    }
    
}

class Demo
{
    final static int a; // static blank final field
    static 
    {
        m1();
        a=100;
        System.out.println("User value :"+a);
    }

    public static void m1()
    {
        System.out.println("Default value :"+a);
    }
}

/* 
output : 
Default value :0
User value :100
a value is:100
*/ 
