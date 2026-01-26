
import java.util.function.Function;

// Retriving the name & salary from the employee object 


public class FunctionDemo3 {
    public static void main(String[] args) {
        Employee e1= new Employee(101, "Chetan", 50000d);

        Function <Employee, String> fn3= emp -> emp.name();
        System.out.println("Name of the Employee is: "+fn3.apply(e1));
        
        Function <Employee,Double> sal=emp -> emp.salary();
        System.out.println("Salary of the employee is : "+sal.apply(e1));


        
    }
    
}
record Employee(Integer id, String name, Double salary) {}


