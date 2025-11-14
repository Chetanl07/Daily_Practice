public class StaticBlockDemo5 {
    public static void main(String []args)
    {
      System.out.println(demo.i);
    }
    
}

class demo{
    static
    {
        i=100;  // initialization is possible due to prepare phase
    }

    static int i;
}
