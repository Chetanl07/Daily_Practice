public class GeneralCustomer  extends Customer
{
    public GeneralCustomer(String name)
    {
        super(name);
    }
    public double calculateBill(double ...prices)
    {
        total=super.calculateBill(prices);
        return total;
    }
    
}
