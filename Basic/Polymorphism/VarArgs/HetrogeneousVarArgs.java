
public class HetrogeneousVarArgs {
    public static void main(String[] args) {
       Hetro h1= new Hetro();
h1.acceptHetro(1,1.2,'A',false,"NIT",new StringBuilder("Java"));
        
    }
}

class Hetro{
    public void acceptHetro(Object ...x)
    {
        for(Object y:x)
        {
        System.out.println(y);
        }
    }

}
