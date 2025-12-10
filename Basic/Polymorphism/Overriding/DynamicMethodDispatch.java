public class DynamicMethodDispatch {
    public static void main(String[] args)
     {
        Payment p=null;             
        p=new DebitCard();          p.makePayment();
        p=new CreditCard();         p.makePayment();
        p=new UPI();                p.makePayment();


    }
    
}

class Payment 
{
    public void makePayment()
    {
        System.out.println("Generic Payment !!!");
    }
}

class CreditCard extends Payment 
{
    public void makePayment()
    {
        System.out.println("Making a payment through Credit card");
    }
}

class DebitCard extends Payment 
{
    public void makePayment()
    {
        System.out.println("Making a payment through Debit card");
    }
}

class UPI extends Payment 
{
    public void makePayment()
    {
        System.out.println("Making a payment through UPI");
    }
}
