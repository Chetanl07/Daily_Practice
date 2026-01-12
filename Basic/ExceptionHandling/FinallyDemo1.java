public class FinallyDemo1 {
    public static void main(String [] args)
    {
        System.out.println("Main method started");

        try{
            System.out.println(10/0);
            System.exit(0);
        }
        finally
        {
            System.out.println("Its finally block, Guaranteed for execution");
        }
        System.out.println("Main method completed");
    }
}
