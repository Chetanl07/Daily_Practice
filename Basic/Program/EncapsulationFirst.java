
import java.util.Scanner;

public class EncapsulationFirst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Employee Name");
        String name=sc.nextLine();
        System.out.println("Enter Employee Salary");
        double salary=Double.parseDouble(sc.nextLine());

        Employee emp=new Employee(name, salary);
        System.out.println(emp);

        System.out.println("enter your increase amount");
        double increase=Double.parseDouble(sc.nextLine());

        emp.setSalary(emp.getSalary()+increase);
        System.out.println(emp);
        sc.close();


    }
    
}
class Employee
{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("name=").append(name);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
