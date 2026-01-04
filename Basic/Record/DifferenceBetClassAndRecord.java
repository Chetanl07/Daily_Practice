import java.util.Objects;
public class DifferenceBetClassAndRecord {
    public static void main(String []args)
    {
        EmployeeClass ex1= new EmployeeClass(111,"Scott");
        System.err.println(ex1);
        EmployeeClass ec2=new EmployeeClass(111, "Scott");
        System.err.println(ec2);

         System.err.println(ex1.equals(ec2));
        System.err.println(ex1.hashCode()+" : "+ec2.hashCode());
        System.err.println(ex1.getId()+" : "+ec2.getName());

        System.out.println("-------------------------------------");

        EmployeeRecord rec1= new EmployeeRecord(-999, "RAj");
          System.err.println(rec1);

          EmployeeRecord rec2= new EmployeeRecord(-999, "RAj");
          System.err.println(rec1.equals(rec2));
          System.err.println(rec1.hashCode()+" : "+rec2.hashCode());
          System.err.println(rec1.id()+" : "+rec1.name());







    }
    
}

class EmployeeClass
{
    private int id;
    private String name;

    public EmployeeClass(int id, String name)
    {
        this.id=id;
        this.name=name;

    }

    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return "EmployeeClass [ id ="+id+", Name= "+name+"]";
    }




    public boolean equals(Object obj)
    {
        if(this == obj)     return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass())        return false;
        
        EmployeeClass other = (EmployeeClass)  obj;
        return id== other.id && Objects.equals(name, other.name);
    }

}

record EmployeeRecord(int id, String name)
{
    // Compact Constructor
    public EmployeeRecord
    {
        if(id<=0)
        {
            System.err.println("Id must be positive");
            System.exit(0);
        }

    }
}