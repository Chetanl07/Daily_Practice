
public class CopyConstructor1 {
    public static void main(String []args)
    {
        CopyConstructor1Employee emp=new CopyConstructor1Employee(111,"scott");
        
        System.out.println(emp);

        CopyConstructor1Manager m1=new CopyConstructor1Manager(emp);
        System.out.println(m1);


    }
    
}
