public class MultipleCatchDemo1 {
    public static void main(String[] args) {
        System.out.println("Main method started !!!");

        try
        {
            int x= 10/0;
            System.out.println(x);

            int arr[]= {10,20,30};
            System.out.println(arr[3]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of bound");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero problem ");
        }
        catch(Exception e)
        {
            System.out.println("No abnormal termination");

        }
        System.out.println("Main mathod ended !!1");
    }
    
}
