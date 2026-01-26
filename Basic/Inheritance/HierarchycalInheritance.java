import java.util.Scanner;


public class HierarchycalInheritance {
    public static void main(String []args)
 {
 Scanner sc=new Scanner(System.in);
 int id=Integer.parseInt(sc.next());
 String name=sc.next();
 double salary=Double.parseDouble(sc.next());
 PermenentEmployee p=new PermenentEmployee(id,name,salary);
 System.out.println(p);
 p.netSalary();
 int id1=Integer.parseInt(sc.next());
 String name1=sc.next();
 double salary1=Double.parseDouble(sc.next());
 int contractDuration=Integer.parseInt(sc.next());
 ContractEmployee c=new ContractEmployee(id1,name1,salary1,contractDuration);
 System.out.println(c);
 }
}
class employee
{
 protected int employeeId;
 protected String employeeName;
 protected double employeeSalary;
 public employee(int id,String name,double salary)
 {
 if(salary<0)
 {
 System.out.println("Error Invalid Input");
 System.exit(0);
 }
 this.employeeId=id;
 this.employeeName=name;
 this.employeeSalary=salary;
 }
}
class PermenentEmployee extends employee
{
 protected double providentFund;
 public PermenentEmployee(int id,String name,double salary)
 {
 super(id,name,salary);
 providentFund=salary*12/100;
 }
 public void netSalary()
 {
 double total=employeeSalary + providentFund;
 System.out.println("Net Salary: "+total);
 }
 public String toString()
 {
 return "PermanentEmployee [employeeId="+ employeeId +", employeeName="+ employeeName +", employeeSalary=" + employeeSalary +", providentfund="+ providentFund +"]";
 }
}

 class ContractEmployee extends employee
{
 protected int contractDuration;
 public ContractEmployee(int id,String name,double salary,int duration)
 {
 super(id,name,salary);
 this.contractDuration=duration;
 }
 public String toString()
 {
 return "ContractEmployee [employeeId="+ employeeId +", employeeName="+ employeeName +", employeeSalary=" + employeeSalary +", contractDuration="+ contractDuration +"]";
 }
}

