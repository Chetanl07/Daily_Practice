import java.util.Scanner;
public class ELCFactoryMethodCreditCardApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Customer Name");
        String name=sc.nextLine();

        System.out.println("Enter Customer credit points:");
        int creditPoints=Integer.parseInt(sc.next());

        FactoryMethodCustomer customer=new FactoryMethodCustomer(name,creditPoints);

        FactoryMethodCardType card=FactoryMethodCardOnOffer.getOfferedCard(customer);
        System.out.println(card);



        
    }
}