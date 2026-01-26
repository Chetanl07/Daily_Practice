 class Nested {
    public static void nestedTry()
     {
        try{
            String str=null;
            System.out.println(str.toUpperCase());


            try{
                str="456";
                Integer value= Integer.parseInt(str);
                System.out.println("Value is"+value);
            }
            catch(NumberFormatException e)
            {
                System.out.println("Number is not in a proper format");
            }

        }
        catch(NullPointerException e)
        {
            System.out.println("Reference is pointing to null");

        }
    }
    
}

public class NestedTryCatch
{
    public static void main(String[] args) {
        Nested.nestedTry();
    }
    
}
