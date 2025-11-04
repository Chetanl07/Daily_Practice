// day 28
public class PassByValueData2 {
    public static void main(String[] args) {
        Employee e1=new Employee();
        System.out.println(e1.getSalary());
        accept(e1);
        System.out.println(e1.getSalary());
    }
    public static void accept(Employee emp)
    {
        emp=new Employee();
        emp.setSalary(90000);
    }
}

class Employee
{
    private double salary=75000;
    public double getSalary()
    {
        return salary;
    }
    public void  setSalary(double salary)
    {
        this.salary=salary;
    }



}
