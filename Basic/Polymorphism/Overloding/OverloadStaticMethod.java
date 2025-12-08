// we can overload Static method.

public class OverloadStaticMethod {
    public static void main(String []args)
    {
        Sample.accept(new Employee(101,50000));
        Sample.accept(new Student(1,"Raj"));

    }
    
}
class Sample
{
    public static void accept(Student student)
    {
        System.out.println("Roll Number is :"+student.roll());
        System.out.println("Student Name is : "+student.name());

    }
    public static void accept(Employee employee)
    {
        System.out.println("Employee Id is :"+employee.id());
        System.out.println("salary is : "+employee.salary());
    }

}

record Student(int roll,String name){}
record Employee(int id,double salary){}
