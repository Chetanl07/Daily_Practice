// static final blank field have a default value 

public class StaticBlockDemo8 {
    final static int x; // static final blank field
    static 
    {
        m1();
        x=15;
    }

    public static void m1()
    {
        System.out.println("Defeult value of x is : "+x);
    }
    public static void main(String []args)
    {
      System.out.println("After initialization:"+StaticBlockDemo8.x);
    }
    
}
