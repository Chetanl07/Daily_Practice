
import java.util.function.Predicate;


// Based on the marks verify whether the Student is PASS OR FAIL

public class PredicateDemo3 {
   public static void main(String[] args) {
    Predicate<Student> Sd1= student -> student.marks() >= 80;

    Student s1=new Student(123, "Chetan", 90D);

    if(Sd1.test(s1))
    {
        System.out.println(s1+"=> PASS");
    }
    else 
    {
        System.out.println(s1+" => FAIL");
    }
    }
    
}
record Student (Integer id, String name, double marks)
{
    public String toString()
    {
         return ""+id+" : "+name+" : "+marks;

    }
}
