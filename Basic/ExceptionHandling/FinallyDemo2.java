public class FinallyDemo2 {
    public static void main(String[] args) {
        try{
            int arr[] = new int[-9];
        }
        catch(NegativeArraySizeException e)
        {
            System.out.println("Array size must be postive integer");
        }
        finally{
            System.out.println("Finally Block");
        }
        System.out.println("Terminated Normally");
    }
    
}
