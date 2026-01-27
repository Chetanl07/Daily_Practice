// comparable interface using in array 
import java.util.Arrays;

public class ComparableUsingArray {
    public static void main(String[] args) {
        
        Employee [] employees=new Employee[3];

        employees[0]=new Employee(333, "Chetan");
        employees[1]=new Employee(111, "Datta");
        employees[2]= new Employee(222, "vinod");

        Arrays.sort(employees);
        
        for (Employee emp: employees)
        {
            System.out.println(emp);
            
        }
    }

    
}

record Employee(Integer id,String name) implements Comparable<Employee>
{

    @Override
    public int compareTo(Employee e2)
    {
        return this. name.compareTo(name);
    }

}