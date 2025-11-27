// equalsIgnoreCase use to compare two String based on  
// the content by ignoring the case
public class EqualsIgnoreCase {
    public static void main(String []args)
    {
        String username="HYDERABAD";

        if(username.equalsIgnoreCase("hyderabad"))
        {
            System.out.println("Welcome to Hyderabad");
        }
        else 
        {
            System.out.println("Sorry ! wrong username / password");
        }
    }
    
}
