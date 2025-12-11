public class OverrideAnnotation {
    public static void main(String[] args) {
        shape shape1=new square();
        shape1.draw();
    }
    
}
class shape
{
    public void draw()
    {
        System.out.println("Generic Draw");

    }
}
class square extends  shape
{
    @Override
    public void draw()
    {
        System.out.println("Square Draw");

    }
}
