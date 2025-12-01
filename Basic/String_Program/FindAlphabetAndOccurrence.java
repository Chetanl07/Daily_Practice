
import java.util.Scanner;

public class FindAlphabetAndOccurrence {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine().toLowerCase();
        char target=sc.nextLine().charAt(0);

        int count=0;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==target)
            {
                count++;
            }
        }
        System.out.println("The character "+target+" appears "+count+" times in the string "+str);


    }
}
