public class MultilevelInheritance {
    public static void main(String []args)
    {
        PCM p=new PCM(1,"Chetan","hyd",90,80,70);
        System.out.println(p);
        p.getTotalMarks();
    }
    
}
class Student 
{
    protected int id;
    protected String name;
    protected String address;

    public Student(int id,String name,String address)
    {
        this.id=id;
        this.name=name;
        this.address=address;

    }

    public String toString()
    {
        return "Student Id: "+id+"\nStudent Name: "+name+"\nStudent Address: "+address;
    }
}

class science extends Student
{
    protected int phy;
    protected int che;

    public science(int id,String name,String address,int phy,int che)
    {
        super(id,name,address);
        this.phy=phy;
        this.che=che;
    }

    public String toString()
    {
        return super.toString()+"\nPhysics Marks: "+phy+"\nChemistry Marks: "+che;
    }
}

class PCM extends science{
    protected int math;

    public PCM(int id,String name,String address,int phy,int che,int math)
    {
        super(id,name,address,phy,che);
        this.math=math;
    }

    public void getTotalMarks()
    {
        int total=phy+che+math;
        System.out.println("Total Marks of PCM: "+total);
    }

    public String toString()
    {
        return super.toString()+"\nMaths Marks: "+math;
    }
}
