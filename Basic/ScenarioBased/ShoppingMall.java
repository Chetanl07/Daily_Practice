import java.util.Scanner;
public class ShoppingMall {
    public static void main(String[] args) 
    {
Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to Hydrabad Mall");
        System.out.println("Please select the customer Type to get additional Discount");
        System.out.println("\t\t\t 1) General Customer");
        System.out.println("\t\t\t 2) Prime Customer");
        System.out.println("\t\t\t 3) VIP Customer");

        Customer customer=null;

        int choice = Integer.parseInt(sc.nextLine());

        switch(choice)
        {
            case 1->
            {
                System.out.println("Enter customer name");
                String name=sc.nextLine();
                customer=new GeneralCustomer(name);
                System.out.println("Enter number of Item");

                int noOfItem= Integer.parseInt(sc.nextLine());
                double itemPrice1[]=new double[noOfItem];
                System.out.println("please enter the Item Name and Price");

                for(int i=0;i<itemPrice1.length;i++)
                {
                    System.out.println(i+1+") Item Name: ");
                    String itemName=sc.nextLine();
                    System.out.println("Item price : ");
                    double itemPrice=Double.parseDouble(sc.nextLine());
                    itemPrice1[i]=itemPrice;

                }
                generateBill(customer,itemPrice1);

            }

             case 2->
            {
                System.out.println("Enter customer name");
                String name=sc.nextLine();
                customer=new PrimeCustomer(name);
                System.out.println("Enter number of Item");

                int noOfItem= Integer.parseInt(sc.nextLine());
                double itemPrice1[]=new double[noOfItem];
                System.out.println("please enter the Item Name and Price");

                for(int i=0;i<itemPrice1.length;i++)
                {
                    System.out.println(i+1+") Item Name: ");
                    String itemName=sc.nextLine();
                    System.out.println("Item price : ");
                    double itemPrice=Double.parseDouble(sc.nextLine());
                    itemPrice1[i]=itemPrice;

                }
                generateBill(customer,itemPrice1);

            }

             case 3->
            {
                System.out.println("Enter customer name");
                String name=sc.nextLine();
                customer=new VIPCustomer(name);
                System.out.println("Enter number of Item");

                int noOfItem= Integer.parseInt(sc.nextLine());
                double itemPrice1[]=new double[noOfItem];
                System.out.println("please enter the Item Name and Price");

                for(int i=0;i<itemPrice1.length;i++)
                {
                    System.out.println(i+1+") Item Name: ");
                    String itemName=sc.nextLine();
                    System.out.println("Item price : ");
                    double itemPrice=Double.parseDouble(sc.nextLine());
                    itemPrice1[i]=itemPrice;

                }
                generateBill(customer,itemPrice1);

            }
        }

    }
    public static void generateBill(Customer customer,double ...prices)
    {
        customer.calculateBill(prices);
        customer.printDetails();
    }
    
}
