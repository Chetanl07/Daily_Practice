public class Customer {
    protected String name;
    protected  double total;

    public Customer(String name)
    {
        super();

        if(name==null || name.isBlank())
        {
            System.out.println("Customer Name connot be blank");
            System.exit(0);
        }
        this.name=name;
    }

    public double calculateBill(double ...prices)
    {
        for(double price : prices)
        {
            if(price<0)
            {
                System.out.println("Price connot be negative");
                System.exit(0);
            }
            total=total+price;
        }
        return total;
    }

    public void printDetails()
    {
        System.out.println("Customer Name is :"+this.name);
        System.out.println("Total price is : "+this.total);
        System.out.println("No discount for general customer..");
    }
    
}
