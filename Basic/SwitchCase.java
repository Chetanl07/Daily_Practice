
import java.util.Scanner;

public class SwitchCase {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your performance grade {A/B/C}");
        char grade=sc.nextLine().toUpperCase().charAt(0);

        double salary=40000;
        double bonus=switch(grade)
        {
            case 'A'->
            {
            System.out.println("Grade A performer");
            yield salary*0.20;
            }

            case 'B'->
            {
                System.out.println("Grade B performer");
                yield salary*0.15;
            }
            case 'C'->
            {
                System.out.println("Grade c performer");
                yield salary*0.10;

            }

            default -> 0.0;

            

        };
        System.out.println("Your bonus amount is:"+bonus);
        sc.close();
        
    }
}
