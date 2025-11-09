public class FactoryMethodCustomer {

    private String customerName;
    private int creditPoints;

    public FactoryMethodCustomer(String customerName, int creditPoints)
    {
        this.customerName = customerName;
        this.creditPoints = creditPoints;
    }

    public int getCreditPoints()
    {
        return creditPoints;
    }

    public String toString()
    {
        return "Customer Name:"+customerName;
    }

    
}