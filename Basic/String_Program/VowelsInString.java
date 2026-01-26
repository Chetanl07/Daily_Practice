
import java.util.Scanner;

public class VowelsInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        boolean containsVowel = false;
        for(char c: str.toLowerCase().toCharArray())
        {
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            {
                containsVowel=true;
                break;
            }
        }
        if(containsVowel) System.out.println("String have a vowels ");
        else System.out.println("only consonents");
    }
    
}
