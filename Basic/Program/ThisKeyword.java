public class ThisKeyword
{
    public static void main(String[] args) 
    {
        customer c=new customer();
        c.setCustomerData(101, "scott", 50000);
        c.getCustomerData();
        
        
    }
}
class customer 
{
    private int id;
    private String name;
    private double salary;

    public void setCustomerData(int id, String name, double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;

    }

    public void getCustomerData()
    {
        System.out.println("id is :"+this.id);
        System.out.println("Name is :"+this.name);
        System.err.println("Salary is :"+this.salary);
    }
}