public class DataHidingInInheritance {
    public static void main(String []args)
    {
        developer d=new developer();
        d.showSalary();

    }
    
}
class employee
{
    protected double salary=50000;
}
class developer extends employee
{
    protected double salary=70000;
    public void showSalary()
    {
        System.out.println("Developer Salary: "+this.salary);
        System.out.println("Employee Salary: "+super.salary);
    }
}
