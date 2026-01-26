// character method to check string have how many  upper case and lower case letter

import java.util.Scanner;
public class isUpperCaseAndisLowerCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int upperCase= 0,lowerCase=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)) upperCase++;
            else if(Character.isLowerCase(ch)) lowerCase++;
        
        }
        System.out.println("UpperCase letters: "+upperCase);
        System.out.println("LowerCase letters: "+lowerCase);
    
    }
    
}
