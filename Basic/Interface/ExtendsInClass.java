public class ExtendsInClass {
    public static void main(String[] args)
    {
        Alpha a= new Implementer();
        a.toString();
        a.hashCode();
        a.equals(null);
    }
    
}
interface Alpha 
{
    public String toString();
    public int hashCode();
    public boolean equals(Object obj);
}

class Implementer implements  Alpha
{

}
