public class MultipleCatchDemo2 {
    public static void main(String[] args) {
        try{
            reaiseException();

        }
        catch(NullPointerException e)
        {
            System.out.println("Ref. is pointing to null");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Number is not in a proper format");

        }
        catch(Exception e)
        {
            System.out.println("General problem");
        }
    }

    public static void reaiseException()
    {
        String s1= "Null";
        System.out.println(s1.length());

        String s2="NIT";
        int no = Integer.parseInt(s2);
        System.out.println(no);
    }
    
}
