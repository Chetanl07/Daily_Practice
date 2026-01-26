// Verify whether a person is eligible 4 voting OR not

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo1 {
    public static void main(String[] args) {

        Predicate <Integer> eligible=age -> age>=18;
        Scanner sc = new Scanner(System.in);
        int myAge=sc.nextInt();
        System.out.println("My age is 0"+myAge+"Am i eligible for Voting : "+eligible.test(myAge));
    }
    
}

