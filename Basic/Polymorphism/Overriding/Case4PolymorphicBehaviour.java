
public class Case4PolymorphicBehaviour
{
    public static void main(String[] args) {
        payment p=null;
        p= new CreditCard();
        PaymentGateway(p);
        System.out.println("--------------");

        p=new DebitCard();
        PaymentGateway(p);
        System.out.println("---------------");

        p=new UPI();
        PaymentGateway(p);
    
        
    }

    public static void PaymentGateway(payment p)
    {
        if(p instanceof  CreditCard)
        {
            CreditCard cd=(CreditCard)p;

            double amount=cd.makePayment(25000);
            System.out.print("Making a payment of "+amount+" Through Credit card ");
            cd.offer();
        }
        else if(p instanceof DebitCard)
        {
            DebitCard dc=(DebitCard)p;
            double amount=dc.makePayment(12000);
            System.out.println("Making a payment of "+amount+" Through debit card");
        }
        else if(p instanceof UPI)
        {
            UPI upi=(UPI)p;
            double amount =upi.makePayment(30000);
            System.out.print("Making a payment of "+amount+" Through UPI ");
            upi.offer();
        }

    }
}

class payment
{
    public double makePayment(double  amount)
    {
        return  0.0;
    }
    
}
class CreditCard extends  payment
{
    
    @Override
    public double makePayment(double amount)
    {
        return  amount;
    }
    public void offer()
    {
        System.out.println("Make a payment through credit card and get 2 days holiday package in GOA");
    }
}

class DebitCard extends payment
{
    @Override
    public double makePayment(double amount)
    {
        return  amount;

    }

}

class UPI extends  payment
{
    @Override
    public double makePayment(double amount)
    {
        return  amount;
    }

    public void offer()
    {
        System.out.println("make a payment through UPI and get 1000 Rs cash back");
    }
}
