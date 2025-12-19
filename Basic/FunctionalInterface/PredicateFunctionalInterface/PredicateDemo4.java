// BASED ON THE MARKS VERIDY WHETHER THE STUDENT IS PASS OR FAIL
import java.util.function.Predicate;

public class PredicateDemo4 {
    public static void main(String[] args) {
        Predicate<Student> std1= student -> student.marks() >= 80;

        Student []students= 
        {
            new Student(101, "Chetan", 90D),
            new Student(102, "Smith", 70D),
            new Student(103, "Datta", 95D),
            new Student(104, "Akash", 92D),

        };

        for(Student student : students)
        {
            if(std1.test(student))
            {
                System.out.println(student+"=> PASS");
            }
            else 
            {
                System.out.println(student+" => FAIL");
            }
        }
        
    }
    
}

record Student(Integer id, String name,Double marks)
{
    public String toString()
    {
        return ""+id+" : "+name+" : "+marks;
    }
}