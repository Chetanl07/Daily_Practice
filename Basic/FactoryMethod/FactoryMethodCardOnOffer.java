public class FactoryMethodCardOnOffer {
    public static FactoryMethodCardType getOfferedCard(FactoryMethodCustomer c)
    {
        int credits=c.getCreditPoints();
        if(credits>1000)
        {
            return new FactoryMethodCardType(c,"Platinum");
        }
        else if(credits>500)
        {
            return new FactoryMethodCardType(c,"Gold");

        }
        else if(credits>100)
        {
            return new FactoryMethodCardType(c,"silver");
        }
        else
        {
            return new FactoryMethodCardType(c,"EMI");
        }



    }
}