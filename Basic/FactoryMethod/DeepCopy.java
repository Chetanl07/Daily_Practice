public class DeepCopy {
    public static void main(String []args)
    {
        product p1=new product();
        product p2=new product(5000);
        System.out.println(p1+" :"+p2);

        p1.setPrice(p2.getPrice());
        System.out.println("After copy");
        System.out.println(p1+" :"+p2);

        p2.setPrice(9000);
        System.out.println("After modification in p2");
         System.out.println(p1+" :"+p2);

    }
    
}
class product{
    private double price;
    public product(){}
    public product(double price)
    {  
        this.price=price;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }

    public String toString()
    {
        return "Product price="+price;
    }
}
