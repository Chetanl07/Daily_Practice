
import java.util.Scanner;

public class RemoveTheCharacter {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();

        System.out.println("Enter a character you want to remove");
        char ch=sc.next().charAt(0);

        StringBuilder result = new StringBuilder();


        for(char c:str.toCharArray())
        {
            if(c!=ch)
            {
                result.append(c);
            }
        }
        System.out.println(result);
    }
    
}
