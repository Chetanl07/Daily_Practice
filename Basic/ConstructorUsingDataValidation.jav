public class ConstructorUsingDataValidation
{
    public static void main(String []args)
    {
        Product p1=new Product(100,"Laptop",80000);
        System.out.println(p1);
    }
}

class Product
{
    private int id;
    private String name;
    private double price;

    public Product(int id,String name,double price)
    {
        if(id<0 || name==null || name.isBlank()|| price<0)
        {
            System.out.println("Invalid Data");
            System.exit(0);
        }
        this.id=id;
        this.name=name;
        this.price=price;
    }

    public String toString()
    {
        return "id="+id+"name="+name+"price="+price;
    }
}