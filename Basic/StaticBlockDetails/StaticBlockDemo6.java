public class StaticBlockDemo6 {
    public static void main(String []args)
    {
      System.out.println(demo.i);
    }
    
}

class demo{
    static 
    {
        i=100;
        //System.err.println(i); // illegal forward reference
        System.out.println(demo.i);
    }

    static int i;

}
