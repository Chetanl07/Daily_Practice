public class ConstructorChaining {
    public static void main(String[] args)
    {
        Addition a1=new Addition(2.3,6.7);
    }
}

class Addition
{
    public Addition(int x,int y)
    {
        super();
        System.out.println("Sum of two integer is :"+(x+y));
    }

    public Addition(String x, String y)
    {
        this(12, 20);
        System.out.println("Concatenated string is :"+(x+y));

    }
    public Addition(double x,double y)
    {
        this("Batch","51");
        
            System.err.println("Sum of two double id:"+(x+y));
        
    }


}