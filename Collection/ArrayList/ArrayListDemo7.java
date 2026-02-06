
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo7 {
    public static void main(String[] args) {
        Department cs= new Department("Computer Science");
        cs.addProfessor(new Professor("James","Java"));
        cs.addProfessor(new Professor("Tim Berneres Lee","HTML"));
        cs.addProfessor(new Professor("Denis","C lang"));

        System.out.println("Professors in "+ cs.getDeptName()+"Department");
        List<Professor> lisoProfessors = cs.getListOfProfessors();

        for(Professor professor: lisoProfessors)
        {
            System.out.println(professor);
        }
    }
}
record Professor(String name,String specialization)
{

}

class Department
{
    private String deptName;
    private List<Professor> listOfProfessors;

    public Department(String deptName)
    {
        this.deptName=deptName;
        listOfProfessors=new ArrayList<>();
    }

    public String getDeptName()
    {
        return this.deptName;
    }

    public void addProfessor(Professor professor)
    {
        listOfProfessors.add(professor);
    }

    public List<Professor> getListOfProfessors()
    {
        return this.listOfProfessors;
    }

    
}