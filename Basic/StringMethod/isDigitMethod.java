// count the character from the String using isDigit method

import java.util.Scanner;
public class isDigitMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        boolean containsDigit =false;

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
            System.out.println("The string contains digits.");
        }
        else{
            System.out.println("The string does not contain digits.");
        }
    }
    
}
