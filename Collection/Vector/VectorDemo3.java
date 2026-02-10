
import java.util.Vector;

public class VectorDemo3 {
    public static void main(String[] args) {
        Vector<Employee> listEmployees = new Vector<>();
        listEmployees.add(new Employee(333, "Chetan", 800D));
        listEmployees.add(new Employee(111, "Datta", 1200D));
        listEmployees.add(new Employee(555, "Sahil", 1500D));
        listEmployees.add(new Employee(666, "Akash", 200D));
        listEmployees.add(new Employee(222, "Vinod", 1800D));

        System.out.println("Printing the Original data...");

        for (Employee emp: listEmployees) {
            System.out.println(emp);   
        }

        System.out.println("\n Printing the Employee Data whose salary >= 1500D");
         for (Employee emp: listEmployees) 
         {
            if(emp.salary()>=1500)
            System.out.println(emp);   
        }


        System.out.println("\n Sorting the Employee object based on Id :");
        listEmployees.sort((e1,e2)-> e1.id().compareTo(e2.id()));

         for (Employee emp: listEmployees) {
            System.out.println(emp);   
        }
    }
    
}

record Employee(Integer id,String name,Double salary)
{

}
