public class MethodIsCompulsort {
    public static void main(String[] args) {
        Gamma g=new Gamma();
        g.show();
        g.draw();
        
    }
    
}
abstract  class Alpha
{
    public abstract  void show();
    public abstract  void draw();
}

abstract  class Beta extends Alpha
{
    @Override
    public void show()
    {
        System.out.println("Show method is overridden in Beta Class...");
    }
}
class Gamma extends Beta{
    @ Override 
    public void draw()
    {
        System.out.println("Draw mehod is overridden in Gamma class...");
    }
}