
import java.util.Scanner;

public class FindDigitContainInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();

        boolean containsDigit=false;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                containsDigit=true;
                break;

            }
        }
        if(containsDigit)
        {
            System.out.println("The String contains digits");

        }
        else System.out.println("The String does not contain digits.");


    }
    
}
