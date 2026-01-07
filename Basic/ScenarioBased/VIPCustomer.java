public class VIPCustomer extends Customer
{
 protected  double discountRate=15.0;
public VIPCustomer(String name)
    {
        super(name);

    }

    public double calculateBill(double ...prices)
    {
        total=super.calculateBill(prices);
        return total;
    }

    public void printDetails()
    {
        double discount= (total*discountRate)/100;
        double finalAmount =total-discount;

        System.out.println("Customer Name is :"+this.name);
        System.out.println("Total price is : "+this.total);
        System.out.println("Discount amount is : "+discount);
        System.out.println("After discount final amount is :"+finalAmount);
    }
    
}
