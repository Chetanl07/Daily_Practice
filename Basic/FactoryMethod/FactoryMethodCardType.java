public class FactoryMethodCardType {
    private FactoryMethodCustomer customer;
    private String cardType;


    public FactoryMethodCardType(FactoryMethodCustomer customer,String cardType)
    {
        this.customer = customer;
        this.cardType = cardType;   
    }

    public String toString()
    {
        return "The customer '"+customer+"' Is Eligible for '"+cardType+"'Card";
    }
}
