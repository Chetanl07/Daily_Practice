public class MultipleCatchDemo3 {
    public static void main(String[] args) {
        try{
            String s1= "Null";
        System.out.println(s1.length());

        String s2="NIT";
        int no = Integer.parseInt(s2);
        System.out.println(no);

        }
        catch(NumberFormatException | NullPointerException e)
        {
            if(e instanceof NumberFormatException)
            {
                System.out.println("Number is not in a proper format");
            }
            else if(e instanceof NullPointerException)
            {
                System.out.println("Ref vaiable is pointing To null");
            }

        }

        System.out.println("Main method ended !!!");
    }
    
}
