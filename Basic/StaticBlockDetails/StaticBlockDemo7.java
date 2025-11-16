// cannot write return statement inside static block and non-static block.

public class StaticBlockDemo7 {
    public static void main(String []args)
    {
        System.out.println("Main Method");
    }

    static 
    {
        System.out.println("Static Block");
       // return;
    }
    
}
