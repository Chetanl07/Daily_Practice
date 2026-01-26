public class PassByValueData
 {
    public static void main(String[] args) {
        customer cust=new customer(12000);
        System.out.println(cust.getBill());

        accept(cust);
        System.out.println(cust.getBill());
  }
        public static void accept(customer c1)
        {
            c1.setBill(18000);
        }
  
    
}
class customer
{
    private double bill;

    public customer(double bill)
    {
        this.bill=bill;
    }
    public double getBill()
    {
        return bill;
    }
    public void setBill(double bill)
    {
        this.bill=bill;
    }
}
